package lab7.util;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = 3;
    private static final String MAGIC_STRING;
    private static PasswordMaker parola=null;
    private String name;

    static {
        StringRandomizer srand = new StringRandomizer();
        MAGIC_STRING = srand.randomString(20);
    }

    private PasswordMaker(String name) {
        this.name = name;
    }

    public static PasswordMaker getInstance() {
        if(parola==null){
            parola=new PasswordMaker("Andrei");

        }
        return parola;
    }

    public static String getCallingCounts() {

    }

    public String getPassword() {
        java.util.Random r = new java.util.Random();
        String ln = ""+name.length();
        ln += r.nextInt(101);
        StringRandomizer srand = new StringRandomizer();
        return srand.randomString(MAGIC_NUMBER) + srand.randomString(10, MAGIC_STRING) + ln;
    }
}

