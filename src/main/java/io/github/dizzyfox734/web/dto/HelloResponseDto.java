package io.github.dizzyfox734.web.dto;


import org.springframework.beans.factory.annotation.Autowired;

public class HelloResponseDto {
    private final String name;
    private final int amount;

    @Autowired
    public HelloResponseDto(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
