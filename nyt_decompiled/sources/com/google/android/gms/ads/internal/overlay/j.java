package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import defpackage.pzc;

/* loaded from: classes2.dex */
public final class j extends h {
    public j(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.h, defpackage.k7b
    public final void p2(Bundle bundle) {
        pzc.k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.B = 4;
        this.a.finish();
    }
}
