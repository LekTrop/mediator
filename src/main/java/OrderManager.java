public class OrderManager extends AbstractYogurtFactory {

    private Order order;

    public void crateOrder() {
        yogurtMediator.send("Create order", this);
    }

    public OrderManager(YogurtMediator yogurtMediator, Order order) {
        super(yogurtMediator);
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
