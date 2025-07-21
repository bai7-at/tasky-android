package defpackage;

import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
public final class r6d implements r8c, c7c {
    private static final Object c = new Object();
    private static int d;
    private final hie a;
    private final b7d b;

    public r6d(b7d b7dVar, hie hieVar) {
        this.b = b7dVar;
        this.a = hieVar;
    }

    private final void a(boolean z) {
        int i;
        int intValue;
        if (((Boolean) pla.c().a(mpa.j6)).booleanValue() && !this.a.g()) {
            Object obj = c;
            synchronized (obj) {
                i = d;
                intValue = ((Integer) pla.c().a(mpa.k6)).intValue();
            }
            if (i < intValue) {
                this.b.e(z);
                synchronized (obj) {
                    d++;
                }
            }
        }
    }

    @Override // defpackage.c7c
    public final void n(zze zzeVar) {
        a(false);
    }

    @Override // defpackage.r8c
    public final void zzr() {
        a(true);
    }
}
