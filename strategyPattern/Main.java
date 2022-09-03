public class Main{
    public static void main(String[] args){
        Animal doggy = new Dogs();
        Animal mithu = new Bird();

        System.out.println(doggy.makeItFly());
        System.out.println(mithu.makeItFly());

        doggy.setFlys(new Itflys());

        System.out.println(doggy.makeItFly());
    }
}