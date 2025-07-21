package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import defpackage.rm;

/* loaded from: classes3.dex */
public final class hma {
    private q4b a;
    private final Context b;
    private final String c;
    private final xvc d;
    private final int e;
    private final rm.a f;
    private final d3b g = new d3b();
    private final sof h = sof.a;

    public hma(Context context, String str, xvc xvcVar, int i, rm.a aVar) {
        this.b = context;
        this.c = str;
        this.d = xvcVar;
        this.e = i;
        this.f = aVar;
    }

    public final void a() {
        try {
            q4b d = kia.a().d(this.b, zzq.G0(), this.c, this.g);
            this.a = d;
            if (d != null) {
                if (this.e != 3) {
                    this.a.C2(new zzw(this.e));
                }
                this.a.T5(new ula(this.f, this.c));
                this.a.p3(this.h.a(this.b, this.d));
            }
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }
}
