package com.epambrest;


import com.epambrest.model.DataReader;
import com.epambrest.model.Status;
import com.epambrest.model.StatusType;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        // Distance
        // Price per km
        // Weight
        // Price per kg
        // Result = d * pr1 + w * pr2

        Scanner scanner = new Scanner(System.in);

        Status currentStatus = new DataReader();

        while (currentStatus.getType() != StatusType.EXIT)
            currentStatus = currentStatus.handle(scanner);
    }
}
