package com.evbarnett.ppl.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.evbarnett.ppl.db.entity.Day
import com.evbarnett.ppl.db.entity.Exercise
import com.evbarnett.ppl.db.entity.ExerciseMap
import com.evbarnett.ppl.db.entity.ProgramSet
import com.evbarnett.ppl.db.type.DateTypeConvertor
import com.evbarnett.ppl.db.type.ExerciseTypeConvertor
import com.evbarnett.ppl.db.type.ProgressionTypeConvertor

@Database(
    entities = [Day::class, Exercise::class, ExerciseMap::class, ProgramSet::class],
    version = 1
)
@TypeConverters(
    DateTypeConvertor::class,
    ExerciseTypeConvertor::class,
    ProgressionTypeConvertor::class
)
abstract class AppDatabase : RoomDatabase() {
    abstract val programDao: ProgramDao
}