package org.example.hometask;

import lombok.Builder;
import org.example.hometask.requests.Request;
import org.example.hometask.requests.RequestObserver;

@Builder
public class Tax implements RequestObserver {
    @Override
    public void update(Request request) {
        System.out.println("Tax received information about the request ");
        request.getCommand().run();
    }
}
