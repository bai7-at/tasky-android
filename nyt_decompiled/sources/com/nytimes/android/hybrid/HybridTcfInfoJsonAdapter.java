package com.nytimes.android.hybrid;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.p96;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class HybridTcfInfoJsonAdapter extends JsonAdapter<HybridTcfInfo> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<HybridTcfInfo> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public HybridTcfInfoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(p96.TCF_COOKIE, "fides_disable_banner");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "tcString");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "shouldFidesDisableBanner");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HybridTcfInfo fromJson(JsonReader jsonReader) {
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
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    JsonDataException x = c29.x("shouldFidesDisableBanner", "fides_disable_banner", jsonReader);
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
            return new HybridTcfInfo(str, bool.booleanValue());
        }
        Constructor<HybridTcfInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HybridTcfInfo.class.getDeclaredConstructor(String.class, Boolean.TYPE, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        HybridTcfInfo newInstance = constructor.newInstance(str, bool, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, HybridTcfInfo hybridTcfInfo) {
        zq3.h(hVar, "writer");
        if (hybridTcfInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(p96.TCF_COOKIE);
        this.nullableStringAdapter.mo197toJson(hVar, hybridTcfInfo.b());
        hVar.C("fides_disable_banner");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(hybridTcfInfo.a()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("HybridTcfInfo");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
