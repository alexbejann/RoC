package nl.saxion.cos;

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
        return super.visitADDSUBGRP(ctx);
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
        return super.visitMULDIVMODOPGRP(ctx);
    }
}