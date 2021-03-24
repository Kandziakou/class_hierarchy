public class Dog extends Pet{
    public void dogSounds(){
        System.out.println(sound() + "barking");
    }

    @Override
    public void petName(){
        System.out.println("Dog name is Dog");
    }
}
