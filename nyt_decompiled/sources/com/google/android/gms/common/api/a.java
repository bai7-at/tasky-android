package com.google.android.gms.common.api;

import com.google.android.gms.common.api.PendingResult;

/* loaded from: classes2.dex */
final class a implements PendingResult.StatusListener {
    final /* synthetic */ Batch a;

    a(Batch batch) {
        this.a = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        Object obj;
        int i;
        int i2;
        boolean z;
        boolean z2;
        PendingResult[] pendingResultArr;
        obj = this.a.zai;
        synchronized (obj) {
            try {
                if (this.a.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    this.a.zag = true;
                } else if (!status.isSuccess()) {
                    this.a.zaf = true;
                }
                Batch batch = this.a;
                i = batch.zae;
                batch.zae = i - 1;
                Batch batch2 = this.a;
                i2 = batch2.zae;
                if (i2 == 0) {
                    z = batch2.zag;
                    if (z) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        z2 = batch2.zaf;
                        Status status2 = z2 ? new Status(13) : Status.RESULT_SUCCESS;
                        Batch batch3 = this.a;
                        pendingResultArr = batch3.zah;
                        batch3.setResult(new BatchResult(status2, pendingResultArr));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
