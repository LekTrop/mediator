public class Mediator {

    public static Storage storage = new Storage();

    private Client client;
    private TechnicalTaskProducer technicalTaskProducer;
    private Manager manager;
    private IssueManager issueManager;
    private Employee employee;
    private Delivery delivery;

    public void sendFinancialManagerNotification(final Order order) {
        manager.processOrder(order);
    }

    public void sendIssueMessageToClient() {
        issueManager.sendIssueMessageToClient();
    }

    public void sendCreateTechnicalTaskNotification() {
        technicalTaskProducer.createTechnicalTask();
    }

    public void sendCheckerNotification() {
        manager.checkStorage(storage);
    }

    public void sendNotificationForEmployee() {
        employee.createYogurt();
    }

    public void sendNotificationForDelivery(){
        delivery.makeDelivery();
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public TechnicalTaskProducer getTechnicalTaskProducer() {
        return technicalTaskProducer;
    }

    public void setTechnicalTaskProducer(TechnicalTaskProducer technicalTaskProducer) {
        this.technicalTaskProducer = technicalTaskProducer;
    }

    public IssueManager getIssueManager() {
        return issueManager;
    }

    public void setIssueManager(IssueManager issueManager) {
        this.issueManager = issueManager;
    }

    public static Storage getStorage() {
        return storage;
    }

    public static void setStorage(Storage storage) {
        Mediator.storage = storage;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Mediator(Client client, TechnicalTaskProducer technicalTaskProducer, Manager manager, IssueManager issueManager, Employee employee, Delivery delivery) {
        this.client = client;
        this.technicalTaskProducer = technicalTaskProducer;
        this.manager = manager;
        this.issueManager = issueManager;
        this.employee = employee;
        this.delivery = delivery;
    }
}
