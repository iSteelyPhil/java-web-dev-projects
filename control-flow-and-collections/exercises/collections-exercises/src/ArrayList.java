public class ArrayList {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr){
            if (integer % 2 == 0){
                total += integer;
            }
        }
        return total;
    }
}
