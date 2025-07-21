package com.nytimes.android.media.audio.podcast;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import defpackage.zv5;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PodcastJsonAdapter extends JsonAdapter<Podcast> {
    public static final int $stable = 8;
    private final JsonAdapter<List<Episode>> listOfEpisodeAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<zv5> podcastDataAdapter;

    public PodcastJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("data", "episodes");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<zv5> f = iVar.f(zv5.class, b0.e(), "data");
        zq3.g(f, "adapter(...)");
        this.podcastDataAdapter = f;
        JsonAdapter<List<Episode>> f2 = iVar.f(j.j(List.class, Episode.class), b0.e(), "episodes");
        zq3.g(f2, "adapter(...)");
        this.listOfEpisodeAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Podcast fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        zv5 zv5Var = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                zv5Var = (zv5) this.podcastDataAdapter.fromJson(jsonReader);
                if (zv5Var == null) {
                    JsonDataException x = c29.x("data_", "data", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (list = (List) this.listOfEpisodeAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("episodes", "episodes", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (zv5Var == null) {
            JsonDataException o = c29.o("data_", "data", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (list != null) {
            return new Podcast(zv5Var, list);
        }
        JsonDataException o2 = c29.o("episodes", "episodes", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Podcast podcast) {
        zq3.h(hVar, "writer");
        if (podcast == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("data");
        this.podcastDataAdapter.mo197toJson(hVar, podcast.c());
        hVar.C("episodes");
        this.listOfEpisodeAdapter.mo197toJson(hVar, podcast.d());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(29);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Podcast");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
