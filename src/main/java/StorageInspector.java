public class StorageInspector extends AbstractYogurtFactory {

    public StorageInspector(YogurtMediator yogurtMediator) {
        super(yogurtMediator);
    }

    public void checkStorage(Storage storage) {
        if (storage.getCounterOfGoods() > 0) {

            storage.setCounterOfGoods(storage.getCounterOfGoods() - 1);

            yogurtMediator.send("We can create Yogurt", this);
        } else {
            throw new IllegalStateException("Sorry but we cant");
        }
    }
}
