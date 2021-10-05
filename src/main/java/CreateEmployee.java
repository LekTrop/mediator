public class CreateEmployee extends AbstractYogurtFactory{

    public void createYogurt() {
        yogurtMediator.send("Create yogurt", this);
    }

    public CreateEmployee(YogurtMediator yogurtMediator) {
        super(yogurtMediator);
    }

    public YogurtMediator getYogurtMediator() {
        return yogurtMediator;
    }

    public void setYogurtMediator(YogurtMediator yogurtMediator) {
        this.yogurtMediator = yogurtMediator;
    }
}
