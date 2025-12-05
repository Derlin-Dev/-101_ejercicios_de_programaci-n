public class Main {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = two_Sum(nums, target);

        if (result == null || result.length == 0) System.out.println("Valores no encotrados");
        else System.out.println("La suma de : " + target + " son : " + result[0] + ", " + result[1]);
    }

    public static int[] two_Sum(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            int num1 = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int num2 = arr[j];

                if (num1 + num2 == target) return new int[] {i, j};
            }
        }

        return new int[0];
    }
}