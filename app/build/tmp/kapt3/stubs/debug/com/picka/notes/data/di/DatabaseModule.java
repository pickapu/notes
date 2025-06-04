package com.picka.notes.data.di;

import android.content.Context;
import androidx.room.Room;
import com.picka.notes.data.local.LocalDataSource;
import com.picka.notes.data.local.NoteDao;
import com.picka.notes.data.local.NoteDatabase;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/picka/notes/data/di/DatabaseModule;", "", "()V", "provideLocalDataSource", "Lcom/picka/notes/data/local/LocalDataSource;", "dao", "Lcom/picka/notes/data/local/NoteDao;", "provideNoteDao", "db", "Lcom/picka/notes/data/local/NoteDatabase;", "provideNoteDatabase", "appContext", "Landroid/content/Context;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull
    public static final com.picka.notes.data.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.picka.notes.data.local.NoteDatabase provideNoteDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context appContext) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.picka.notes.data.local.NoteDao provideNoteDao(@org.jetbrains.annotations.NotNull
    com.picka.notes.data.local.NoteDatabase db) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.picka.notes.data.local.LocalDataSource provideLocalDataSource(@org.jetbrains.annotations.NotNull
    com.picka.notes.data.local.NoteDao dao) {
        return null;
    }
}