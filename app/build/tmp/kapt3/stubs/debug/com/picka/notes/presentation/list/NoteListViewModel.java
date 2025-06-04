package com.picka.notes.presentation.list;

import androidx.lifecycle.ViewModel;
import com.picka.notes.domain.model.Note;
import com.picka.notes.domain.usecase.DeleteNoteUseCase;
import com.picka.notes.domain.usecase.GetAllNotesUseCase;
import kotlinx.coroutines.flow.StateFlow;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/picka/notes/presentation/list/NoteListViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllNotes", "Lcom/picka/notes/domain/usecase/GetAllNotesUseCase;", "deleteNote", "Lcom/picka/notes/domain/usecase/DeleteNoteUseCase;", "(Lcom/picka/notes/domain/usecase/GetAllNotesUseCase;Lcom/picka/notes/domain/usecase/DeleteNoteUseCase;)V", "_noteList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/picka/notes/domain/model/Note;", "noteList", "Lkotlinx/coroutines/flow/StateFlow;", "getNoteList", "()Lkotlinx/coroutines/flow/StateFlow;", "onDeleteNoteClicked", "", "note", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class NoteListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.picka.notes.domain.usecase.GetAllNotesUseCase getAllNotes = null;
    @org.jetbrains.annotations.NotNull
    private final com.picka.notes.domain.usecase.DeleteNoteUseCase deleteNote = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.picka.notes.domain.model.Note>> _noteList = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.picka.notes.domain.model.Note>> noteList = null;
    
    @javax.inject.Inject
    public NoteListViewModel(@org.jetbrains.annotations.NotNull
    com.picka.notes.domain.usecase.GetAllNotesUseCase getAllNotes, @org.jetbrains.annotations.NotNull
    com.picka.notes.domain.usecase.DeleteNoteUseCase deleteNote) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.picka.notes.domain.model.Note>> getNoteList() {
        return null;
    }
    
    public final void onDeleteNoteClicked(@org.jetbrains.annotations.NotNull
    com.picka.notes.domain.model.Note note) {
    }
}