package com.springbank.user.cmd.api.commands;

import com.springbank.user.core.models.User;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.AggregateIdentifier;

@Data
@Builder
public class UpdateUserCommand {

    @AggregateIdentifier
    private String id;
    private User user;
}
