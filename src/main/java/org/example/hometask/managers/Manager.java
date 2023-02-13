package org.example.hometask.managers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.hometask.requests.RequestHandler;

import java.util.List;

@SuperBuilder
@NoArgsConstructor
public abstract class Manager implements RequestHandler {
    @Getter
    List<Manager> managers;
}
