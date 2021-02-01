package com.springbank.user.core.configuration.events;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRemovedEvent {

    private String id;
}
