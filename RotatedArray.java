// public class RotatedArray {
//     public static void main (String[] args){
    
//     }
//     public int findMin(int[] nums) {
//         int first = 0;
//         int last = nums.length-1;
//         int key = nums[0];

//         return 0;
//     }
//     public static int binarySearch(int arr[], int first, int last, int key) {
//         if (last>=first){  
//             if (arr[mid] == key){  
//             return key;  
//             }
//             if((arr[mid] > arr[i - 1]) && arr[mid] < arr[i + 1]) {
//                 return 0;
//             }
//             if (arr[mid] > key){
//             return binarySearch(arr, first, mid-1, key);//search in left subarray  
//             }else{
//             return binarySearch(arr, mid+1, last, key);//search in right subarray  
//             }
//         }  
//     return -1;
//     }
// }  