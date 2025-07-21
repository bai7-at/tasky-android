package com.nytimes.android.hybrid;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class HybridUserInfoJsonAdapter extends JsonAdapter<HybridUserInfo> {
    private volatile Constructor<HybridUserInfo> constructorRef;
    private final JsonAdapter<Set<String>> nullableSetOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public HybridUserInfoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("nytsCookie", "regiId", "pushToken", "agentId", "entitlements");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "nytsCookie");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<Set<String>> f2 = iVar.f(j.j(Set.class, String.class), b0.e(), "entitlements");
        zq3.g(f2, "adapter(...)");
        this.nullableSetOfStringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HybridUserInfo fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Set set = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 3) {
                str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            } else if (P == 4) {
                set = (Set) this.nullableSetOfStringAdapter.fromJson(jsonReader);
                i &= -17;
            }
        }
        jsonReader.h();
        if (i == -25) {
            return new HybridUserInfo(str, str2, str3, str4, set);
        }
        Constructor<HybridUserInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HybridUserInfo.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Set.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        HybridUserInfo newInstance = constructor.newInstance(str, str2, str3, str4, set, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, HybridUserInfo hybridUserInfo) {
        zq3.h(hVar, "writer");
        if (hybridUserInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("nytsCookie");
        this.nullableStringAdapter.mo197toJson(hVar, hybridUserInfo.c());
        hVar.C("regiId");
        this.nullableStringAdapter.mo197toJson(hVar, hybridUserInfo.e());
        hVar.C("pushToken");
        this.nullableStringAdapter.mo197toJson(hVar, hybridUserInfo.d());
        hVar.C("agentId");
        this.nullableStringAdapter.mo197toJson(hVar, hybridUserInfo.a());
        hVar.C("entitlements");
        this.nullableSetOfStringAdapter.mo197toJson(hVar, hybridUserInfo.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("HybridUserInfo");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
