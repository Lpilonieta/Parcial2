package Logic;

public interface CheckCredentials {
     default boolean isUserUnal(String username){
        return false;
    }
    default boolean isPasswordCorrect(String password){
         return false;
    }
    default boolean canLogin(boolean user, boolean password){
         if (user == true && password == true){
             return true;
         }
         else {
             return false;
         }
    }
    public default void loginSucced(){}
    public default void loginFailed(){}

}
