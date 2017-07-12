package com.example.olamide.bakingapp.Activities;

import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.olamide.bakingapp.DataModel.Recipe;
import com.example.olamide.bakingapp.Fragments.RecipeListFragment;
import com.example.olamide.bakingapp.Presenter.RecipeListPresenter;
import com.example.olamide.bakingapp.Widgets.RecipeWidgetService;


public class MainActivity extends BaseActivity implements RecipeListPresenter.Callbacks {
    @Override
    protected Fragment createFragment() {
        return new RecipeListFragment();
    }

    @Override
    public void recipeSelected(Recipe recipe) {
        Intent intent = RecipeDetailActivity.newIntent(this, recipe);
        RecipeWidgetService.startActionUpdateRecipeWidgets(this, recipe);
        startActivity(intent);
    }
}

