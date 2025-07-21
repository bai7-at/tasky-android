package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbbz;

/* loaded from: classes3.dex */
public final class oic implements w6c, cfc {
    private final ydb a;
    private final Context b;
    private final ceb c;
    private final View d;
    private String e;
    private final zzbbz f;

    public oic(ydb ydbVar, Context context, ceb cebVar, View view, zzbbz zzbbzVar) {
        this.a = ydbVar;
        this.b = context;
        this.c = cebVar;
        this.d = view;
        this.f = zzbbzVar;
    }

    @Override // defpackage.w6c
    public final void c(iab iabVar, String str, String str2) {
        if (this.c.p(this.b)) {
            try {
                ceb cebVar = this.c;
                Context context = this.b;
                cebVar.l(context, cebVar.a(context), this.a.a(), iabVar.zzc(), iabVar.zzb());
            } catch (RemoteException e) {
                fgb.h("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // defpackage.w6c
    public final void zza() {
        this.a.c(false);
    }

    @Override // defpackage.w6c
    public final void zzb() {
    }

    @Override // defpackage.w6c
    public final void zzc() {
        View view = this.d;
        if (view != null && this.e != null) {
            this.c.o(view.getContext(), this.e);
        }
        this.a.c(true);
    }

    @Override // defpackage.w6c
    public final void zze() {
    }

    @Override // defpackage.w6c
    public final void zzf() {
    }

    @Override // defpackage.cfc
    public final void zzk() {
    }

    @Override // defpackage.cfc
    public final void zzl() {
        if (this.f == zzbbz.APP_OPEN) {
            return;
        }
        String c = this.c.c(this.b);
        this.e = c;
        this.e = String.valueOf(c).concat(this.f == zzbbz.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
