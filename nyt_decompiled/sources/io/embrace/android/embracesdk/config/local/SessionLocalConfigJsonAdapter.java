package io.embrace.android.embracesdk.config.local;

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
public final class SessionLocalConfigJsonAdapter extends JsonAdapter<SessionLocalConfig> {
    private volatile Constructor<SessionLocalConfig> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Set<String>> nullableSetOfStringAdapter;
    private final JsonReader.b options;

    public SessionLocalConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("components", "send_full_for", "error_log_strict_mode");
        zq3.g(a, "JsonReader.Options.of(\"c… \"error_log_strict_mode\")");
        this.options = a;
        JsonAdapter<Set<String>> f = iVar.f(j.j(Set.class, String.class), b0.e(), "sessionComponents");
        zq3.g(f, "moshi.adapter(Types.newP…     \"sessionComponents\")");
        this.nullableSetOfStringAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.class, b0.e(), "sessionEnableErrorLogStrictMode");
        zq3.g(f2, "moshi.adapter(Boolean::c…nableErrorLogStrictMode\")");
        this.nullableBooleanAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SessionLocalConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public SessionLocalConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Set set = null;
        Set set2 = null;
        Boolean bool = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    set = (Set) this.nullableSetOfStringAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    set2 = (Set) this.nullableSetOfStringAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                } else if (P == 2) {
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
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
            return new SessionLocalConfig(set, set2, bool);
        }
        Constructor<SessionLocalConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SessionLocalConfig.class.getDeclaredConstructor(Set.class, Set.class, Boolean.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "SessionLocalConfig::clas…his.constructorRef = it }");
        }
        SessionLocalConfig newInstance = constructor.newInstance(set, set2, bool, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, SessionLocalConfig sessionLocalConfig) {
        zq3.h(hVar, "writer");
        if (sessionLocalConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("components");
        this.nullableSetOfStringAdapter.mo197toJson(hVar, sessionLocalConfig.getSessionComponents());
        hVar.C("send_full_for");
        this.nullableSetOfStringAdapter.mo197toJson(hVar, sessionLocalConfig.getFullSessionEvents());
        hVar.C("error_log_strict_mode");
        this.nullableBooleanAdapter.mo197toJson(hVar, sessionLocalConfig.getSessionEnableErrorLogStrictMode());
        hVar.l();
    }
}
