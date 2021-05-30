package lt.verbus.user.query.api.handlers;

import lt.verbus.user.core.events.UserRegisteredEvent;
import lt.verbus.user.core.events.UserRemovedEvent;
import lt.verbus.user.core.events.UserUpdatedEvent;
import lt.verbus.user.query.api.repositories.UserRepository;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;

@Service
@ProcessingGroup("user-group")
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

    @Override
    public void on(UserUpdatedEvent event) {
        userRepository.save(event.getUser());
    }

    @Override
    public void on(UserRemovedEvent event) {
        userRepository.deleteById(event.getId());
    }
}
