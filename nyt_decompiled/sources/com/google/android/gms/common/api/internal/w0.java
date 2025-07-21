package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
final class w0 implements Runnable {
    private final u0 a;
    final /* synthetic */ zap b;

    w0(zap zapVar, u0 u0Var) {
        this.b = zapVar;
        this.a = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.zaa) {
            ConnectionResult b = this.a.b();
            if (b.hasResolution()) {
                zap zapVar = this.b;
                zapVar.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(b.getResolution()), this.a.a(), false), 1);
                return;
            }
            zap zapVar2 = this.b;
            if (zapVar2.zac.getErrorResolutionIntent(zapVar2.getActivity(), b.getErrorCode(), null) != null) {
                zap zapVar3 = this.b;
                zapVar3.zac.zag(zapVar3.getActivity(), this.b.mLifecycleFragment, b.getErrorCode(), 2, this.b);
            } else {
                if (b.getErrorCode() != 18) {
                    this.b.zaa(b, this.a.a());
                    return;
                }
                zap zapVar4 = this.b;
                Dialog zab = zapVar4.zac.zab(zapVar4.getActivity(), this.b);
                zap zapVar5 = this.b;
                zapVar5.zac.zac(zapVar5.getActivity().getApplicationContext(), new v0(this, zab));
            }
        }
    }
}
