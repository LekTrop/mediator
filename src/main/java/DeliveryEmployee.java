public class DeliveryEmployee extends AbstractYogurtFactory{

    public DeliveryEmployee(YogurtMediator yogurtMediator) {
        super(yogurtMediator);
    }

    public void doDelivery(){
        System.out.println("Make delivery");
    }
}
