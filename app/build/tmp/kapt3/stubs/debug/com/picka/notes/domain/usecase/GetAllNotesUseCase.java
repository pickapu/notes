package com.picka.notes.domain.usecase;

import com.picka.notes.domain.model.Note;
import com.picka.notes.domain.repository.NoteRepository;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/picka/notes/domain/usecase/GetAllNotesUseCase;", "", "repository", "Lcom/picka/notes/domain/repository/NoteRepository;", "(Lcom/picka/notes/domain/repository/NoteRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/picka/notes/domain/model/Note;", "app_debug"})
public final class GetAllNotesUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.picka.notes.domain.repository.NoteRepository repository = null;
    
    @javax.inject.Inject
    public GetAllNotesUseCase(@org.jetbrains.annotations.NotNull
    com.picka.notes.domain.repository.NoteRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.picka.notes.domain.model.Note>> invoke() {
        return null;
    }
}