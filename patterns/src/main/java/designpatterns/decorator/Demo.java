package designpatterns.decorator;

public class Demo {

    private static boolean addPanner;
    private static boolean addCheese;

    public static void main(String[] args) {
        Pizaa pizaa = new PizaaBase();

        if(addCheese)
            pizaa = new CheesDecorator(pizaa);

        if(addPanner)
            pizaa = new PaneerDecorator(pizaa);
    }
}
