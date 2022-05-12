package com.example.myapplication

import androidx.room.Entity

@Entity(tableName = "word_table")
class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)