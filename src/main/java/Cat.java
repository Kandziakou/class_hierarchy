public class Cat extends Pet{
    public void catSounds(){
        System.out.println(sound() + "meowing");
    }

    @Override
    public void petName(){
        System.out.println("Cat name is Dog too");
    }
}
