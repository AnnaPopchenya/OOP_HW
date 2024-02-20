package HW_6;

import java.util.List;

// Интерфейс для работы с пользователями
public interface UserService<T extends User> {
    void createUser(String firstName, String lastName, String middleName);
    void editUser(int index, String firstName, String lastName, String middleName);
    List<T> getUsers();
}
