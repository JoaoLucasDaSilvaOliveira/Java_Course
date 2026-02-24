package br.com.myapp.app;

import br.com.myapp.security.SecurityManager;

import java.util.ServiceLoader;

public class App {
    public static void main(String[] args) {
        SecurityManager sm = ServiceLoader.load(SecurityManager.class).findFirst().orElseThrow();
        System.out.println(sm.authorize("e", "a"));
    }
}
