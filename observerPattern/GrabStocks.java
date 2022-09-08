public class GrabStocks {
    public static void main (String args[]){
        StockGrabber stockGrabber = new StockGrabber();
		
		// Create an Observer that will be sent updates from Subject
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(198.00);
		stockGrabber.setAAPLPrice(777.60);
		stockGrabber.setGOOGPrice(776.40);
		
		// Delete one of the observers
		
		stockGrabber.unregister(observer2);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
    }
}
