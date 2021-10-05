public abstract class AbstractYogurtFactory {
    protected YogurtMediator yogurtMediator;

    public AbstractYogurtFactory(YogurtMediator yogurtMediator) {
        this.yogurtMediator = yogurtMediator;
    }
}
