package N12;

public class LoginStringEspecifica implements Login{
    private static final String USER = "Admin";
    private static final String PASSWORD = "1234-5";
    private String username;
    private String password;

    public LoginStringEspecifica (){
        this(USER, PASSWORD);
    }

    public LoginStringEspecifica (String username, String password){
        this.password = password;
        this.username = username;
    }

    @Override
    public boolean login (String username, String password){
        return (this.username.equals(username) && this.password.equals(password));
    }
}
