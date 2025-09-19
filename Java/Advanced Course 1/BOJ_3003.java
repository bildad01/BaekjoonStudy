import java.util.Scanner;

public class BOJ_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        for(int k=0; k<6; k++){
            arr[k] = sc.nextInt();
        } sc.close();
        int[] A = new int[6];
        int[] B = {1,1,2,2,2,8};

        for(int i = 0; i < 6; i++){
            A[i] = B[i] - arr[i];        
        }
        for(int num = 0; num <6; num++){
            System.out.print(A[num]);
            if(num<5){
                System.out.print(" ");
            }
        }




        
    }
    
}
