package com.shadow.mvvm_recyclerview.data.models

data class Property(
    val acquired: Int,
    val active: Int,
    val category: String,
    val cool_feature: String,
    val created_at: String,
    val description: String,
    val files: List<File>,
    val id: Int,
    val lat: Double,
    val lng: Double,
    val location: String,
    val name: String,
    val open_hours: String,
    val payment_plan: String,
    val period: String,
    val price: Int,
    val size: String,
    val type: String,
    val type_id: Int,
    val units: String,
    val updated_at: String,
    val user_id: Int
)