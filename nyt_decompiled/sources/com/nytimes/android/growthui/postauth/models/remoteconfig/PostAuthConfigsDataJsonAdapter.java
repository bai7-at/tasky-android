package com.nytimes.android.growthui.postauth.models.remoteconfig;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PostAuthConfigsDataJsonAdapter extends JsonAdapter<PostAuthConfigsData> {
    public static final int $stable = 8;
    private volatile Constructor<PostAuthConfigsData> constructorRef;
    private final JsonAdapter<Map<String, PostAuthData>> nullableMapOfStringPostAuthDataAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<PostAuthData> postAuthDataAdapter;

    public PostAuthConfigsDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("config", "variants");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<PostAuthData> f = iVar.f(PostAuthData.class, b0.e(), "config");
        zq3.g(f, "adapter(...)");
        this.postAuthDataAdapter = f;
        JsonAdapter<Map<String, PostAuthData>> f2 = iVar.f(j.j(Map.class, String.class, PostAuthData.class), b0.e(), "variants");
        zq3.g(f2, "adapter(...)");
        this.nullableMapOfStringPostAuthDataAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PostAuthConfigsData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        PostAuthData postAuthData = null;
        Map map = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                postAuthData = (PostAuthData) this.postAuthDataAdapter.fromJson(jsonReader);
                if (postAuthData == null) {
                    JsonDataException x = c29.x("config", "config", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -2;
            } else if (P == 1) {
                map = (Map) this.nullableMapOfStringPostAuthDataAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.h();
        if (i == -4) {
            zq3.f(postAuthData, "null cannot be cast to non-null type com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthData");
            return new PostAuthConfigsData(postAuthData, map);
        }
        Constructor<PostAuthConfigsData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PostAuthConfigsData.class.getDeclaredConstructor(PostAuthData.class, Map.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        PostAuthConfigsData newInstance = constructor.newInstance(postAuthData, map, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PostAuthConfigsData postAuthConfigsData) {
        zq3.h(hVar, "writer");
        if (postAuthConfigsData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("config");
        this.postAuthDataAdapter.mo197toJson(hVar, postAuthConfigsData.a());
        hVar.C("variants");
        this.nullableMapOfStringPostAuthDataAdapter.mo197toJson(hVar, postAuthConfigsData.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PostAuthConfigsData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
