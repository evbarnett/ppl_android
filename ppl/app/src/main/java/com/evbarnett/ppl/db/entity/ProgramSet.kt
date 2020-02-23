package com.evbarnett.ppl.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

@Entity(
    tableName = "program_sets",
    foreignKeys = [
        ForeignKey(
            entity = ExerciseMap::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("exercise_map_id"),
            onDelete = ForeignKey.CASCADE
        )]
)
data class ProgramSet( //TODO add constraints
    @ColumnInfo(name = "date") val date: Date,
    @ColumnInfo(name = "exercise_map_id") val exerciseMapId: Int,
    @ColumnInfo(name = "set_number") val setNumber: Int,
    @ColumnInfo(name = "set_weight") val setWeight: Int,
    @ColumnInfo(name = "set_value") val setValue: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}