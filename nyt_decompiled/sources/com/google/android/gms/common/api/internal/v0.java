package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes2.dex */
final class v0 extends zabw {
    final /* synthetic */ Dialog a;
    final /* synthetic */ w0 b;

    v0(w0 w0Var, Dialog dialog) {
        this.b = w0Var;
        this.a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        this.b.b.zad();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
