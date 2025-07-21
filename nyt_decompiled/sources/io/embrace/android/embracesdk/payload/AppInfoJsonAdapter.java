package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class AppInfoJsonAdapter extends JsonAdapter<AppInfo> {
    private volatile Constructor<AppInfo> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public AppInfoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.INTERNAL_REFERRER, QueryKeys.VISIT_FREQUENCY, "bi", "bt", "fl", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "vu", "vul", "bv", "ou", "oul", "sdk", "sdc", "rn", "jsp", "rnv", "unv", "ubg", "usv");
        zq3.g(a, "JsonReader.Options.of(\"v…nv\", \"unv\", \"ubg\", \"usv\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "appVersion");
        zq3.g(f, "moshi.adapter(String::cl…emptySet(), \"appVersion\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.class, b0.e(), "appFramework");
        zq3.g(f2, "moshi.adapter(Int::class…ptySet(), \"appFramework\")");
        this.nullableIntAdapter = f2;
        JsonAdapter<Boolean> f3 = iVar.f(Boolean.class, b0.e(), "appUpdated");
        zq3.g(f3, "moshi.adapter(Boolean::c…emptySet(), \"appUpdated\")");
        this.nullableBooleanAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(29);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AppInfo");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AppInfo fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str6 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                    break;
                case 1:
                    i &= (int) 4294967293L;
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967287L;
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967279L;
                    break;
                case 5:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967263L;
                    break;
                case 6:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294967231L;
                    break;
                case 7:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294967167L;
                    break;
                case 8:
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967039L;
                    break;
                case 9:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294966783L;
                    break;
                case 10:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294966271L;
                    break;
                case 11:
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294965247L;
                    break;
                case 12:
                    str8 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294963199L;
                    break;
                case 13:
                    str9 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294959103L;
                    break;
                case 14:
                    str10 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294950911L;
                    break;
                case 15:
                    str11 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294934527L;
                    break;
                case 16:
                    str12 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294901759L;
                    break;
                case 17:
                    str13 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294836223L;
                    break;
                case 18:
                    i &= (int) 4294705151L;
                    str14 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
            }
            i &= (int) j;
        }
        jsonReader.h();
        if (i == ((int) 4294443008L)) {
            return new AppInfo(str, num, str2, str3, str4, str5, bool, bool2, str6, bool3, bool4, str7, str8, str9, str10, str11, str12, str13, str14);
        }
        Constructor<AppInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AppInfo.class.getDeclaredConstructor(String.class, Integer.class, String.class, String.class, String.class, String.class, Boolean.class, Boolean.class, String.class, Boolean.class, Boolean.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "AppInfo::class.java.getD…his.constructorRef = it }");
        }
        AppInfo newInstance = constructor.newInstance(str, num, str2, str3, str4, str5, bool, bool2, str6, bool3, bool4, str7, str8, str9, str10, str11, str12, str13, str14, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AppInfo appInfo) {
        zq3.h(hVar, "writer");
        if (appInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.INTERNAL_REFERRER);
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getAppVersion());
        hVar.C(QueryKeys.VISIT_FREQUENCY);
        this.nullableIntAdapter.mo197toJson(hVar, appInfo.getAppFramework());
        hVar.C("bi");
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getBuildId());
        hVar.C("bt");
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getBuildType());
        hVar.C("fl");
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getBuildFlavor());
        hVar.C(QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING);
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getEnvironment());
        hVar.C("vu");
        this.nullableBooleanAdapter.mo197toJson(hVar, appInfo.getAppUpdated());
        hVar.C("vul");
        this.nullableBooleanAdapter.mo197toJson(hVar, appInfo.getAppUpdatedThisLaunch());
        hVar.C("bv");
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getBundleVersion());
        hVar.C("ou");
        this.nullableBooleanAdapter.mo197toJson(hVar, appInfo.getOsUpdated());
        hVar.C("oul");
        this.nullableBooleanAdapter.mo197toJson(hVar, appInfo.getOsUpdatedThisLaunch());
        hVar.C("sdk");
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getSdkVersion());
        hVar.C("sdc");
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getSdkSimpleVersion());
        hVar.C("rn");
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getReactNativeBundleId());
        hVar.C("jsp");
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getJavaScriptPatchNumber());
        hVar.C("rnv");
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getReactNativeVersion());
        hVar.C("unv");
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getHostedPlatformVersion());
        hVar.C("ubg");
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getBuildGuid());
        hVar.C("usv");
        this.nullableStringAdapter.mo197toJson(hVar, appInfo.getHostedSdkVersion());
        hVar.l();
    }
}
