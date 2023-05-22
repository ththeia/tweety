package ro.ase.cts.COMPOSITE;

//the leaf node
public class Employee extends AbstractNodeStrHierach{

    //specific attributes for employees
    String name;
    String post;
    double salary;

    public Employee(String name, String post){
        this.name=name;
        this.post=post;
    }

    public void setSalary(double value){
        this.salary = value;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPost() {
        return this.post;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }


}
