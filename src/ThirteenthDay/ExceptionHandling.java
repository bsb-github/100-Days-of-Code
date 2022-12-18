package ThirteenthDay;

public class ExceptionHandling {
    public static void main(String[] args) {
        // (a)
//        System.out.println(1 / 0);
//        // (b)
//        int[] list = new int[5];
//        System.out.println(list[5]);
//        // (c)
//        String s = "abc";
//        System.out.println(s.charAt(3));
//        // (d)
//        Object o = new Object();
//        String d = (String)o;
        // (e)
        try {
            Object obj = null;
        System.out.println(1/0);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
//        // (f)
       // System.out.println(1.0 / 0);
    }
}
