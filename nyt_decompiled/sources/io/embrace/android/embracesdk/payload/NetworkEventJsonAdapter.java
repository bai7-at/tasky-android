package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NetworkEventJsonAdapter extends JsonAdapter<NetworkEvent> {
    private final JsonAdapter<AppInfo> appInfoAdapter;
    private volatile Constructor<NetworkEvent> constructorRef;
    private final JsonAdapter<NetworkCapturedCall> networkCapturedCallAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public NetworkEventJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("app_id", Tag.A, "device_id", "id", QueryKeys.IS_NEW_USER, "ts", "ip", "si");
        zq3.g(a, "JsonReader.Options.of(\"a…   \"n\", \"ts\", \"ip\", \"si\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "appId");
        zq3.g(f, "moshi.adapter(String::cl…mptySet(),\n      \"appId\")");
        this.stringAdapter = f;
        JsonAdapter<AppInfo> f2 = iVar.f(AppInfo.class, b0.e(), "appInfo");
        zq3.g(f2, "moshi.adapter(AppInfo::c…tySet(),\n      \"appInfo\")");
        this.appInfoAdapter = f2;
        JsonAdapter<NetworkCapturedCall> f3 = iVar.f(NetworkCapturedCall.class, b0.e(), "networkCaptureCall");
        zq3.g(f3, "moshi.adapter(NetworkCap…(), \"networkCaptureCall\")");
        this.networkCapturedCallAdapter = f3;
        JsonAdapter<String> f4 = iVar.f(String.class, b0.e(), "ipAddress");
        zq3.g(f4, "moshi.adapter(String::cl… emptySet(), \"ipAddress\")");
        this.nullableStringAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NetworkEvent");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NetworkEvent fromJson(JsonReader jsonReader) {
        String str;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str2 = null;
        int i = -1;
        AppInfo appInfo = null;
        String str3 = null;
        String str4 = null;
        NetworkCapturedCall networkCapturedCall = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (true) {
            String str8 = str7;
            String str9 = str6;
            String str10 = str5;
            NetworkCapturedCall networkCapturedCall2 = networkCapturedCall;
            String str11 = str4;
            String str12 = str3;
            AppInfo appInfo2 = appInfo;
            String str13 = str2;
            if (!jsonReader.hasNext()) {
                jsonReader.h();
                if (i == ((int) 4294967167L)) {
                    if (str13 == null) {
                        JsonDataException o = c29.o("appId", "app_id", jsonReader);
                        zq3.g(o, "Util.missingProperty(\"appId\", \"app_id\", reader)");
                        throw o;
                    }
                    if (appInfo2 == null) {
                        JsonDataException o2 = c29.o("appInfo", Tag.A, jsonReader);
                        zq3.g(o2, "Util.missingProperty(\"appInfo\", \"a\", reader)");
                        throw o2;
                    }
                    if (str12 == null) {
                        JsonDataException o3 = c29.o("deviceId", "device_id", jsonReader);
                        zq3.g(o3, "Util.missingProperty(\"de…Id\", \"device_id\", reader)");
                        throw o3;
                    }
                    if (str11 == null) {
                        JsonDataException o4 = c29.o("eventId", "id", jsonReader);
                        zq3.g(o4, "Util.missingProperty(\"eventId\", \"id\", reader)");
                        throw o4;
                    }
                    if (networkCapturedCall2 == null) {
                        JsonDataException o5 = c29.o("networkCaptureCall", QueryKeys.IS_NEW_USER, jsonReader);
                        zq3.g(o5, "Util.missingProperty(\"ne…aptureCall\", \"n\", reader)");
                        throw o5;
                    }
                    if (str10 != null) {
                        return new NetworkEvent(str13, appInfo2, str12, str11, networkCapturedCall2, str10, str9, str8);
                    }
                    JsonDataException o6 = c29.o("timestamp", "ts", jsonReader);
                    zq3.g(o6, "Util.missingProperty(\"timestamp\", \"ts\", reader)");
                    throw o6;
                }
                Constructor<NetworkEvent> constructor = this.constructorRef;
                if (constructor == null) {
                    str = "Util.missingProperty(\"de…Id\", \"device_id\", reader)";
                    constructor = NetworkEvent.class.getDeclaredConstructor(String.class, AppInfo.class, String.class, String.class, NetworkCapturedCall.class, String.class, String.class, String.class, Integer.TYPE, c29.c);
                    this.constructorRef = constructor;
                    zq3.g(constructor, "NetworkEvent::class.java…his.constructorRef = it }");
                } else {
                    str = "Util.missingProperty(\"de…Id\", \"device_id\", reader)";
                }
                Constructor<NetworkEvent> constructor2 = constructor;
                if (str13 == null) {
                    JsonDataException o7 = c29.o("appId", "app_id", jsonReader);
                    zq3.g(o7, "Util.missingProperty(\"appId\", \"app_id\", reader)");
                    throw o7;
                }
                if (appInfo2 == null) {
                    JsonDataException o8 = c29.o("appInfo", Tag.A, jsonReader);
                    zq3.g(o8, "Util.missingProperty(\"appInfo\", \"a\", reader)");
                    throw o8;
                }
                if (str12 == null) {
                    JsonDataException o9 = c29.o("deviceId", "device_id", jsonReader);
                    zq3.g(o9, str);
                    throw o9;
                }
                if (str11 == null) {
                    JsonDataException o10 = c29.o("eventId", "id", jsonReader);
                    zq3.g(o10, "Util.missingProperty(\"eventId\", \"id\", reader)");
                    throw o10;
                }
                if (networkCapturedCall2 == null) {
                    JsonDataException o11 = c29.o("networkCaptureCall", QueryKeys.IS_NEW_USER, jsonReader);
                    zq3.g(o11, "Util.missingProperty(\"ne…aptureCall\", \"n\", reader)");
                    throw o11;
                }
                if (str10 != null) {
                    NetworkEvent newInstance = constructor2.newInstance(str13, appInfo2, str12, str11, networkCapturedCall2, str10, str9, str8, Integer.valueOf(i), null);
                    zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                JsonDataException o12 = c29.o("timestamp", "ts", jsonReader);
                zq3.g(o12, "Util.missingProperty(\"timestamp\", \"ts\", reader)");
                throw o12;
            }
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    str7 = str8;
                    str6 = str9;
                    str5 = str10;
                    networkCapturedCall = networkCapturedCall2;
                    str4 = str11;
                    str3 = str12;
                    appInfo = appInfo2;
                    str2 = str13;
                case 0:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x = c29.x("appId", "app_id", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"app…_id\",\n            reader)");
                        throw x;
                    }
                    str7 = str8;
                    str6 = str9;
                    str5 = str10;
                    networkCapturedCall = networkCapturedCall2;
                    str4 = str11;
                    str3 = str12;
                    appInfo = appInfo2;
                case 1:
                    AppInfo appInfo3 = (AppInfo) this.appInfoAdapter.fromJson(jsonReader);
                    if (appInfo3 == null) {
                        JsonDataException x2 = c29.x("appInfo", Tag.A, jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"app… \"a\",\n            reader)");
                        throw x2;
                    }
                    appInfo = appInfo3;
                    str7 = str8;
                    str6 = str9;
                    str5 = str10;
                    networkCapturedCall = networkCapturedCall2;
                    str4 = str11;
                    str3 = str12;
                    str2 = str13;
                case 2:
                    String str14 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str14 == null) {
                        JsonDataException x3 = c29.x("deviceId", "device_id", jsonReader);
                        zq3.g(x3, "Util.unexpectedNull(\"dev…     \"device_id\", reader)");
                        throw x3;
                    }
                    str3 = str14;
                    str7 = str8;
                    str6 = str9;
                    str5 = str10;
                    networkCapturedCall = networkCapturedCall2;
                    str4 = str11;
                    appInfo = appInfo2;
                    str2 = str13;
                case 3:
                    String str15 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str15 == null) {
                        JsonDataException x4 = c29.x("eventId", "id", jsonReader);
                        zq3.g(x4, "Util.unexpectedNull(\"eve…\"id\",\n            reader)");
                        throw x4;
                    }
                    str4 = str15;
                    str7 = str8;
                    str6 = str9;
                    str5 = str10;
                    networkCapturedCall = networkCapturedCall2;
                    str3 = str12;
                    appInfo = appInfo2;
                    str2 = str13;
                case 4:
                    NetworkCapturedCall networkCapturedCall3 = (NetworkCapturedCall) this.networkCapturedCallAdapter.fromJson(jsonReader);
                    if (networkCapturedCall3 == null) {
                        JsonDataException x5 = c29.x("networkCaptureCall", QueryKeys.IS_NEW_USER, jsonReader);
                        zq3.g(x5, "Util.unexpectedNull(\"net…aptureCall\", \"n\", reader)");
                        throw x5;
                    }
                    networkCapturedCall = networkCapturedCall3;
                    str7 = str8;
                    str6 = str9;
                    str5 = str10;
                    str4 = str11;
                    str3 = str12;
                    appInfo = appInfo2;
                    str2 = str13;
                case 5:
                    String str16 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str16 == null) {
                        JsonDataException x6 = c29.x("timestamp", "ts", jsonReader);
                        zq3.g(x6, "Util.unexpectedNull(\"tim…            \"ts\", reader)");
                        throw x6;
                    }
                    str5 = str16;
                    str7 = str8;
                    str6 = str9;
                    networkCapturedCall = networkCapturedCall2;
                    str4 = str11;
                    str3 = str12;
                    appInfo = appInfo2;
                    str2 = str13;
                case 6:
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    str7 = str8;
                    str5 = str10;
                    networkCapturedCall = networkCapturedCall2;
                    str4 = str11;
                    str3 = str12;
                    appInfo = appInfo2;
                    str2 = str13;
                case 7:
                    i &= (int) 4294967167L;
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    str6 = str9;
                    str5 = str10;
                    networkCapturedCall = networkCapturedCall2;
                    str4 = str11;
                    str3 = str12;
                    appInfo = appInfo2;
                    str2 = str13;
                default:
                    str7 = str8;
                    str6 = str9;
                    str5 = str10;
                    networkCapturedCall = networkCapturedCall2;
                    str4 = str11;
                    str3 = str12;
                    appInfo = appInfo2;
                    str2 = str13;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NetworkEvent networkEvent) {
        zq3.h(hVar, "writer");
        if (networkEvent == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("app_id");
        this.stringAdapter.mo197toJson(hVar, networkEvent.getAppId());
        hVar.C(Tag.A);
        this.appInfoAdapter.mo197toJson(hVar, networkEvent.getAppInfo());
        hVar.C("device_id");
        this.stringAdapter.mo197toJson(hVar, networkEvent.getDeviceId());
        hVar.C("id");
        this.stringAdapter.mo197toJson(hVar, networkEvent.getEventId());
        hVar.C(QueryKeys.IS_NEW_USER);
        this.networkCapturedCallAdapter.mo197toJson(hVar, networkEvent.getNetworkCaptureCall());
        hVar.C("ts");
        this.stringAdapter.mo197toJson(hVar, networkEvent.getTimestamp());
        hVar.C("ip");
        this.nullableStringAdapter.mo197toJson(hVar, networkEvent.getIpAddress());
        hVar.C("si");
        this.nullableStringAdapter.mo197toJson(hVar, networkEvent.getSessionId());
        hVar.l();
    }
}
