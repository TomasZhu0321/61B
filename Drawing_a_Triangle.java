public class Drawing_a_Triangle {
    public static void main(String[] args){
        int i=1;
        int j=0;
        while (i<8){
            while(j<i){               
                System.out.print("*");
                j++;
            }
        System.out.println("");
        i++;
        j=0;
        }
    }
}