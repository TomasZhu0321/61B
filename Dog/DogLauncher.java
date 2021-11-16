public class DogLauncher{
    public static void main(String[] args){
        Dog d1=new Dog(20);
        Dog d2=new Dog(40);
        Dog bigger=d1.maxDog(d2);
        bigger.makeNoise();
       
        
    }
}