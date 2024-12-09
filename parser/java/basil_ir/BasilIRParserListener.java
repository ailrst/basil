// Generated from basil_ir/BasilIRParser.g4 by ANTLR 4.9.3
package basil_ir;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BasilIRParser}.
 */
public interface BasilIRParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_Program}.
	 * @param ctx the parse tree
	 */
	void enterStart_Program(BasilIRParser.Start_ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_Program}.
	 * @param ctx the parse tree
	 */
	void exitStart_Program(BasilIRParser.Start_ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_ListDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListDeclaration(BasilIRParser.Start_ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_ListDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListDeclaration(BasilIRParser.Start_ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_ListBIdent}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListBIdent(BasilIRParser.Start_ListBIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_ListBIdent}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListBIdent(BasilIRParser.Start_ListBIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_Declaration}.
	 * @param ctx the parse tree
	 */
	void enterStart_Declaration(BasilIRParser.Start_DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_Declaration}.
	 * @param ctx the parse tree
	 */
	void exitStart_Declaration(BasilIRParser.Start_DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_MExpr}.
	 * @param ctx the parse tree
	 */
	void enterStart_MExpr(BasilIRParser.Start_MExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_MExpr}.
	 * @param ctx the parse tree
	 */
	void exitStart_MExpr(BasilIRParser.Start_MExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_IntType}.
	 * @param ctx the parse tree
	 */
	void enterStart_IntType(BasilIRParser.Start_IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_IntType}.
	 * @param ctx the parse tree
	 */
	void exitStart_IntType(BasilIRParser.Start_IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_BoolType}.
	 * @param ctx the parse tree
	 */
	void enterStart_BoolType(BasilIRParser.Start_BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_BoolType}.
	 * @param ctx the parse tree
	 */
	void exitStart_BoolType(BasilIRParser.Start_BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_MapType}.
	 * @param ctx the parse tree
	 */
	void enterStart_MapType(BasilIRParser.Start_MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_MapType}.
	 * @param ctx the parse tree
	 */
	void exitStart_MapType(BasilIRParser.Start_MapTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_BVType}.
	 * @param ctx the parse tree
	 */
	void enterStart_BVType(BasilIRParser.Start_BVTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_BVType}.
	 * @param ctx the parse tree
	 */
	void exitStart_BVType(BasilIRParser.Start_BVTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_Type}.
	 * @param ctx the parse tree
	 */
	void enterStart_Type(BasilIRParser.Start_TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_Type}.
	 * @param ctx the parse tree
	 */
	void exitStart_Type(BasilIRParser.Start_TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_ListExpr}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListExpr(BasilIRParser.Start_ListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_ListExpr}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListExpr(BasilIRParser.Start_ListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_IntLit}.
	 * @param ctx the parse tree
	 */
	void enterStart_IntLit(BasilIRParser.Start_IntLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_IntLit}.
	 * @param ctx the parse tree
	 */
	void exitStart_IntLit(BasilIRParser.Start_IntLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_AddrAttr}.
	 * @param ctx the parse tree
	 */
	void enterStart_AddrAttr(BasilIRParser.Start_AddrAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_AddrAttr}.
	 * @param ctx the parse tree
	 */
	void exitStart_AddrAttr(BasilIRParser.Start_AddrAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_Endian}.
	 * @param ctx the parse tree
	 */
	void enterStart_Endian(BasilIRParser.Start_EndianContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_Endian}.
	 * @param ctx the parse tree
	 */
	void exitStart_Endian(BasilIRParser.Start_EndianContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_ListStatement}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListStatement(BasilIRParser.Start_ListStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_ListStatement}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListStatement(BasilIRParser.Start_ListStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_Statement}.
	 * @param ctx the parse tree
	 */
	void enterStart_Statement(BasilIRParser.Start_StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_Statement}.
	 * @param ctx the parse tree
	 */
	void exitStart_Statement(BasilIRParser.Start_StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_Assign}.
	 * @param ctx the parse tree
	 */
	void enterStart_Assign(BasilIRParser.Start_AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_Assign}.
	 * @param ctx the parse tree
	 */
	void exitStart_Assign(BasilIRParser.Start_AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_Jump}.
	 * @param ctx the parse tree
	 */
	void enterStart_Jump(BasilIRParser.Start_JumpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_Jump}.
	 * @param ctx the parse tree
	 */
	void exitStart_Jump(BasilIRParser.Start_JumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_LVar}.
	 * @param ctx the parse tree
	 */
	void enterStart_LVar(BasilIRParser.Start_LVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_LVar}.
	 * @param ctx the parse tree
	 */
	void exitStart_LVar(BasilIRParser.Start_LVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_BVLVar}.
	 * @param ctx the parse tree
	 */
	void enterStart_BVLVar(BasilIRParser.Start_BVLVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_BVLVar}.
	 * @param ctx the parse tree
	 */
	void exitStart_BVLVar(BasilIRParser.Start_BVLVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_IntLVar}.
	 * @param ctx the parse tree
	 */
	void enterStart_IntLVar(BasilIRParser.Start_IntLVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_IntLVar}.
	 * @param ctx the parse tree
	 */
	void exitStart_IntLVar(BasilIRParser.Start_IntLVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_BoolLVar}.
	 * @param ctx the parse tree
	 */
	void enterStart_BoolLVar(BasilIRParser.Start_BoolLVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_BoolLVar}.
	 * @param ctx the parse tree
	 */
	void exitStart_BoolLVar(BasilIRParser.Start_BoolLVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_ListLVar}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListLVar(BasilIRParser.Start_ListLVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_ListLVar}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListLVar(BasilIRParser.Start_ListLVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_ListBlock}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListBlock(BasilIRParser.Start_ListBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_ListBlock}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListBlock(BasilIRParser.Start_ListBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_Block}.
	 * @param ctx the parse tree
	 */
	void enterStart_Block(BasilIRParser.Start_BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_Block}.
	 * @param ctx the parse tree
	 */
	void exitStart_Block(BasilIRParser.Start_BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_PEntry}.
	 * @param ctx the parse tree
	 */
	void enterStart_PEntry(BasilIRParser.Start_PEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_PEntry}.
	 * @param ctx the parse tree
	 */
	void exitStart_PEntry(BasilIRParser.Start_PEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_PExit}.
	 * @param ctx the parse tree
	 */
	void enterStart_PExit(BasilIRParser.Start_PExitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_PExit}.
	 * @param ctx the parse tree
	 */
	void exitStart_PExit(BasilIRParser.Start_PExitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_PAddress}.
	 * @param ctx the parse tree
	 */
	void enterStart_PAddress(BasilIRParser.Start_PAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_PAddress}.
	 * @param ctx the parse tree
	 */
	void exitStart_PAddress(BasilIRParser.Start_PAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_InternalBlocks}.
	 * @param ctx the parse tree
	 */
	void enterStart_InternalBlocks(BasilIRParser.Start_InternalBlocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_InternalBlocks}.
	 * @param ctx the parse tree
	 */
	void exitStart_InternalBlocks(BasilIRParser.Start_InternalBlocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_ProcDef}.
	 * @param ctx the parse tree
	 */
	void enterStart_ProcDef(BasilIRParser.Start_ProcDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_ProcDef}.
	 * @param ctx the parse tree
	 */
	void exitStart_ProcDef(BasilIRParser.Start_ProcDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_Params}.
	 * @param ctx the parse tree
	 */
	void enterStart_Params(BasilIRParser.Start_ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_Params}.
	 * @param ctx the parse tree
	 */
	void exitStart_Params(BasilIRParser.Start_ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_ListParams}.
	 * @param ctx the parse tree
	 */
	void enterStart_ListParams(BasilIRParser.Start_ListParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_ListParams}.
	 * @param ctx the parse tree
	 */
	void exitStart_ListParams(BasilIRParser.Start_ListParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_Expr}.
	 * @param ctx the parse tree
	 */
	void enterStart_Expr(BasilIRParser.Start_ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_Expr}.
	 * @param ctx the parse tree
	 */
	void exitStart_Expr(BasilIRParser.Start_ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_BVExpr}.
	 * @param ctx the parse tree
	 */
	void enterStart_BVExpr(BasilIRParser.Start_BVExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_BVExpr}.
	 * @param ctx the parse tree
	 */
	void exitStart_BVExpr(BasilIRParser.Start_BVExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_IntExpr}.
	 * @param ctx the parse tree
	 */
	void enterStart_IntExpr(BasilIRParser.Start_IntExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_IntExpr}.
	 * @param ctx the parse tree
	 */
	void exitStart_IntExpr(BasilIRParser.Start_IntExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_LogExpr}.
	 * @param ctx the parse tree
	 */
	void enterStart_LogExpr(BasilIRParser.Start_LogExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_LogExpr}.
	 * @param ctx the parse tree
	 */
	void exitStart_LogExpr(BasilIRParser.Start_LogExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_IntRVar}.
	 * @param ctx the parse tree
	 */
	void enterStart_IntRVar(BasilIRParser.Start_IntRVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_IntRVar}.
	 * @param ctx the parse tree
	 */
	void exitStart_IntRVar(BasilIRParser.Start_IntRVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_BVRVar}.
	 * @param ctx the parse tree
	 */
	void enterStart_BVRVar(BasilIRParser.Start_BVRVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_BVRVar}.
	 * @param ctx the parse tree
	 */
	void exitStart_BVRVar(BasilIRParser.Start_BVRVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_BoolRVar}.
	 * @param ctx the parse tree
	 */
	void enterStart_BoolRVar(BasilIRParser.Start_BoolRVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_BoolRVar}.
	 * @param ctx the parse tree
	 */
	void exitStart_BoolRVar(BasilIRParser.Start_BoolRVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_BoolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStart_BoolLiteral(BasilIRParser.Start_BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_BoolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStart_BoolLiteral(BasilIRParser.Start_BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_BVUnOp}.
	 * @param ctx the parse tree
	 */
	void enterStart_BVUnOp(BasilIRParser.Start_BVUnOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_BVUnOp}.
	 * @param ctx the parse tree
	 */
	void exitStart_BVUnOp(BasilIRParser.Start_BVUnOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_BVBinOp}.
	 * @param ctx the parse tree
	 */
	void enterStart_BVBinOp(BasilIRParser.Start_BVBinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_BVBinOp}.
	 * @param ctx the parse tree
	 */
	void exitStart_BVBinOp(BasilIRParser.Start_BVBinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_BVLogicalBinOp}.
	 * @param ctx the parse tree
	 */
	void enterStart_BVLogicalBinOp(BasilIRParser.Start_BVLogicalBinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_BVLogicalBinOp}.
	 * @param ctx the parse tree
	 */
	void exitStart_BVLogicalBinOp(BasilIRParser.Start_BVLogicalBinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_IntBinOp}.
	 * @param ctx the parse tree
	 */
	void enterStart_IntBinOp(BasilIRParser.Start_IntBinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_IntBinOp}.
	 * @param ctx the parse tree
	 */
	void exitStart_IntBinOp(BasilIRParser.Start_IntBinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_IntLogicalBinOp}.
	 * @param ctx the parse tree
	 */
	void enterStart_IntLogicalBinOp(BasilIRParser.Start_IntLogicalBinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_IntLogicalBinOp}.
	 * @param ctx the parse tree
	 */
	void exitStart_IntLogicalBinOp(BasilIRParser.Start_IntLogicalBinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#start_BoolBinOp}.
	 * @param ctx the parse tree
	 */
	void enterStart_BoolBinOp(BasilIRParser.Start_BoolBinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#start_BoolBinOp}.
	 * @param ctx the parse tree
	 */
	void exitStart_BoolBinOp(BasilIRParser.Start_BoolBinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BasilIRParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BasilIRParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(BasilIRParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(BasilIRParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#listBIdent}.
	 * @param ctx the parse tree
	 */
	void enterListBIdent(BasilIRParser.ListBIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#listBIdent}.
	 * @param ctx the parse tree
	 */
	void exitListBIdent(BasilIRParser.ListBIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(BasilIRParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(BasilIRParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#mExpr}.
	 * @param ctx the parse tree
	 */
	void enterMExpr(BasilIRParser.MExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#mExpr}.
	 * @param ctx the parse tree
	 */
	void exitMExpr(BasilIRParser.MExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#intType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(BasilIRParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#intType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(BasilIRParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#boolType}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(BasilIRParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#boolType}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(BasilIRParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#mapType}.
	 * @param ctx the parse tree
	 */
	void enterMapType(BasilIRParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#mapType}.
	 * @param ctx the parse tree
	 */
	void exitMapType(BasilIRParser.MapTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#bVType}.
	 * @param ctx the parse tree
	 */
	void enterBVType(BasilIRParser.BVTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#bVType}.
	 * @param ctx the parse tree
	 */
	void exitBVType(BasilIRParser.BVTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(BasilIRParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(BasilIRParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(BasilIRParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(BasilIRParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#intLit}.
	 * @param ctx the parse tree
	 */
	void enterIntLit(BasilIRParser.IntLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#intLit}.
	 * @param ctx the parse tree
	 */
	void exitIntLit(BasilIRParser.IntLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#addrAttr}.
	 * @param ctx the parse tree
	 */
	void enterAddrAttr(BasilIRParser.AddrAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#addrAttr}.
	 * @param ctx the parse tree
	 */
	void exitAddrAttr(BasilIRParser.AddrAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#endian}.
	 * @param ctx the parse tree
	 */
	void enterEndian(BasilIRParser.EndianContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#endian}.
	 * @param ctx the parse tree
	 */
	void exitEndian(BasilIRParser.EndianContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#listStatement}.
	 * @param ctx the parse tree
	 */
	void enterListStatement(BasilIRParser.ListStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#listStatement}.
	 * @param ctx the parse tree
	 */
	void exitListStatement(BasilIRParser.ListStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BasilIRParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BasilIRParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(BasilIRParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(BasilIRParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterJump(BasilIRParser.JumpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitJump(BasilIRParser.JumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#lVar}.
	 * @param ctx the parse tree
	 */
	void enterLVar(BasilIRParser.LVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#lVar}.
	 * @param ctx the parse tree
	 */
	void exitLVar(BasilIRParser.LVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#bVLVar}.
	 * @param ctx the parse tree
	 */
	void enterBVLVar(BasilIRParser.BVLVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#bVLVar}.
	 * @param ctx the parse tree
	 */
	void exitBVLVar(BasilIRParser.BVLVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#intLVar}.
	 * @param ctx the parse tree
	 */
	void enterIntLVar(BasilIRParser.IntLVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#intLVar}.
	 * @param ctx the parse tree
	 */
	void exitIntLVar(BasilIRParser.IntLVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#boolLVar}.
	 * @param ctx the parse tree
	 */
	void enterBoolLVar(BasilIRParser.BoolLVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#boolLVar}.
	 * @param ctx the parse tree
	 */
	void exitBoolLVar(BasilIRParser.BoolLVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#listLVar}.
	 * @param ctx the parse tree
	 */
	void enterListLVar(BasilIRParser.ListLVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#listLVar}.
	 * @param ctx the parse tree
	 */
	void exitListLVar(BasilIRParser.ListLVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#listBlock}.
	 * @param ctx the parse tree
	 */
	void enterListBlock(BasilIRParser.ListBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#listBlock}.
	 * @param ctx the parse tree
	 */
	void exitListBlock(BasilIRParser.ListBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BasilIRParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BasilIRParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#pEntry}.
	 * @param ctx the parse tree
	 */
	void enterPEntry(BasilIRParser.PEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#pEntry}.
	 * @param ctx the parse tree
	 */
	void exitPEntry(BasilIRParser.PEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#pExit}.
	 * @param ctx the parse tree
	 */
	void enterPExit(BasilIRParser.PExitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#pExit}.
	 * @param ctx the parse tree
	 */
	void exitPExit(BasilIRParser.PExitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#pAddress}.
	 * @param ctx the parse tree
	 */
	void enterPAddress(BasilIRParser.PAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#pAddress}.
	 * @param ctx the parse tree
	 */
	void exitPAddress(BasilIRParser.PAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#internalBlocks}.
	 * @param ctx the parse tree
	 */
	void enterInternalBlocks(BasilIRParser.InternalBlocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#internalBlocks}.
	 * @param ctx the parse tree
	 */
	void exitInternalBlocks(BasilIRParser.InternalBlocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#procDef}.
	 * @param ctx the parse tree
	 */
	void enterProcDef(BasilIRParser.ProcDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#procDef}.
	 * @param ctx the parse tree
	 */
	void exitProcDef(BasilIRParser.ProcDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(BasilIRParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(BasilIRParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#listParams}.
	 * @param ctx the parse tree
	 */
	void enterListParams(BasilIRParser.ListParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#listParams}.
	 * @param ctx the parse tree
	 */
	void exitListParams(BasilIRParser.ListParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BasilIRParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BasilIRParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#bVExpr}.
	 * @param ctx the parse tree
	 */
	void enterBVExpr(BasilIRParser.BVExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#bVExpr}.
	 * @param ctx the parse tree
	 */
	void exitBVExpr(BasilIRParser.BVExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(BasilIRParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(BasilIRParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#logExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogExpr(BasilIRParser.LogExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#logExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogExpr(BasilIRParser.LogExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#intRVar}.
	 * @param ctx the parse tree
	 */
	void enterIntRVar(BasilIRParser.IntRVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#intRVar}.
	 * @param ctx the parse tree
	 */
	void exitIntRVar(BasilIRParser.IntRVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#bVRVar}.
	 * @param ctx the parse tree
	 */
	void enterBVRVar(BasilIRParser.BVRVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#bVRVar}.
	 * @param ctx the parse tree
	 */
	void exitBVRVar(BasilIRParser.BVRVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#boolRVar}.
	 * @param ctx the parse tree
	 */
	void enterBoolRVar(BasilIRParser.BoolRVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#boolRVar}.
	 * @param ctx the parse tree
	 */
	void exitBoolRVar(BasilIRParser.BoolRVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(BasilIRParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(BasilIRParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#bVUnOp}.
	 * @param ctx the parse tree
	 */
	void enterBVUnOp(BasilIRParser.BVUnOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#bVUnOp}.
	 * @param ctx the parse tree
	 */
	void exitBVUnOp(BasilIRParser.BVUnOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#bVBinOp}.
	 * @param ctx the parse tree
	 */
	void enterBVBinOp(BasilIRParser.BVBinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#bVBinOp}.
	 * @param ctx the parse tree
	 */
	void exitBVBinOp(BasilIRParser.BVBinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#bVLogicalBinOp}.
	 * @param ctx the parse tree
	 */
	void enterBVLogicalBinOp(BasilIRParser.BVLogicalBinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#bVLogicalBinOp}.
	 * @param ctx the parse tree
	 */
	void exitBVLogicalBinOp(BasilIRParser.BVLogicalBinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#intBinOp}.
	 * @param ctx the parse tree
	 */
	void enterIntBinOp(BasilIRParser.IntBinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#intBinOp}.
	 * @param ctx the parse tree
	 */
	void exitIntBinOp(BasilIRParser.IntBinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#intLogicalBinOp}.
	 * @param ctx the parse tree
	 */
	void enterIntLogicalBinOp(BasilIRParser.IntLogicalBinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#intLogicalBinOp}.
	 * @param ctx the parse tree
	 */
	void exitIntLogicalBinOp(BasilIRParser.IntLogicalBinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasilIRParser#boolBinOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolBinOp(BasilIRParser.BoolBinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasilIRParser#boolBinOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolBinOp(BasilIRParser.BoolBinOpContext ctx);
}