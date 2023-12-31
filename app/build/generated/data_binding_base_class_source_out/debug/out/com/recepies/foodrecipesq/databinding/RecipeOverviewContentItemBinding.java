// Generated by data binding compiler. Do not edit!
package com.recepies.foodrecipesq.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.recepies.foodrecipesq.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RecipeOverviewContentItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView contentTitle;

  @NonNull
  public final ImageView tickImage;

  protected RecipeOverviewContentItemBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView contentTitle, ImageView tickImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contentTitle = contentTitle;
    this.tickImage = tickImage;
  }

  @NonNull
  public static RecipeOverviewContentItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recipe_overview_content_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RecipeOverviewContentItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RecipeOverviewContentItemBinding>inflateInternal(inflater, R.layout.recipe_overview_content_item, root, attachToRoot, component);
  }

  @NonNull
  public static RecipeOverviewContentItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recipe_overview_content_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RecipeOverviewContentItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RecipeOverviewContentItemBinding>inflateInternal(inflater, R.layout.recipe_overview_content_item, null, false, component);
  }

  public static RecipeOverviewContentItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RecipeOverviewContentItemBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (RecipeOverviewContentItemBinding)bind(component, view, R.layout.recipe_overview_content_item);
  }
}
