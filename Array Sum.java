public class ArrSum{
    public static void main(String[] args){
     int[] arr = {-1,0,1,2,-1,-4};
     int n= arr.length; 
     int found=0;
     for(int i=0; i<n && found<2; i++){
    for(int j=i+1; j<n && found<2; j++){
    for(int k=j+1; k<n && found<2; k++){
        if(arr[i]+arr[j]+arr[k]==0){
        System.out.println("[" + arr[i]+","+arr[j]+","+arr[k]+"]");
        found++; 
}
}
}
}
}
} 
