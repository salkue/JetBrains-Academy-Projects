class Main {
    public static void main(String[] args) {
        // put your code here
        int[] numbers=new int[10];
        for (int i=0;i<=9;i++){
            numbers[i]=i;
        }
        for (int i=9;i>=0;i--){
            System.out.print(numbers[i]);
            System.out.print(" ");}
    }
}
