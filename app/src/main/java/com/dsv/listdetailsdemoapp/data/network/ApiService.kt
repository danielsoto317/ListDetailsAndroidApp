package com.dsv.listdetailsdemoapp.data.network

import com.dsv.listdetailsdemoapp.data.model.Post
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<Post>

    @GET("posts/{id}")
    suspend fun getPostById(
        @Path("id") id: Int,
    ): Post
}
