package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class udd implements ake {
    private final s6 a;
    private final y6c b;
    private final z7e c;
    private final d8e d;
    private final Executor e;
    private final ScheduledExecutorService f;
    private final x0c g;
    private final odd h;
    private final k9d i;
    private final Context j;
    private final q7e k;
    private final vcd l;

    udd(Context context, s6 s6Var, odd oddVar, y6c y6cVar, z7e z7eVar, d8e d8eVar, x0c x0cVar, Executor executor, ScheduledExecutorService scheduledExecutorService, k9d k9dVar, q7e q7eVar, vcd vcdVar) {
        this.j = context;
        this.a = s6Var;
        this.h = oddVar;
        this.b = y6cVar;
        this.c = z7eVar;
        this.d = d8eVar;
        this.g = x0cVar;
        this.e = executor;
        this.f = scheduledExecutorService;
        this.i = k9dVar;
        this.k = q7eVar;
        this.l = vcdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) defpackage.pla.c().a(defpackage.mpa.t5)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String b(defpackage.g1e r5) {
        /*
            zoa r0 = defpackage.mpa.u5
            kpa r1 = defpackage.pla.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            f1e r2 = r5.b
            y0e r2 = r2.b
            int r2 = r2.e
            if (r2 == 0) goto L57
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            zoa r2 = defpackage.mpa.t5
            kpa r3 = defpackage.pla.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L57
            goto L58
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L58
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received error HTTP response code: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L58
        L57:
            r1 = r0
        L58:
            f1e r5 = r5.b
            y0e r5 = r5.b
            x0e r5 = r5.i
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.a()
            return r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udd.b(g1e):java.lang.String");
    }

    final /* synthetic */ j64 a(v0e v0eVar, g1e g1eVar, g9d g9dVar, Throwable th) {
        f7e a = e7e.a(this.j, 12);
        a.I(v0eVar.F);
        a.zzh();
        j64 o = zb.o(g9dVar.a(g1eVar, v0eVar), v0eVar.S, TimeUnit.MILLISECONDS, this.f);
        this.h.f(g1eVar, v0eVar, o, this.c);
        p7e.a(o, this.k, a);
        return o;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf  */
    @Override // defpackage.ake
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ defpackage.j64 zza(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udd.zza(java.lang.Object):j64");
    }
}
