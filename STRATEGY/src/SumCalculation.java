public class SumCalculation implements InterfaceProcess{
    @Override
    public int process(int[] values) {
        if(values ==null)
            return 0;
        int sum=0;
        for(int i =0; i<values.length;i++)
            sum+=values[i];
        return sum;
    }
}
