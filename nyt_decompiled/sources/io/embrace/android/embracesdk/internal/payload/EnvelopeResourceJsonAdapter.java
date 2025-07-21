package io.embrace.android.embracesdk.internal.payload;

import com.comscore.streaming.EventType;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.payload.EnvelopeResource;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class EnvelopeResourceJsonAdapter extends JsonAdapter<EnvelopeResource> {
    private volatile Constructor<EnvelopeResource> constructorRef;
    private final JsonAdapter<EnvelopeResource.AppFramework> nullableAppFrameworkAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public EnvelopeResourceJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("app_version", "app_framework", "build_id", "app_ecosystem_id", "build_type", "build_flavor", "environment", "bundle_version", "sdk_version", "sdk_simple_version", "react_native_bundle_id", "react_native_version", "javascript_patch_number", "hosted_platform_version", "hosted_sdk_version", "unity_build_id", "device_manufacturer", "device_model", "device_architecture", "jailbroken", "disk_total_capacity", "os_type", "os_name", "os_version", "os_code", "screen_resolution", "num_cores", "cpu_name", "egl_info");
        zq3.g(a, "JsonReader.Options.of(\"a…, \"cpu_name\", \"egl_info\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "appVersion");
        zq3.g(f, "moshi.adapter(String::cl…emptySet(), \"appVersion\")");
        this.nullableStringAdapter = f;
        JsonAdapter<EnvelopeResource.AppFramework> f2 = iVar.f(EnvelopeResource.AppFramework.class, b0.e(), "appFramework");
        zq3.g(f2, "moshi.adapter(EnvelopeRe…ptySet(), \"appFramework\")");
        this.nullableAppFrameworkAdapter = f2;
        JsonAdapter<Integer> f3 = iVar.f(Integer.class, b0.e(), "sdkSimpleVersion");
        zq3.g(f3, "moshi.adapter(Int::class…et(), \"sdkSimpleVersion\")");
        this.nullableIntAdapter = f3;
        JsonAdapter<Boolean> f4 = iVar.f(Boolean.class, b0.e(), "jailbroken");
        zq3.g(f4, "moshi.adapter(Boolean::c…emptySet(), \"jailbroken\")");
        this.nullableBooleanAdapter = f4;
        JsonAdapter<Long> f5 = iVar.f(Long.class, b0.e(), "diskTotalCapacity");
        zq3.g(f5, "moshi.adapter(Long::clas…t(), \"diskTotalCapacity\")");
        this.nullableLongAdapter = f5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EnvelopeResource");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public EnvelopeResource fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        EnvelopeResource.AppFramework appFramework = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Integer num = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        Boolean bool = null;
        Long l = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
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
                    appFramework = (EnvelopeResource.AppFramework) this.nullableAppFrameworkAdapter.fromJson(jsonReader);
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
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967231L;
                    break;
                case 7:
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967167L;
                    break;
                case 8:
                    str8 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967039L;
                    break;
                case 9:
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294966783L;
                    break;
                case 10:
                    str9 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294966271L;
                    break;
                case 11:
                    str10 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294965247L;
                    break;
                case 12:
                    str11 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294963199L;
                    break;
                case 13:
                    str12 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294959103L;
                    break;
                case 14:
                    str13 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294950911L;
                    break;
                case 15:
                    str14 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294934527L;
                    break;
                case 16:
                    str15 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294901759L;
                    break;
                case 17:
                    str16 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294836223L;
                    break;
                case 18:
                    str17 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294705151L;
                    break;
                case 19:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294443007L;
                    break;
                case 20:
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    j = 4293918719L;
                    break;
                case 21:
                    str18 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4292870143L;
                    break;
                case 22:
                    str19 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4290772991L;
                    break;
                case 23:
                    str20 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4286578687L;
                    break;
                case 24:
                    str21 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4278190079L;
                    break;
                case EventType.SUBS /* 25 */:
                    str22 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4261412863L;
                    break;
                case EventType.CDN /* 26 */:
                    num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4227858431L;
                    break;
                case 27:
                    num3 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4160749567L;
                    break;
                case 28:
                    i &= (int) 4026531839L;
                    num4 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
            }
            i &= (int) j;
        }
        jsonReader.h();
        if (i == ((int) 3758096384L)) {
            return new EnvelopeResource(str, appFramework, str2, str3, str4, str5, str6, str7, str8, num, str9, str10, str11, str12, str13, str14, str15, str16, str17, bool, l, str18, str19, str20, str21, str22, num2, num3, num4);
        }
        Constructor<EnvelopeResource> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EnvelopeResource.class.getDeclaredConstructor(String.class, EnvelopeResource.AppFramework.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Long.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Integer.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "EnvelopeResource::class.…his.constructorRef = it }");
        }
        EnvelopeResource newInstance = constructor.newInstance(str, appFramework, str2, str3, str4, str5, str6, str7, str8, num, str9, str10, str11, str12, str13, str14, str15, str16, str17, bool, l, str18, str19, str20, str21, str22, num2, num3, num4, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, EnvelopeResource envelopeResource) {
        zq3.h(hVar, "writer");
        if (envelopeResource == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("app_version");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getAppVersion());
        hVar.C("app_framework");
        this.nullableAppFrameworkAdapter.mo197toJson(hVar, envelopeResource.getAppFramework());
        hVar.C("build_id");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getBuildId());
        hVar.C("app_ecosystem_id");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getAppEcosystemId());
        hVar.C("build_type");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getBuildType());
        hVar.C("build_flavor");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getBuildFlavor());
        hVar.C("environment");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getEnvironment());
        hVar.C("bundle_version");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getBundleVersion());
        hVar.C("sdk_version");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getSdkVersion());
        hVar.C("sdk_simple_version");
        this.nullableIntAdapter.mo197toJson(hVar, envelopeResource.getSdkSimpleVersion());
        hVar.C("react_native_bundle_id");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getReactNativeBundleId());
        hVar.C("react_native_version");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getReactNativeVersion());
        hVar.C("javascript_patch_number");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getJavascriptPatchNumber());
        hVar.C("hosted_platform_version");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getHostedPlatformVersion());
        hVar.C("hosted_sdk_version");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getHostedSdkVersion());
        hVar.C("unity_build_id");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getUnityBuildId());
        hVar.C("device_manufacturer");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getDeviceManufacturer());
        hVar.C("device_model");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getDeviceModel());
        hVar.C("device_architecture");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getDeviceArchitecture());
        hVar.C("jailbroken");
        this.nullableBooleanAdapter.mo197toJson(hVar, envelopeResource.getJailbroken());
        hVar.C("disk_total_capacity");
        this.nullableLongAdapter.mo197toJson(hVar, envelopeResource.getDiskTotalCapacity());
        hVar.C("os_type");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getOsType());
        hVar.C("os_name");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getOsName());
        hVar.C("os_version");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getOsVersion());
        hVar.C("os_code");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getOsCode());
        hVar.C("screen_resolution");
        this.nullableStringAdapter.mo197toJson(hVar, envelopeResource.getScreenResolution());
        hVar.C("num_cores");
        this.nullableIntAdapter.mo197toJson(hVar, envelopeResource.getNumCores());
        hVar.C("cpu_name");
        this.nullableIntAdapter.mo197toJson(hVar, envelopeResource.getCpuName());
        hVar.C("egl_info");
        this.nullableIntAdapter.mo197toJson(hVar, envelopeResource.getEglInfo());
        hVar.l();
    }
}
