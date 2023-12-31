// Generated by Dagger (https://dagger.dev).
package com.recepies.foodrecipesq.domain.usecase;

import com.recepies.foodrecipesq.domain.repository.FavoriteRecipeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RemoveFavoriteRecipeUseCase_Factory implements Factory<RemoveFavoriteRecipeUseCase> {
  private final Provider<FavoriteRecipeRepository> favoriteRecipeRepositoryProvider;

  public RemoveFavoriteRecipeUseCase_Factory(
      Provider<FavoriteRecipeRepository> favoriteRecipeRepositoryProvider) {
    this.favoriteRecipeRepositoryProvider = favoriteRecipeRepositoryProvider;
  }

  @Override
  public RemoveFavoriteRecipeUseCase get() {
    return newInstance(favoriteRecipeRepositoryProvider.get());
  }

  public static RemoveFavoriteRecipeUseCase_Factory create(
      Provider<FavoriteRecipeRepository> favoriteRecipeRepositoryProvider) {
    return new RemoveFavoriteRecipeUseCase_Factory(favoriteRecipeRepositoryProvider);
  }

  public static RemoveFavoriteRecipeUseCase newInstance(
      FavoriteRecipeRepository favoriteRecipeRepository) {
    return new RemoveFavoriteRecipeUseCase(favoriteRecipeRepository);
  }
}
