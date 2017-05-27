package com.example.hadv.rkr.data

/**
 * Created by hadv on 5/27/17.
 */
class SearchRepository(val apiService: GithubApiService) {

    fun searchUsers(location: String, language: String): io.reactivex.Observable<Result> {
        return apiService.search(query = "location:$location language:$language")
    }

}