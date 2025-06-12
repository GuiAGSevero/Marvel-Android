package com.severo.core.data.repository

import com.example.core.domain.model.CharacterPaging
import com.severo.core.model.Comic
import com.severo.core.model.Event

interface CharactersRemoteDataSource {

    suspend fun fetchCharacters(queries: Map<String, String>): CharacterPaging

    suspend fun fetchComics(characterId: Int): List<Comic>

    suspend fun fetchEvents(characterId: Int): List<Event>
}