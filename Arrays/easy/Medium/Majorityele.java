package Arrays.easy.Medium;

//Given an array nums of size n, return the majority element.

//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

class Majorityele {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele = 0;
        for (int num : nums) {
            if (count == 0) {
                if (ele != num)
                    ele = num;
                count++;
            } else {
                if (ele != num)
                    count--;
                else
                    count++;
            }
        }
        return ele;
    }
}
