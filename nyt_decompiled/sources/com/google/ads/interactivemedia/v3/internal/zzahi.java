package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
public final class zzahi extends RuntimeException {
    public zzahi(zzafz zzafzVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzafc zza() {
        return new zzafc(getMessage());
    }
}
