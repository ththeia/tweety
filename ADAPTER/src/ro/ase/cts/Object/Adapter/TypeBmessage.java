package ro.ase.cts.Object.Adapter;

public class TypeBmessage implements InterfaceTypeB {
    String[] words;

    public TypeBmessage(){
        this.words= new String("Default B type message").split(" ");

    }
    @Override
    public String[] getText() {
        return this.words;
    }

    @Override
    public void setText(String[] Words) {
        words = new String[Words.length];
        System.arraycopy(Words,0,words,0,Words.length);
    }

    @Override
    public void show() {
        System.out.println("Message:");
        for(int i = 0; i<words.length;i++)
            System.out.print(words[i]+ "*");
        System.out.print('\n');
    }
}
