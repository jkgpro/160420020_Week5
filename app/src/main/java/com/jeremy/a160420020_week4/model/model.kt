package com.jeremy.a160420020_week4.model

import com.google.gson.annotations.SerializedName
data class Student (
    val id:String?,
    @SerializedName("student_name")
    val name:String?,
    @SerializedName("birth_of_date")
    val dob:String?,
    val phone:String?,
    @SerializedName("photo_url")
    val photoUrl:String?
    )
data class DetailStudent (
    val id:String?, val name:String?, val BOD:String?, val phone:String?
        )