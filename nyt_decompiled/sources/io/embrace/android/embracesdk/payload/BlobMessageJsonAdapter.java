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
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class BlobMessageJsonAdapter extends JsonAdapter<BlobMessage> {
    private volatile Constructor<BlobMessage> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<AppExitInfoData>> listOfAppExitInfoDataAdapter;
    private final JsonAdapter<AppInfo> nullableAppInfoAdapter;
    private final JsonAdapter<BlobSession> nullableBlobSessionAdapter;
    private final JsonAdapter<DeviceInfo> nullableDeviceInfoAdapter;
    private final JsonAdapter<UserInfo> nullableUserInfoAdapter;
    private final JsonReader.b options;

    public BlobMessageJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(Tag.A, "bae", QueryKeys.SUBDOMAIN, "s", QueryKeys.USER_ID, QueryKeys.INTERNAL_REFERRER);
        zq3.g(a, "JsonReader.Options.of(\"a…bae\", \"d\", \"s\", \"u\", \"v\")");
        this.options = a;
        JsonAdapter<AppInfo> f = iVar.f(AppInfo.class, b0.e(), "appInfo");
        zq3.g(f, "moshi.adapter(AppInfo::c…   emptySet(), \"appInfo\")");
        this.nullableAppInfoAdapter = f;
        JsonAdapter<List<AppExitInfoData>> f2 = iVar.f(j.j(List.class, AppExitInfoData.class), b0.e(), "applicationExits");
        zq3.g(f2, "moshi.adapter(Types.newP…et(), \"applicationExits\")");
        this.listOfAppExitInfoDataAdapter = f2;
        JsonAdapter<DeviceInfo> f3 = iVar.f(DeviceInfo.class, b0.e(), "deviceInfo");
        zq3.g(f3, "moshi.adapter(DeviceInfo…emptySet(), \"deviceInfo\")");
        this.nullableDeviceInfoAdapter = f3;
        JsonAdapter<BlobSession> f4 = iVar.f(BlobSession.class, b0.e(), "session");
        zq3.g(f4, "moshi.adapter(BlobSessio…a, emptySet(), \"session\")");
        this.nullableBlobSessionAdapter = f4;
        JsonAdapter<UserInfo> f5 = iVar.f(UserInfo.class, b0.e(), "userInfo");
        zq3.g(f5, "moshi.adapter(UserInfo::…  emptySet(), \"userInfo\")");
        this.nullableUserInfoAdapter = f5;
        JsonAdapter<Integer> f6 = iVar.f(Integer.TYPE, b0.e(), "version");
        zq3.g(f6, "moshi.adapter(Int::class…a, emptySet(), \"version\")");
        this.intAdapter = f6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BlobMessage");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public BlobMessage fromJson(JsonReader jsonReader) {
        int i;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        int i2 = -1;
        Integer num = 0;
        AppInfo appInfo = null;
        List list = null;
        DeviceInfo deviceInfo = null;
        BlobSession blobSession = null;
        UserInfo userInfo = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    i = ((int) 4294967294L) & i2;
                    appInfo = (AppInfo) this.nullableAppInfoAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    List list2 = (List) this.listOfAppExitInfoDataAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        JsonDataException x = c29.x("applicationExits", "bae", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"app…ionExits\", \"bae\", reader)");
                        throw x;
                    }
                    i = ((int) 4294967293L) & i2;
                    list = list2;
                    break;
                case 2:
                    i = ((int) 4294967291L) & i2;
                    deviceInfo = (DeviceInfo) this.nullableDeviceInfoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    i = ((int) 4294967287L) & i2;
                    blobSession = (BlobSession) this.nullableBlobSessionAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    i = ((int) 4294967279L) & i2;
                    userInfo = (UserInfo) this.nullableUserInfoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    Integer num2 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        JsonDataException x2 = c29.x("version", QueryKeys.INTERNAL_REFERRER, jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"version\", \"v\", reader)");
                        throw x2;
                    }
                    i = ((int) 4294967263L) & i2;
                    num = num2;
                    break;
            }
            i2 = i;
        }
        jsonReader.h();
        if (i2 == ((int) 4294967232L)) {
            if (list != null) {
                return new BlobMessage(appInfo, list, deviceInfo, blobSession, userInfo, num.intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<io.embrace.android.embracesdk.payload.AppExitInfoData>");
        }
        Constructor<BlobMessage> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = BlobMessage.class.getDeclaredConstructor(AppInfo.class, List.class, DeviceInfo.class, BlobSession.class, UserInfo.class, cls, cls, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "BlobMessage::class.java.…his.constructorRef = it }");
        }
        BlobMessage newInstance = constructor.newInstance(appInfo, list, deviceInfo, blobSession, userInfo, num, Integer.valueOf(i2), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, BlobMessage blobMessage) {
        zq3.h(hVar, "writer");
        if (blobMessage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(Tag.A);
        this.nullableAppInfoAdapter.mo197toJson(hVar, blobMessage.getAppInfo());
        hVar.C("bae");
        this.listOfAppExitInfoDataAdapter.mo197toJson(hVar, blobMessage.getApplicationExits());
        hVar.C(QueryKeys.SUBDOMAIN);
        this.nullableDeviceInfoAdapter.mo197toJson(hVar, blobMessage.getDeviceInfo());
        hVar.C("s");
        this.nullableBlobSessionAdapter.mo197toJson(hVar, blobMessage.getSession());
        hVar.C(QueryKeys.USER_ID);
        this.nullableUserInfoAdapter.mo197toJson(hVar, blobMessage.getUserInfo());
        hVar.C(QueryKeys.INTERNAL_REFERRER);
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(blobMessage.getVersion()));
        hVar.l();
    }
}
