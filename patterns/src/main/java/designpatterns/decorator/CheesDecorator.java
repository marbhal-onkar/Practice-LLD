package designpatterns.decorator;

public class CheesDecorator extends BaseDecorator {

    public CheesDecorator(Pizaa nextLayer){
        super(nextLayer);
        System.out.println("Pizza with cheese.");
    }
}
