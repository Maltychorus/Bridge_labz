// given array = [2,7,9,11] , target = 9 , sum of two numbers = 9 , output = [0,1] i.e. index of 2 and 7  

public class July3 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 11};
        int target = 9;
        
        for (int i = 0 ; i < arr.length; i++){
            for (int j = i + 1 ; j < arr.length; j++){
                if (arr[i]+arr[j] == target){
                    System.out.println("Output: [" + i + "," + j + "]");
                    return;
                }
            }
        }
        System.out.println("No two numbers found that sum to the target.");
    }
}
