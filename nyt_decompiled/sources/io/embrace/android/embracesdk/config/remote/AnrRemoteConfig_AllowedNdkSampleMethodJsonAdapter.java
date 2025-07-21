package io.embrace.android.embracesdk.config.remote;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.remote.AnrRemoteConfig;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class AnrRemoteConfig_AllowedNdkSampleMethodJsonAdapter extends JsonAdapter<AnrRemoteConfig.AllowedNdkSampleMethod> {
    private volatile Constructor<AnrRemoteConfig.AllowedNdkSampleMethod> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public AnrRemoteConfig_AllowedNdkSampleMethodJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.MAX_SCROLL_DEPTH);
        zq3.g(a, "JsonReader.Options.of(\"c\", \"m\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "clz");
        zq3.g(f, "moshi.adapter(String::cl…\n      emptySet(), \"clz\")");
        this.nullableStringAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AnrRemoteConfig.AllowedNdkSampleMethod");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AnrRemoteConfig.AllowedNdkSampleMethod fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
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
            return new AnrRemoteConfig.AllowedNdkSampleMethod(str, str2);
        }
        Constructor<AnrRemoteConfig.AllowedNdkSampleMethod> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AnrRemoteConfig.AllowedNdkSampleMethod.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "AnrRemoteConfig.AllowedN…his.constructorRef = it }");
        }
        AnrRemoteConfig.AllowedNdkSampleMethod newInstance = constructor.newInstance(str, str2, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AnrRemoteConfig.AllowedNdkSampleMethod allowedNdkSampleMethod) {
        zq3.h(hVar, "writer");
        if (allowedNdkSampleMethod == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        this.nullableStringAdapter.mo197toJson(hVar, allowedNdkSampleMethod.getClz());
        hVar.C(QueryKeys.MAX_SCROLL_DEPTH);
        this.nullableStringAdapter.mo197toJson(hVar, allowedNdkSampleMethod.getMethod());
        hVar.l();
    }
}
