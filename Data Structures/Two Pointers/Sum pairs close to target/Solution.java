class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        
        int n = arr.length;
        
        Arrays.sort(arr);
        
        int start = 0;
        int end = n - 1;
        
        int diff = Integer.MAX_VALUE;
        
        List<Integer> list = new ArrayList<>();
        
        while(start < end){
            int sum = arr[start] + arr[end];
            if(Math.abs(target - sum) < diff){
                diff = Math.abs(target - sum);
                list.clear();
                list.add(arr[start]);
                list.add(arr[end]);
            }
            if(sum < target){
                start++;
            }
            else if(sum > target){
                end--;
            }
            else{
                return list;
            }
        }
        
        return list;
        
    }
}
