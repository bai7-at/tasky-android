package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* loaded from: classes2.dex */
final class c extends zag {
    final /* synthetic */ Intent a;
    final /* synthetic */ LifecycleFragment b;

    c(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.a = intent;
        this.b = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
