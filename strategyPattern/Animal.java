public class Animal {
    public Flys flys;

    public String makeItFly(){
        return flys.Fly();
    }

    public void setFlys(Flys flyingType){
        flys = flyingType;
    }
}