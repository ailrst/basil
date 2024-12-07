#include "cpp/Absyn.H"
#include "cpp/Skeleton.H"
#include <optional>
#include <cassert>


class Normaliser : public Skeleton {
  std::optional<DirectCallReturn *> replacement = {};

public:
  void visitDirectCall(DirectCall *p);
  void visitDirectCallReturnLocal(DirectCallReturnLocal *p);
  void visitListStatement(ListStatement *p);
};





