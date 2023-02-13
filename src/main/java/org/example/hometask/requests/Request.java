package org.example.hometask.requests;

import lombok.Builder;
import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;

@Builder
@Value
public class Request {
    RequestType requestType;
    Runnable command;
    @NonFinal
    @Setter
    boolean isCompleted;
}
