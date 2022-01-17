
public class Main {


    public static void main(String[] args) throws WrongPasswordException, WrongLoginException {

        //task 1
        System.out.println(end("nikel@mail.ru"));

        //task 2
        // petqa login@ yv password@ 10 nishic avel chlini yv karox  e parunakli miyan
        // angleren tarer yv tver
        System.out.println(Reg("Makich", "markosyan", "markosyan"));

    }
    //task 1
    public static boolean end(String s) {
        return s.endsWith("@gmail.com") || s.endsWith("@mail.ru");
    }


    // task 2
    public static String Reg(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException {

        char[] array = login.toCharArray();
        char[] array1 = password.toCharArray();
        char[] array2 = confirmPassword.toCharArray();

        if (login.matches(login.replaceAll("[^\\da-zA-Z]", " ")) &&

                array.length < 10) {

        } else {

            throw new WrongLoginException("WrongLoginException : invalid login please try again ");

        }

        if (password.matches(password.replaceAll("[^\\da-zA-Z]", " ")) &&
                array1.length < 10 &&
                confirmPassword.matches(confirmPassword.replaceAll("[^\\da-zA-Z]", " "))
                && array2.length < 10) {
        } else {

            throw new WrongPasswordException("you have used invalid characters please try again");

        }

        if (password.equals(confirmPassword)) {

        } else {

            throw new WrongPasswordException("WrongPasswordException : password does not match");

        }

        return login + " " + password;

    }


}