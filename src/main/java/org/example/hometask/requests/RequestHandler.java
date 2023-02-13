package org.example.hometask.requests;

public interface RequestHandler {
    boolean canHandleRequest(Request req);

    Request handle(Request req);
}