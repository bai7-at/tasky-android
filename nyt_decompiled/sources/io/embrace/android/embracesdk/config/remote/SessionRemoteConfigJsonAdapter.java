package io.embrace.android.embracesdk.config.remote;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class SessionRemoteConfigJsonAdapter extends JsonAdapter<SessionRemoteConfig> {
    private volatile Constructor<SessionRemoteConfig> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Set<String>> nullableSetOfStringAdapter;
    private final JsonReader.b options;

    public SessionRemoteConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("enable", "components", "send_full_for");
        zq3.g(a, "JsonReader.Options.of(\"e…\",\n      \"send_full_for\")");
        this.options = a;
        JsonAdapter<Boolean> f = iVar.f(Boolean.class, b0.e(), "isEnabled");
        zq3.g(f, "moshi.adapter(Boolean::c… emptySet(), \"isEnabled\")");
        this.nullableBooleanAdapter = f;
        JsonAdapter<Set<String>> f2 = iVar.f(j.j(Set.class, String.class), b0.e(), "sessionComponents");
        zq3.g(f2, "moshi.adapter(Types.newP…     \"sessionComponents\")");
        this.nullableSetOfStringAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SessionRemoteConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public SessionRemoteConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Boolean bool = null;
        Set set = null;
        Set set2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    set = (Set) this.nullableSetOfStringAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                } else if (P == 2) {
                    set2 = (Set) this.nullableSetOfStringAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967288L)) {
            return new SessionRemoteConfig(bool, set, set2);
        }
        Constructor<SessionRemoteConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SessionRemoteConfig.class.getDeclaredConstructor(Boolean.class, Set.class, Set.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "SessionRemoteConfig::cla…his.constructorRef = it }");
        }
        SessionRemoteConfig newInstance = constructor.newInstance(bool, set, set2, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, SessionRemoteConfig sessionRemoteConfig) {
        zq3.h(hVar, "writer");
        if (sessionRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("enable");
        this.nullableBooleanAdapter.mo197toJson(hVar, sessionRemoteConfig.isEnabled());
        hVar.C("components");
        this.nullableSetOfStringAdapter.mo197toJson(hVar, sessionRemoteConfig.getSessionComponents());
        hVar.C("send_full_for");
        this.nullableSetOfStringAdapter.mo197toJson(hVar, sessionRemoteConfig.getFullSessionEvents());
        hVar.l();
    }
}
