package com.severo.core.data.repository

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.severo.core.model.Character
import com.severo.core.model.Comic
import com.severo.core.model.Event
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {

    fun getCachedCharacters(
        query: String,
        orderBy: String,
        pagingConfig: PagingConfig
    ): Flow<PagingData<Character>>

    suspend fun getComics(characterId: Int): List<Comic>

    suspend fun getEvents(characterId: Int): List<Event>
}