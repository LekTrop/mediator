import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public class YogurtMediator implements Mediator {

    public static Storage storage = new Storage();

    private TechnicalTaskProducer technicalTaskProducer;
    private StorageInspector storageInspector;
    private CreateEmployee createEmployee;
    private PackEmployee packEmployee;
    private DeliveryEmployee deliveryEmployee;
    private OrderManager orderManager;

    private final Map<Class<?>, Consumer<AbstractYogurtFactory>> map = new HashMap<>();

    public YogurtMediator() {
        map.put(OrderManager.class, order -> technicalTaskProducer.createTechnicalTask(orderManager.getOrder()));
        map.put(TechnicalTaskProducer.class, taskProducer -> storageInspector.checkStorage(storage));
        map.put(StorageInspector.class, employee -> createEmployee.createYogurt());
        map.put(CreateEmployee.class, employee -> packEmployee.doPacking());
        map.put(PackEmployee.class, delivery -> deliveryEmployee.doDelivery());
    }

    @Override
    public void send(String msg, AbstractYogurtFactory abstractYogurtFactory) {
        System.out.println(msg);

        Optional.ofNullable(map.get(abstractYogurtFactory.getClass()))
                .ifPresentOrElse(action -> action.accept(abstractYogurtFactory),
                        () -> System.out.println("This type of operation is not supported"));

    }

    public static Storage getStorage() {
        return storage;
    }

    public static void setStorage(Storage storage) {
        YogurtMediator.storage = storage;
    }

    public TechnicalTaskProducer getTechnicalTaskProducer() {
        return technicalTaskProducer;
    }

    public void setTechnicalTaskProducer(TechnicalTaskProducer technicalTaskProducer) {
        this.technicalTaskProducer = technicalTaskProducer;
    }

    public StorageInspector getStorageInspector() {
        return storageInspector;
    }

    public void setStorageInspector(StorageInspector storageInspector) {
        this.storageInspector = storageInspector;
    }

    public CreateEmployee getCreateEmployee() {
        return createEmployee;
    }

    public void setCreateEmployee(CreateEmployee createEmployee) {
        this.createEmployee = createEmployee;
    }

    public PackEmployee getPackEmployee() {
        return packEmployee;
    }

    public void setPackEmployee(PackEmployee packEmployee) {
        this.packEmployee = packEmployee;
    }

    public DeliveryEmployee getDeliveryEmployee() {
        return deliveryEmployee;
    }

    public void setDeliveryEmployee(DeliveryEmployee deliveryEmployee) {
        this.deliveryEmployee = deliveryEmployee;
    }

    public Map<Class<?>, Consumer<AbstractYogurtFactory>> getMap() {
        return map;
    }

    public OrderManager getOrderManager() {
        return orderManager;
    }

    public void setOrderManager(OrderManager orderManager) {
        this.orderManager = orderManager;
    }
}
