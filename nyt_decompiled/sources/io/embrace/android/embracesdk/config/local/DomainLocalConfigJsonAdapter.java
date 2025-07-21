package io.embrace.android.embracesdk.config.local;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class DomainLocalConfigJsonAdapter extends JsonAdapter<DomainLocalConfig> {
    private volatile Constructor<DomainLocalConfig> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public DomainLocalConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("domain_name", "domain_limit");
        zq3.g(a, "JsonReader.Options.of(\"d…in_name\", \"domain_limit\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "domain");
        zq3.g(f, "moshi.adapter(String::cl…    emptySet(), \"domain\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.class, b0.e(), "limit");
        zq3.g(f2, "moshi.adapter(Int::class…     emptySet(), \"limit\")");
        this.nullableIntAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DomainLocalConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DomainLocalConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Integer num = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
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
            return new DomainLocalConfig(str, num);
        }
        Constructor<DomainLocalConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DomainLocalConfig.class.getDeclaredConstructor(String.class, Integer.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "DomainLocalConfig::class…his.constructorRef = it }");
        }
        DomainLocalConfig newInstance = constructor.newInstance(str, num, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, DomainLocalConfig domainLocalConfig) {
        zq3.h(hVar, "writer");
        if (domainLocalConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("domain_name");
        this.nullableStringAdapter.mo197toJson(hVar, domainLocalConfig.getDomain());
        hVar.C("domain_limit");
        this.nullableIntAdapter.mo197toJson(hVar, domainLocalConfig.getLimit());
        hVar.l();
    }
}
