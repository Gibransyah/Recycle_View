package com.app.recycle_view

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Demonslayer(
    val imgDemonslayer: Int,
    val nameDemonslayer: String,
    val descDemonslayer: String,
):Parcelable
