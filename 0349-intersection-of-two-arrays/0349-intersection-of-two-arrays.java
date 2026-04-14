class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> InputSet = new HashSet<>();
        Set<Integer> Intersection = new HashSet<>();

        for(int num : nums1) {
            InputSet.add(num);
        }
        for(int num : nums2) {
            if(InputSet.contains(num)) {
                Intersection.add(num);
            }
        }
        int result[] = new int[Intersection.size()];
        int i=0;
        for( int num : Intersection) {
            result[i++] = num;
        }
        return result;
    }
}