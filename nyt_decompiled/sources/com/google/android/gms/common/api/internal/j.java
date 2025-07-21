package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
final class j extends x {
    final /* synthetic */ ConnectionResult b;
    final /* synthetic */ l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(l lVar, zabf zabfVar, ConnectionResult connectionResult) {
        super(zabfVar);
        this.c = lVar;
        this.b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void a() {
        this.c.c.zaD(this.b);
    }
}
