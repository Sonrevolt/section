package section4;



public class String1 {

    public static void main(String[] args) {
        String s1 = "Hello, World!";
        System.out.println("String length: " + s1.length());

        String s2 = "Hello, World!";
        if(s2.equals(s1)){
            System.out.println("equals");
        }else{
            System.out.println("Not equals");
        }
    }
}

