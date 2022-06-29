package spring2.zenospring.src.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DeleteUserRes {
    private String name;
    private String nickName;
    private String phone;
    private String email;
}