public abstract class Pet implements AnimalInterface{
    public String sound(){
        return "Pet has ";
    }
    abstract void petName();
}