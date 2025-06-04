public class Main {
    public static void main(String[] args) {
        int number = 1111;
        String binaryString = Integer.toBinaryString(number);
        String hexString = Integer.toHexString(number);
        System.out.println("number = " + number);
        System.out.println("binary = " + binaryString);
        System.out.println("hex = " + hexString);
    }
}