package com.squareup.moshi.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;

/* loaded from: classes4.dex */
public final class NonNullJsonAdapter<T> extends JsonAdapter<T> {
    private final JsonAdapter<T> delegate;

    public NonNullJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.delegate = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Object fromJson(JsonReader jsonReader) {
        if (jsonReader.r() != JsonReader.Token.NULL) {
            return this.delegate.fromJson(jsonReader);
        }
        throw new JsonDataException("Unexpected null at " + jsonReader.getPath());
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public void mo197toJson(h hVar, Object obj) {
        if (obj != null) {
            this.delegate.mo197toJson(hVar, obj);
            return;
        }
        throw new JsonDataException("Unexpected null at " + hVar.getPath());
    }

    public String toString() {
        return this.delegate + ".nonNull()";
    }
}
