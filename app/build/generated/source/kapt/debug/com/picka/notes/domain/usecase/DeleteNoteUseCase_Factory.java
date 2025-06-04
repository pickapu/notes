package com.picka.notes.domain.usecase;

import com.picka.notes.domain.repository.NoteRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DeleteNoteUseCase_Factory implements Factory<DeleteNoteUseCase> {
  private final Provider<NoteRepository> repositoryProvider;

  public DeleteNoteUseCase_Factory(Provider<NoteRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DeleteNoteUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static DeleteNoteUseCase_Factory create(Provider<NoteRepository> repositoryProvider) {
    return new DeleteNoteUseCase_Factory(repositoryProvider);
  }

  public static DeleteNoteUseCase newInstance(NoteRepository repository) {
    return new DeleteNoteUseCase(repository);
  }
}
