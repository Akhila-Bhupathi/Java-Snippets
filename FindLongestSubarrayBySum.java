public class FindLongestSubarrayBySum {
    public static void main(String[] args) {
        // int[] arr={1,2,3,4,5,6,7,8,9,10};
        // int sum=15;
        // int[] arr = {4,1,3,2,1,1,2,3,4,5};
        // int sum=4;
        int[] arr = {1,2,3,7,5};
        int sum=12;
        int[] result = findLongestSubarrayBySum(arr,sum);
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i]+" ");
        }
    }
    
    public static int[] findLongestSubarrayBySum(int[] a, int s) {
        int start=0;
        int end=0;
        int max=0;
        
        int i=0;
        int j=0;
        int sum=0;
        
        while(j<a.length) {
            sum+=a[j];
            if(sum > s) {
                sum-=a[i];
                i++;
            }
            if(sum == s) {
                if((j-i+1)>max) {
                    max=j-i+1;
                    start=i;
                    end=j;
                } 
                i=j+1;
                sum=0;
                
            }
            j++;
            
        }
        
        return new int[] {start+1,end+1};
    }
    
}
