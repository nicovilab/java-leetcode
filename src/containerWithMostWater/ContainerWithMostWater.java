package containerWithMostWater;

/*

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1


 */


public class ContainerWithMostWater {

    public int maxArea(int[] heigth){

        //we set a left pointer and a right pointer. calculate the max area possible and move the pointer until pointer a and b are in the same position
        //we move the smallest pointer because there is a possibility to get max area with higher heigth

        int maxArea = 0;
        int pointerA = 0;
        int pointerB = heigth.length -1;

        while(pointerA < pointerB){
            if(heigth[pointerA] < heigth[pointerB]){
                // area = heigth * width (pointer b - pointer a) -> the width of the container is just the distance between both pointers
                maxArea = Math.max(maxArea, heigth[pointerA] * (pointerB - pointerA)); //for heigth we take the smallest one, otherwise the container may overflow
                pointerA++;
            }else{
                    maxArea = Math.max(maxArea, heigth[pointerB] * (pointerB - pointerA));
                    pointerB--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater maxArea = new ContainerWithMostWater();


        int[] case1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea.maxArea(case1));

        int[] case2 = {1,1};
        System.out.println(maxArea.maxArea(case2));

    }
}
