import br.com.myapp.security.SecurityManager;
import br.com.myapp.securityImpl.SecurityManagerImpl;

module securityImpl {
    requires security;
    provides SecurityManager with SecurityManagerImpl;
}