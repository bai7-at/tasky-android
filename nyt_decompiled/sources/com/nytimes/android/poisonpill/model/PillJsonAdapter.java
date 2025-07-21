package com.nytimes.android.poisonpill.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PillJsonAdapter extends JsonAdapter<Pill> {
    private final JsonAdapter<Classifier> classifierAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public PillJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("classifier", "allowedDismisses", "copy");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Classifier> f = iVar.f(Classifier.class, b0.e(), "classifier");
        zq3.g(f, "adapter(...)");
        this.classifierAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "allowedDismisses");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "copy");
        zq3.g(f3, "adapter(...)");
        this.nullableStringAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Pill fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Classifier classifier = null;
        Integer num = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                classifier = (Classifier) this.classifierAdapter.fromJson(jsonReader);
                if (classifier == null) {
                    JsonDataException x = c29.x("classifier", "classifier", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x2 = c29.x("allowedDismisses", "allowedDismisses", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (classifier == null) {
            JsonDataException o = c29.o("classifier", "classifier", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (num != null) {
            return new Pill(classifier, num.intValue(), str);
        }
        JsonDataException o2 = c29.o("allowedDismisses", "allowedDismisses", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Pill pill) {
        zq3.h(hVar, "writer");
        if (pill == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("classifier");
        this.classifierAdapter.mo197toJson(hVar, pill.b());
        hVar.C("allowedDismisses");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(pill.a()));
        hVar.C("copy");
        this.nullableStringAdapter.mo197toJson(hVar, pill.c());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(26);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Pill");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
