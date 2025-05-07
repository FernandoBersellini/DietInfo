package com.diet_info.dietInfo.user.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUserCommand {
    private Integer id;
    private User user;

    public UpdateUserCommand(Integer id, User user) {
        this.id = id;
        this.user = user;
    }
}
