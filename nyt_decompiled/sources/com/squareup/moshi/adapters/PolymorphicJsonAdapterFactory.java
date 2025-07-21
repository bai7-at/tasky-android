package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class PolymorphicJsonAdapterFactory implements JsonAdapter.e {
    final Class a;
    final String b;
    final List c;
    final List d;
    final JsonAdapter e;

    static final class PolymorphicJsonAdapter extends JsonAdapter<Object> {
        final JsonAdapter<Object> fallbackJsonAdapter;
        final List<JsonAdapter<Object>> jsonAdapters;
        final String labelKey;
        final JsonReader.b labelKeyOptions;
        final JsonReader.b labelOptions;
        final List<String> labels;
        final List<Type> subtypes;

        PolymorphicJsonAdapter(String str, List<String> list, List<Type> list2, List<JsonAdapter<Object>> list3, JsonAdapter<Object> jsonAdapter) {
            this.labelKey = str;
            this.labels = list;
            this.subtypes = list2;
            this.jsonAdapters = list3;
            this.fallbackJsonAdapter = jsonAdapter;
            this.labelKeyOptions = JsonReader.b.a(str);
            this.labelOptions = JsonReader.b.a((String[]) list.toArray(new String[0]));
        }

        private int a(JsonReader jsonReader) {
            jsonReader.b();
            while (jsonReader.hasNext()) {
                if (jsonReader.P(this.labelKeyOptions) != -1) {
                    int X = jsonReader.X(this.labelOptions);
                    if (X != -1 || this.fallbackJsonAdapter != null) {
                        return X;
                    }
                    throw new JsonDataException("Expected one of " + this.labels + " for key '" + this.labelKey + "' but found '" + jsonReader.nextString() + "'. Register a subtype for this label.");
                }
                jsonReader.f0();
                jsonReader.skipValue();
            }
            throw new JsonDataException("Missing label for " + this.labelKey);
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) {
            JsonReader s = jsonReader.s();
            s.c0(false);
            try {
                int a = a(s);
                s.close();
                return a == -1 ? this.fallbackJsonAdapter.fromJson(jsonReader) : this.jsonAdapters.get(a).fromJson(jsonReader);
            } catch (Throwable th) {
                s.close();
                throw th;
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public void mo197toJson(h hVar, Object obj) {
            JsonAdapter<Object> jsonAdapter;
            int indexOf = this.subtypes.indexOf(obj.getClass());
            if (indexOf == -1) {
                jsonAdapter = this.fallbackJsonAdapter;
                if (jsonAdapter == null) {
                    throw new IllegalArgumentException("Expected one of " + this.subtypes + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
                }
            } else {
                jsonAdapter = this.jsonAdapters.get(indexOf);
            }
            hVar.d();
            if (jsonAdapter != this.fallbackJsonAdapter) {
                hVar.C(this.labelKey).K0(this.labels.get(indexOf));
            }
            int b = hVar.b();
            jsonAdapter.mo197toJson(hVar, obj);
            hVar.j(b);
            hVar.l();
        }

        public String toString() {
            return "PolymorphicJsonAdapter(" + this.labelKey + ")";
        }
    }

    PolymorphicJsonAdapterFactory(Class cls, String str, List list, List list2, JsonAdapter jsonAdapter) {
        this.a = cls;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = jsonAdapter;
    }

    public static PolymorphicJsonAdapterFactory a(Class cls, String str) {
        if (cls == null) {
            throw new NullPointerException("baseType == null");
        }
        if (str != null) {
            return new PolymorphicJsonAdapterFactory(cls, str, Collections.emptyList(), Collections.emptyList(), null);
        }
        throw new NullPointerException("labelKey == null");
    }

    public PolymorphicJsonAdapterFactory b(Class cls, String str) {
        if (cls == null) {
            throw new NullPointerException("subtype == null");
        }
        if (str == null) {
            throw new NullPointerException("label == null");
        }
        if (this.c.contains(str)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(this.c);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.d);
        arrayList2.add(cls);
        return new PolymorphicJsonAdapterFactory(this.a, this.b, arrayList, arrayList2, this.e);
    }

    @Override // com.squareup.moshi.JsonAdapter.e
    public JsonAdapter create(Type type2, Set set, i iVar) {
        if (j.g(type2) != this.a || !set.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.d.size());
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(iVar.d((Type) this.d.get(i)));
        }
        return new PolymorphicJsonAdapter(this.b, this.c, this.d, arrayList, this.e).nullSafe();
    }
}
