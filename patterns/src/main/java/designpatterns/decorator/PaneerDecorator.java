package designpatterns.decorator;

public class PaneerDecorator extends BaseDecorator {

    public PaneerDecorator(Pizaa nextLayer) {
        super(nextLayer);
        System.out.println("Pizza with Paneer.");
    }
}
