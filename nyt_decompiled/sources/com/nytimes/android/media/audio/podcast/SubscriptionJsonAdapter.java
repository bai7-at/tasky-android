package com.nytimes.android.media.audio.podcast;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class SubscriptionJsonAdapter extends JsonAdapter<Subscription> {
    public static final int $stable = 8;
    private final JsonReader.b options;
    private final JsonAdapter<PodcastSubscriptionType> podcastSubscriptionTypeAdapter;
    private final JsonAdapter<String> stringAdapter;

    public SubscriptionJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("service", "url");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<PodcastSubscriptionType> f = iVar.f(PodcastSubscriptionType.class, b0.e(), "service");
        zq3.g(f, "adapter(...)");
        this.podcastSubscriptionTypeAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "url");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Subscription fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        PodcastSubscriptionType podcastSubscriptionType = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                podcastSubscriptionType = (PodcastSubscriptionType) this.podcastSubscriptionTypeAdapter.fromJson(jsonReader);
                if (podcastSubscriptionType == null) {
                    JsonDataException x = c29.x("service", "service", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (str = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("url", "url", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (podcastSubscriptionType == null) {
            JsonDataException o = c29.o("service", "service", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (str != null) {
            return new Subscription(podcastSubscriptionType, str);
        }
        JsonDataException o2 = c29.o("url", "url", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Subscription subscription) {
        zq3.h(hVar, "writer");
        if (subscription == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("service");
        this.podcastSubscriptionTypeAdapter.mo197toJson(hVar, subscription.a());
        hVar.C("url");
        this.stringAdapter.mo197toJson(hVar, subscription.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Subscription");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
