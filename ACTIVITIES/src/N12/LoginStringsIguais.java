package N12;

public class LoginStringsIguais implements Login{
    @Override
    public boolean login(String username, String password) {
        return (username.equals(password));
    }
}
