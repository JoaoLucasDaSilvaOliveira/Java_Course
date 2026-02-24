package br.com.myapp.security;

public interface SecurityManager {
    boolean authorize(String username, String password);
}
