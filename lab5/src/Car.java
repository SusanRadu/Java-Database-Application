public class Car implements BubbleBathable{

    @Override
    public void wash(){
        System.out.println("washing a car");
    }

    @Override
    public void takeBubbleBath() {

    }

    @Override
    public void scrub() {
        System.out.println("Soft Scrub");
    }

    @Override
    public void soak() {

    }
}
