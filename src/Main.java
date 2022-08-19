public class Main {
    public static void main(String[] args)
    {
        int pw;
        //int w=4;
        int w=11;
        if(w<=2)
        {
            pw=3;
            System.out.println(pw);
        }
        if(w>2&&w<=5)
        {
            pw=3+2*(w-2);
            System.out.println(pw);
        }
        if (w>5)
        {
            pw=3+2*5+3*(w-5);
            System.out.println(pw);
        }


    }
}