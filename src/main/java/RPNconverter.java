import java.util.ArrayList;
import java.util.Stack;


public class RPNconverter {
    //ważność operatorów
    static boolean isFunc(String str) {
        char[] ch = str.toCharArray();
        if ((ch[0] >= 'a' && ch[0] <= 'z')) {
            return true;
        } else if (ch[0]=='!'){
            return true;

        }else {
            return false;
        }

    }

    static int prec(String ch) {
        switch (ch) {
            case "+":
                return 1;
            case "-":
                return 1;

            case "*":
                return 2;
            case "/":
                return 2;

            case "^":
                return 3;


        }

        return -1;
    }
    //1 to lewo
    //2 to prawo

    static int assoc(String ch) {
        switch (ch) {
            case "+":
                return 1;
            case "-":
                return 1;

            case "*":
                return 1;
            case "/":
                return 1;

            case "^":
                return 2;
            case ")":

        }

        return -1;
    }

    //czy to liczba
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(String.valueOf(str));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }


    static Stack<String> RPNconverter(String s) {


        String g = "   ";
        s += g;

        int counter = 0;

        char[] startArray = s.toCharArray();
        ArrayList<Character> f = new ArrayList<>();
        for (char a :
                startArray) {
            f.add(a);

        }


        Stack<String> output = new Stack<>();
        Stack<String> stack = new Stack<>();


        //konwersja

        while (!f.isEmpty()) {
            if (f.get(0).equals(',')) {
                f.remove(0);
            } else if (isNumeric(String.valueOf(f.get(0)))) {

                String string = "";

                while (isNumeric(String.valueOf(f.get(0))) || f.get(0) == '.') {


                    string += f.get(0);

                    f.remove(f.get(0));


                }
                output.push(string);


            }
            //jeśli znajdzie się w działaniu litera to automatycznie uzna ją za funkcję
            else if (!isNumeric(String.valueOf(f.get(0))) && ((f.get(0) >= 'a' && f.get(counter) <= 'z'))) {
                String string2 = "";

                while (!isNumeric(String.valueOf(f.get(0))) && ((f.get(0) >= 'a' && f.get(0) <= 'z'))) {
                    string2 += f.get(0);
                    f.remove(f.get(0));

                }
                stack.push(string2);


            } else if (!isNumeric(String.valueOf(f.get(0))) && f.get(0) != ')' && f.get(0) != '(') {
                while (!stack.isEmpty() && (
                        isFunc(stack.peek())
                                || prec(stack.peek()) > prec(String.valueOf(f.get(0)))
                                || (prec(stack.peek()) == prec(String.valueOf(f.get(0))) && assoc(stack.peek()) == 1))
                        && !stack.peek().equals('(')) {

                    output.push(stack.pop());

                }
                stack.push(String.valueOf(f.get(0)));
                f.remove(0);
            } else if (!isNumeric(String.valueOf(f.get(0))) && f.get(0).equals('(')) {
                stack.push(String.valueOf(f.get(0)));
                f.remove(0);

            } else if (!isNumeric(String.valueOf(f.get(0))) && f.get(0).equals(')')) {


                f.remove(0);
                while (!stack.peek().equals("(")) {

                    output.push(stack.pop());
                }

                if (stack.peek().equals("(")) {
                    stack.pop();
                }

            }
            if (f.isEmpty()) {
                while (!stack.isEmpty()) {
                    output.push(stack.pop());
                }
            }

        }
        int c=0;
        while (c<g.length()){
            output.pop();
            c++;
        }
        return output;

    }
}