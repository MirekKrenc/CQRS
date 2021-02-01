package com.springbank.user.query.api.handlers;

import com.springbank.user.core.events.UserRegisteredEvent;
import com.springbank.user.core.events.UserRemovedEvent;
import com.springbank.user.core.events.UserUpdatedEvent;
import com.springbank.user.query.api.repositories.UserRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;

@Service
public class UserEventHandlerImpl implements UserEventHandler {

    private final UserRepository userRepository;

    public UserEventHandlerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @EventHandler
    @Override
    public void on(UserRegisteredEvent event) {
        userRepository.save(event.getUser());

    }

    @EventHandler
    @Override
    public void on(UserUpdatedEvent event) {
        userRepository.save(event.getUser());

    }

    @EventHandler
    @Override
    public void on(UserRemovedEvent event) {
        userRepository.deleteById(event.getId());
    }
}
