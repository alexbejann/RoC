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
        return visit(ctx.arithmetic_expr());
    }
}
