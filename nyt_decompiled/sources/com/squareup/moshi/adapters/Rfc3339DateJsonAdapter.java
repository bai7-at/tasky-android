package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import java.util.Date;

/* loaded from: classes4.dex */
public final class Rfc3339DateJsonAdapter extends JsonAdapter<Date> {
    @Override // com.squareup.moshi.JsonAdapter
    public synchronized Date fromJson(JsonReader jsonReader) {
        if (jsonReader.r() == JsonReader.Token.NULL) {
            return (Date) jsonReader.l();
        }
        return a.e(jsonReader.nextString());
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public synchronized void mo197toJson(h hVar, Date date) {
        try {
            if (date == null) {
                hVar.G();
            } else {
                hVar.K0(a.b(date));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
