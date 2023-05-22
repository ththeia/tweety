package ro.ase.cts.Object.Adapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestAdapter {

    public static void main(String[] args){
        //Type A message collection
        ArrayList<TypeAmessage> messageTypeA = new ArrayList<>();
        messageTypeA.add(new TypeAmessage());
        messageTypeA.add(new TypeAmessage());

        for(TypeAmessage message : messageTypeA)
            message.display();


        //Type B message collection
        ArrayList<InterfaceTypeB> messageTypeB = new ArrayList<>();
        messageTypeB.add(new TypeBmessage());
        messageTypeB.add(new TypeBmessage());

        for(InterfaceTypeB message : messageTypeB)
            message.show();



        //Solution without Adapter
        ArrayList<Object> genericMessages = new ArrayList<>();
        genericMessages.add(new TypeAmessage());
        genericMessages.add(new TypeBmessage());

        for(Object message : genericMessages){
            if(message instanceof TypeAmessage){
                ((TypeAmessage) message).display();
            } else if (message instanceof TypeBmessage){
                ((TypeBmessage) message).show();;
            }
        }

        //With Adapter
        System.out.println("-----------------------------------------------------------------------------------------" +
                "");
        TypeAmessage mA= new TypeAmessage();
        mA.setText("Adapter example of mA text");
        ObjectAdaptor a2B =new ObjectAdaptor(mA);

        messageTypeB.add(a2B);

        for(InterfaceTypeB message : messageTypeB)
            message.show();

    }
}
