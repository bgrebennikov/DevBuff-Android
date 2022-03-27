package com.github.bgrebennikov.devbuff.data.local

import android.os.Parcelable
import com.github.bgrebennikov.devbuff.presentation.ui.adapters.explore.ListItem
import kotlinx.parcelize.Parcelize

@Parcelize
data class SimpleLanguagesModel(
    val name: String
) : ListItem, Parcelable {
    override val itemId: Int
        get() = name.hashCode()
}