import java.util.HashSet;
class Dupicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map=new HashSet<Integer>();//Creating HashMap.
        for(int i=0; i<nums.length; i++){
            if(map.contains(nums[i]))
                return true;
            map.add(nums[i]);
        }
        return false;
    }   
}
