package com.developer.android.rickandmorty.main.models.character

import com.google.gson.annotations.SerializedName

data class CharacterData(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val resultResponses: List<ResultResponse>
)
