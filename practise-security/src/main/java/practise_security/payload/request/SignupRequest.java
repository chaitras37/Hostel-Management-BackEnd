package practise_security.payload.request;

import java.util.Set;

import javax.validation.constraints.*;

import org.springframework.lang.NonNull;


public class SignupRequest {
  @NonNull
  @Size(min = 3, max = 55)
  @Email
  private String username;

  @NonNull
  @Size(max = 50)
  
  private String email;

  private Set<String> role;

  @NonNull
  @Size(min = 6, max = 40)
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }
}
