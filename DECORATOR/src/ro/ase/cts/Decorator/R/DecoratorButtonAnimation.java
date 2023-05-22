package ro.ase.cts.Decorator.R;

public class DecoratorButtonAnimation extends AbstractDECORATORVisualControl{
    public DecoratorButtonAnimation(AbstractVisualControl visualControl) {
        super(visualControl);
    }

    @Override
    public void click() {
       this.visualControl.click();
       System.out.println("Animatie Buton");
    }
}
