package com.fahreddinsevindir.animalphotoapp.api

import com.fahreddinsevindir.animalphotoapp.data.UnsplashPhoto

data class UnsplashResponse (
    val results: List<UnsplashPhoto>
)