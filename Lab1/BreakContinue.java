public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
      for (int i=0;i<a.length;i++){
          if(a[i]>=0){
              for(int j=1;j<=n;j++){
                  if(i+j<a.length){
                    a[i]=a[i]+a[j+i];
                  }          
                  else{
                      break;
                  }
              }
          }else{
            a[i]=a[i];
            continue;
        }
      }
      System.out.print(a);
    }
    public static void main(String[] args) {
      int[] a = {1,-1,-1,10,5,-1};
      int n = 2;
      windowPosSum(a, n);
  
      // Should print 4, 8, -3, 13, 9, 4
      System.out.println(java.util.Arrays.toString(a));
    }
  }