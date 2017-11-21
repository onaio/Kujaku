package utils;

import android.app.AlarmManager;

/**
 * Created by Jason Rogena - jrogena@ona.io on 11/7/17.
 */

public class Constants {
    public static final String INTENT_ACTION_SHOW_MAP = "io.ona.kujaku.map.SHOW";
    public static final String INTENT_ACTION_MAP_DOWNLOAD_SERVICE_STATUS_UPDATES = "io.ona.kujaku.service.map.downloader.updates";
    public static final String PARCELABLE_KEY_MAPBOX_ACCESS_TOKEN = "mapbox_access_token";
    public static final String PARCELABLE_KEY_MAPBOX_STYLES = "mapbox_styles";
    public static final String PARCELABLE_KEY_STYLE_URL = "offline_map_mapbox_style_url";;
    public static final String PARCELABLE_KEY_MIN_ZOOM = "offline_map_min_zoom";;
    public static final String PARCELABLE_KEY_MAX_ZOOM = "offline_map_max_zoom";
    public static final String PARCELABLE_KEY_MAP_UNIQUE_NAME = "offline_map_unique_name";
    public static final String PARCELABLE_KEY_TOP_LEFT_BOUND = "offline_map_top_left_bound";
    public static final String PARCELABLE_KEY_BOTTOM_RIGHT_BOUND = "offline_map_bottom_right_bound";
    public static final String PARCELABLE_KEY_MAP_= "offline_map_bottom_right_bound";
    public static final String PARCELABLE_KEY_SERVICE_ACTION = "map_downloader_service";
    public static final String PARCELABLE_KEY_NETWORK_STATE = "active_network_state";

    public static int MAP_DOWNLOAD_SERVICE_ALARM_REQUEST_CODE = 8687;
    public static long MAP_DOWNLOAD_SERVICE_ALARM_INTERVAL = AlarmManager.INTERVAL_FIFTEEN_MINUTES;

    public static enum SERVICE_ACTION {
        DOWNLOAD_MAP,
        DELETE_MAP,
        NETWORK_RESUME
    }
}