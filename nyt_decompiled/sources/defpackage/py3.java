package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.nytimes.android.api.cms.LatestFeed;

/* loaded from: classes3.dex */
public abstract class py3 {
    public static LatestFeed a(Gson gson, JsonReader jsonReader) {
        LatestFeed latestFeed = (LatestFeed) gson.fromJson(jsonReader, LatestFeed.class);
        latestFeed.setSectionConfigs();
        return latestFeed;
    }
}
