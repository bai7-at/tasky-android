package com.nytimes.android.poisonpill.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PoisonPillFirebaseRemoteConfigJsonAdapter extends JsonAdapter<PoisonPillFirebaseRemoteConfig> {
    private final JsonAdapter<Pill[]> arrayOfPillAdapter;
    private final JsonReader.b options;

    public PoisonPillFirebaseRemoteConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("pills");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Pill[]> f = iVar.f(j.b(Pill.class), b0.e(), "pills");
        zq3.g(f, "adapter(...)");
        this.arrayOfPillAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PoisonPillFirebaseRemoteConfig fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Pill[] pillArr = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (pillArr = (Pill[]) this.arrayOfPillAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("pills", "pills", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (pillArr != null) {
            return new PoisonPillFirebaseRemoteConfig(pillArr);
        }
        JsonDataException o = c29.o("pills", "pills", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PoisonPillFirebaseRemoteConfig poisonPillFirebaseRemoteConfig) {
        zq3.h(hVar, "writer");
        if (poisonPillFirebaseRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("pills");
        this.arrayOfPillAdapter.mo197toJson(hVar, poisonPillFirebaseRemoteConfig.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PoisonPillFirebaseRemoteConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
