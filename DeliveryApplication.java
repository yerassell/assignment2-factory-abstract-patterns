import gui.Button;
import gui.Checkbox;
import gui.GUIFactory;
import transport.Logistics;

public class DeliveryApplication {
    private final GUIFactory factory;
    private final Logistics logistics;

    public DeliveryApplication(GUIFactory factory, Logistics logistics){
        this.factory = factory;
        this.logistics = logistics;
    }

    public void start(){
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();

        logistics.planDelivery();
    }
}
