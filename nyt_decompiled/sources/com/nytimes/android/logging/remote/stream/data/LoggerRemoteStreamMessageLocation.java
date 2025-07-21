package com.nytimes.android.logging.remote.stream.data;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class LoggerRemoteStreamMessageLocation {
    private final String a;
    private final String b;
    private final int c;

    public LoggerRemoteStreamMessageLocation(String str, String str2, int i) {
        zq3.h(str, TransferTable.COLUMN_FILE);
        zq3.h(str2, "function");
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoggerRemoteStreamMessageLocation)) {
            return false;
        }
        LoggerRemoteStreamMessageLocation loggerRemoteStreamMessageLocation = (LoggerRemoteStreamMessageLocation) obj;
        return zq3.c(this.a, loggerRemoteStreamMessageLocation.a) && zq3.c(this.b, loggerRemoteStreamMessageLocation.b) && this.c == loggerRemoteStreamMessageLocation.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "LoggerRemoteStreamMessageLocation(file=" + this.a + ", function=" + this.b + ", line=" + this.c + ")";
    }
}
