public class IssueManager {

    private Mediator mediator;

    public void sendIssueMessageToClient() {
        System.out.println("Sorry buy order cannot be accepted");
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
