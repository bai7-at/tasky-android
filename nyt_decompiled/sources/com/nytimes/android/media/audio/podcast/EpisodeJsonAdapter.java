package com.nytimes.android.media.audio.podcast;

import com.nytimes.android.utils.TimeDuration;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class EpisodeJsonAdapter extends JsonAdapter<Episode> {
    public static final int $stable = 8;
    private final JsonAdapter<List<Subscription>> listOfSubscriptionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TimeDuration> timeDurationAdapter;

    public EpisodeJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("title", "description", "date", "webLink", "mediaUrl", "section", "duration", "subscriptions");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "title");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "date");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
        JsonAdapter<TimeDuration> f3 = iVar.f(TimeDuration.class, b0.e(), "duration");
        zq3.g(f3, "adapter(...)");
        this.timeDurationAdapter = f3;
        JsonAdapter<List<Subscription>> f4 = iVar.f(j.j(List.class, Subscription.class), b0.e(), "subscriptions");
        zq3.g(f4, "adapter(...)");
        this.listOfSubscriptionAdapter = f4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Episode fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        TimeDuration timeDuration = null;
        List list = null;
        while (true) {
            String str7 = str3;
            List list2 = list;
            if (!jsonReader.hasNext()) {
                TimeDuration timeDuration2 = timeDuration;
                jsonReader.h();
                if (str == null) {
                    JsonDataException o = c29.o("title", "title", jsonReader);
                    zq3.g(o, "missingProperty(...)");
                    throw o;
                }
                if (str2 == null) {
                    JsonDataException o2 = c29.o("description", "description", jsonReader);
                    zq3.g(o2, "missingProperty(...)");
                    throw o2;
                }
                if (str4 == null) {
                    JsonDataException o3 = c29.o("webLink", "webLink", jsonReader);
                    zq3.g(o3, "missingProperty(...)");
                    throw o3;
                }
                if (str5 == null) {
                    JsonDataException o4 = c29.o("mediaUrl", "mediaUrl", jsonReader);
                    zq3.g(o4, "missingProperty(...)");
                    throw o4;
                }
                if (str6 == null) {
                    JsonDataException o5 = c29.o("section", "section", jsonReader);
                    zq3.g(o5, "missingProperty(...)");
                    throw o5;
                }
                if (timeDuration2 == null) {
                    JsonDataException o6 = c29.o("duration", "duration", jsonReader);
                    zq3.g(o6, "missingProperty(...)");
                    throw o6;
                }
                if (list2 != null) {
                    return new Episode(str, str2, str7, str4, str5, str6, timeDuration2, list2);
                }
                JsonDataException o7 = c29.o("subscriptions", "subscriptions", jsonReader);
                zq3.g(o7, "missingProperty(...)");
                throw o7;
            }
            TimeDuration timeDuration3 = timeDuration;
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    str3 = str7;
                    list = list2;
                    timeDuration = timeDuration3;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("title", "title", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    str3 = str7;
                    list = list2;
                    timeDuration = timeDuration3;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x2 = c29.x("description", "description", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    str3 = str7;
                    list = list2;
                    timeDuration = timeDuration3;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    list = list2;
                    timeDuration = timeDuration3;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x3 = c29.x("webLink", "webLink", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    str3 = str7;
                    list = list2;
                    timeDuration = timeDuration3;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        JsonDataException x4 = c29.x("mediaUrl", "mediaUrl", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    str3 = str7;
                    list = list2;
                    timeDuration = timeDuration3;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        JsonDataException x5 = c29.x("section", "section", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    str3 = str7;
                    list = list2;
                    timeDuration = timeDuration3;
                case 6:
                    TimeDuration timeDuration4 = (TimeDuration) this.timeDurationAdapter.fromJson(jsonReader);
                    if (timeDuration4 == null) {
                        JsonDataException x6 = c29.x("duration", "duration", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    timeDuration = timeDuration4;
                    str3 = str7;
                    list = list2;
                case 7:
                    List list3 = (List) this.listOfSubscriptionAdapter.fromJson(jsonReader);
                    if (list3 == null) {
                        JsonDataException x7 = c29.x("subscriptions", "subscriptions", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    list = list3;
                    str3 = str7;
                    timeDuration = timeDuration3;
                default:
                    str3 = str7;
                    list = list2;
                    timeDuration = timeDuration3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Episode episode) {
        zq3.h(hVar, "writer");
        if (episode == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("title");
        this.stringAdapter.mo197toJson(hVar, episode.g());
        hVar.C("description");
        this.stringAdapter.mo197toJson(hVar, episode.b());
        hVar.C("date");
        this.nullableStringAdapter.mo197toJson(hVar, episode.a());
        hVar.C("webLink");
        this.stringAdapter.mo197toJson(hVar, episode.h());
        hVar.C("mediaUrl");
        this.stringAdapter.mo197toJson(hVar, episode.d());
        hVar.C("section");
        this.stringAdapter.mo197toJson(hVar, episode.e());
        hVar.C("duration");
        this.timeDurationAdapter.mo197toJson(hVar, episode.c());
        hVar.C("subscriptions");
        this.listOfSubscriptionAdapter.mo197toJson(hVar, episode.f());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(29);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Episode");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
