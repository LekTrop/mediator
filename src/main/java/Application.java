public class Application {
    public static void main(String[] args) {
        TechnicalTaskProducer technicalTaskProducer = new TechnicalTaskProducer();
        Delivery delivery = new Delivery();
        Employee employee = new Employee();
        IssueManager issueManager = new IssueManager();
        Manager manager = new Manager();
        Client client = new Client("Alex");

        Mediator mediator = new Mediator(client,technicalTaskProducer,manager,issueManager,employee,delivery);

        client.setMediator(mediator);
        technicalTaskProducer.setMediator(mediator);
        manager.setMediator(mediator);
        issueManager.setMediator(mediator);
        employee.setMediator(mediator);

        client.createOrder(100L);


    }
}
