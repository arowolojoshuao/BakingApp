package com.example.olamide.bakingapp.Networking;


import com.example.olamide.bakingapp.DataModel.Recipe;

import java.util.ArrayList;
import io.reactivex.Observable;

public class UdacityNetworkService {

    private UdacityApiObservable mUdacityApiObservable;

    public UdacityNetworkService(){
        mUdacityApiObservable = ApiUtils.getUdacityApiObservable();
    }

    public Observable<ArrayList<Recipe>> networkApiRequestRecipes() {
        Observable observer = mUdacityApiObservable.getUdacityRecipeResult();
        return observer;
    }
}
