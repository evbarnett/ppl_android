package com.evbarnett.ppl.db.type;

import androidx.room.TypeConverter;

import java.util.Date;

public class DateTypeConvertor {

    @TypeConverter
    public Date stampToDate(Long timestamp) {
        return new Date(timestamp);
    }

    @TypeConverter
    public Long dateToStamp(Date date) {
        return date.getTime();
    }
}
