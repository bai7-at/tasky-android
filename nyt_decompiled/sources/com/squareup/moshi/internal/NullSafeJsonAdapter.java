package com.squareup.moshi.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;

/* loaded from: classes4.dex */
public final class NullSafeJsonAdapter<T> extends JsonAdapter<T> {
    private final JsonAdapter<T> delegate;

    public NullSafeJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Object fromJson(JsonReader jsonReader) {
        return jsonReader.r() == JsonReader.Token.NULL ? jsonReader.l() : this.delegate.fromJson(jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public void mo197toJson(h hVar, Object obj) {
        if (obj == null) {
            hVar.G();
        } else {
            this.delegate.mo197toJson(hVar, obj);
        }
    }

    public String toString() {
        return this.delegate + ".nullSafe()";
    }
}
