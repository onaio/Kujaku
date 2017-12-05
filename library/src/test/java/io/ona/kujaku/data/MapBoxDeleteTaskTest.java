package io.ona.kujaku.data;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import io.ona.kujaku.BuildConfig;
import utils.exceptions.MalformedDataException;

import static org.junit.Assert.*;

/**
 * Created by Ephraim Kigamba - ekigamba@ona.io on 05/12/2017.
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class,manifest=Config.NONE)
public class MapBoxDeleteTaskTest {

    @Test
    public void constructorShouldCreateValidObject() {
        String mapName = "sample map name";
        String mapboxAccessToken = "90sd09jio(#@";
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put(MapBoxDeleteTask.MAP_NAME, mapName);
            jsonObject.put(MapBoxDeleteTask.MAP_BOX_ACCESS_TOKEN, mapboxAccessToken);

            MapBoxDeleteTask mapBoxDeleteTask = new MapBoxDeleteTask(jsonObject);

            assertEquals(mapBoxDeleteTask.getMapName(), mapName);
            assertEquals(mapBoxDeleteTask.getMapBoxAccessToken(), mapboxAccessToken);
        } catch (JSONException | MalformedDataException e) {
            e.printStackTrace();
        }

    }

}