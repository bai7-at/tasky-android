package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import defpackage.me5;
import defpackage.og8;

/* loaded from: classes2.dex */
final class h0 implements me5 {
    private final GoogleApiManager a;
    private final int b;
    private final ApiKey c;
    private final long d;
    private final long e;

    h0(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2, String str, String str2) {
        this.a = googleApiManager;
        this.b = i;
        this.c = apiKey;
        this.d = j;
        this.e = j2;
    }

    static h0 a(GoogleApiManager googleApiManager, int i, ApiKey apiKey) {
        boolean z;
        if (!googleApiManager.zaD()) {
            return null;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            z = true;
        } else {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            z = config.getMethodTimingTelemetryEnabled();
            zabq zai = googleApiManager.zai(apiKey);
            if (zai != null) {
                if (!(zai.zaf() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zai.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration b = b(zai, baseGmsClient, i);
                    if (b == null) {
                        return null;
                    }
                    zai.zaq();
                    z = b.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new h0(googleApiManager, i, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static ConnectionTelemetryConfiguration b(zabq zabqVar, BaseGmsClient baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // defpackage.me5
    public final void onComplete(og8 og8Var) {
        zabq zai;
        int i;
        int i2;
        int i3;
        int errorCode;
        long j;
        long j2;
        int i4;
        if (this.a.zaD()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zai = this.a.zai(this.c)) != null && (zai.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zai.zaf();
                int i5 = 0;
                boolean z = this.d > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                int i6 = 100;
                if (config != null) {
                    z &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration b = b(zai, baseGmsClient, this.b);
                        if (b == null) {
                            return;
                        }
                        boolean z2 = b.getMethodTimingTelemetryEnabled() && this.d > 0;
                        maxMethodInvocationsInBatch = b.getMaxMethodInvocationsLogged();
                        z = z2;
                    }
                    i3 = batchPeriodMillis;
                    i2 = maxMethodInvocationsInBatch;
                } else {
                    i = 0;
                    i2 = 100;
                    i3 = 5000;
                }
                GoogleApiManager googleApiManager = this.a;
                if (og8Var.q()) {
                    errorCode = 0;
                } else {
                    if (!og8Var.o()) {
                        Exception l = og8Var.l();
                        if (l instanceof ApiException) {
                            Status status = ((ApiException) l).getStatus();
                            i6 = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            if (connectionResult != null) {
                                errorCode = connectionResult.getErrorCode();
                                i5 = i6;
                            }
                        } else {
                            i5 = 101;
                            errorCode = -1;
                        }
                    }
                    i5 = i6;
                    errorCode = -1;
                }
                if (z) {
                    long j3 = this.d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i4 = (int) (SystemClock.elapsedRealtime() - this.e);
                    j = j3;
                    j2 = currentTimeMillis;
                } else {
                    j = 0;
                    j2 = 0;
                    i4 = -1;
                }
                googleApiManager.zaw(new MethodInvocation(this.b, i5, errorCode, j, j2, null, null, gCoreServiceId, i4), i, i3, i2);
            }
        }
    }
}
