
public class Person {

    Person(String phil, Role role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum Role {
        TEACHER,
        STUDENT
    }

  Role role;
  String name;

  public Person(String name, String role) {
    this.name = name;
    this.role = role;
  }

  @Override
  public String toString() {
      String roleValue = this.role.name();
      
    return this.name + " (" + roleValue.toLowerCase() + ')';
  }
}
