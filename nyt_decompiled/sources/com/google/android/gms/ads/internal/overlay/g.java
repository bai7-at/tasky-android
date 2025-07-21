package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.zzj;
import defpackage.bbf;
import defpackage.dyf;
import defpackage.ila;
import defpackage.wxf;

/* loaded from: classes2.dex */
final class g extends ila {
    final /* synthetic */ h c;

    /* synthetic */ g(h hVar, bbf bbfVar) {
        this.c = hVar;
    }

    @Override // defpackage.ila
    public final void a() {
        final BitmapDrawable bitmapDrawable;
        Bitmap a = dyf.w().a(Integer.valueOf(this.c.b.zzo.zzf));
        if (a != null) {
            dyf.r();
            h hVar = this.c;
            zzj zzjVar = hVar.b.zzo;
            boolean z = zzjVar.zzd;
            float f = zzjVar.zze;
            Activity activity = hVar.a;
            if (!z || f <= 0.0f || f > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), a);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, a.getWidth(), a.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), a);
                }
            }
            wxf.l.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.c.a.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
