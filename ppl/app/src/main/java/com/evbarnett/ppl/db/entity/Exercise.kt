package com.evbarnett.ppl.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.evbarnett.ppl.db.type.ExerciseType

@Entity(tableName = "exercises", indices = [Index(value = ["exercise_name"], unique = true)])
data class Exercise(
    @ColumnInfo(name = "exercise_name") val exerciseName: String,
    @ColumnInfo(name = "exercise_type") val exerciseType: ExerciseType
) {

    @PrimaryKey(autoGenerate = true)
    var id = 0
}