package ro.ase.cts.Decorator.R;

public class Button extends AbstractVisualControl{
    public Button(String text, int id){
        this.text=text;
        this.id=id;
    }
    @Override
    public void click() {
       System.out.println("Simple click on the button" +text);
    }
}
