package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class o extends p {
    private final Callable f;

    /* synthetic */ o(Callable callable, zzu zzuVar) {
        super();
        this.f = callable;
    }

    @Override // com.google.android.gms.common.p
    final String a() {
        try {
            return (String) this.f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
