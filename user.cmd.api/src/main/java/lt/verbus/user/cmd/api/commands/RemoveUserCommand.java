package lt.verbus.user.cmd.api.commands;

import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
public class RemoveUserCommand {
    @TargetAggregateIdentifier
    private String id;
}
