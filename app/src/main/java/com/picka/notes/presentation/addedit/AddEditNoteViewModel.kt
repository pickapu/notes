package com.picka.notes.presentation.addedit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.picka.notes.domain.model.Note
import com.picka.notes.domain.usecase.GetNoteByIdUseCase
import com.picka.notes.domain.usecase.InsertNoteUseCase
import com.picka.notes.domain.usecase.UpdateNoteUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddEditNoteViewModel @Inject constructor(
    private val getNoteById: GetNoteByIdUseCase,
    private val insertNote: InsertNoteUseCase,
    private val updateNote: UpdateNoteUseCase
) : ViewModel() {

    private val _currentNote = MutableStateFlow<Note?>(null)
    val currentNote: StateFlow<Note?> = _currentNote

    fun loadNote(id: Int) {
        viewModelScope.launch {
            val note = getNoteById(id)
            _currentNote.value = note
        }
    }

    fun saveNote(note: Note) {
        viewModelScope.launch {
            if (note.id == 0) {
                insertNote(note)
            } else {
                updateNote(note)
            }
        }
    }
}
