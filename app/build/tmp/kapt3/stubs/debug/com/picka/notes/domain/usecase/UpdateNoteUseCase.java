package com.picka.notes.domain.usecase;

import com.picka.notes.domain.model.Note;
import com.picka.notes.domain.repository.NoteRepository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/picka/notes/domain/usecase/UpdateNoteUseCase;", "", "repository", "Lcom/picka/notes/domain/repository/NoteRepository;", "(Lcom/picka/notes/domain/repository/NoteRepository;)V", "invoke", "", "note", "Lcom/picka/notes/domain/model/Note;", "(Lcom/picka/notes/domain/model/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UpdateNoteUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.picka.notes.domain.repository.NoteRepository repository = null;
    
    @javax.inject.Inject
    public UpdateNoteUseCase(@org.jetbrains.annotations.NotNull
    com.picka.notes.domain.repository.NoteRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    com.picka.notes.domain.model.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}