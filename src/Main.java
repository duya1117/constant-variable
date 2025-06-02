public class Main {
    public static void main(String[] args) {
//        "happy", :angry", "sad", etc.
        String mood = "";

        switch (mood) {
            case "happy":
                System.out.println("나는 행복하다. 왜냐하면 행복하기 때문이다.");
                break;
            case "tired":
                System.out.println("피곤하다 너무 자고싶다.");
                break;
            case "sad":
                System.out.println("수업중이라 잘 수가 없어 슬프다.");
                break;
            case "angry":
                System.out.println("지금 잘 수가 없어 화가난다.");
                break;

            default:
                System.out.println("지금 내 기분은 이 단어들로는 표현할 수 없다.");
        }
    }
}