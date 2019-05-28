import java.util.ArrayList;
import java.util.Stack;

public class EndOfTheLine {
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    static double add(double b,double a){
        return b+a;
    }
    static double minus(double b,double a){
        return b-a;
    }
    static double multiply(double b,double a){
        return b*a;
    }
    static double division(double b,double a){
        return b/a;
    }static double power(double b,double a){
        return Math.pow(b,a);
    }


     static double silnia(double i) {
        if (i < 1)
            return 1;
        else
            return i * silnia(i - 1);
    }
    static double sqrt(double a){
        return Math.sqrt(a);
    }
    static double sin(double a){
        return Math.sin(Math.toRadians(a));
    }static double cos(double a){
        return Math.cos(Math.toRadians(a));
    }

    static double tan(double a){

        return Math.tan(Math.toRadians(a));
    }
    static double cbrt(double a) {
        return Math.cbrt(a);
    }
    static double log(double a) {
        return Math.log10(a);
    }
    static boolean isFunc(String op) {
        switch (op) {
            case "sin":
                return true;

            case "cos":
                return true;

            case "tan":
                return true;
            case "cbrt":

                return true;
            case "!":
                return true;
            case "sqt":
                return true;
            case "log":
                return true;
        }

        return false;
    }
    static double wichFunc(double a,String op) {
        switch (op) {
            case "sin":

                return sin(a);
            case "cos":
                return cos(a);

            case "tan":
                return tan(a);
            case "cbrt":
                return cbrt(a);

            case "!":
                return silnia(a);
            case "sqt":
                return sqrt(a);
            case "log":
                return log(a);
        }

        return 0;
    }
    static double wichOperator(double b,double a,String op) {
        switch (op) {
            case "+":

                return add(b,a);
            case "-":
                return minus(b,a);

            case "*":
                return multiply(b, a);
            case "/":
                return division(b, a);

            case "^":
                return power(b, a);


        }

        return 0;
    }

    static boolean isOperator(String ch) {
        switch (ch) {
            case "+":

                return true;
            case "-":
                return true;

            case "*":
                return true;
            case "/":
                return true;

            case "^":
                return true;


        }

        return false;
    }
    public String EndOfTheLine(Stack<String> stos){
        ArrayList<String> postfix=new ArrayList<>();
        for (String a:
             stos) {
            postfix.add(a);


        }
        Stack<Double> entrence=new Stack<>();
        System.out.println(postfix);

        for (String a:
             postfix) {
            if (isNumeric(a)){
                double b= Double.parseDouble((a));
                entrence.push(b);

            }else if (isOperator(a)){
                double numb1=entrence.pop();
                double numb2=entrence.pop();
                entrence.push(wichOperator(numb2,numb1,a));

            }else if (isFunc(a)){
                double numb1=entrence.pop();
                entrence.push(wichFunc(numb1,a));

            }

        }
        String MożemyIść= String.valueOf(entrence.peek());
        return MożemyIść;
    }

}
