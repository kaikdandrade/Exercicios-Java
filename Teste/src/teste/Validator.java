package teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static void isEmail(String email) {
        Pattern regex = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = regex.matcher(email);
        System.out.println(matcher.matches());
    }

    public static void isPhone(String phone) {
        Pattern regex = Pattern.compile("^[0-9]{2}+ [0-9]{2}+ [0-9]{4}+-[0-9]{5}$");
        Matcher matcher = regex.matcher(phone);
        System.out.println(matcher.matches());
    }

    public static void isTel(String tel) {
        Pattern regex = Pattern.compile("^[0-9]{2}+ [0-9]{2}+ [0-9]{4}+-[0-9]{4}$");
        Matcher matcher = regex.matcher(tel);
        System.out.println(matcher.matches());
    }

    public static void isURL(String url) {
        Pattern regex = Pattern.compile("^[a-zA-z]{4,5}+://[a-zA-z]{1,}$");
        Matcher matcher = regex.matcher(url);
        System.out.println(matcher.matches());
    }

    public static boolean isCPF(String cpf) {
        Pattern regex = Pattern.compile("^[0-9]{3}+.[0-9]{3}+.[0-9]{3}+-[0-9]{2}$");
        Matcher matcher = regex.matcher(cpf);
        return matcher.matches();
    }
}
