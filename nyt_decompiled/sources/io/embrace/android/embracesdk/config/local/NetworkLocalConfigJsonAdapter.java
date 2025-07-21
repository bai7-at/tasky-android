package io.embrace.android.embracesdk.config.local;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NetworkLocalConfigJsonAdapter extends JsonAdapter<NetworkLocalConfig> {
    private volatile Constructor<NetworkLocalConfig> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<DomainLocalConfig>> nullableListOfDomainLocalConfigAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public NetworkLocalConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("trace_id_header", "default_capture_limit", "domains", "capture_request_content_length", "disabled_url_patterns", "enable_native_monitoring");
        zq3.g(a, "JsonReader.Options.of(\"t…nable_native_monitoring\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "traceIdHeader");
        zq3.g(f, "moshi.adapter(String::cl…tySet(), \"traceIdHeader\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.class, b0.e(), "defaultCaptureLimit");
        zq3.g(f2, "moshi.adapter(Int::class…), \"defaultCaptureLimit\")");
        this.nullableIntAdapter = f2;
        JsonAdapter<List<DomainLocalConfig>> f3 = iVar.f(j.j(List.class, DomainLocalConfig.class), b0.e(), "domains");
        zq3.g(f3, "moshi.adapter(Types.newP…   emptySet(), \"domains\")");
        this.nullableListOfDomainLocalConfigAdapter = f3;
        JsonAdapter<Boolean> f4 = iVar.f(Boolean.class, b0.e(), "captureRequestContentLength");
        zq3.g(f4, "moshi.adapter(Boolean::c…ureRequestContentLength\")");
        this.nullableBooleanAdapter = f4;
        JsonAdapter<List<String>> f5 = iVar.f(j.j(List.class, String.class), b0.e(), "disabledUrlPatterns");
        zq3.g(f5, "moshi.adapter(Types.newP…   \"disabledUrlPatterns\")");
        this.nullableListOfStringAdapter = f5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NetworkLocalConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NetworkLocalConfig fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        Integer num = null;
        List list = null;
        Boolean bool = null;
        List list2 = null;
        Boolean bool2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= (int) 4294967294L;
                    break;
                case 1:
                    i &= (int) 4294967293L;
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    i &= (int) 4294967291L;
                    list = (List) this.nullableListOfDomainLocalConfigAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    i &= (int) 4294967287L;
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    i &= (int) 4294967279L;
                    list2 = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    i &= (int) 4294967263L;
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967232L)) {
            return new NetworkLocalConfig(str, num, list, bool, list2, bool2);
        }
        Constructor<NetworkLocalConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NetworkLocalConfig.class.getDeclaredConstructor(String.class, Integer.class, List.class, Boolean.class, List.class, Boolean.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "NetworkLocalConfig::clas…his.constructorRef = it }");
        }
        NetworkLocalConfig newInstance = constructor.newInstance(str, num, list, bool, list2, bool2, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NetworkLocalConfig networkLocalConfig) {
        zq3.h(hVar, "writer");
        if (networkLocalConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("trace_id_header");
        this.nullableStringAdapter.mo197toJson(hVar, networkLocalConfig.getTraceIdHeader());
        hVar.C("default_capture_limit");
        this.nullableIntAdapter.mo197toJson(hVar, networkLocalConfig.getDefaultCaptureLimit());
        hVar.C("domains");
        this.nullableListOfDomainLocalConfigAdapter.mo197toJson(hVar, networkLocalConfig.getDomains());
        hVar.C("capture_request_content_length");
        this.nullableBooleanAdapter.mo197toJson(hVar, networkLocalConfig.getCaptureRequestContentLength());
        hVar.C("disabled_url_patterns");
        this.nullableListOfStringAdapter.mo197toJson(hVar, networkLocalConfig.getDisabledUrlPatterns());
        hVar.C("enable_native_monitoring");
        this.nullableBooleanAdapter.mo197toJson(hVar, networkLocalConfig.getEnableNativeMonitoring());
        hVar.l();
    }
}
