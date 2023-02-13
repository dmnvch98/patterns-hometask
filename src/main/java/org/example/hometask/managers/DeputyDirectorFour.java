package org.example.hometask.managers;

import lombok.experimental.SuperBuilder;
import org.example.hometask.requests.Request;

@SuperBuilder
public class DeputyDirectorFour extends Manager {
    Manager canHandleRequestAdministrator;

    @Override
    public boolean canHandleRequest(Request req) {
        canHandleRequestAdministrator = managers.stream()
            .filter(executor -> executor.canHandleRequest(req))
            .findFirst().orElse(null);
        return canHandleRequestAdministrator != null;
    }

    @Override
    public Request handle(Request req) {
        return canHandleRequestAdministrator.handle(req);
    }
}
