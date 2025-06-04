package com.picka.notes.data.repository

import com.picka.notes.data.local.LocalDataSource
import com.picka.notes.domain.model.Note
import com.picka.notes.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource
) : NoteRepository {
    override fun getAllNotes(): Flow<List<Note>> = localDataSource.getAllNotes()
    override suspend fun getNoteById(id: Int): Note? = localDataSource.getNoteById(id)
    override suspend fun insertNote(note: Note) = localDataSource.insertNote(note)
    override suspend fun updateNote(note: Note) = localDataSource.updateNote(note)
    override suspend fun deleteNote(note: Note) = localDataSource.deleteNote(note)
}
