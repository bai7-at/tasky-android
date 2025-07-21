package defpackage;

import android.media.AudioAttributes;

/* loaded from: classes3.dex */
public final class t6f {
    public final AudioAttributes a;

    /* synthetic */ t6f(waf wafVar, d1f d1fVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = khe.a;
        if (i >= 29) {
            mtd.a(usage, 1);
        }
        if (i >= 32) {
            lie.a(usage, 0);
        }
        this.a = usage.build();
    }
}
