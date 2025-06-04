package com.picka.notes.data.di

import android.content.Context
import androidx.room.Room
import com.picka.notes.data.local.LocalDataSource
import com.picka.notes.data.local.NoteDao
import com.picka.notes.data.local.NoteDatabase
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
        @Singleton
        fun provideNoteDatabase(
                @ApplicationContext appContext: Context
        ): NoteDatabase {
                return Room.databaseBuilder(
                        appContext,
                        NoteDatabase::class.java,
                        "notes_db"
                            ).build()
            }

        @Provides
        fun provideNoteDao(db: NoteDatabase): NoteDao = db.noteDao()

        @Provides
        @Singleton
        fun provideLocalDataSource(dao: NoteDao): LocalDataSource =
                LocalDataSource(dao)
}
