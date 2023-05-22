public class DataCollection {
    protected int values[];
    protected InterfaceProcess entity;

    public DataCollection(int n){
        values = new int[n];
        for(int i =0; i<n; i++){
            values[i]=i+1;
        }
    }

    public void setStrategy(InterfaceProcess entity){
        this.entity=entity;
    }

    public int dataProcessing(){
        if(entity != null)
            return entity.process(values);
        else
            throw new UnsupportedOperationException();
    }
}
