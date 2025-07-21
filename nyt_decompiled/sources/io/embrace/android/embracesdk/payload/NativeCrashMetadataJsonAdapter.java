package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NativeCrashMetadataJsonAdapter extends JsonAdapter<NativeCrashMetadata> {
    private final JsonAdapter<AppInfo> appInfoAdapter;
    private final JsonAdapter<DeviceInfo> deviceInfoAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<UserInfo> userInfoAdapter;

    public NativeCrashMetadataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(Tag.A, QueryKeys.SUBDOMAIN, QueryKeys.USER_ID, "sp");
        zq3.g(a, "JsonReader.Options.of(\"a\", \"d\", \"u\", \"sp\")");
        this.options = a;
        JsonAdapter<AppInfo> f = iVar.f(AppInfo.class, b0.e(), "appInfo");
        zq3.g(f, "moshi.adapter(AppInfo::c…tySet(),\n      \"appInfo\")");
        this.appInfoAdapter = f;
        JsonAdapter<DeviceInfo> f2 = iVar.f(DeviceInfo.class, b0.e(), "deviceInfo");
        zq3.g(f2, "moshi.adapter(DeviceInfo…emptySet(), \"deviceInfo\")");
        this.deviceInfoAdapter = f2;
        JsonAdapter<UserInfo> f3 = iVar.f(UserInfo.class, b0.e(), "userInfo");
        zq3.g(f3, "moshi.adapter(UserInfo::…  emptySet(), \"userInfo\")");
        this.userInfoAdapter = f3;
        JsonAdapter<Map<String, String>> f4 = iVar.f(j.j(Map.class, String.class, String.class), b0.e(), "sessionProperties");
        zq3.g(f4, "moshi.adapter(Types.newP…t(), \"sessionProperties\")");
        this.nullableMapOfStringStringAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NativeCrashMetadata");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NativeCrashMetadata fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        AppInfo appInfo = null;
        DeviceInfo deviceInfo = null;
        UserInfo userInfo = null;
        Map map = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                appInfo = (AppInfo) this.appInfoAdapter.fromJson(jsonReader);
                if (appInfo == null) {
                    JsonDataException x = c29.x("appInfo", Tag.A, jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"app… \"a\",\n            reader)");
                    throw x;
                }
            } else if (P == 1) {
                deviceInfo = (DeviceInfo) this.deviceInfoAdapter.fromJson(jsonReader);
                if (deviceInfo == null) {
                    JsonDataException x2 = c29.x("deviceInfo", QueryKeys.SUBDOMAIN, jsonReader);
                    zq3.g(x2, "Util.unexpectedNull(\"deviceInfo\", \"d\", reader)");
                    throw x2;
                }
            } else if (P == 2) {
                userInfo = (UserInfo) this.userInfoAdapter.fromJson(jsonReader);
                if (userInfo == null) {
                    JsonDataException x3 = c29.x("userInfo", QueryKeys.USER_ID, jsonReader);
                    zq3.g(x3, "Util.unexpectedNull(\"use…\n            \"u\", reader)");
                    throw x3;
                }
            } else if (P == 3) {
                map = (Map) this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (appInfo == null) {
            JsonDataException o = c29.o("appInfo", Tag.A, jsonReader);
            zq3.g(o, "Util.missingProperty(\"appInfo\", \"a\", reader)");
            throw o;
        }
        if (deviceInfo == null) {
            JsonDataException o2 = c29.o("deviceInfo", QueryKeys.SUBDOMAIN, jsonReader);
            zq3.g(o2, "Util.missingProperty(\"deviceInfo\", \"d\", reader)");
            throw o2;
        }
        if (userInfo != null) {
            return new NativeCrashMetadata(appInfo, deviceInfo, userInfo, map);
        }
        JsonDataException o3 = c29.o("userInfo", QueryKeys.USER_ID, jsonReader);
        zq3.g(o3, "Util.missingProperty(\"userInfo\", \"u\", reader)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NativeCrashMetadata nativeCrashMetadata) {
        zq3.h(hVar, "writer");
        if (nativeCrashMetadata == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(Tag.A);
        this.appInfoAdapter.mo197toJson(hVar, nativeCrashMetadata.getAppInfo());
        hVar.C(QueryKeys.SUBDOMAIN);
        this.deviceInfoAdapter.mo197toJson(hVar, nativeCrashMetadata.getDeviceInfo());
        hVar.C(QueryKeys.USER_ID);
        this.userInfoAdapter.mo197toJson(hVar, nativeCrashMetadata.getUserInfo());
        hVar.C("sp");
        this.nullableMapOfStringStringAdapter.mo197toJson(hVar, nativeCrashMetadata.getSessionProperties());
        hVar.l();
    }
}
