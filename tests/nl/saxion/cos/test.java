package nl.saxion.cos;

public class test
{
    public static void main(String[] args)
    {
        boolean a = -2 > -5 && -10*10 > 10;
        long c = 12;
        int b= (int) (12 +c);
        // tempLocalLabel <- Local
        // jumpLabel <- Global
           if (a)
           {
               System.out.println(30*(-10));
           }
           else
           {
               System.out.println(10*(-10));
           }
//            if (a+2 > 2) // L2
//            {
//                System.out.println("da");
//            }
//            // GOTO L5
//            //L2
//            else if (a>1) // L3
//            {
//                System.out.println("else if");
//            }
//            // L3
//            else if (a>1) // L4
//            {
//                System.out.println("else if");
//            }
//            //GOTO L5
//            //L4
//            else
//            {
//                System.out.println("else");
//            }
//            //GOTO L5
//        }
//        // L1
//        else
//        {
//            System.out.println("nu");
//        }
        // L5
    }
}
