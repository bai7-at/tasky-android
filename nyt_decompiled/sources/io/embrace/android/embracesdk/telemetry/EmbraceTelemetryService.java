package io.embrace.android.embracesdk.telemetry;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.facebook.AuthenticationTokenClaims;
import defpackage.c04;
import defpackage.du8;
import defpackage.qs2;
import defpackage.rx3;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.envelope.resource.DeviceKt;
import io.embrace.android.embracesdk.internal.SystemInfo;
import io.embrace.android.embracesdk.internal.spans.EmbraceExtensionsKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.c;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.f;

/* loaded from: classes5.dex */
public final class EmbraceTelemetryService implements TelemetryService {
    private final c04 appAttributes$delegate;
    private final OkHttpReflectionFacade okHttpReflectionFacade;
    private final ConcurrentHashMap<String, String> storageTelemetryMap;
    private final SystemInfo systemInfo;
    private final ConcurrentHashMap<String, Integer> usageCountMap;

    public EmbraceTelemetryService(SystemInfo systemInfo) {
        zq3.h(systemInfo, "systemInfo");
        this.systemInfo = systemInfo;
        this.okHttpReflectionFacade = new OkHttpReflectionFacade();
        this.usageCountMap = new ConcurrentHashMap<>();
        this.storageTelemetryMap = new ConcurrentHashMap<>();
        this.appAttributes$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.telemetry.EmbraceTelemetryService$appAttributes$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Map<String, String> mo865invoke() {
                Map<String, String> computeAppAttributes;
                computeAppAttributes = EmbraceTelemetryService.this.computeAppAttributes();
                return computeAppAttributes;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, String> computeAppAttributes() {
        Object b;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EmbraceExtensionsKt.toEmbraceAttributeName$default("okhttp3", false, 1, null), String.valueOf(this.okHttpReflectionFacade.hasOkHttp3()));
        String okHttp3Version = this.okHttpReflectionFacade.getOkHttp3Version();
        if (okHttp3Version.length() > 0) {
            linkedHashMap.put(EmbraceExtensionsKt.toEmbraceAttributeName$default("okhttp3_on_classpath", false, 1, null), okHttp3Version);
        }
        String embraceAttributeName$default = EmbraceExtensionsKt.toEmbraceAttributeName$default("kotlin_on_classpath", false, 1, null);
        try {
            Result.a aVar = Result.a;
            b = Result.b(rx3.f.toString());
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        boolean g = Result.g(b);
        String str2 = DatasetUtils.UNKNOWN_IDENTITY_ID;
        if (g) {
            b = DatasetUtils.UNKNOWN_IDENTITY_ID;
        }
        linkedHashMap.put(embraceAttributeName$default, b);
        String embraceAttributeName$default2 = EmbraceExtensionsKt.toEmbraceAttributeName$default("is_emulator", false, 1, null);
        try {
            str = Result.b(String.valueOf(DeviceKt.isEmulator(this.systemInfo)));
        } catch (Throwable th2) {
            Result.a aVar3 = Result.a;
            str = Result.b(f.a(th2));
        }
        if (!Result.g(str)) {
            str2 = str;
        }
        linkedHashMap.put(embraceAttributeName$default2, str2);
        return linkedHashMap;
    }

    private final Map<String, String> getAndClearStorageTelemetry() {
        Map<String, String> v = t.v(this.storageTelemetryMap);
        this.storageTelemetryMap.clear();
        return v;
    }

    private final Map<String, String> getAndClearUsageCountTelemetry() {
        LinkedHashMap linkedHashMap;
        synchronized (this.usageCountMap) {
            try {
                Set<Map.Entry<String, Integer>> entrySet = this.usageCountMap.entrySet();
                zq3.g(entrySet, "usageCountMap.entries");
                Set<Map.Entry<String, Integer>> set = entrySet;
                linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(set, 10)), 16));
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object key = entry.getKey();
                    zq3.g(key, "it.key");
                    Pair a = du8.a(EmbraceExtensionsKt.toEmbraceUsageAttributeName((String) key), String.valueOf(((Number) entry.getValue()).intValue()));
                    linkedHashMap.put(a.c(), a.d());
                }
                this.usageCountMap.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    private final Map<String, String> getAppAttributes() {
        return (Map) this.appAttributes$delegate.getValue();
    }

    @Override // io.embrace.android.embracesdk.telemetry.TelemetryService
    public Map<String, String> getAndClearTelemetryAttributes() {
        return t.p(t.p(getAndClearUsageCountTelemetry(), getAndClearStorageTelemetry()), getAppAttributes());
    }

    @Override // io.embrace.android.embracesdk.telemetry.TelemetryService
    public void logStorageTelemetry(Map<String, String> map) {
        zq3.h(map, "storageTelemetry");
        this.storageTelemetryMap.putAll(map);
    }

    @Override // io.embrace.android.embracesdk.telemetry.TelemetryService
    public void onPublicApiCalled(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        synchronized (this.usageCountMap) {
            try {
                ConcurrentHashMap<String, Integer> concurrentHashMap = this.usageCountMap;
                Integer num = concurrentHashMap.get(str);
                if (num == null) {
                    num = 0;
                }
                concurrentHashMap.put(str, Integer.valueOf(num.intValue() + 1));
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
