package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.t6;
import com.google.android.gms.internal.ads.u6;
import com.google.android.gms.internal.ads.zzflg;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
final class spb extends yrd {
    private final bud a;
    private final gqb b;
    private final spb c = this;
    private final e4f d;
    private final e4f e;
    private final e4f f;
    private final e4f g;
    private final e4f h;
    private final e4f i;
    private final e4f j;
    private final e4f k;
    private final e4f l;
    private final e4f m;
    private final e4f n;

    /* synthetic */ spb(gqb gqbVar, bud budVar, rpb rpbVar) {
        e4f e4fVar;
        e4f e4fVar2;
        e4f e4fVar3;
        this.b = gqbVar;
        this.a = budVar;
        dud dudVar = new dud(budVar);
        this.d = dudVar;
        e4f b = u3f.b(utc.a());
        this.e = b;
        e4f b2 = u3f.b(stc.a());
        this.f = b2;
        e4f b3 = u3f.b(wtc.a());
        this.g = b3;
        e4f b4 = u3f.b(ytc.a());
        this.h = b4;
        y3f b5 = z3f.b(4);
        b5.b(zzflg.GMS_SIGNALS, b);
        b5.b(zzflg.BUILD_URL, b2);
        b5.b(zzflg.HTTP, b3);
        b5.b(zzflg.PRE_PROCESS, b4);
        z3f c = b5.c();
        this.i = c;
        e4fVar = gqbVar.h;
        e4f b6 = u3f.b(new ztc(dudVar, e4fVar, x4e.a(), c));
        this.j = b6;
        i4f a = j4f.a(0, 1);
        a.a(b6);
        j4f c2 = a.c();
        this.k = c2;
        u6 u6Var = new u6(c2);
        this.l = u6Var;
        x4e a2 = x4e.a();
        e4fVar2 = gqbVar.n;
        this.m = u3f.b(new t6(a2, e4fVar2, u6Var));
        e4fVar3 = gqbVar.H;
        this.n = u3f.b(new t7e(e4fVar3));
    }

    @Override // defpackage.yrd
    public final jqd a() {
        dob dobVar;
        e4f e4fVar;
        e4f e4fVar2;
        dobVar = this.b.b;
        Context a = dobVar.a();
        d4f.b(a);
        teb tebVar = new teb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        vtd vtdVar = new vtd(tebVar, kkeVar, cud.a(this.a));
        d4f.b(kkeVar);
        e4fVar = this.b.n;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) e4fVar.zzb();
        q7e q7eVar = (q7e) this.n.zzb();
        e4fVar2 = this.b.a0;
        zuc zucVar = (zuc) e4fVar2.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new iod(vtdVar, 0L, scheduledExecutorService));
        return new jqd(a, kkeVar, hashSet, q7eVar, zucVar);
    }

    @Override // defpackage.yrd
    public final s6 b() {
        return (s6) this.m.zzb();
    }
}
