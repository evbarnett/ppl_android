package com.evbarnett.ppl.db.type;

/**
 * TODO Documentation
 */
public enum ExerciseType {
    WEIGHT("Weight"),
    NUMBER("Number"),
    SECONDS("Seconds");

    private String stringRep;

    ExerciseType(String stringRep) {
        this.stringRep = stringRep;
    }

    public String getStringRep() {
        return stringRep;
    }
}
