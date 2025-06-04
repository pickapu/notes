package com.picka.notes.data.local

import com.picka.notes.domain.model.Note
import com.picka.notes.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class LocalDataSource(private val dao: NoteDao) : NoteRepository {
    override fun getAllNotes(): Flow<List<Note>> {
        return dao.getAllNotesFlow().map { list ->
            list.map { entity ->
                Note(
                    id = entity.id,
                    title = entity.title,
                    content = entity.content,
                    timestamp = entity.timestamp
                )
            }
        }
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)?.let { entity ->
            Note(entity.id, entity.title, entity.content, entity.timestamp)
        }
    }

    override suspend fun insertNote(note: Note) {
        dao.insert(
            NoteEntity(
                id = note.id,
                title = note.title,
                content = note.content,
                timestamp = note.timestamp
            )
        )
    }

    override suspend fun updateNote(note: Note) {
        dao.update(
            NoteEntity(
                id = note.id,
                title = note.title,
                content = note.content,
                timestamp = note.timestamp
            )
        )
    }

    override suspend fun deleteNote(note: Note) {
        dao.delete(
            NoteEntity(
                id = note.id,
                title = note.title,
                content = note.content,
                timestamp = note.timestamp
            )
        )
    }
}
