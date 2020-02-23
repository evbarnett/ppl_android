package com.evbarnett.ppl.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "days")
data class Day(val name: String) {

    @PrimaryKey(autoGenerate = true)
    var id = 0
}