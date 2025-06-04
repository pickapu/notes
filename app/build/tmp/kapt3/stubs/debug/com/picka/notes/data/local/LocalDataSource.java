package com.picka.notes.data.local;

import com.picka.notes.domain.model.Note;
import com.picka.notes.domain.repository.NoteRepository;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bH\u0016J\u001b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/picka/notes/data/local/LocalDataSource;", "Lcom/picka/notes/domain/repository/NoteRepository;", "dao", "Lcom/picka/notes/data/local/NoteDao;", "(Lcom/picka/notes/data/local/NoteDao;)V", "deleteNote", "", "note", "Lcom/picka/notes/domain/model/Note;", "(Lcom/picka/notes/domain/model/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotes", "Lkotlinx/coroutines/flow/Flow;", "", "getNoteById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertNote", "updateNote", "app_debug"})
public final class LocalDataSource implements com.picka.notes.domain.repository.NoteRepository {
    @org.jetbrains.annotations.NotNull
    private final com.picka.notes.data.local.NoteDao dao = null;
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull
    com.picka.notes.data.local.NoteDao dao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.picka.notes.domain.model.Note>> getAllNotes() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getNoteById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.picka.notes.domain.model.Note> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insertNote(@org.jetbrains.annotations.NotNull
    com.picka.notes.domain.model.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object updateNote(@org.jetbrains.annotations.NotNull
    com.picka.notes.domain.model.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull
    com.picka.notes.domain.model.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}