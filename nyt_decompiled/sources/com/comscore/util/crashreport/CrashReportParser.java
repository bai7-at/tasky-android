package com.comscore.util.crashreport;

/* loaded from: classes2.dex */
public interface CrashReportParser {
    String reportToString(CrashReport crashReport);

    CrashReport stringToReport(String str);
}
