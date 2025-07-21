package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class nce {
    protected cbe a;

    protected nce() {
    }

    public final String a(Context context, String str) {
        return this.a.zze(fc5.l3(context), "");
    }

    public final String b(Context context, byte[] bArr) {
        return this.a.zzg(fc5.l3(context), null);
    }

    public final String c(Context context, View view, Activity activity) {
        return this.a.zzk(fc5.l3(context), fc5.l3(null), fc5.l3(activity));
    }

    public final void d(MotionEvent motionEvent) {
        this.a.zzl(fc5.l3(motionEvent));
    }
}
