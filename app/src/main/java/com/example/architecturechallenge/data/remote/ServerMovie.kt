package com.example.architecturechallenge.data.remote

import com.example.architecturechallenge.data.Movie

data class ServerMovie(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int,
    val favorite: Boolean,
)

fun ServerMovie.toMovie() = Movie(
    id = 0,
    title = title,
    posterPath = poster_path,
    overview = overview,
    favorite = favorite,
)