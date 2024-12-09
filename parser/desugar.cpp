#include "desugar.hpp"
class FindParam : public Skeleton {
public:
  std::vector<Param *> params = {};
  void visitParam(Param *p) { params.push_back(p); };
};

class OneParamToLVar : public Skeleton {
  std::vector<LVar *> *out_params;

public:
  OneParamToLVar(std::vector<LVar *> *out) : out_params(out){};

  void visitLocalBVLVar(LocalBVLVar *p) {
    out_params->push_back(new LVarBVLVar(p->clone()));
  }
  void visitLocalIntLVar(LocalIntLVar *p) {
    out_params->push_back(new LVarIntLVar(p->clone()));
  }
  void visitLocalBoolLVar(LocalBoolLVar *p) {
    out_params->push_back(new LVarBoolLVar(p->clone()));
  }

  void visitGlobalIntLVar(GlobalIntLVar *p) {
    LVar *l = new LVarIntLVar(new LocalIntLVar(p->bident_, p->inttype_));
    out_params->push_back(l);
  }
  void visitGlobalBVLVar(GlobalBVLVar *p) {
    LVar *l = new LVarBVLVar(new LocalBVLVar(p->bident_, p->bvtype_));
    out_params->push_back(l);
  }
  void visitGlobalBoolLVar(GlobalBoolLVar *p) {
    LVar *l = new LVarBoolLVar(new LocalBoolLVar(p->bident_, p->booltype_));
    out_params->push_back(l);
  }
};

void Normaliser::visitDirectCall(DirectCall *p) {
  replacement = new DirectCallReturn(new ListLVar(), p->bident_->clone(),
                                     p->listexpr_->clone());
}

void Normaliser::visitDirectCallReturnLocal(DirectCallReturnLocal *p) {
  auto list = new ListLVar();

  auto getParam = new OneParamToLVar(list);
  p->listlvar_->accept(getParam);
  delete getParam;
  assert(list->size() == p->listlvar_->size());
  replacement =
      new DirectCallReturn(list, p->bident_->clone(), p->listexpr_->clone());
}

void Normaliser::visitListStatement(ListStatement *b) {
  for (int i = 0; i < b->size(); i++) {
    auto statement = (*b)[i];
    replacement = {};
    statement->accept(this);

    if (replacement) {
      delete (*b)[i];
      (*b)[i] = replacement.value();
    }
  }
}
