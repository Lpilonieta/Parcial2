package Logic;

public class GetDataFromUI {
    private static String username;
    private static String password;
    private static String radicado;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        GetDataFromUI.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        GetDataFromUI.password = password;
    }

    public static String getRadicado() {
        return radicado;
    }

    public static void setRadicado(String radicado) {
        GetDataFromUI.radicado = radicado;
    }
}
