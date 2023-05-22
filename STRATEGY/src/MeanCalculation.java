public class MeanCalculation implements InterfaceProcess {

    @Override
    public int process(int[] values) {
        if(values ==null)
            return 0;
        int mean =0;
        for(int i=0;i<values.length;i++)
            mean+=values[i];
        return mean/values.length;

    }
}
