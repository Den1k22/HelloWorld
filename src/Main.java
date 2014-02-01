import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n=10;
        int a=n;
        int c,d;
        int[] aaa = new int[n];
        Random rr = new Random();
        for (int i = 0; i<n; ++i)
        {
            int bb = rr.nextInt(100);
            aaa[i] = bb;
        }
        for (int i=0;i<n;++i)
        {
            System.out.print(aaa[i] + " ");
        }
        System.out.println();
        do
        {
            d = 0;
            for (int i=1;i<a;++i)
            { if (aaa[i]>aaa[d])
                {
                    d = i;
                }
            }
            c = aaa[a-1];
            aaa[a-1] = aaa[d];
            aaa[d] = c;
            --a;
        }while (a > 0);
        for (int i=0;i<n;++i)
        {
            System.out.print(aaa[i] + " ");
        }
        System.out.println();
        //ax^2+bx+c=0;
        int xa = 1,xb = 6,xc = -16,xd;
        double x1,x2;
        if (xa==0&&xb==0&&xc==0){System.out.println("lox");}
        else
        {
            xd=xb*xb-4*xa*xc;
            if (xd < 0){ System.out.println("lox");}
            else
            {
              x1 = (-xb + Math.sqrt(xd))/2*xa;
              x2 = (-xb - Math.sqrt(xd))/2*xa;
              System.out.print(x1 + " " + x2);
            }
        }
        System.out.println();
        //fibonaci
        int fi1=0,fi2=1,f;
        System.out.print(fi1 + " " + fi2 + " ");
        for (int i=0; i<10;++i)
        {
          f = fi2;
          fi2 = fi1+fi2;
          fi1 = f;
          System.out.print(fi2+ " ");
        }
        System.out.println();
    }
}