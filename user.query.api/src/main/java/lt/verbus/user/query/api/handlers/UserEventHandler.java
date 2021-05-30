package lt.verbus.user.query.api.handlers;

import lt.verbus.user.core.events.UserRegisteredEvent;
import lt.verbus.user.core.events.UserRemovedEvent;
import lt.verbus.user.core.events.UserUpdatedEvent;

public interface UserEventHandler {
    void on(UserRegisteredEvent event);
    void on(UserUpdatedEvent event);
    void on(UserRemovedEvent event);
}
