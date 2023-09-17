import java.util.HashSet;
class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
       HashSet<Integer> hashnums = new HashSet<Integer>();
       for (int i : nums) {
           if(hashnums.contains(i)){
               return true;
           }
           hashnums.add(i);
       }
       return false;
    }

    public static void main(String[] args){
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 4, 2};
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
    }
}