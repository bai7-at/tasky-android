package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes2.dex */
final class c extends BasePendingResult {
    private final Result a;

    public c(GoogleApiClient googleApiClient, Result result) {
        super(googleApiClient);
        this.a = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final Result createFailedResult(Status status) {
        return this.a;
    }
}
