package com.picka.notes.domain.usecase

import com.picka.notes.domain.model.Note
import com.picka.notes.domain.repository.NoteRepository
import javax.inject.Inject

class GetNoteByIdUseCase@Inject constructor(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? = repository.getNoteById(id)
}
