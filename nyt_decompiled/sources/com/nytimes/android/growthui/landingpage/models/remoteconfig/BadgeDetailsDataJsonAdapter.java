package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class BadgeDetailsDataJsonAdapter extends JsonAdapter<BadgeDetailsData> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<BadgeDetailsData> constructorRef;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public BadgeDetailsDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("text", "isVisible");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "text");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "isVisible");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public BadgeDetailsData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.b();
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("text", "text", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -2;
            } else if (P == 1) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    JsonDataException x2 = c29.x("isVisible", "isVisible", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i &= -3;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -4) {
            zq3.f(str, "null cannot be cast to non-null type kotlin.String");
            return new BadgeDetailsData(str, bool.booleanValue());
        }
        Constructor<BadgeDetailsData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BadgeDetailsData.class.getDeclaredConstructor(String.class, Boolean.TYPE, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        BadgeDetailsData newInstance = constructor.newInstance(str, bool, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, BadgeDetailsData badgeDetailsData) {
        zq3.h(hVar, "writer");
        if (badgeDetailsData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("text");
        this.stringAdapter.mo197toJson(hVar, badgeDetailsData.a());
        hVar.C("isVisible");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(badgeDetailsData.b()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BadgeDetailsData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
