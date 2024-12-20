// Generated from /home/zakaria/Desktop/Work_Space/compile_mini_ING/bin/antlr/Grammaire1.g4 by ANTLR 4.13.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Grammaire1Parser}.
 */
public interface Grammaire1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Grammaire1Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Grammaire1Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#var_global}.
	 * @param ctx the parse tree
	 */
	void enterVar_global(Grammaire1Parser.Var_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#var_global}.
	 * @param ctx the parse tree
	 */
	void exitVar_global(Grammaire1Parser.Var_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#var_expression}.
	 * @param ctx the parse tree
	 */
	void enterVar_expression(Grammaire1Parser.Var_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#var_expression}.
	 * @param ctx the parse tree
	 */
	void exitVar_expression(Grammaire1Parser.Var_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#id_variable}.
	 * @param ctx the parse tree
	 */
	void enterId_variable(Grammaire1Parser.Id_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#id_variable}.
	 * @param ctx the parse tree
	 */
	void exitId_variable(Grammaire1Parser.Id_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#tableau}.
	 * @param ctx the parse tree
	 */
	void enterTableau(Grammaire1Parser.TableauContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#tableau}.
	 * @param ctx the parse tree
	 */
	void exitTableau(Grammaire1Parser.TableauContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Grammaire1Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Grammaire1Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#declaration_expression}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_expression(Grammaire1Parser.Declaration_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#declaration_expression}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_expression(Grammaire1Parser.Declaration_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(Grammaire1Parser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(Grammaire1Parser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(Grammaire1Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(Grammaire1Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#instruction_expression}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_expression(Grammaire1Parser.Instruction_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#instruction_expression}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_expression(Grammaire1Parser.Instruction_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(Grammaire1Parser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(Grammaire1Parser.AffectationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Grammaire1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Grammaire1Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(Grammaire1Parser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(Grammaire1Parser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#condition_simple}.
	 * @param ctx the parse tree
	 */
	void enterCondition_simple(Grammaire1Parser.Condition_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#condition_simple}.
	 * @param ctx the parse tree
	 */
	void exitCondition_simple(Grammaire1Parser.Condition_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(Grammaire1Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(Grammaire1Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#boucle}.
	 * @param ctx the parse tree
	 */
	void enterBoucle(Grammaire1Parser.BoucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#boucle}.
	 * @param ctx the parse tree
	 */
	void exitBoucle(Grammaire1Parser.BoucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#fonction}.
	 * @param ctx the parse tree
	 */
	void enterFonction(Grammaire1Parser.FonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#fonction}.
	 * @param ctx the parse tree
	 */
	void exitFonction(Grammaire1Parser.FonctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(Grammaire1Parser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(Grammaire1Parser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammaire1Parser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(Grammaire1Parser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammaire1Parser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(Grammaire1Parser.ReadContext ctx);
}