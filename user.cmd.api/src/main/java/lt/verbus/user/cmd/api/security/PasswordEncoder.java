package lt.verbus.user.cmd.api.security;

public interface PasswordEncoder {
    String hashPassword(String password);
}
