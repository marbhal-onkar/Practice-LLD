package designpatterns.decorator;

public class BaseDecorator implements Pizaa {

    Pizaa nextLayer;

    public BaseDecorator(Pizaa nextLayer) {
        this.nextLayer = nextLayer;
        System.out.println("Simple Pizza");
    }
}
