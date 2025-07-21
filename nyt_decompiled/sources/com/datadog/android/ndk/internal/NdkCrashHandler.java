package com.datadog.android.ndk.internal;

import defpackage.jb2;

/* loaded from: classes2.dex */
public interface NdkCrashHandler {

    public enum ReportTarget {
        RUM,
        LOGS
    }

    void a();

    void b(jb2 jb2Var, ReportTarget reportTarget);
}
