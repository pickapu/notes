package com.picka.notes.presentation.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.picka.notes.domain.model.Note
import com.picka.notes.domain.usecase.DeleteNoteUseCase
import com.picka.notes.domain.usecase.GetAllNotesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteListViewModel @Inject constructor(
    private val getAllNotes: GetAllNotesUseCase,
    private val deleteNote: DeleteNoteUseCase
) : ViewModel() {

    private val _noteList = MutableStateFlow<List<Note>>(emptyList())
    val noteList: StateFlow<List<Note>> = _noteList

    init {
        viewModelScope.launch {
            getAllNotes().collectLatest { notes ->
                _noteList.value = notes
            }
        }
    }

    fun onDeleteNoteClicked(note: Note) {
        viewModelScope.launch {
            deleteNote(note)
        }
    }
}
