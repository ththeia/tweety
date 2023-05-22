package ro.ase.cts.Class.Adapter;

public class MatricealPrinter implements InterfacePrinterMatriceal{
    private String idPrinter;

    public void print(String text){
        System.out.println("Imprimanta: Printing..." +text);
    }

    @Override
    public void cancel() {
        System.out.println("Printer: Cancel print");
    }
}
