package com.jorgemartinez.popcorn.retrofit

data class PopularMoviesResponse(
    val page: Int,
    val results: List<Movie>
)