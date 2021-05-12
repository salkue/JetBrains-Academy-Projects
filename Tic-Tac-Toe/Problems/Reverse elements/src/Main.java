class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
     /*   int[][] tempArray = new int[twoDimArray.length][twoDimArray[0].length];
        for (int i = 0; i < twoDimArray.length; i++) {
            int counter = 0;
            for (int j = twoDimArray[0].length - 1; j >= 0; j--) {
                tempArray[i][counter] = twoDimArray[i][j];
                counter++;
            }
        }*/
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length - 1 - j; j++) {
                int temp = twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[i][twoDimArray[i].length - 1 - j];
//                System.out.println(twoDimArray[i][twoDimArray[i].length - 1 - j]);
                twoDimArray[i][twoDimArray[i].length - 1 - j] = temp;
            }
        }
    }


//    public static void main(String[] args) {
//        int[][] test = {{1, 2, 3}, {4, 5, 6,},};
//        System.out.println(Arrays.deepToString(test));
//        reverseElements(test);
//        System.out.println(Arrays.deepToString(test));
//    }
}