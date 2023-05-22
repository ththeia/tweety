package ro.ase.cts.Class.Adapter;

public class ClassAdapter extends MatricealPrinter implements InterfacePrinterLaser{

    @Override
    public void laserPrint(String[] paragraphs) {
        this.print(paragraph2Text(paragraphs));
    }

    @Override
    public void cancelPrint() {
        this.cancel();
    }

    public String paragraph2Text(String[] paragraphs){
        StringBuilder sb = new StringBuilder();
        for(String paragraph: paragraphs)
            sb.append(" "+paragraph);
        return sb.toString();
    }
}
 