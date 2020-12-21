package com.fahreddinsevindir.animalphotoapp.data

import com.fahreddinsevindir.animalphotoapp.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {
}