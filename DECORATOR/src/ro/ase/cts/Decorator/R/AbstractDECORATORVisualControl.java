package ro.ase.cts.Decorator.R;

public abstract class AbstractDECORATORVisualControl extends AbstractVisualControl{

    protected AbstractVisualControl visualControl;

    //we ask for the object through the refference using super() and the refference this.visualControl= visualControl; ;
    public AbstractDECORATORVisualControl(AbstractVisualControl visualControl){
        super();
        this.visualControl= visualControl;
    }

    @Override
    public void click() {
        this.visualControl.click();
    }
}
