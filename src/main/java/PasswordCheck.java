public class PasswordCheck {
    public static void main(String[] args) {

        PasswordCheck pass = new PasswordCheck();

        String password2 = "Tebolebepe@45";
        //pass.PasswordIsOk(password2);
        System.out.println(pass.PasswordIsOk(password2));


    }

    public boolean PasswordIsValid(String password) {
        try {
            if (password.isEmpty()) {
                throw new Exception("Password can not be empty");
            } else if (!((password.length() >= 8))) {

                throw new Exception("Password length should be more than 8 digits");
            } else {
                int count = 0;
                // check digits from 0 to 9
                for (int i = 0; i <= 8; i++) {

                    // to convert int to string
                    String str1 = Integer.toString(i);

                    if (password.contains(str1)) {
                        count = 1;
                    }
                }

                if (count == 0) {
                    throw new Exception("Password must contain 1 digit");
                } else if (!(password.contains("@") || password.contains("#")
                        || password.contains("!") || password.contains("~")
                        || password.contains("$") || password.contains("%")
                        || password.contains("^") || password.contains("&")
                        || password.contains("*") || password.contains("(")
                        || password.contains(")") || password.contains("-")
                        || password.contains("+") || password.contains("/")
                        || password.contains(":") || password.contains(".")
                        || password.contains(", ") || password.contains("<")
                        || password.contains(">") || password.contains("?")
                        || password.contains("|"))) {
                    throw new Exception("Password should contain character");
                } else {
                    int count1 = 0;

                    // checking capital letters
                    for (int i = 65; i <= 90; i++) {

                        // type casting
                        char c = (char) i;

                        String str1 = Character.toString(c);
                        if (password.contains(str1)) {
                            count1 = 1;
                        }
                    }
                    if (count1 == 0) {
                        throw new Exception("Password must contain at list capital letter");
                    } else {
                        int count2 = 0;
                        // checking small letters
                        for (int i = 90; i <= 122; i++) {
                            // type casting
                            char c = (char) i;
                            String str1 = Character.toString(c);

                            if (password.contains(str1)) {
                                count2 = 1;
                            }
                        }
                        if (count2 == 0) {
                            throw new Exception("Password must contain at least small letter");
                        }
//                        else {
//                            //PasswordIsOk(password);
//                            System.out.println("Password is ok");
//                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e);

        }
       return true;

    }

    public boolean PasswordIsOk(String password) {
        if(!password.isEmpty() && password.length() >= 8) {
            if (PasswordIsValid(password)) {
                return true;

            } else {

                return false;
            }
        }
        return false;

    }

}



