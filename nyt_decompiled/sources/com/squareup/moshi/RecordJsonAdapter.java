package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes4.dex */
final class RecordJsonAdapter<T> extends JsonAdapter<T> {
    static final JsonAdapter.e FACTORY = new a();

    class a implements JsonAdapter.e {
        a() {
        }

        @Override // com.squareup.moshi.JsonAdapter.e
        public JsonAdapter create(Type type2, Set set, i iVar) {
            return null;
        }
    }

    RecordJsonAdapter() {
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Object fromJson(JsonReader jsonReader) {
        throw new AssertionError();
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public void mo197toJson(h hVar, Object obj) {
        throw new AssertionError();
    }
}
