class Solution {
    void pushZerosToEnd(int[] arr) {

        int n = arr.length;
        
        int res = 0;
        
        for(int i = 0; i < n; i++){
            
            if(arr[i] != 0){
                int temp = arr[res];
                arr[res] = arr[i];
                arr[i] = temp;
                res++;
            }
            
        }
        
    }
}
