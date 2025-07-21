package com.google.ads.interactivemedia.pal;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import com.google.android.gms.internal.pal.zzagc;
import defpackage.cy0;
import defpackage.o6e;
import defpackage.og8;
import defpackage.vg8;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class NonceManager {
    static final zzagc zza = zzagc.c(3);
    static final zzagc zzb = zzagc.c(5);
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final ExecutorService zze;
    private final og8 zzf;
    private final zzax zzg;
    private final zzav zzh;
    private final String zzi;
    private boolean zzj = false;
    private String zzk;

    NonceManager(Context context, Handler handler, ExecutorService executorService, og8 og8Var, zzax zzaxVar, String str) {
        this.zzd = context;
        this.zze = executorService;
        this.zzf = og8Var;
        this.zzg = zzaxVar;
        this.zzh = new zzav(handler, zzb);
        this.zzi = str;
    }

    static /* bridge */ /* synthetic */ Activity zza(NonceManager nonceManager) {
        Context context = nonceManager.zzd;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public String getNonce() {
        return this.zzi;
    }

    public void sendAdClick() {
        vg8.j(this.zzf.i(this.zze, new cy0() { // from class: com.google.ads.interactivemedia.pal.zzan
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                return NonceManager.this.zzc(og8Var);
            }
        }), zza.zzd(), TimeUnit.MILLISECONDS).i(this.zze, new cy0() { // from class: com.google.ads.interactivemedia.pal.zzao
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                NonceManager.this.zzd(og8Var);
                return null;
            }
        });
    }

    @Deprecated
    public void sendAdImpression() {
    }

    public void sendAdTouch(final MotionEvent motionEvent) {
        vg8.j(this.zzf.i(this.zze, new cy0() { // from class: com.google.ads.interactivemedia.pal.zzal
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                MotionEvent motionEvent2 = motionEvent;
                int i = NonceManager.zzc;
                ((o6e) og8Var.m()).d(motionEvent2);
                return null;
            }
        }), zza.zzd(), TimeUnit.MILLISECONDS).i(this.zze, new cy0() { // from class: com.google.ads.interactivemedia.pal.zzam
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                NonceManager.this.zze(og8Var);
                return null;
            }
        });
    }

    public void sendPlaybackEnd() {
        this.zzh.zzd();
        if (this.zzj) {
            this.zzj = false;
            this.zzg.zza(8, this.zzk);
        }
    }

    public void sendPlaybackStart() {
        if (this.zzj) {
            return;
        }
        this.zzj = true;
        og8 j = vg8.j(this.zzf.i(this.zze, new zzas(this)), zza.zzd(), TimeUnit.MILLISECONDS);
        j.i(this.zze, new cy0() { // from class: com.google.ads.interactivemedia.pal.zzap
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                NonceManager.this.zzf(og8Var);
                return null;
            }
        });
        j.h(new cy0() { // from class: com.google.ads.interactivemedia.pal.zzaq
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                NonceManager.this.zzg(og8Var);
                return null;
            }
        });
    }

    final /* synthetic */ String zzc(og8 og8Var) throws Exception {
        return ((o6e) og8Var.m()).a(this.zzd, "");
    }

    final /* synthetic */ Void zzd(og8 og8Var) throws Exception {
        this.zzg.zza(4, og8Var.q() ? (String) og8Var.m() : null);
        return null;
    }

    final /* synthetic */ Void zze(og8 og8Var) throws Exception {
        this.zzg.zza(5, null);
        return null;
    }

    final /* synthetic */ Void zzf(og8 og8Var) throws Exception {
        String str = og8Var.q() ? (String) og8Var.m() : null;
        this.zzk = str;
        this.zzg.zza(6, str);
        return null;
    }

    final /* synthetic */ Void zzg(og8 og8Var) throws Exception {
        if (!this.zzj) {
            return null;
        }
        this.zzh.zzc(new zzar(this));
        return null;
    }
}
