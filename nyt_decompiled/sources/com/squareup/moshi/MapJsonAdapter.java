package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
final class MapJsonAdapter<K, V> extends JsonAdapter<Map<K, V>> {
    public static final JsonAdapter.e FACTORY = new a();
    private final JsonAdapter<K> keyAdapter;
    private final JsonAdapter<V> valueAdapter;

    class a implements JsonAdapter.e {
        a() {
        }

        @Override // com.squareup.moshi.JsonAdapter.e
        public JsonAdapter create(Type type2, Set set, i iVar) {
            Class g;
            if (!set.isEmpty() || (g = j.g(type2)) != Map.class) {
                return null;
            }
            Type[] i = j.i(type2, g);
            return new MapJsonAdapter(iVar, i[0], i[1]).nullSafe();
        }
    }

    MapJsonAdapter(i iVar, Type type2, Type type3) {
        this.keyAdapter = iVar.d(type2);
        this.valueAdapter = iVar.d(type3);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map fromJson(JsonReader jsonReader) {
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        jsonReader.b();
        while (jsonReader.hasNext()) {
            jsonReader.C();
            Object fromJson = this.keyAdapter.fromJson(jsonReader);
            Object fromJson2 = this.valueAdapter.fromJson(jsonReader);
            Object put = linkedHashTreeMap.put(fromJson, fromJson2);
            if (put != null) {
                throw new JsonDataException("Map key '" + fromJson + "' has multiple values at path " + jsonReader.getPath() + ": " + put + " and " + fromJson2);
            }
        }
        jsonReader.h();
        return linkedHashTreeMap;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Map map) {
        hVar.d();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new JsonDataException("Map key is null at " + hVar.getPath());
            }
            hVar.X();
            this.keyAdapter.mo197toJson(hVar, entry.getKey());
            this.valueAdapter.mo197toJson(hVar, entry.getValue());
        }
        hVar.l();
    }

    public String toString() {
        return "JsonAdapter(" + this.keyAdapter + "=" + this.valueAdapter + ")";
    }
}
