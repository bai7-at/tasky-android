package io.embrace.android.embracesdk.config.remote;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NetworkRemoteConfigJsonAdapter extends JsonAdapter<NetworkRemoteConfig> {
    private volatile Constructor<NetworkRemoteConfig> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Map<String, Integer>> nullableMapOfStringIntAdapter;
    private final JsonReader.b options;

    public NetworkRemoteConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("defaultCaptureLimit", "domains");
        zq3.g(a, "JsonReader.Options.of(\"d…CaptureLimit\", \"domains\")");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "defaultCaptureLimit");
        zq3.g(f, "moshi.adapter(Int::class…), \"defaultCaptureLimit\")");
        this.nullableIntAdapter = f;
        JsonAdapter<Map<String, Integer>> f2 = iVar.f(j.j(Map.class, String.class, Integer.class), b0.e(), "domainLimits");
        zq3.g(f2, "moshi.adapter(Types.newP…ptySet(), \"domainLimits\")");
        this.nullableMapOfStringIntAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NetworkRemoteConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NetworkRemoteConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Map map = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    map = (Map) this.nullableMapOfStringIntAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967292L)) {
            return new NetworkRemoteConfig(num, map);
        }
        Constructor<NetworkRemoteConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NetworkRemoteConfig.class.getDeclaredConstructor(Integer.class, Map.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "NetworkRemoteConfig::cla…his.constructorRef = it }");
        }
        NetworkRemoteConfig newInstance = constructor.newInstance(num, map, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NetworkRemoteConfig networkRemoteConfig) {
        zq3.h(hVar, "writer");
        if (networkRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("defaultCaptureLimit");
        this.nullableIntAdapter.mo197toJson(hVar, networkRemoteConfig.getDefaultCaptureLimit());
        hVar.C("domains");
        this.nullableMapOfStringIntAdapter.mo197toJson(hVar, networkRemoteConfig.getDomainLimits());
        hVar.l();
    }
}
