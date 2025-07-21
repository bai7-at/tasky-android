package io.embrace.android.embracesdk.config.local;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class LocalConfigJsonAdapter extends JsonAdapter<LocalConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<SdkLocalConfig> sdkLocalConfigAdapter;
    private final JsonAdapter<String> stringAdapter;

    public LocalConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("appId", "ndk_enabled", "sdkConfig");
        zq3.g(a, "JsonReader.Options.of(\"a…bled\",\n      \"sdkConfig\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "appId");
        zq3.g(f, "moshi.adapter(String::cl…mptySet(),\n      \"appId\")");
        this.stringAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "ndkEnabled");
        zq3.g(f2, "moshi.adapter(Boolean::c…et(),\n      \"ndkEnabled\")");
        this.booleanAdapter = f2;
        JsonAdapter<SdkLocalConfig> f3 = iVar.f(SdkLocalConfig.class, b0.e(), "sdkConfig");
        zq3.g(f3, "moshi.adapter(SdkLocalCo… emptySet(), \"sdkConfig\")");
        this.sdkLocalConfigAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LocalConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public LocalConfig fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Boolean bool = null;
        SdkLocalConfig sdkLocalConfig = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("appId", "appId", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"app…pId\",\n            reader)");
                    throw x;
                }
            } else if (P == 1) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    JsonDataException x2 = c29.x("ndkEnabled", "ndk_enabled", jsonReader);
                    zq3.g(x2, "Util.unexpectedNull(\"ndk…   \"ndk_enabled\", reader)");
                    throw x2;
                }
            } else if (P == 2 && (sdkLocalConfig = (SdkLocalConfig) this.sdkLocalConfigAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("sdkConfig", "sdkConfig", jsonReader);
                zq3.g(x3, "Util.unexpectedNull(\"sdk…ig\", \"sdkConfig\", reader)");
                throw x3;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("appId", "appId", jsonReader);
            zq3.g(o, "Util.missingProperty(\"appId\", \"appId\", reader)");
            throw o;
        }
        if (bool == null) {
            JsonDataException o2 = c29.o("ndkEnabled", "ndk_enabled", jsonReader);
            zq3.g(o2, "Util.missingProperty(\"nd…\", \"ndk_enabled\", reader)");
            throw o2;
        }
        boolean booleanValue = bool.booleanValue();
        if (sdkLocalConfig != null) {
            return new LocalConfig(str, booleanValue, sdkLocalConfig);
        }
        JsonDataException o3 = c29.o("sdkConfig", "sdkConfig", jsonReader);
        zq3.g(o3, "Util.missingProperty(\"sd…ig\", \"sdkConfig\", reader)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LocalConfig localConfig) {
        zq3.h(hVar, "writer");
        if (localConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("appId");
        this.stringAdapter.mo197toJson(hVar, localConfig.getAppId());
        hVar.C("ndk_enabled");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(localConfig.getNdkEnabled()));
        hVar.C("sdkConfig");
        this.sdkLocalConfigAdapter.mo197toJson(hVar, localConfig.getSdkConfig());
        hVar.l();
    }
}
