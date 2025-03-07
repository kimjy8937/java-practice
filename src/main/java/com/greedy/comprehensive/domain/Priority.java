package com.greedy.comprehensive.domain;

public enum Priority {
    H, M, L;

    public static Priority fromString(String type) {
        return switch (type.toUpperCase()) {
            case "H", "HIGH" -> H;
            case "M", "MEDIUM" -> M;
            case "L", "LOW" -> L;
            default -> throw new IllegalArgumentException("Invalid Priority: " + type);
        };
    }
}
