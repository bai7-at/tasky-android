package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import defpackage.og8;
import defpackage.qg8;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzha {
    private final zzvr zza;
    private final float zzb;

    public zzha(ExecutorService executorService, float f) {
        this.zzb = f;
        this.zza = zzvw.zza(executorService);
    }

    final /* synthetic */ Bitmap zza(String str, com.google.ads.interactivemedia.v3.impl.data.zzbd zzbdVar) throws Exception {
        Bitmap decodeStream = BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        if (decodeStream == null) {
            return null;
        }
        if (zzbdVar.width != decodeStream.getWidth() || zzbdVar.height != decodeStream.getHeight()) {
            return decodeStream;
        }
        double d = this.zzb;
        if (Math.copySign(1.0d - d, 1.0d) <= 0.1d || d == 1.0d) {
            return decodeStream;
        }
        if (Double.isNaN(1.0d) && Double.isNaN(d)) {
            return decodeStream;
        }
        return Bitmap.createScaledBitmap(decodeStream, (int) (this.zzb * decodeStream.getWidth()), (int) (this.zzb * decodeStream.getHeight()), true);
    }

    public final og8 zzb(final String str, final com.google.ads.interactivemedia.v3.impl.data.zzbd zzbdVar) {
        qg8 qg8Var = new qg8();
        zzvd.zzd(this.zza.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzgy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzha.this.zza(str, zzbdVar);
            }
        }), new zzgz(this, qg8Var, str), this.zza);
        return qg8Var.a();
    }
}
