public class RandomPassword {
    private String password;
    private int defaultPasswordLength = 10;
    private static final String PASSWORD_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=";

    public static void main(String[] args) {
        RandomPassword rp = new RandomPassword();
        rp.password = rp.randomPassword(rp.defaultPasswordLength);
        System.out.println("Your password is: " + rp.password);
    }

    private String randomPassword(int length) {
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * PASSWORD_SET.length());
            password[i] = PASSWORD_SET.charAt(rand);
        }
        return new String(password);
    }
}
