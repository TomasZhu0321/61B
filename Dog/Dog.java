public class Dog {
    public int weightInPound;
    public Dog(int w){
        weightInPound=w;
    }
    public void makeNoise(){
        if (weightInPound<10){
            System.out.println("yip!");
        }else if (weightInPound<30){
            System.out.println("bark!");
        }else{
            System.out.println("woooof!");
        }   
    }
    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.weightInPound>d2.weightInPound){
            return d1;
        }
        return d2;
    }
    public Dog maxDog(Dog d2){
        if (this.weightInPound>d2.weightInPound){
            return this;
        }
        return d2;
    }
}