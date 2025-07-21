package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjw;

/* loaded from: classes3.dex */
public final class imb {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, wlb] */
    public static final wlb a(final Context context, final unb unbVar, final String str, final boolean z, final boolean z2, final gfa gfaVar, final zqa zqaVar, final zzcei zzceiVar, eqa eqaVar, final hdf hdfVar, final iq9 iq9Var, final ina inaVar, final v0e v0eVar, final y0e y0eVar, final l8d l8dVar, final w1e w1eVar) {
        mpa.a(context);
        try {
            final eqa eqaVar2 = null;
            fhe fheVar = new fhe(context, unbVar, str, z, z2, gfaVar, zqaVar, zzceiVar, eqaVar2, hdfVar, iq9Var, inaVar, v0eVar, y0eVar, w1eVar, l8dVar) { // from class: fmb
                public final /* synthetic */ Context a;
                public final /* synthetic */ unb b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ gfa f;
                public final /* synthetic */ zqa g;
                public final /* synthetic */ zzcei h;
                public final /* synthetic */ hdf i;
                public final /* synthetic */ iq9 j;
                public final /* synthetic */ ina k;
                public final /* synthetic */ v0e l;
                public final /* synthetic */ y0e m;
                public final /* synthetic */ w1e n;
                public final /* synthetic */ l8d r;

                {
                    this.i = hdfVar;
                    this.j = iq9Var;
                    this.k = inaVar;
                    this.l = v0eVar;
                    this.m = y0eVar;
                    this.n = w1eVar;
                    this.r = l8dVar;
                }

                @Override // defpackage.fhe
                public final Object zza() {
                    unb unbVar2 = this.b;
                    String str2 = this.c;
                    boolean z3 = this.d;
                    ina inaVar2 = this.k;
                    boolean z4 = this.e;
                    gfa gfaVar2 = this.f;
                    v0e v0eVar2 = this.l;
                    zqa zqaVar2 = this.g;
                    hdf hdfVar2 = this.i;
                    y0e y0eVar2 = this.m;
                    Context context2 = this.a;
                    zzcei zzceiVar2 = this.h;
                    iq9 iq9Var2 = this.j;
                    w1e w1eVar2 = this.n;
                    l8d l8dVar2 = this.r;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = vmb.z0;
                        qmb qmbVar = new qmb(new vmb(new pnb(context2), unbVar2, str2, z3, z4, gfaVar2, zqaVar2, zzceiVar2, null, hdfVar2, iq9Var2, inaVar2, v0eVar2, y0eVar2, w1eVar2));
                        qmbVar.setWebViewClient(dyf.s().c(qmbVar, inaVar2, z4, l8dVar2));
                        qmbVar.setWebChromeClient(new vlb(qmbVar));
                        return qmbVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return fheVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcjw("Webview initialization failed.", th);
        }
    }
}
