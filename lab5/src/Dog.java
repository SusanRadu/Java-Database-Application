public class Dog extends Animal implements BubbleBathable{

    @Override
    public void wash(){
        System.out.println("wasing a dog");
    }

    public void soak(){
        System.out.println("soaking a dog");
    }


    @Override
    public void takeBubbleBath() {

    }

    @Override
    public void scrub() {

    }
}
