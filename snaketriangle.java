public class main{
    public static void main(String[]args){
        int n=5;
        int num=1;
        for(int i=1;i<=n;i++){
            int s=num;
            num+=i;
            if(i%2==0){
                for(int j=num-1;j>=s;j--){
                    System.out.print(j +" ");
                }
            }
            else{
                for(int j=s;j<num;j++){
                    System.out.print(j +" ");
                }
            }  
            System.out.println();  
            }
            
        }
    }
