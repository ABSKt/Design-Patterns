import java.util.*;

public class StockGrabber implements Subject {

    public double AAPLstock;
    public double GOOGstock;
    public double IBMstock;

    ArrayList<Observer> arr;

    public StockGrabber() {
        this.arr = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        // TODO Auto-generated method stub
        arr.add(o);

    }

    @Override
    public void unregister(Observer o) {
        // TODO Auto-generated method stub
        int observerIndex = arr.indexOf(o);
        System.out.println("Observer " + (observerIndex + 1) + " deleted");
        arr.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub
        for (Observer observer : arr) {
            observer.update(IBMstock, GOOGstock, AAPLstock);
        }
    }

    public void setIBMPrice(double newIBMPrice) {
        this.IBMstock = newIBMPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice) {
        this.GOOGstock = newGOOGPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAPPLPrice) {
        this.AAPLstock = newAPPLPrice;
        notifyObserver();
    }

}
