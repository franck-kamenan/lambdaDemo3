package be.intecbrussel.lambda.demo3;

public class App
{
    public static void main(String[] args)
    {
        FuncInterface fun = (String s) -> System.out.println(s);

        String s = "Hello there";
        fun.functionality(s);

        s = "something different";

        FuncInterface anonFun = new FuncInterface()
        {
            String s = "I'm always overlooked : ' (";

            @Override
            public void functionality(String s)
            {
                s = this.s;
                System.out.println(s);
            }
        };
        
        anonFun.functionality(s);
    }
}
