package com.example.weatherforecast

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WeatherHistoryAdapter(private val historyList: List<SavedWeather>) :
    RecyclerView.Adapter<WeatherHistoryAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvCityName: TextView = itemView.findViewById(R.id.tvCityName)
        val tvDate: TextView = itemView.findViewById(R.id.tvDate)
        val tvTemp: TextView = itemView.findViewById(R.id.tvTemp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_weather_history, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = historyList[position]
        holder.tvCityName.text = item.cityName
        holder.tvDate.text = item.date
        holder.tvTemp.text = "${item.temperature}°C"
    }

    override fun getItemCount(): Int {
        return historyList.size
    }
}