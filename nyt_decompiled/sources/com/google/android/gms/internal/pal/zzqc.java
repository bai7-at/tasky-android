package com.google.android.gms.internal.pal;

/* loaded from: classes3.dex */
public final class zzqc extends RuntimeException {
    public zzqc(String str) {
        super(str);
    }

    public zzqc(String str, Throwable th) {
        super("Creating a LegacyProtoKey failed", th);
    }
}
