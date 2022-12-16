package ThirteenthDay;

public class EH2 {
    public static void main(String[] args) {
        // (a)
        for (int i = 0; i < 2; i++) {
            System.out.print(i + " ");
            try {
                System.out.println(1 / 0);
            }
            catch (Exception ex) {
            }
        }
        // (b)
        System.out.println();
        System.out.println("(b)");
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
                System.out.println(1 / 0);
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
