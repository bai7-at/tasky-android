package com.nytimes.android.poisonpill.model;

import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class ClassifierJsonAdapter extends JsonAdapter<Classifier> {
    private final JsonAdapter<ClassifierType> classifierTypeAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public ClassifierJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(AuthenticationTokenClaims.JSON_KEY_NAME, "version");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<ClassifierType> f = iVar.f(ClassifierType.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "adapter(...)");
        this.classifierTypeAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "version");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Classifier fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        ClassifierType classifierType = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                classifierType = (ClassifierType) this.classifierTypeAdapter.fromJson(jsonReader);
                if (classifierType == null) {
                    JsonDataException x = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (str = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("version", "version", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (classifierType == null) {
            JsonDataException o = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (str != null) {
            return new Classifier(classifierType, str);
        }
        JsonDataException o2 = c29.o("version", "version", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Classifier classifier) {
        zq3.h(hVar, "writer");
        if (classifier == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.classifierTypeAdapter.mo197toJson(hVar, classifier.a());
        hVar.C("version");
        this.stringAdapter.mo197toJson(hVar, classifier.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Classifier");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
