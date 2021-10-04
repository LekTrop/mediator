public class Manager {

    private Mediator mediator;

    public void processOrder(final Order order) {
        System.out.println("Process order");
        final Long orderPrice = order.getPrice();

        if (PriceRules.MIN_COUNT_OF_ORDER_PRICE < orderPrice) {
            mediator.sendIssueMessageToClient();
        } else {
            mediator.sendCreateTechnicalTaskNotification();
        }
    }

    public void checkStorage(Storage storage) {
        System.out.println("Check storage");
        if (storage.getCounterOfGoods() > 0) {

            storage.setCounterOfGoods(storage.getCounterOfGoods() - 1);

            mediator.sendNotificationForEmployee();
        } else {
            mediator.sendIssueMessageToClient();
        }
    }


    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
