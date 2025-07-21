package com.google.android.gms.internal.play_billing;

import defpackage.t2a;

/* loaded from: classes3.dex */
public abstract class y extends t2a {
    private final z a;
    protected z b;

    protected y(z zVar) {
        this.a = zVar;
        if (zVar.p()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = zVar.g();
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final y clone() {
        y yVar = (y) this.a.q(5, null, null);
        yVar.b = zze();
        return yVar;
    }

    public final z c() {
        z zze = zze();
        if (zze.o()) {
            return zze;
        }
        throw new zzef(zze);
    }

    @Override // defpackage.nac
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public z zze() {
        if (!this.b.p()) {
            return this.b;
        }
        this.b.k();
        return this.b;
    }

    protected final void e() {
        if (this.b.p()) {
            return;
        }
        f();
    }

    protected void f() {
        z g = this.a.g();
        u0.a().b(g.getClass()).zzg(g, this.b);
        this.b = g;
    }
}
