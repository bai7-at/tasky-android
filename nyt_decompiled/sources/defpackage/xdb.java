package defpackage;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
final class xdb extends deb {
    private final Clock b;
    private final xdb c = this;
    private final e4f d;
    private final e4f e;
    private final e4f f;
    private final e4f g;
    private final e4f h;
    private final e4f i;
    private final e4f j;
    private final e4f k;

    /* synthetic */ xdb(Context context, Clock clock, hie hieVar, ceb cebVar, wdb wdbVar) {
        this.b = clock;
        v3f a = w3f.a(context);
        this.d = a;
        v3f a2 = w3f.a(hieVar);
        this.e = a2;
        v3f a3 = w3f.a(cebVar);
        this.f = a3;
        this.g = u3f.b(new mdb(a, a2, a3));
        v3f a4 = w3f.a(clock);
        this.h = a4;
        e4f b = u3f.b(new odb(a4, a2, a3));
        this.i = b;
        qdb qdbVar = new qdb(a4, b);
        this.j = qdbVar;
        this.k = u3f.b(new ieb(a, qdbVar));
    }

    @Override // defpackage.deb
    final ldb a() {
        return (ldb) this.g.zzb();
    }

    @Override // defpackage.deb
    final pdb b() {
        return new pdb(this.b, (ndb) this.i.zzb());
    }

    @Override // defpackage.deb
    final heb c() {
        return (heb) this.k.zzb();
    }
}
