package com.google.android.gms.internal.play_billing;

import defpackage.sbc;

/* loaded from: classes3.dex */
public final class zzef extends RuntimeException {
    public zzef(sbc sbcVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzci a() {
        return new zzci(getMessage());
    }
}
