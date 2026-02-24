import br.com.myapp.security.SecurityManager;

module app {
    requires security; //importa o módulo
    uses SecurityManager;
}