package com.nytimes.android.dailyfive.domain;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class FollowStatusJsonAdapter extends JsonAdapter<FollowStatus> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public FollowStatusJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("uri", "following");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "uri");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "following");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FollowStatus fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("uri", "uri", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (bool = (Boolean) this.booleanAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("following", "following", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("uri", "uri", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (bool != null) {
            return new FollowStatus(str, bool.booleanValue());
        }
        JsonDataException o2 = c29.o("following", "following", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, FollowStatus followStatus) {
        zq3.h(hVar, "writer");
        if (followStatus == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("uri");
        this.stringAdapter.mo197toJson(hVar, followStatus.b());
        hVar.C("following");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(followStatus.a()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("FollowStatus");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
