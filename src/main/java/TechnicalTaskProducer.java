public class TechnicalTaskProducer extends AbstractYogurtFactory {

    public void createTechnicalTask(Order order) {
        if(order.getPrice() < PriceRules.MIN_COUNT_OF_ORDER_PRICE){
            throw new IllegalStateException("Sry but we cannot ");
        }
        yogurtMediator.send("Create TechnicalTask", this);
    }

    public TechnicalTaskProducer(YogurtMediator yogurtMediator) {
        super(yogurtMediator);
    }

    public YogurtMediator getYogurtMediator() {
        return yogurtMediator;
    }

    public void setYogurtMediator(YogurtMediator yogurtMediator) {
        this.yogurtMediator = yogurtMediator;
    }
}
