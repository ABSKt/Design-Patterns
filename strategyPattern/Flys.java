public interface Flys {
 String Fly();   
}

class Itflys implements Flys{
    public String Fly(){
        return "Flying High";
    }
}

class cantFly implements Flys{
    public String Fly(){
        return "Can't Fly";
    }
}