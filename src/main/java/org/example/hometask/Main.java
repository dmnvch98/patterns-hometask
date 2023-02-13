package org.example.hometask;

import org.example.hometask.hierarchy.HardHierarchy;
import org.example.hometask.hierarchy.MiddleHierarchy;
import org.example.hometask.hierarchy.SimpleHierarchy;
import org.example.hometask.requests.Request;
import org.example.hometask.requests.RequestType;

public class Main {
    public static void main(String[] args) {
        SimpleHierarchy simpleHierarchy = SimpleHierarchy.builder()
            .build();
        simpleHierarchy.sendRequest(
            Request
                .builder()
                .command(() -> System.out.println("simple req"))
                .requestType(RequestType.SUPPLIER_REQUEST)
                .build()
        );

        MiddleHierarchy middleHierarchy = MiddleHierarchy.builder().build();
        middleHierarchy.sendRequest(
            Request
                .builder()
                .command(() -> System.out.println("middle req"))
                .requestType(RequestType.SUPPLIER_REQUEST)
                .build()
        );

        HardHierarchy hardHierarchy = HardHierarchy.builder().build();
        hardHierarchy.sendRequest(
            Request
                .builder()
                .command(() -> System.out.println("hard req"))
                .requestType(RequestType.SUPPLIER_REQUEST)
                .build()
        );
    }
}
