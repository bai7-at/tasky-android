package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
final class b extends zag {
    final /* synthetic */ Intent a;
    final /* synthetic */ Fragment b;
    final /* synthetic */ int c;

    b(Intent intent, Fragment fragment, int i) {
        this.a = intent;
        this.b = fragment;
        this.c = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
