package ro.ase.cts.Object.Adapter;

public class TypeAmessage implements InterfaceTypeA {
    String text;

    public TypeAmessage(){
        this.text = "Default A type Message";
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public void setText(String text) {

    }

    @Override
    public void display() {

    }
}
