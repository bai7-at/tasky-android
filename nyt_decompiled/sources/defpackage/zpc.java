package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zpc implements Callable {
    private final iq9 a;
    private final imb b;
    private final Context c;
    private final zuc d;
    private final k6e e;
    private final a8d f;
    private final Executor g;
    private final gfa h;
    private final zzcei i;
    private final d8e j;
    private final l8d k;
    private final w1e l;

    public zpc(Context context, Executor executor, gfa gfaVar, zzcei zzceiVar, iq9 iq9Var, imb imbVar, a8d a8dVar, d8e d8eVar, zuc zucVar, k6e k6eVar, l8d l8dVar, w1e w1eVar) {
        this.c = context;
        this.g = executor;
        this.h = gfaVar;
        this.i = zzceiVar;
        this.a = iq9Var;
        this.b = imbVar;
        this.f = a8dVar;
        this.j = d8eVar;
        this.d = zucVar;
        this.e = k6eVar;
        this.k = l8dVar;
        this.l = w1eVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        cqc cqcVar = new cqc(this);
        cqcVar.h();
        return cqcVar;
    }
}
