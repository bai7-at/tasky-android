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
public final class BaseUrlLocalConfigJsonAdapter extends JsonAdapter<BaseUrlLocalConfig> {
    private volatile Constructor<BaseUrlLocalConfig> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public BaseUrlLocalConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("config", "data", "data_dev", "images");
        zq3.g(a, "JsonReader.Options.of(\"c…ata_dev\",\n      \"images\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "config");
        zq3.g(f, "moshi.adapter(String::cl…    emptySet(), \"config\")");
        this.nullableStringAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BaseUrlLocalConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public BaseUrlLocalConfig fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
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
                } else if (P == 2) {
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                } else if (P == 3) {
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
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
            return new BaseUrlLocalConfig(str, str2, str3, str4);
        }
        Constructor<BaseUrlLocalConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BaseUrlLocalConfig.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "BaseUrlLocalConfig::clas…his.constructorRef = it }");
        }
        BaseUrlLocalConfig newInstance = constructor.newInstance(str, str2, str3, str4, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, BaseUrlLocalConfig baseUrlLocalConfig) {
        zq3.h(hVar, "writer");
        if (baseUrlLocalConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("config");
        this.nullableStringAdapter.mo197toJson(hVar, baseUrlLocalConfig.getConfig());
        hVar.C("data");
        this.nullableStringAdapter.mo197toJson(hVar, baseUrlLocalConfig.getData());
        hVar.C("data_dev");
        this.nullableStringAdapter.mo197toJson(hVar, baseUrlLocalConfig.getDataDev());
        hVar.C("images");
        this.nullableStringAdapter.mo197toJson(hVar, baseUrlLocalConfig.getImages());
        hVar.l();
    }
}
