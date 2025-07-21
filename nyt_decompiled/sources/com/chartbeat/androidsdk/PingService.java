package com.chartbeat.androidsdk;

import defpackage.jc5;
import defpackage.mb7;
import defpackage.ps2;
import java.util.LinkedHashMap;
import retrofit2.Response;

/* loaded from: classes2.dex */
final class PingService {
    private static final String TAG = "PingService";
    private static final boolean TEST_RANDOM_FAILURES = false;
    private ChartbeatAPI api;

    PingService(String str) {
        this.api = (ChartbeatAPI) new PingClient(ChartbeatAPI.ENDPOINT, ChartbeatAPI.HOST, str).createService(ChartbeatAPI.class);
    }

    <T> jc5.c applySchedulers() {
        return new jc5.c() { // from class: com.chartbeat.androidsdk.PingService.2
            @Override // defpackage.ps2
            public jc5<T> call(jc5<T> jc5Var) {
                return jc5Var.p(mb7.b()).i(mb7.b());
            }
        };
    }

    jc5<Integer> ping(LinkedHashMap<String, String> linkedHashMap) {
        return this.api.ping(linkedHashMap).a(applySchedulers()).h(new ps2() { // from class: com.chartbeat.androidsdk.PingService.1
            @Override // defpackage.ps2
            public Integer call(Response<Void> response) {
                return Integer.valueOf(response.code());
            }
        });
    }
}
