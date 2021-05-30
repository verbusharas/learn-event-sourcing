package lt.verbus.user.cmd.api.aggregates;

import lt.verbus.user.cmd.api.commands.RegisterUserCommand;
import lt.verbus.user.cmd.api.commands.RemoveUserCommand;
import lt.verbus.user.cmd.api.commands.UpdateUserCommand;
import lt.verbus.user.core.events.UserRegisteredEvent;
import lt.verbus.user.core.events.UserRemovedEvent;
import lt.verbus.user.core.events.UserUpdatedEvent;
import lt.verbus.user.core.models.User;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class UserAggregate {
    @AggregateIdentifier
    private String id;
    private User user;

    public UserAggregate() {

    }

    @CommandHandler
    public UserAggregate(RegisterUserCommand command) {

    }

    @CommandHandler
    public void handle(UpdateUserCommand command) {

    }

    @CommandHandler
    public void handle(RemoveUserCommand command) {

    }

    @EventSourcingHandler
    public void on(UserRegisteredEvent event) {

    }

    @EventSourcingHandler
    public void on(UserUpdatedEvent event) {

    }

    @EventSourcingHandler
    public void on(UserRemovedEvent event) {

    }
}
