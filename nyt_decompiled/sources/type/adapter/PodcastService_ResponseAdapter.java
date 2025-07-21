package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.lu3;
import defpackage.w41;
import defpackage.zq3;
import type.PodcastService;

/* loaded from: classes5.dex */
public final class PodcastService_ResponseAdapter implements h8 {
    public static final PodcastService_ResponseAdapter INSTANCE = new PodcastService_ResponseAdapter();

    private PodcastService_ResponseAdapter() {
    }

    @Override // defpackage.h8
    public PodcastService fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return PodcastService.Companion.safeValueOf(nextString);
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, PodcastService podcastService) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(podcastService, "value");
        lu3Var.value(podcastService.getRawValue());
    }
}
