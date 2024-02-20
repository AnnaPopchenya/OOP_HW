package HW_6;

import java.util.List;

// Интерфейс для отображения пользователей
public interface UserView<T extends User> {
    void displayUsers(List<T> list);
}


