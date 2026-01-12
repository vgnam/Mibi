package com.example.weatherforecast

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWeather(weather: SavedWeather)

    @Query("SELECT * FROM weather_history ORDER BY id DESC")
    suspend fun getAllWeather(): List<SavedWeather>
}