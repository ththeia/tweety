package ro.ase.cts.COMPOSITE;

import java.util.ArrayList;

//the composite node

public class OrganizationalStructure extends AbstractNodeStrHierach{

    //ArrayList to handle the collection of nodes
    ArrayList<AbstractNodeStrHierach> structureElements = new ArrayList();
    String strName;
    String description;

    public OrganizationalStructure(String strName, String description){
        this.strName = strName;
        this.description=description;

    }
    //the methods that don't make sense for the STRUCTURE but were ovveriden because of the inheritance will throw exception
    @Override
    public String getName() {
        return this.strName;
    }

    @Override
    public String getPost() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getSalary() {
        float totalSalaries=0;
        for(AbstractNodeStrHierach node : this.structureElements){
            totalSalaries+= node.getSalary();
        }
        return totalSalaries;
    }


    //the methods inherited from the ABSTRACT CLASS must be OVERRIDEN MANUALLY AS THEY ARE NOT REQUESTED ANYMORE
    //because they are already implementen in the abstract class with throw exception
    public void addChildNode(AbstractNodeStrHierach strElement){
        structureElements.add(strElement);
    }

    public void deleteChildNode(AbstractNodeStrHierach strElement){
        structureElements.remove(strElement);
    }
    public AbstractNodeStrHierach getChildNode(int i){
        return (AbstractNodeStrHierach)structureElements.get(i);
    }
}
