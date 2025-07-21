package defpackage;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.h;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
final class k8d extends TimerTask {
    final /* synthetic */ AlertDialog a;
    final /* synthetic */ Timer b;
    final /* synthetic */ h c;

    k8d(l8d l8dVar, AlertDialog alertDialog, Timer timer, h hVar) {
        this.a = alertDialog;
        this.b = timer;
        this.c = hVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.dismiss();
        this.b.cancel();
        h hVar = this.c;
        if (hVar != null) {
            hVar.zzb();
        }
    }
}
