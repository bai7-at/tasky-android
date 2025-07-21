package com.google.android.gms.internal.ads;

import defpackage.w1f;

/* loaded from: classes3.dex */
public final class zzhco extends RuntimeException {
    public zzhco(w1f w1fVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzhag a() {
        return new zzhag(getMessage());
    }
}
