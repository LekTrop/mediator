public class PackEmployee extends AbstractYogurtFactory{
    public PackEmployee(YogurtMediator yogurtMediator) {
        super(yogurtMediator);
    }
    void doPacking(){
        yogurtMediator.send("Pack....",this);
    }
}
