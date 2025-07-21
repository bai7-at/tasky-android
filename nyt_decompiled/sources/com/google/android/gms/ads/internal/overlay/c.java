package com.google.android.gms.ads.internal.overlay;

import android.view.View;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes2.dex */
final class c implements View.OnClickListener {
    final /* synthetic */ h a;

    c(h hVar) {
        this.a = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
        h hVar = this.a;
        hVar.B = 2;
        hVar.a.finish();
    }
}
