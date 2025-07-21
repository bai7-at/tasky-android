package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
final class u0 {
    private final int a;
    private final ConnectionResult b;

    u0(ConnectionResult connectionResult, int i) {
        Preconditions.checkNotNull(connectionResult);
        this.b = connectionResult;
        this.a = i;
    }

    final int a() {
        return this.a;
    }

    final ConnectionResult b() {
        return this.b;
    }
}
