import java.text.SimpleDateFormat;

public class Test {
    
    static class vox {
        static int a;
    }

    public static void main(String[] args) {
        try{
        System.out.println( new SimpleDateFormat("yyyyMMddHHmmss").parse("20150708150000").getTime());
        System.out.println();
        }
        catch(Exception e){
        }
    }
}
