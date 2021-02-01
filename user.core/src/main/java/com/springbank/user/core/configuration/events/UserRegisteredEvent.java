package com.springbank.user.core.configuration.events;

import com.springbank.user.core.configuration.models.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegisteredEvent {

    private String id;
    private User user;
}
