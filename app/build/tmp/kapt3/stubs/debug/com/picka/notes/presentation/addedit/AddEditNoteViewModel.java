package com.picka.notes.presentation.addedit;

import androidx.lifecycle.ViewModel;
import com.picka.notes.domain.model.Note;
import com.picka.notes.domain.usecase.GetNoteByIdUseCase;
import com.picka.notes.domain.usecase.InsertNoteUseCase;
import com.picka.notes.domain.usecase.UpdateNoteUseCase;
import kotlinx.coroutines.flow.StateFlow;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/picka/notes/presentation/addedit/AddEditNoteViewModel;", "Landroidx/lifecycle/ViewModel;", "getNoteById", "Lcom/picka/notes/domain/usecase/GetNoteByIdUseCase;", "insertNote", "Lcom/picka/notes/domain/usecase/InsertNoteUseCase;", "updateNote", "Lcom/picka/notes/domain/usecase/UpdateNoteUseCase;", "(Lcom/picka/notes/domain/usecase/GetNoteByIdUseCase;Lcom/picka/notes/domain/usecase/InsertNoteUseCase;Lcom/picka/notes/domain/usecase/UpdateNoteUseCase;)V", "_currentNote", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/picka/notes/domain/model/Note;", "currentNote", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentNote", "()Lkotlinx/coroutines/flow/StateFlow;", "loadNote", "", "id", "", "saveNote", "note", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class AddEditNoteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.picka.notes.domain.usecase.GetNoteByIdUseCase getNoteById = null;
    @org.jetbrains.annotations.NotNull
    private final com.picka.notes.domain.usecase.InsertNoteUseCase insertNote = null;
    @org.jetbrains.annotations.NotNull
    private final com.picka.notes.domain.usecase.UpdateNoteUseCase updateNote = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.picka.notes.domain.model.Note> _currentNote = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.picka.notes.domain.model.Note> currentNote = null;
    
    @javax.inject.Inject
    public AddEditNoteViewModel(@org.jetbrains.annotations.NotNull
    com.picka.notes.domain.usecase.GetNoteByIdUseCase getNoteById, @org.jetbrains.annotations.NotNull
    com.picka.notes.domain.usecase.InsertNoteUseCase insertNote, @org.jetbrains.annotations.NotNull
    com.picka.notes.domain.usecase.UpdateNoteUseCase updateNote) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.picka.notes.domain.model.Note> getCurrentNote() {
        return null;
    }
    
    public final void loadNote(int id) {
    }
    
    public final void saveNote(@org.jetbrains.annotations.NotNull
    com.picka.notes.domain.model.Note note) {
    }
}