package com.squareup.moshi;

import java.util.Date;

/* loaded from: classes4.dex */
public final class Rfc3339DateJsonAdapter extends JsonAdapter<Date> {
    private final com.squareup.moshi.adapters.Rfc3339DateJsonAdapter delegate = new com.squareup.moshi.adapters.Rfc3339DateJsonAdapter();

    @Override // com.squareup.moshi.JsonAdapter
    public Date fromJson(JsonReader jsonReader) {
        return this.delegate.fromJson(jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Date date) {
        this.delegate.mo197toJson(hVar, date);
    }
}
