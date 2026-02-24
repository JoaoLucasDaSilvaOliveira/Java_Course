package br.com.myapp.securityImpl;

import br.com.myapp.security.SecurityManager;

import java.util.Objects;

public class SecurityManagerImpl implements SecurityManager {
    @Override
    public boolean authorize(String username, String password) {
        return Objects.equals(username, "João") && Objects.equals(password, "123");
    }
}
