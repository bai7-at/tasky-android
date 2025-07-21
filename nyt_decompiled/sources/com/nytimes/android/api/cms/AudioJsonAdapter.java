package com.nytimes.android.api.cms;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class AudioJsonAdapter extends JsonAdapter<Audio> {
    private volatile Constructor<Audio> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<PodcastSeries> nullablePodcastSeriesAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public AudioJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("credit", "fileName", "fileUrl", "length", "podcastSeries");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "credit");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.TYPE, b0.e(), "length");
        zq3.g(f2, "adapter(...)");
        this.longAdapter = f2;
        JsonAdapter<PodcastSeries> f3 = iVar.f(PodcastSeries.class, b0.e(), "podcastSeries");
        zq3.g(f3, "adapter(...)");
        this.nullablePodcastSeriesAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(27);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Audio");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Audio fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = 0L;
        String str = null;
        String str2 = null;
        String str3 = null;
        PodcastSeries podcastSeries = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (P == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (P == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (P == 3) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("length", "length", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -9;
            } else if (P == 4) {
                podcastSeries = (PodcastSeries) this.nullablePodcastSeriesAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (i == -16) {
            return new Audio(str, str2, str3, l.longValue(), podcastSeries);
        }
        Constructor<Audio> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Audio.class.getDeclaredConstructor(String.class, String.class, String.class, Long.TYPE, PodcastSeries.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        Audio newInstance = constructor.newInstance(str, str2, str3, l, podcastSeries, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Audio audio) {
        zq3.h(hVar, "writer");
        if (audio == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("credit");
        this.nullableStringAdapter.mo197toJson(hVar, audio.getCredit());
        hVar.C("fileName");
        this.nullableStringAdapter.mo197toJson(hVar, audio.getFileName());
        hVar.C("fileUrl");
        this.nullableStringAdapter.mo197toJson(hVar, audio.getFileUrl());
        hVar.C("length");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(audio.getLength()));
        hVar.C("podcastSeries");
        this.nullablePodcastSeriesAdapter.mo197toJson(hVar, audio.getPodcastSeries());
        hVar.l();
    }
}
