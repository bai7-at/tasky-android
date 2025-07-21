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
public final class PlaylistRefJsonAdapter extends JsonAdapter<PlaylistRef> {
    private volatile Constructor<PlaylistRef> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public PlaylistRefJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("id", "uri", "headline");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "id");
        zq3.g(f, "adapter(...)");
        this.longAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "uri");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "headline");
        zq3.g(f3, "adapter(...)");
        this.nullableStringAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PlaylistRef");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public PlaylistRef fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Long l = 0L;
        jsonReader.b();
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("id", "id", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -2;
            } else if (P == 1) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x2 = c29.x("uri", "uri", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i &= -3;
            } else if (P == 2) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (i == -4) {
            long longValue = l.longValue();
            zq3.f(str, "null cannot be cast to non-null type kotlin.String");
            return new PlaylistRef(longValue, str, str2);
        }
        Constructor<PlaylistRef> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PlaylistRef.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        PlaylistRef newInstance = constructor.newInstance(l, str, str2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PlaylistRef playlistRef) {
        zq3.h(hVar, "writer");
        if (playlistRef == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("id");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(playlistRef.getId()));
        hVar.C("uri");
        this.stringAdapter.mo197toJson(hVar, playlistRef.getUri());
        hVar.C("headline");
        this.nullableStringAdapter.mo197toJson(hVar, playlistRef.getHeadline());
        hVar.l();
    }
}
