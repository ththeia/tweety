package ro.ase.cts.Decorator.R;

public class DecoratorButtonSound extends AbstractDECORATORVisualControl {
    String fileSound;

    public DecoratorButtonSound(AbstractVisualControl visualControl, String file){
        super(visualControl);
        this.fileSound=file;
    }

    @Override
    public void click() {
        System.out.println("Sound on" +fileSound);
    }
}
