package lt.verbus.user.cmd.api.commands;

import lombok.Builder;
import lombok.Data;
import lt.verbus.user.core.models.User;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class RegisterUserCommand {
    @TargetAggregateIdentifier
    private String id;
    private User user;
}
