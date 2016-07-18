package liang.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  
  @NotNull
  @Size(min = 3, max = 80)
  private String email;
  
  @NotNull
  @Size(min = 2, max = 80)
  private String username;

  public User() { }

  public User(int id) { 
    this.id = id;
  }

  public User(String email, String username) {
    this.email = email;
    this.username = username;
  }

  public int getId() {
    return id;
  }

  public void setId(int value) {
    this.id = value;
  }

  public String getEmail() {
    return email;
  }
  
  public void setEmail(String value) {
    this.email = value;
  }
  
  public String getUsername() {
    return username;
  }

  public void setUsername(String value) {
    this.username = value;
  }
  
} // class User
