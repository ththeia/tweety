package ro.ase.cts.Object.Adapter;

public class ObjectAdaptor implements InterfaceTypeB {
    InterfaceTypeA typeA;

    //we need to ask for the existing object as below
    // and we need to override the existing methods and objects
    public ObjectAdaptor(InterfaceTypeA ref){
        typeA=ref;
    }
    @Override
    public String[] getText() {
        return typeA.getText().split(" ");
    }

    @Override
    public void setText(String[] words) {
    StringBuilder builder =new StringBuilder();
    for (String s : words){
        builder.append(s+ " ");
    }
    typeA.setText(builder.toString());
    }

    @Override
    public void show() {
     typeA.display();
    }
}
