package io.embrace.android.embracesdk.config.remote;

import com.facebook.AccessToken;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
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
public final class NetworkCaptureRuleRemoteConfigJsonAdapter extends JsonAdapter<NetworkCaptureRuleRemoteConfig> {
    private volatile Constructor<NetworkCaptureRuleRemoteConfig> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<Set<Integer>> setOfIntAdapter;
    private final JsonAdapter<String> stringAdapter;

    public NetworkCaptureRuleRemoteConfigJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("id", "duration", "method", "url", AccessToken.EXPIRES_IN_KEY, "max_size", "max_count", "status_codes");
        zq3.g(a, "JsonReader.Options.of(\"i…x_count\", \"status_codes\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "id");
        zq3.g(f, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.stringAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.class, b0.e(), "duration");
        zq3.g(f2, "moshi.adapter(Long::clas…  emptySet(), \"duration\")");
        this.nullableLongAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.TYPE, b0.e(), "expiresIn");
        zq3.g(f3, "moshi.adapter(Long::clas…Set(),\n      \"expiresIn\")");
        this.longAdapter = f3;
        JsonAdapter<Integer> f4 = iVar.f(Integer.TYPE, b0.e(), "maxCount");
        zq3.g(f4, "moshi.adapter(Int::class…, emptySet(), \"maxCount\")");
        this.intAdapter = f4;
        JsonAdapter<Set<Integer>> f5 = iVar.f(j.j(Set.class, Integer.class), b0.e(), "statusCodes");
        zq3.g(f5, "moshi.adapter(Types.newP…mptySet(), \"statusCodes\")");
        this.setOfIntAdapter = f5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NetworkCaptureRuleRemoteConfig");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NetworkCaptureRuleRemoteConfig fromJson(JsonReader jsonReader) {
        String str;
        int i;
        zq3.h(jsonReader, "reader");
        Integer num = 0;
        jsonReader.b();
        int i2 = -1;
        Long l = 0L;
        Long l2 = null;
        String str2 = null;
        Long l3 = null;
        String str3 = null;
        String str4 = null;
        Set set = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    String str5 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        JsonDataException x = c29.x("id", "id", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"id\", \"id\", reader)");
                        throw x;
                    }
                    str2 = str5;
                    continue;
                case 1:
                    l3 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    continue;
                case 2:
                    String str6 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        JsonDataException x2 = c29.x("method", "method", jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"met…        \"method\", reader)");
                        throw x2;
                    }
                    str3 = str6;
                    continue;
                case 3:
                    String str7 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str7 == null) {
                        JsonDataException x3 = c29.x("urlRegex", "url", jsonReader);
                        zq3.g(x3, "Util.unexpectedNull(\"url…           \"url\", reader)");
                        throw x3;
                    }
                    str4 = str7;
                    continue;
                case 4:
                    Long l4 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l4 == null) {
                        JsonDataException x4 = c29.x("expiresIn", AccessToken.EXPIRES_IN_KEY, jsonReader);
                        zq3.g(x4, "Util.unexpectedNull(\"exp…    \"expires_in\", reader)");
                        throw x4;
                    }
                    i = ((int) 4294967279L) & i2;
                    l = l4;
                    break;
                case 5:
                    Long l5 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l5 == null) {
                        JsonDataException x5 = c29.x("maxSize", "max_size", jsonReader);
                        zq3.g(x5, "Util.unexpectedNull(\"max…e\",\n              reader)");
                        throw x5;
                    }
                    i = ((int) 4294967263L) & i2;
                    l2 = l5;
                    break;
                case 6:
                    Integer num2 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        JsonDataException x6 = c29.x("maxCount", "max_count", jsonReader);
                        zq3.g(x6, "Util.unexpectedNull(\"max…     \"max_count\", reader)");
                        throw x6;
                    }
                    i2 = ((int) 4294967231L) & i2;
                    num = num2;
                    continue;
                case 7:
                    Set set2 = (Set) this.setOfIntAdapter.fromJson(jsonReader);
                    if (set2 == null) {
                        JsonDataException x7 = c29.x("statusCodes", "status_codes", jsonReader);
                        zq3.g(x7, "Util.unexpectedNull(\"sta…  \"status_codes\", reader)");
                        throw x7;
                    }
                    i = ((int) 4294967167L) & i2;
                    set = set2;
                    break;
            }
            i2 = i;
        }
        jsonReader.h();
        if (i2 == ((int) 4294967055L)) {
            if (str2 == null) {
                JsonDataException o = c29.o("id", "id", jsonReader);
                zq3.g(o, "Util.missingProperty(\"id\", \"id\", reader)");
                throw o;
            }
            if (str3 == null) {
                JsonDataException o2 = c29.o("method", "method", jsonReader);
                zq3.g(o2, "Util.missingProperty(\"method\", \"method\", reader)");
                throw o2;
            }
            if (str4 == null) {
                JsonDataException o3 = c29.o("urlRegex", "url", jsonReader);
                zq3.g(o3, "Util.missingProperty(\"urlRegex\", \"url\", reader)");
                throw o3;
            }
            long longValue = l.longValue();
            long longValue2 = l2.longValue();
            int intValue = num.intValue();
            if (set != null) {
                return new NetworkCaptureRuleRemoteConfig(str2, l3, str3, str4, longValue, longValue2, intValue, set);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.Int>");
        }
        Constructor<NetworkCaptureRuleRemoteConfig> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            str = "Util.missingProperty(\"method\", \"method\", reader)";
            constructor = NetworkCaptureRuleRemoteConfig.class.getDeclaredConstructor(String.class, Long.class, String.class, String.class, cls, cls, cls2, Set.class, cls2, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "NetworkCaptureRuleRemote…his.constructorRef = it }");
        } else {
            str = "Util.missingProperty(\"method\", \"method\", reader)";
        }
        if (str2 == null) {
            JsonDataException o4 = c29.o("id", "id", jsonReader);
            zq3.g(o4, "Util.missingProperty(\"id\", \"id\", reader)");
            throw o4;
        }
        if (str3 == null) {
            JsonDataException o5 = c29.o("method", "method", jsonReader);
            zq3.g(o5, str);
            throw o5;
        }
        if (str4 == null) {
            JsonDataException o6 = c29.o("urlRegex", "url", jsonReader);
            zq3.g(o6, "Util.missingProperty(\"urlRegex\", \"url\", reader)");
            throw o6;
        }
        NetworkCaptureRuleRemoteConfig newInstance = constructor.newInstance(str2, l3, str3, str4, l, l2, num, set, Integer.valueOf(i2), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NetworkCaptureRuleRemoteConfig networkCaptureRuleRemoteConfig) {
        zq3.h(hVar, "writer");
        if (networkCaptureRuleRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("id");
        this.stringAdapter.mo197toJson(hVar, networkCaptureRuleRemoteConfig.getId());
        hVar.C("duration");
        this.nullableLongAdapter.mo197toJson(hVar, networkCaptureRuleRemoteConfig.getDuration());
        hVar.C("method");
        this.stringAdapter.mo197toJson(hVar, networkCaptureRuleRemoteConfig.getMethod());
        hVar.C("url");
        this.stringAdapter.mo197toJson(hVar, networkCaptureRuleRemoteConfig.getUrlRegex());
        hVar.C(AccessToken.EXPIRES_IN_KEY);
        this.longAdapter.mo197toJson(hVar, Long.valueOf(networkCaptureRuleRemoteConfig.getExpiresIn()));
        hVar.C("max_size");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(networkCaptureRuleRemoteConfig.getMaxSize()));
        hVar.C("max_count");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(networkCaptureRuleRemoteConfig.getMaxCount()));
        hVar.C("status_codes");
        this.setOfIntAdapter.mo197toJson(hVar, networkCaptureRuleRemoteConfig.getStatusCodes());
        hVar.l();
    }
}
