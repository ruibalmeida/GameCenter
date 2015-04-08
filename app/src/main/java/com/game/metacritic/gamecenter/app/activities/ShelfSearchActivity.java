package com.game.metacritic.gamecenter.app.activities;

import android.app.Activity;
import android.app.ListActivity;
import android.net.Uri;
import android.os.Bundle;

import com.game.metacritic.gamecenter.app.R;
import com.game.metacritic.gamecenter.app.data.models.Game;
import com.game.metacritic.gamecenter.app.data.models.GameResponse;
import com.game.metacritic.gamecenter.app.fragments.ShelfSearchFragment;
import com.game.metacritic.gamecenter.app.utils.Constants;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class ShelfSearchActivity extends Activity implements ShelfSearchFragment.OnFragmentInteractionListener {
    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelf_search);

        String gameItemString = null;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            gameItemString = extras.getString(Constants.GAME_RESPONSE_KEY);
        }
        Game[] itemGameArray = new Gson().fromJson(gameItemString, Game[].class);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.shelf_search_activity, ShelfSearchFragment.newInstance(itemGameArray)).commit();
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}