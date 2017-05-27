package com.example.hadv.rkr.data

/**
 * Created by hadv on 5/27/17.
 */
object SearchRepositoryProvider {
    fun provideSearchRepository(): SearchRepository {
        return SearchRepository(GithubApiService.create())
    }
}