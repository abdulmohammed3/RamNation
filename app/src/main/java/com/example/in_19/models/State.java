package com.example.in_19.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class State {
    String stateName;
    String dashboardLink;

    public State(JSONObject jsonObject) throws JSONException{
        stateName = jsonObject.getString("States:");
        dashboardLink = jsonObject.getString("Covid Dashboard:");
    }
    public static List<State> fromJsonArray (JSONArray stateJsonArray) throws JSONException{
        List<State> states = new ArrayList<>();
        for(int i =0; i<stateJsonArray.length();i++){
            states.add(new State(stateJsonArray.getJSONObject(i)));
        }
        return states;
    }
    public String getStateName(){return stateName;}

    public String getDashboardLink() {
        return dashboardLink;
    }
}
