package com.evbarnett.ppl.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.evbarnett.ppl.db.type.ProgressionType

@Entity(
    tableName = "exercise_map",
    foreignKeys = [
        ForeignKey(
            entity = Day::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("day_id"),
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Exercise::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("exercise_id"),
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class ExerciseMap(
    @ColumnInfo(name = "day_id") val dayId: Int,
    @ColumnInfo(name = "exercise_id") val exerciseId: Int,
    @ColumnInfo(name = "position") val position: Int,
    @ColumnInfo(name = "num_sets") val numSets: Int,
    @ColumnInfo(name = "progression_type") val progressionType: ProgressionType
) {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}