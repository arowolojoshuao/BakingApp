package com.example.olamide.bakingapp.Networking;


import com.example.olamide.bakingapp.DataModel.Recipe;

import java.util.ArrayList;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface UdacityApiObservable {
    @GET(" ")
    Observable<ArrayList<Recipe>> getUdacityRecipeResult();
}
