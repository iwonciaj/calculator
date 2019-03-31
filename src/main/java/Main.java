

public class Main {
    public static void main(String[] args) {
        /*List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);*/
        Window window = new Window();
        String string;
        window.setFrame();
        RPNconverter converter =new RPNconverter();
        string="3+4*2/(1−5)^2^3";//tytaj można wpisać działanie na razie tylko żeby przetestować czy działą
        System.out.println(converter.RPNconverter(string));


    }
}
