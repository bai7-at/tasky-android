package defpackage;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
final class ndb {
    private final Clock a;
    private final hie b;
    private final ceb c;

    ndb(Clock clock, hie hieVar, ceb cebVar) {
        this.a = clock;
        this.b = hieVar;
        this.c = cebVar;
    }

    public final void a(int i, long j) {
        if (((Boolean) pla.c().a(mpa.p0)).booleanValue()) {
            return;
        }
        if (j - this.b.zzf() < 0) {
            pzc.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) pla.c().a(mpa.q0)).booleanValue()) {
            this.b.l(i);
            this.b.t(j);
        } else {
            this.b.l(-1);
            this.b.t(j);
        }
    }
}
