package com.laundry.app.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class SharePreferenceManager {

    private static final String PREFERENCE_FILE_NAME = "laundry_preference";

    private static final String PREFERENCE_KEY_AUTHENTICATION_TOKEN = "authentication_token";

    private static final String PREFERENCE_KEY_AUTHENTICATION_USERNAME = "authentication_username";

    private static final String PREFERENCE_KEY_ROLE = "role";

    private static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(PREFERENCE_FILE_NAME,
                Activity.MODE_PRIVATE);
    }

    public static String getToken(Context context) {
        SharedPreferences preference = getSharedPreferences(context);
        return preference.getString(PREFERENCE_KEY_AUTHENTICATION_TOKEN, null);
    }

    public static void setToken(Context context, String token) {
        SharedPreferences preference = getSharedPreferences(context);
        SharedPreferences.Editor editor = preference.edit();
        editor.putString(PREFERENCE_KEY_AUTHENTICATION_TOKEN, token);
        editor.apply();
    }

    public static String getUsername(Context context) {
        SharedPreferences preference = getSharedPreferences(context);
        return preference.getString(PREFERENCE_KEY_AUTHENTICATION_USERNAME, null);
    }

    public static void setUsername(Context context, String username) {
        SharedPreferences preference = getSharedPreferences(context);
        SharedPreferences.Editor editor = preference.edit();
        editor.putString(PREFERENCE_KEY_AUTHENTICATION_USERNAME, username);
        editor.apply();
    }

    public static String getMode(Context context) {
        SharedPreferences preference = getSharedPreferences(context);
        return preference.getString(PREFERENCE_KEY_ROLE, null);
    }

    public static void setMode(Context context, String mode) {
        SharedPreferences preference = getSharedPreferences(context);
        SharedPreferences.Editor editor = preference.edit();
        editor.putString(PREFERENCE_KEY_ROLE, mode);
        editor.apply();
    }

}