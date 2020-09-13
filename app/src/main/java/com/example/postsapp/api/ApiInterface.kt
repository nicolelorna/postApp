package com.example.postsapp.api


//import  ke.co.postapp.models.post
//import retrofit2.Response
//import retrofit2.http.GET

interface ApiInterface {
    @GET(value:"posts")
    suspend fun getPosts(): Response<List<Post>>
}