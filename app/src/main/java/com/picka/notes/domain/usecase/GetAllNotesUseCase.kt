package com.picka.notes.domain.usecase

import com.picka.notes.domain.model.Note
import com.picka.notes.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllNotesUseCase@Inject constructor(
    private val repository: NoteRepository
) {
    operator fun invoke(): Flow<List<Note>> = repository.getAllNotes()
}
