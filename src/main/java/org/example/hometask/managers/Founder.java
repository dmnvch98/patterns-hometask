package org.example.hometask.managers;

import lombok.Builder;
import lombok.Value;
import org.example.hometask.requests.Request;

@Builder
@Value
public class Founder {
    Manager director;

    public void sendRequest(Request request) {
        director.handle(request);
    }

}
