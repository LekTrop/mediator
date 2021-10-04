public class Client {

    private String name;
    private Mediator mediator;

    public Order createOrder(Long price) {
        System.out.println("Create order");
        Order order = new Order(price, this);
        mediator.sendFinancialManagerNotification(order);
        return order;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client(String name) {
        this.name = name;
    }
}
