package com.example.mohamed.hw5;

import android.os.AsyncTask;

import java.util.ArrayList;

/**
 * Created by mohamed on 2/17/17.
 */

public class GetGamesListAsyncTask extends AsyncTask<String, Void, ArrayList<Game>> {
    @Override
    protected ArrayList<Game> doInBackground(String... strings) {
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(ArrayList<Game> games) {
        super.onPostExecute(games);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
