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
public final class LegacyCollectionGraphicsJsonAdapter extends JsonAdapter<LegacyCollectionGraphics> {
    private volatile Constructor<LegacyCollectionGraphics> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<LegacyCollectionMobile> nullableLegacyCollectionMobileAdapter;
    private final JsonReader.b options;

    public LegacyCollectionGraphicsJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("mobile", "minWidth");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<LegacyCollectionMobile> f = iVar.f(LegacyCollectionMobile.class, b0.e(), "mobile");
        zq3.g(f, "adapter(...)");
        this.nullableLegacyCollectionMobileAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "minWidth");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LegacyCollectionGraphics");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public LegacyCollectionGraphics fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Integer num = 0;
        jsonReader.b();
        LegacyCollectionMobile legacyCollectionMobile = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                legacyCollectionMobile = (LegacyCollectionMobile) this.nullableLegacyCollectionMobileAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x = c29.x("minWidth", "minWidth", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i = -3;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -3) {
            return new LegacyCollectionGraphics(legacyCollectionMobile, num.intValue());
        }
        Constructor<LegacyCollectionGraphics> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = LegacyCollectionGraphics.class.getDeclaredConstructor(LegacyCollectionMobile.class, cls, cls, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        LegacyCollectionGraphics newInstance = constructor.newInstance(legacyCollectionMobile, num, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LegacyCollectionGraphics legacyCollectionGraphics) {
        zq3.h(hVar, "writer");
        if (legacyCollectionGraphics == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("mobile");
        this.nullableLegacyCollectionMobileAdapter.mo197toJson(hVar, legacyCollectionGraphics.getMobile());
        hVar.C("minWidth");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(legacyCollectionGraphics.getMinWidth()));
        hVar.l();
    }
}
