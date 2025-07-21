package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
abstract class CollectionJsonAdapter<C extends Collection<T>, T> extends JsonAdapter<C> {
    public static final JsonAdapter.e FACTORY = new a();
    private final JsonAdapter<T> elementAdapter;

    class a implements JsonAdapter.e {
        a() {
        }

        @Override // com.squareup.moshi.JsonAdapter.e
        public JsonAdapter create(Type type2, Set set, i iVar) {
            Class g = j.g(type2);
            if (!set.isEmpty()) {
                return null;
            }
            if (g == List.class || g == Collection.class) {
                return CollectionJsonAdapter.b(type2, iVar).nullSafe();
            }
            if (g == Set.class) {
                return CollectionJsonAdapter.d(type2, iVar).nullSafe();
            }
            return null;
        }
    }

    class b extends CollectionJsonAdapter {
        b(JsonAdapter jsonAdapter) {
            super(jsonAdapter, null);
        }

        @Override // com.squareup.moshi.CollectionJsonAdapter
        Collection c() {
            return new ArrayList();
        }

        @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
        public /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) {
            return super.fromJson(jsonReader);
        }

        @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public /* bridge */ /* synthetic */ void mo197toJson(h hVar, Object obj) {
            super.mo197toJson(hVar, (Collection) obj);
        }
    }

    class c extends CollectionJsonAdapter {
        c(JsonAdapter jsonAdapter) {
            super(jsonAdapter, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.squareup.moshi.CollectionJsonAdapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Set c() {
            return new LinkedHashSet();
        }

        @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
        public /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) {
            return super.fromJson(jsonReader);
        }

        @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public /* bridge */ /* synthetic */ void mo197toJson(h hVar, Object obj) {
            super.mo197toJson(hVar, (Collection) obj);
        }
    }

    /* synthetic */ CollectionJsonAdapter(JsonAdapter jsonAdapter, a aVar) {
        this(jsonAdapter);
    }

    static JsonAdapter b(Type type2, i iVar) {
        return new b(iVar.d(j.c(type2, Collection.class)));
    }

    static JsonAdapter d(Type type2, i iVar) {
        return new c(iVar.d(j.c(type2, Collection.class)));
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Collection fromJson(JsonReader jsonReader) {
        Collection c2 = c();
        jsonReader.a();
        while (jsonReader.hasNext()) {
            c2.add(this.elementAdapter.fromJson(jsonReader));
        }
        jsonReader.d();
        return c2;
    }

    abstract Collection c();

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Collection collection) {
        hVar.a();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            this.elementAdapter.mo197toJson(hVar, it2.next());
        }
        hVar.i();
    }

    public String toString() {
        return this.elementAdapter + ".collection()";
    }

    private CollectionJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.elementAdapter = jsonAdapter;
    }
}
