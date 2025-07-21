package io.embrace.android.embracesdk.payload;

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
public final class PerformanceInfoJsonAdapter extends JsonAdapter<PerformanceInfo> {
    private volatile Constructor<PerformanceInfo> constructorRef;
    private final JsonAdapter<DiskUsage> nullableDiskUsageAdapter;
    private final JsonAdapter<List<AppExitInfoData>> nullableListOfAppExitInfoDataAdapter;
    private final JsonAdapter<List<Long>> nullableListOfLongAdapter;
    private final JsonAdapter<List<NativeThreadAnrInterval>> nullableListOfNativeThreadAnrIntervalAdapter;
    private final JsonAdapter<List<ResponsivenessSnapshot>> nullableListOfResponsivenessSnapshotAdapter;
    private final JsonAdapter<NetworkRequests> nullableNetworkRequestsAdapter;
    private final JsonReader.b options;

    public PerformanceInfoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("ds", "ga", "aei", "nst", "nr", "rms");
        zq3.g(a, "JsonReader.Options.of(\"d…\"nst\", \"nr\",\n      \"rms\")");
        this.options = a;
        JsonAdapter<DiskUsage> f = iVar.f(DiskUsage.class, b0.e(), "diskUsage");
        zq3.g(f, "moshi.adapter(DiskUsage:… emptySet(), \"diskUsage\")");
        this.nullableDiskUsageAdapter = f;
        JsonAdapter<List<Long>> f2 = iVar.f(j.j(List.class, Long.class), b0.e(), "googleAnrTimestamps");
        zq3.g(f2, "moshi.adapter(Types.newP…), \"googleAnrTimestamps\")");
        this.nullableListOfLongAdapter = f2;
        JsonAdapter<List<AppExitInfoData>> f3 = iVar.f(j.j(List.class, AppExitInfoData.class), b0.e(), "appExitInfoData");
        zq3.g(f3, "moshi.adapter(Types.newP…Set(), \"appExitInfoData\")");
        this.nullableListOfAppExitInfoDataAdapter = f3;
        JsonAdapter<List<NativeThreadAnrInterval>> f4 = iVar.f(j.j(List.class, NativeThreadAnrInterval.class), b0.e(), "nativeThreadAnrIntervals");
        zq3.g(f4, "moshi.adapter(Types.newP…ativeThreadAnrIntervals\")");
        this.nullableListOfNativeThreadAnrIntervalAdapter = f4;
        JsonAdapter<NetworkRequests> f5 = iVar.f(NetworkRequests.class, b0.e(), "networkRequests");
        zq3.g(f5, "moshi.adapter(NetworkReq…Set(), \"networkRequests\")");
        this.nullableNetworkRequestsAdapter = f5;
        JsonAdapter<List<ResponsivenessSnapshot>> f6 = iVar.f(j.j(List.class, ResponsivenessSnapshot.class), b0.e(), "responsivenessMonitorSnapshots");
        zq3.g(f6, "moshi.adapter(Types.newP…ivenessMonitorSnapshots\")");
        this.nullableListOfResponsivenessSnapshotAdapter = f6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PerformanceInfo");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public PerformanceInfo fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        DiskUsage diskUsage = null;
        int i = -1;
        List list = null;
        List list2 = null;
        List list3 = null;
        NetworkRequests networkRequests = null;
        List list4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    diskUsage = (DiskUsage) this.nullableDiskUsageAdapter.fromJson(jsonReader);
                    i &= (int) 4294967294L;
                    break;
                case 1:
                    i &= (int) 4294967293L;
                    list = (List) this.nullableListOfLongAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    i &= (int) 4294967291L;
                    list2 = (List) this.nullableListOfAppExitInfoDataAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    i &= (int) 4294967287L;
                    list3 = (List) this.nullableListOfNativeThreadAnrIntervalAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    i &= (int) 4294967279L;
                    networkRequests = (NetworkRequests) this.nullableNetworkRequestsAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    i &= (int) 4294967263L;
                    list4 = (List) this.nullableListOfResponsivenessSnapshotAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967232L)) {
            return new PerformanceInfo(diskUsage, list, list2, list3, networkRequests, list4);
        }
        Constructor<PerformanceInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PerformanceInfo.class.getDeclaredConstructor(DiskUsage.class, List.class, List.class, List.class, NetworkRequests.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "PerformanceInfo::class.j…his.constructorRef = it }");
        }
        PerformanceInfo newInstance = constructor.newInstance(diskUsage, list, list2, list3, networkRequests, list4, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PerformanceInfo performanceInfo) {
        zq3.h(hVar, "writer");
        if (performanceInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("ds");
        this.nullableDiskUsageAdapter.mo197toJson(hVar, performanceInfo.getDiskUsage());
        hVar.C("ga");
        this.nullableListOfLongAdapter.mo197toJson(hVar, performanceInfo.getGoogleAnrTimestamps());
        hVar.C("aei");
        this.nullableListOfAppExitInfoDataAdapter.mo197toJson(hVar, performanceInfo.getAppExitInfoData());
        hVar.C("nst");
        this.nullableListOfNativeThreadAnrIntervalAdapter.mo197toJson(hVar, performanceInfo.getNativeThreadAnrIntervals());
        hVar.C("nr");
        this.nullableNetworkRequestsAdapter.mo197toJson(hVar, performanceInfo.getNetworkRequests());
        hVar.C("rms");
        this.nullableListOfResponsivenessSnapshotAdapter.mo197toJson(hVar, performanceInfo.getResponsivenessMonitorSnapshots());
        hVar.l();
    }
}
