package com.evbarnett.ppl.db.type;

import androidx.room.TypeConverter;

/**
 * TODO Documentation
 */
public class ProgressionTypeConvertor {

    @TypeConverter
    public ProgressionType valToType(int val) {
        switch (val) {
            case 1:
                return ProgressionType.STANDARD_LINEAR;
        }
        return null;
    }

    @TypeConverter
    public int typeToVal(ProgressionType exerciseType) {
        switch (exerciseType) {
            case STANDARD_LINEAR:
                return 1;
        }
        return -1;
    }
}
