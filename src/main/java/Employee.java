public class Employee {
    private Mediator mediator;

    public Yogurt createYogurt(){
        System.out.println("Create yogurt");

        System.out.println("End create");

        mediator.sendNotificationForDelivery();

        return new Yogurt();
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
