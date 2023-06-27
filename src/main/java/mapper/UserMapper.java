package mapper;

import java.util.List;
import pojo.User;

public interface UserMapper {

    List<User> selectAll();

    User selectById(int id);
}
