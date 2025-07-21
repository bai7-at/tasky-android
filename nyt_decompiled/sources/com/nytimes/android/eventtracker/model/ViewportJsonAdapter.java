package com.nytimes.android.eventtracker.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class ViewportJsonAdapter extends JsonAdapter<Viewport> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.b options;

    public ViewportJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("width", "length");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.TYPE, b0.e(), "width");
        zq3.g(f, "adapter(...)");
        this.intAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Viewport fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x = c29.x("width", "width", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (num2 = (Integer) this.intAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("length", "length", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (num == null) {
            JsonDataException o = c29.o("width", "width", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        int intValue = num.intValue();
        if (num2 != null) {
            return new Viewport(intValue, num2.intValue());
        }
        JsonDataException o2 = c29.o("length", "length", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Viewport viewport) {
        zq3.h(hVar, "writer");
        if (viewport == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("width");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(viewport.b()));
        hVar.C("length");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(viewport.a()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Viewport");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
