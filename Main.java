public class Main {
    
    public static void main(String[] args) {

        System.out.println("메인 수정도 몰래 했지롱");
        System.out.println("새로운 기능");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }

    }
}
