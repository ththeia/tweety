package ro.ase.cts.Class.Adapter;

public class TestAdapter {
    public static void main(String[] args){

        System.out.println("Laser adapter example");
        InterfacePrinterLaser laser = new ClassAdapter();
        laser.laserPrint(new String[]{"This","is","a","test"});
        laser.cancelPrint();

    }
}
