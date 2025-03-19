public class pro9 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for (byte ch = 1; ch <=1+i; ch++) {  // Inner loop for characters
                System.out.print(i + " "); 
            }
            System.out.println("");
        }
    }
}