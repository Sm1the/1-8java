import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;


public class Runner {
    public static void main(String[] args) {
        String country = "", language = "";
        Locale locale1 = new Locale("en", "US");
        Locale locale2 = new Locale("ru", "RU");
        ResourceBundle text1 = ResourceBundle.getBundle("localization", locale1);
        ResourceBundle text2 = ResourceBundle.getBundle("localization", locale2);

        System.out.println("Выберите язык/Select language :");
        System.out.println("Русский : 1, English : 2.");
        char i = 0;
        try {
            i = (char) System.in.read();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        switch (i) {
            case '2':
                country = "US";
                language = "EN";
                System.out.println("========================================");
                System.out.println("#                                      #");
                System.out.println("#                                      #");
                System.out.println("#"+"  "+text1.getString("login")+" : ____ " + "              "+"#");
                System.out.println("#"+"  "+text1.getString("password")+" : ____ " + "           "+"#");
                System.out.println("#                                      #");
                System.out.println("#                                      #");
                System.out.println("========================================");
                break;
            case '1':
                country = "RU";
                language = "RU";
                System.out.println("========================================");
                System.out.println("#                                      #");
                System.out.println("#                                      #");
                System.out.println("#"+"  "+text2.getString("login")+" : ____ " + "            "+"#");
                System.out.println("#"+"  "+text2.getString("password")+" : ____ " + "           "+"#");
                System.out.println("#                                      #");
                System.out.println("#                                      #");
                System.out.println("========================================");
                break;
        }

    }
}
