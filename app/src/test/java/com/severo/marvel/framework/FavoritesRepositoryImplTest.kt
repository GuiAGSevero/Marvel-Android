package com.severo.marvel.framework

import com.nhaarman.mockitokotlin2.*
import com.severo.core.data.repository.FavoritesLocalDataSource
import com.severo.testing.model.CharacterFactory
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class FavoritesRepositoryImplTest {

    private lateinit var repository: FavoritesRepositoryImpl

    private val localDataSource: FavoritesLocalDataSource = mock()
    private val characterFactory = CharacterFactory()
    private val character = characterFactory.create(CharacterFactory.Hero.ThreeDMan)

    @Before
    fun setUp() {
        repository = FavoritesRepositoryImpl(localDataSource)
    }

    @Test
    fun `should return list of characters from localDataSource`() = runTest {
        // Arrange
        val expected = listOf(character)
        whenever(localDataSource.getAll()).thenReturn(flowOf(expected))

        // Act
        val result = repository.getAll().first()

        // Assert
        assertEquals(expected, result)
        verify(localDataSource).getAll()
    }

    @Test
    fun `should return true when character is favorite`() = runTest {
        // Arrange
        whenever(localDataSource.isFavorite(character.id)).thenReturn(true)

        // Act
        val result = repository.isFavorite(character.id)

        // Assert
        assertTrue(result)
        verify(localDataSource).isFavorite(character.id)
    }

    @Test
    fun `should call save on localDataSource`() = runTest {
        // Act
        repository.saveFavorite(character)

        // Assert
        verify(localDataSource).save(character)
    }

    @Test
    fun `should call delete on localDataSource`() = runTest {
        // Act
        repository.deleteFavorite(character)

        // Assert
        verify(localDataSource).delete(character)
    }
}
