public class Assert{
    public static void main(String[] args) {
        
    
    int as=45;
    int bs=76;
    Assert as > bs:"as is not less than bs";
    Assert as < bs:"as is not greater than bs";
    System.out.println("This line will not be executed if assertion fails.");
}
}