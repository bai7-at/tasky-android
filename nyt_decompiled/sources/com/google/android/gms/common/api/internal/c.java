package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes2.dex */
final class c implements PendingResult.StatusListener {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ zaad b;

    c(zaad zaadVar, BasePendingResult basePendingResult) {
        this.b = zaadVar;
        this.a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        Map map;
        map = this.b.zaa;
        map.remove(this.a);
    }
}
