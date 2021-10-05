public class Application {
    public static void main(String[] args) {
        YogurtMediator mediator = new YogurtMediator();

        OrderManager orderManager = new OrderManager(mediator, new Order(1560L));
        TechnicalTaskProducer technicalTask = new TechnicalTaskProducer(mediator);
        DeliveryEmployee deliveryEmployee = new DeliveryEmployee(mediator);
        PackEmployee packer = new PackEmployee(mediator);
        StorageInspector storageInspector = new StorageInspector(mediator);
        CreateEmployee createEmployee = new CreateEmployee(mediator);

        mediator.setOrderManager(orderManager);
        mediator.setTechnicalTaskProducer(technicalTask);
        mediator.setDeliveryEmployee(deliveryEmployee);
        mediator.setPackEmployee(packer);
        mediator.setStorageInspector(storageInspector);
        mediator.setCreateEmployee(createEmployee);

        orderManager.crateOrder();
    }
}
