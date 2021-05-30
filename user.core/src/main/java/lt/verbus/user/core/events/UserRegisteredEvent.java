package lt.verbus.user.core.events;

import lombok.Builder;
import lombok.Data;
import lt.verbus.user.core.models.User;

@Data
@Builder
public class UserRegisteredEvent {
    private String id;
    private User user;
}
