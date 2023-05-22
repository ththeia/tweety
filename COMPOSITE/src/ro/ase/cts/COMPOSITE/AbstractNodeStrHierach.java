package ro.ase.cts.COMPOSITE;

public abstract class AbstractNodeStrHierach {

    //interface for attributes of a node
    public abstract String getName();
    public abstract String getPost();
    public abstract double getSalary();

    public String getInfo(){
        return this.getName() + " - " +this.getPost();
    }

    //Methods for adding a node to the hierachical structure
    public void addChildNode(AbstractNodeStrHierach strElement){
        throw new UnsupportedOperationException();
    }

    public void deleteChildNode(AbstractNodeStrHierach strElement){
        throw new UnsupportedOperationException();
    }
    public AbstractNodeStrHierach getChildNode(int i){
        throw new UnsupportedOperationException();
    }
}
