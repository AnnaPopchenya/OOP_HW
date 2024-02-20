package HW_6;


public interface UserController<T extends User> {
    
    void create(String firstName, String lastName, String middleName);
}
