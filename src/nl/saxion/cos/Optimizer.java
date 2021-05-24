package nl.saxion.cos;

import nl.saxion.cos.exceptions.CompilerException;

public class Optimizer extends RoCBaseVisitor<Object>
{

    @Override
    public Object visitNUMBER(RoCParser.NUMBERContext ctx)
    {
        Integer i = Integer.parseInt(ctx.getText());
        return i;
    }

    @Override
    public Object visitLogicalExpressionAndOr(RoCParser.LogicalExpressionAndOrContext ctx)
    {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);
        if (left != null && right != null && ctx.op.getText() != null)
        {
            switch (ctx.op.getText())
            {
                case "&&":
                    if (left instanceof Integer)
                        return getBooleanValue((Integer) left,(Integer) right, true);
                    break;
                case "||":
                    if (left instanceof Integer)
                        return getBooleanValue((Integer) left, (Integer) right, false);
                    break;
            }
        }

        return null;
    }

    @Override
    public Object visitComparisonExpressionWithOperator(RoCParser.ComparisonExpressionWithOperatorContext ctx)
    {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);

        if (left != null && right != null && ctx.op.getText() != null)
        {
            switch (ctx.op.getText())
            {
                case ">":
                    if (left instanceof Integer)
                        return getBooleanValue((Integer) left > (Integer) right);
                    break;
                case "<":
                    if (left instanceof Integer)
                        return getBooleanValue((Integer) left < (Integer) right);
                    break;
                case "<=":
                    if (left instanceof Integer)
                        return getBooleanValue((Integer) left <= (Integer) right);
                    break;
                case ">=":
                    if (left instanceof Integer)
                        return getBooleanValue((Integer) left >= (Integer) right);
                    break;
            }
        }
        //This line should never be reached
        return null;
    }

    /**
     *
     * @param value of the comparison
     * @return 1 if it's true or 0 if it's false, this values are meant for bytecode
     */
    private Object getBooleanValue(boolean value)
    {
        return value ? 1 : 0;
    }

    /**
     *
     * @param left
     * @param right
     * @param isAnd if logical &&
     * @return bytecode boolean value 1 or 0
     */
    private Object getBooleanValue(Integer left, Integer right, boolean isAnd)
    {
        if (isAnd)
        {
            if (left == 1 && right == 1)// return true if both of them are 1
                return 1;
            else // else return false if both are 0
                return 0;
        }
        else
        {
            if (left == 1)// if left is true return true, 1
                return left;
            else if (right == 1)// else if right is 1 return true
                return right;
            else // else both 0 return false
                return 0;
        }
    }

    @Override
    public Object visitADDSUBGRP(RoCParser.ADDSUBGRPContext ctx)
    {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);
        if (left != null && right != null)
        {
            if (ctx.op.getText().equals("+"))
            {
                if (left instanceof Integer)
                    return (Integer) left + (Integer) right;
            }
            else if (ctx.op.getText().equals("-"))
            {
                if (left instanceof Integer)
                    return (Integer) left - (Integer) right;
            }
        }
        //This line should never be reached
        return null;
    }

    @Override
    public Object visitMULDIVMODOPGRP(RoCParser.MULDIVMODOPGRPContext ctx)
    {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);
        if (left != null && right != null)
        {
            if (ctx.op.getText().equals("*"))
            {
                if (left instanceof Integer)
                    return (Integer) left * (Integer) right;
            }
            else if (ctx.op.getText().equals("/"))
            {
                if (left instanceof Integer)
                    return (Integer) left / (Integer) right;
            }
            else if (ctx.op.getText().equals("%"))
            {
                if (left instanceof Integer)
                    return (Integer) left % (Integer) right;
            }
        }
        //This line should never be reached
        return null;
    }

    /**
     * This method is needed to avoid returning null from a parenthesis operation,
     * because it should visit the node
     * @param ctx RoCParser.PARENGRPContext
     * @return result of the expression
     */
    @Override
    public Object visitPARENGRP(RoCParser.PARENGRPContext ctx)
    {
        return visit(ctx.expr());
    }
}
