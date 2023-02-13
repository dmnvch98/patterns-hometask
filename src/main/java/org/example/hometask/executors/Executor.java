package org.example.hometask.executors;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import org.example.hometask.executors.states.State;
import org.example.hometask.requests.Request;
import org.example.hometask.requests.RequestHandler;

@SuperBuilder
public abstract class Executor implements RequestHandler {
    @Getter
    private State state;
    @Override
    public abstract boolean canHandleRequest(Request req);

    @Override
    public abstract Request handle(Request req);

    public void changeStateTo(State state) {
        this.state = state;
    }
}
