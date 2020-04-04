public interface BubbleBathable extends Soakable,Scrubbable{

    void takeBubbleBath();

    default void wash(){
        System.out.println("bubble bath default");
    }

}
