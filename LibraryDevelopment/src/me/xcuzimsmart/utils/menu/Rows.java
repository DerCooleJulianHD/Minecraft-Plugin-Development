package me.xcuzimsmart.utils.menu;

import org.apache.commons.lang.Validate;

import javax.annotation.Nullable;

public enum Rows {
 
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    Six(6);
    
    private final int value;

    Rows(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }

    public int getSlots() {
        return this.getValue() * 9;
    }

    @Nullable
    public static Rows getRowsByInt(int amount) {
        Validate.isTrue(amount > 0 && amount < 6, "amount of rows must be a number between '0' and '6'");
        for (Rows rows : Rows.values()) {
            if (amount == rows.value) {
                return rows;
            }
        }

        return null;
    }
}