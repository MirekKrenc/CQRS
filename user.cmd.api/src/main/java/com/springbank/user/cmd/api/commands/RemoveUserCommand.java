package com.springbank.user.cmd.api.commands;

import lombok.Data;
import org.axonframework.modelling.command.AggregateIdentifier;

@Data
public class RemoveUserCommand {

    @AggregateIdentifier
    private String id;
}
