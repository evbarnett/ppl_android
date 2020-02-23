package com.evbarnett.ppl.db.type;

import androidx.room.TypeConverter;

/**
 * TODO Documentation
 */
public class ExerciseTypeConvertor {

    @TypeConverter
    public ExerciseType valToType(int val) {
        switch (val) {
            case 1:
                return ExerciseType.WEIGHT;
            case 2:
                return ExerciseType.NUMBER;
            case 3:
                return ExerciseType.SECONDS;
        }
        return null;
    }

    @TypeConverter
    public int typeToVal(ExerciseType exerciseType) {
        switch (exerciseType) {
            case WEIGHT:
                return 1;
            case NUMBER:
                return 2;
            case SECONDS:
                return 3;
        }
        return -1;
    }
}
