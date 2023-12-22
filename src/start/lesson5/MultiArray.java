package start.lesson5;

public class MultiArray {
    public static void main(String[] args) {

        // find a person with 172 high
        int[] group1 = {156, 172, 198};
        int[] group2 = {142, 199, 157};


        int[][] multiArray = {group1, group2};
        upperFor: for (int[] array : multiArray) {
            for (int number : array) {
                if (number == 172) {
                    System.out.println("found");
                } else{
                    System.out.println("not found");
                }
            }
        }       } }