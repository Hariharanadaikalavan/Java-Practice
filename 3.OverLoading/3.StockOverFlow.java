public class StockOverFlowError {
    

    double overloadedMethod(double d)
    {
        return d *= d;
        
    }
 
    int overloadedMethod(int i)
    {
        return i *= i;
    }
 
    float overloadedMethod(float f)
    {
        return f *= f;
    }
 
    public static void main(String[] args)
    {
        StockOverFlowError obj = new StockOverFlowError();
 
        System.out.println(obj.overloadedMethod(100.56));
    }
}
