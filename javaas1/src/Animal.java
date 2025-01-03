public class Animal {
    public void AniSound(){
        System.out.println("Bawww");
    }
}
class Cat extends Animal{
    public void AniSound(){
        super.AniSound();
        System.out.println("Meowww");
    }
}