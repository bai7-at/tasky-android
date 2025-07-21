package defpackage;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ryb implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;
    private final l4f f;
    private final l4f g;
    private final l4f h;
    private final l4f i;
    private final l4f j;

    public ryb(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6, l4f l4fVar7, l4f l4fVar8, l4f l4fVar9, l4f l4fVar10) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
        this.f = l4fVar6;
        this.g = l4fVar7;
        this.h = l4fVar8;
        this.i = l4fVar9;
        this.j = l4fVar10;
    }

    public static qyb b(t0c t0cVar, Context context, w0e w0eVar, View view, wlb wlbVar, s0c s0cVar, clc clcVar, dgc dgcVar, l3f l3fVar, Executor executor) {
        return new qyb(t0cVar, context, w0eVar, view, wlbVar, s0cVar, clcVar, dgcVar, l3fVar, executor);
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qyb zzb() {
        return new qyb(((m3c) this.a).zzb(), (Context) this.b.zzb(), ((xyb) this.c).a(), ((wyb) this.d).a(), ((lzb) this.e).a(), ((yyb) this.f).a(), ((vic) this.g).a(), (dgc) this.h.zzb(), u3f.a(g4f.a(this.i)), (Executor) this.j.zzb());
    }
}
