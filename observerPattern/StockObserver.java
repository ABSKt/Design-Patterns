public class StockObserver implements Observer{

    private double IBMstock;
    private double GOOGstock;
    private double AAPLstock;

    private Subject stockGrabbber;

    public StockObserver(Subject stockgrabber){
        this.stockGrabbber = stockgrabber;
        System.out.println("New Observer ");
        stockGrabbber.register(this);
    }
    @Override
    public void update(double IBMstock, double GOOGstock, double AAPLstock) {
        // TODO Auto-generated method stub
        this.IBMstock = IBMstock;
        this.GOOGstock = GOOGstock;
        this.AAPLstock = AAPLstock;

        printThePrices();
    }

    public void printThePrices(){
		System.out.println("\nIBM: " + IBMstock + "\nAAPL: " + AAPLstock + "\nGOOG: " + GOOGstock + "\n");
		
	}
    
}
