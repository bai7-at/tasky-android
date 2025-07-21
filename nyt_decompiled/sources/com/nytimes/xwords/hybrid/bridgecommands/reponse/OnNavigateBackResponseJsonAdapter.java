package com.nytimes.xwords.hybrid.bridgecommands.reponse;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class OnNavigateBackResponseJsonAdapter extends JsonAdapter<OnNavigateBackResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader.b options;

    public OnNavigateBackResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("gamesOnNavigateBack");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Boolean> f = iVar.f(Boolean.TYPE, b0.e(), "gamesOnNavigateBack");
        zq3.g(f, "adapter(...)");
        this.booleanAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public OnNavigateBackResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0 && (bool = (Boolean) this.booleanAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("gamesOnNavigateBack", "gamesOnNavigateBack", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (bool != null) {
            return new OnNavigateBackResponse(bool.booleanValue());
        }
        JsonDataException o = c29.o("gamesOnNavigateBack", "gamesOnNavigateBack", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, OnNavigateBackResponse onNavigateBackResponse) {
        zq3.h(hVar, "writer");
        if (onNavigateBackResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("gamesOnNavigateBack");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(onNavigateBackResponse.a()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("OnNavigateBackResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
