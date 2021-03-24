public interface AnimalInterface {
    public default boolean isAlive(){
        return true;
    }
    public String sound();
}
