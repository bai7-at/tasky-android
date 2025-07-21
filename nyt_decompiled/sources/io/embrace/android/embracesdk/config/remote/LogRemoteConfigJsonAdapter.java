package io.embrace.android.embracesdk.config.remote;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class LogRemoteConfigJsonAdapter extends JsonAdapter<LogRemoteConfig> {
    private volatile Constructor<LogRemoteConfig> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.b options;

    public LogRemoteConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("max_length", "info_limit", "warn_limit", "error_limit");
        zq3.g(a, "JsonReader.Options.of(\"m…rn_limit\", \"error_limit\")");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "logMessageMaximumAllowedLength");
        zq3.g(f, "moshi.adapter(Int::class…ageMaximumAllowedLength\")");
        this.nullableIntAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LogRemoteConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public LogRemoteConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                } else if (P == 2) {
                    num3 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                } else if (P == 3) {
                    num4 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967287L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967280L)) {
            return new LogRemoteConfig(num, num2, num3, num4);
        }
        Constructor<LogRemoteConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LogRemoteConfig.class.getDeclaredConstructor(Integer.class, Integer.class, Integer.class, Integer.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "LogRemoteConfig::class.j…his.constructorRef = it }");
        }
        LogRemoteConfig newInstance = constructor.newInstance(num, num2, num3, num4, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LogRemoteConfig logRemoteConfig) {
        zq3.h(hVar, "writer");
        if (logRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("max_length");
        this.nullableIntAdapter.mo197toJson(hVar, logRemoteConfig.getLogMessageMaximumAllowedLength());
        hVar.C("info_limit");
        this.nullableIntAdapter.mo197toJson(hVar, logRemoteConfig.getLogInfoLimit());
        hVar.C("warn_limit");
        this.nullableIntAdapter.mo197toJson(hVar, logRemoteConfig.getLogWarnLimit());
        hVar.C("error_limit");
        this.nullableIntAdapter.mo197toJson(hVar, logRemoteConfig.getLogErrorLimit());
        hVar.l();
    }
}
