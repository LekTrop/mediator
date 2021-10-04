public class TechnicalTaskProducer {

    private Mediator mediator;

    public TechnicalTask createTechnicalTask(){
        System.out.println("create task");
        mediator.sendCheckerNotification();
        return new TechnicalTask();
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
