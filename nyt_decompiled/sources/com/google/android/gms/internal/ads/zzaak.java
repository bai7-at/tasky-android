package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import defpackage.cmd;
import defpackage.mr9;
import defpackage.wad;

/* loaded from: classes3.dex */
public final class zzaak extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final c zzd;
    private boolean zze;

    /* synthetic */ zzaak(c cVar, SurfaceTexture surfaceTexture, boolean z, mr9 mr9Var) {
        super(surfaceTexture);
        this.zzd = cVar;
        this.zza = z;
    }

    public static zzaak a(Context context, boolean z) {
        boolean z2 = true;
        if (z && !b(context)) {
            z2 = false;
        }
        wad.f(z2);
        return new c().a(z ? zzb : 0);
    }

    public static synchronized boolean b(Context context) {
        int i;
        synchronized (zzaak.class) {
            try {
                if (!zzc) {
                    zzb = cmd.c(context) ? cmd.d() ? 1 : 2 : 0;
                    zzc = true;
                }
                i = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            try {
                if (!this.zze) {
                    this.zzd.b();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
