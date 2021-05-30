package lt.verbus.user.cmd.api.commands;

import lombok.Builder;
import lombok.Data;
import lt.verbus.user.core.models.User;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class RegisterUserCommand {
    @TargetAggregateIdentifier
    private String id;
    @NotNull(message="no user details were supplied")
    @Valid
    private User user;
}
