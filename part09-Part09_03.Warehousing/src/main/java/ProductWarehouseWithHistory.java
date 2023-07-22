public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }
    
    public String history(){
        return changeHistory.toString();
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount){
        double ammount = super.takeFromWarehouse(amount);
        this.changeHistory.add(super.getBalance());
        return ammount;
    }

    public void printAnalysis(){
        System.out.println(
            "Product:" + super.getName()
            +"\nHistory: "+changeHistory.toString()
            +"\nLargest amount of product: "+changeHistory.maxValue()+"\n"
            +"\nSmallest amount of product: "+changeHistory.minValue()+"\n"
            +"\nAverage: "+changeHistory.average());
    }
}
