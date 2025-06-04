public class Main {
    public static void main(String[] args) {
//        int number = 5;
//
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(number + " x " + i + " = " + (number * i));
//        }

        for(int i = 1; i < 10;i++){
            System.out.println(i + "단");
            for(int j = 1; j < 10; j++) {
                System.out.println( i + " x "+ j + " = " + (i * j));
            }
            System.out.println("-------------------");
        }
    }
}