// Generated by Dagger (https://dagger.dev).
package com.recepies.foodrecipesq.domain.usecase;

import com.recepies.foodrecipesq.domain.repository.GetMealDietTypeRepository;
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
public final class GetMealDietTypeUseCase_Factory implements Factory<GetMealDietTypeUseCase> {
  private final Provider<GetMealDietTypeRepository> mealDietTypeRepositoryProvider;

  public GetMealDietTypeUseCase_Factory(
      Provider<GetMealDietTypeRepository> mealDietTypeRepositoryProvider) {
    this.mealDietTypeRepositoryProvider = mealDietTypeRepositoryProvider;
  }

  @Override
  public GetMealDietTypeUseCase get() {
    return newInstance(mealDietTypeRepositoryProvider.get());
  }

  public static GetMealDietTypeUseCase_Factory create(
      Provider<GetMealDietTypeRepository> mealDietTypeRepositoryProvider) {
    return new GetMealDietTypeUseCase_Factory(mealDietTypeRepositoryProvider);
  }

  public static GetMealDietTypeUseCase newInstance(
      GetMealDietTypeRepository mealDietTypeRepository) {
    return new GetMealDietTypeUseCase(mealDietTypeRepository);
  }
}