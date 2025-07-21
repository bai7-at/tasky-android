package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes3.dex */
final class esb implements vyd {
    private final gqb a;
    private final esb b = this;
    private final e4f c;
    private final e4f d;
    private final e4f e;
    private final e4f f;
    private final e4f g;
    private final e4f h;
    private final e4f i;

    /* synthetic */ esb(gqb gqbVar, Context context, String str, zzq zzqVar, dsb dsbVar) {
        e4f e4fVar;
        e4f e4fVar2;
        e4f e4fVar3;
        e4f e4fVar4;
        e4f e4fVar5;
        e4f e4fVar6;
        e4f e4fVar7;
        this.a = gqbVar;
        v3f a = w3f.a(context);
        this.c = a;
        v3f a2 = w3f.a(zzqVar);
        this.d = a2;
        v3f a3 = w3f.a(str);
        this.e = a3;
        e4fVar = gqbVar.o;
        e4f b = u3f.b(new zhd(e4fVar));
        this.f = b;
        e4fVar2 = gqbVar.J0;
        e4f b2 = u3f.b(new vzd(e4fVar2));
        this.g = b2;
        e4fVar3 = gqbVar.p;
        e4fVar4 = gqbVar.V;
        e4f b3 = u3f.b(new tyd(a, e4fVar3, e4fVar4, b, b2, u1e.a()));
        this.h = b3;
        e4fVar5 = gqbVar.i;
        e4fVar6 = gqbVar.W;
        e4fVar7 = gqbVar.a0;
        this.i = u3f.b(new hid(a, a2, a3, b3, b, b2, e4fVar5, e4fVar6, e4fVar7));
    }

    @Override // defpackage.vyd
    public final gid zza() {
        return (gid) this.i.zzb();
    }
}
