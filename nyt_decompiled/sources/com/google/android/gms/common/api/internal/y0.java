package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;

/* loaded from: classes2.dex */
final class y0 {
    final /* synthetic */ BasePendingResult a;

    /* synthetic */ y0(BasePendingResult basePendingResult, zar zarVar) {
        this.a = basePendingResult;
    }

    protected final void finalize() {
        Result result;
        result = this.a.zaj;
        BasePendingResult.zal(result);
        super.finalize();
    }
}
