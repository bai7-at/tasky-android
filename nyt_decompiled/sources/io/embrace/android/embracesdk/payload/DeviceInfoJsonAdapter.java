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
public final class DeviceInfoJsonAdapter extends JsonAdapter<DeviceInfo> {
    private volatile Constructor<DeviceInfo> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public DeviceInfoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("dm", "do", "da", "jb", "lc", "ms", "os", "ov", "oc", QueryKeys.SITE_VISIT_REFERRER, QueryKeys.TIME_ZONE, "nc", "pt", "gp");
        zq3.g(a, "JsonReader.Options.of(\"d…, \"tz\", \"nc\", \"pt\", \"gp\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "manufacturer");
        zq3.g(f, "moshi.adapter(String::cl…ptySet(), \"manufacturer\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.class, b0.e(), "jailbroken");
        zq3.g(f2, "moshi.adapter(Boolean::c…emptySet(), \"jailbroken\")");
        this.nullableBooleanAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.class, b0.e(), "internalStorageTotalCapacity");
        zq3.g(f3, "moshi.adapter(Long::clas…nalStorageTotalCapacity\")");
        this.nullableLongAdapter = f3;
        JsonAdapter<Integer> f4 = iVar.f(Integer.class, b0.e(), "operatingSystemVersionCode");
        zq3.g(f4, "moshi.adapter(Int::class…ratingSystemVersionCode\")");
        this.nullableIntAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DeviceInfo");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DeviceInfo fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        int i = -1;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        String str4 = null;
        Long l = null;
        String str5 = null;
        String str6 = null;
        Integer num = null;
        String str7 = null;
        String str8 = null;
        Integer num2 = null;
        String str9 = null;
        String str10 = null;
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
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                    break;
                case 3:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    j = 4294967287L;
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967279L;
                    break;
                case 5:
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    j = 4294967263L;
                    break;
                case 6:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967231L;
                    break;
                case 7:
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967167L;
                    break;
                case 8:
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294967039L;
                    break;
                case 9:
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294966783L;
                    break;
                case 10:
                    str8 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294966271L;
                    break;
                case 11:
                    num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    j = 4294965247L;
                    break;
                case 12:
                    str9 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294963199L;
                    break;
                case 13:
                    str10 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294959103L;
                    break;
            }
            i &= (int) j;
        }
        jsonReader.h();
        if (i == ((int) 4294950912L)) {
            return new DeviceInfo(str, str2, str3, bool, str4, l, str5, str6, num, str7, str8, num2, str9, str10);
        }
        Constructor<DeviceInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DeviceInfo.class.getDeclaredConstructor(String.class, String.class, String.class, Boolean.class, String.class, Long.class, String.class, String.class, Integer.class, String.class, String.class, Integer.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "DeviceInfo::class.java.g…his.constructorRef = it }");
        }
        DeviceInfo newInstance = constructor.newInstance(str, str2, str3, bool, str4, l, str5, str6, num, str7, str8, num2, str9, str10, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, DeviceInfo deviceInfo) {
        zq3.h(hVar, "writer");
        if (deviceInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("dm");
        this.nullableStringAdapter.mo197toJson(hVar, deviceInfo.getManufacturer());
        hVar.C("do");
        this.nullableStringAdapter.mo197toJson(hVar, deviceInfo.getModel());
        hVar.C("da");
        this.nullableStringAdapter.mo197toJson(hVar, deviceInfo.getArchitecture());
        hVar.C("jb");
        this.nullableBooleanAdapter.mo197toJson(hVar, deviceInfo.getJailbroken());
        hVar.C("lc");
        this.nullableStringAdapter.mo197toJson(hVar, deviceInfo.getLocale());
        hVar.C("ms");
        this.nullableLongAdapter.mo197toJson(hVar, deviceInfo.getInternalStorageTotalCapacity());
        hVar.C("os");
        this.nullableStringAdapter.mo197toJson(hVar, deviceInfo.getOperatingSystemType());
        hVar.C("ov");
        this.nullableStringAdapter.mo197toJson(hVar, deviceInfo.getOperatingSystemVersion());
        hVar.C("oc");
        this.nullableIntAdapter.mo197toJson(hVar, deviceInfo.getOperatingSystemVersionCode());
        hVar.C(QueryKeys.SITE_VISIT_REFERRER);
        this.nullableStringAdapter.mo197toJson(hVar, deviceInfo.getScreenResolution());
        hVar.C(QueryKeys.TIME_ZONE);
        this.nullableStringAdapter.mo197toJson(hVar, deviceInfo.getTimezoneDescription());
        hVar.C("nc");
        this.nullableIntAdapter.mo197toJson(hVar, deviceInfo.getCores());
        hVar.C("pt");
        this.nullableStringAdapter.mo197toJson(hVar, deviceInfo.getCpuName());
        hVar.C("gp");
        this.nullableStringAdapter.mo197toJson(hVar, deviceInfo.getEgl());
        hVar.l();
    }
}
