package USER.Management.User_Management.service;

import USER.Management.User_Management.dto.UserDto;
import USER.Management.User_Management.model.User;

public interface UserService {

    User save (UserDto userDto);
}
