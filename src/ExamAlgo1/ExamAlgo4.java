package ExamAlgo1;

public class ExamAlgo4 {

   public static int closestDistance(int[] array) {

      int min = Integer.MAX_VALUE;

      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array.length; j++) {
            if (i != j) {
               if (Math.abs(array[i] - array[j]) < min) {
                  min = Math.abs(array[i] - array[j]);
               }
            }
         }
      }

      return min;

   }

   public static void main(String[] args) {
      System.out.println(closestDistance(new int[] {1, 3, 98, 5, 99}));
   }

}
