package com.google.android.gms.internal.pal;

import defpackage.zx9;

/* loaded from: classes3.dex */
public final class zzafh extends RuntimeException {
    public zzafh(zx9 zx9Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzadi a() {
        return new zzadi(getMessage());
    }
}
