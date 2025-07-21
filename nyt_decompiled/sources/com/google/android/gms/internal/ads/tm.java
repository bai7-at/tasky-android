package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.ezd;
import defpackage.khe;
import defpackage.y7f;

/* loaded from: classes3.dex */
final class tm {
    private final AudioManager a;
    private final sm b;
    private y7f c;
    private int d;
    private float e = 1.0f;

    public tm(Context context, Handler handler, y7f y7fVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(AssetConstants.AUDIO_TYPE);
        audioManager.getClass();
        this.a = audioManager;
        this.c = y7fVar;
        this.b = new sm(this, handler);
        this.d = 0;
    }

    static /* bridge */ /* synthetic */ void c(tm tmVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                tmVar.g(3);
                return;
            } else {
                tmVar.f(0);
                tmVar.g(2);
                return;
            }
        }
        if (i == -1) {
            tmVar.f(-1);
            tmVar.e();
        } else if (i == 1) {
            tmVar.g(1);
            tmVar.f(1);
        } else {
            ezd.f("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    private final void e() {
        if (this.d == 0) {
            return;
        }
        if (khe.a < 26) {
            this.a.abandonAudioFocus(this.b);
        }
        g(0);
    }

    private final void f(int i) {
        int H;
        y7f y7fVar = this.c;
        if (y7fVar != null) {
            tn tnVar = (tn) y7fVar;
            boolean a = tnVar.a.a();
            H = wn.H(a, i);
            tnVar.a.U(a, i, H);
        }
    }

    private final void g(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.e != f) {
            this.e = f;
            y7f y7fVar = this.c;
            if (y7fVar != null) {
                ((tn) y7fVar).a.R();
            }
        }
    }

    public final float a() {
        return this.e;
    }

    public final int b(boolean z, int i) {
        e();
        return z ? 1 : -1;
    }

    public final void d() {
        this.c = null;
        e();
    }
}
