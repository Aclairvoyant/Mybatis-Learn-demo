package pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String gender;
    private String addr;
}
