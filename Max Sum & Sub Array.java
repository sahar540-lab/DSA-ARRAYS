public class Array {
    public static void main(String[] args) {
        int arr[] = [-2, 1, -3, 4, -1, 2, 1, -5, 4];
        int sum = 0;
        int max = arr[0];
        int start = 0;
        int end = 0;
        int s = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum > max) {
                max = sum;
                start = s;
                end = i; }
            if(sum < 0) {
                sum = 0;
                s = i + 1;     }     }
        System.out.println("Maximum Sum = " + max);
        System.out.print("Subarray = ");
        for(int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");  
        }
    }
}
       
    

