package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes4.dex */
final class ArrayJsonAdapter extends JsonAdapter<Object> {
    public static final JsonAdapter.e FACTORY = new a();
    private final JsonAdapter<Object> elementAdapter;
    private final Class<?> elementClass;

    class a implements JsonAdapter.e {
        a() {
        }

        @Override // com.squareup.moshi.JsonAdapter.e
        public JsonAdapter create(Type type2, Set set, i iVar) {
            Type a = j.a(type2);
            if (a != null && set.isEmpty()) {
                return new ArrayJsonAdapter(j.g(a), iVar.d(a)).nullSafe();
            }
            return null;
        }
    }

    ArrayJsonAdapter(Class<?> cls, JsonAdapter<Object> jsonAdapter) {
        this.elementClass = cls;
        this.elementAdapter = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Object fromJson(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.a();
        while (jsonReader.hasNext()) {
            arrayList.add(this.elementAdapter.fromJson(jsonReader));
        }
        jsonReader.d();
        Object newInstance = Array.newInstance(this.elementClass, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public void mo197toJson(h hVar, Object obj) {
        hVar.a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.elementAdapter.mo197toJson(hVar, Array.get(obj, i));
        }
        hVar.i();
    }

    public String toString() {
        return this.elementAdapter + ".array()";
    }
}
