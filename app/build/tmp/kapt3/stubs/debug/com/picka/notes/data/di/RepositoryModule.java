package com.picka.notes.data.di;

import com.picka.notes.data.repository.NoteRepositoryImpl;
import com.picka.notes.domain.repository.NoteRepository;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/picka/notes/data/di/RepositoryModule;", "", "()V", "bindNoteRepository", "Lcom/picka/notes/domain/repository/NoteRepository;", "impl", "Lcom/picka/notes/data/repository/NoteRepositoryImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.picka.notes.domain.repository.NoteRepository bindNoteRepository(@org.jetbrains.annotations.NotNull
    com.picka.notes.data.repository.NoteRepositoryImpl impl);
}