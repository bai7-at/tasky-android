package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.Video;
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
public final class Video_LiveUrlJsonAdapter extends JsonAdapter<Video.LiveUrl> {
    private volatile Constructor<Video.LiveUrl> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public Video_LiveUrlJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("rank", "url");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.TYPE, b0.e(), "rank");
        zq3.g(f, "adapter(...)");
        this.intAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "url");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Video.LiveUrl");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Video.LiveUrl fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Integer num = 0;
        jsonReader.b();
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x = c29.x("rank", "rank", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -2;
            } else if (P == 1) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.h();
        if (i == -4) {
            return new Video.LiveUrl(num.intValue(), str);
        }
        Constructor<Video.LiveUrl> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = Video.LiveUrl.class.getDeclaredConstructor(cls, String.class, cls, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        Video.LiveUrl newInstance = constructor.newInstance(num, str, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Video.LiveUrl liveUrl) {
        zq3.h(hVar, "writer");
        if (liveUrl == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("rank");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(liveUrl.getRank()));
        hVar.C("url");
        this.nullableStringAdapter.mo197toJson(hVar, liveUrl.getUrl());
        hVar.l();
    }
}
