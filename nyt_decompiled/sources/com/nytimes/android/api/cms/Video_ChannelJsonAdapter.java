package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.Video;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class Video_ChannelJsonAdapter extends JsonAdapter<Video.Channel> {
    private volatile Constructor<Video.Channel> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public Video_ChannelJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("displayName");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "displayName");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Video.Channel");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Video.Channel fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i = -2;
            }
        }
        jsonReader.h();
        if (i == -2) {
            return new Video.Channel(str);
        }
        Constructor<Video.Channel> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Video.Channel.class.getDeclaredConstructor(String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        Video.Channel newInstance = constructor.newInstance(str, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Video.Channel channel) {
        zq3.h(hVar, "writer");
        if (channel == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("displayName");
        this.nullableStringAdapter.mo197toJson(hVar, channel.getDisplayName());
        hVar.l();
    }
}
