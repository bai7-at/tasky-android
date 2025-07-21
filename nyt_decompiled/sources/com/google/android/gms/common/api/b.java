package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes2.dex */
final class b extends BasePendingResult {
    private final Result a;

    public b(Result result) {
        super(Looper.getMainLooper());
        this.a = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final Result createFailedResult(Status status) {
        if (status.getStatusCode() == this.a.getStatus().getStatusCode()) {
            return this.a;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
