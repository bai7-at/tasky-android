package com.datadog.android.ndk.internal;

import com.datadog.android.ndk.internal.NdkCrashHandler;
import defpackage.jb2;
import defpackage.zq3;

/* loaded from: classes2.dex */
public final class d implements NdkCrashHandler {
    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public void a() {
    }

    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public void b(jb2 jb2Var, NdkCrashHandler.ReportTarget reportTarget) {
        zq3.h(jb2Var, "sdkCore");
        zq3.h(reportTarget, "reportTarget");
    }
}
