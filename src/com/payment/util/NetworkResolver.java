package com.payment.util;

public class NetworkResolver {

    public static String resolve(String pan) {
        if (pan == null || pan.length() < 6) {
            throw new IllegalArgumentException("Invalid PAN");
        }

        // Simplified BIN-based routing
        if (pan.startsWith("4")) return "VISA";
        if (pan.startsWith("5")) return "MASTERCARD";
        if (pan.startsWith("6")) return "RUPAY";

        throw new IllegalArgumentException("Unknown Card Network");
    }
}
