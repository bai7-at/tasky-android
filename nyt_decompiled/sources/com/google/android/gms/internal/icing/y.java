package com.google.android.gms.internal.icing;

import defpackage.e1b;
import defpackage.i4d;

/* loaded from: classes3.dex */
public abstract class y extends e1b {
    private final z a;
    protected z b;
    protected boolean c = false;

    protected y(z zVar) {
        this.a = zVar;
        this.b = (z) zVar.f(4, null, null);
    }

    private static final void c(z zVar, z zVar2) {
        v0.a().b(zVar.getClass()).d(zVar, zVar2);
    }

    @Override // defpackage.e1b
    protected final /* bridge */ /* synthetic */ e1b b(f fVar) {
        h((z) fVar);
        return this;
    }

    protected void d() {
        z zVar = (z) this.b.f(4, null, null);
        c(zVar, this.b);
        this.b = zVar;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final y clone() {
        y yVar = (y) this.a.f(5, null, null);
        yVar.h(zzl());
        return yVar;
    }

    @Override // defpackage.e3d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public z zzl() {
        if (this.c) {
            return this.b;
        }
        z zVar = this.b;
        v0.a().b(zVar.getClass()).a(zVar);
        this.c = true;
        return this.b;
    }

    public final z g() {
        z zzl = zzl();
        boolean z = true;
        byte byteValue = ((Byte) zzl.f(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                boolean zzf = v0.a().b(zzl.getClass()).zzf(zzl);
                zzl.f(2, true != zzf ? null : zzl, null);
                z = zzf;
            }
        }
        if (z) {
            return zzl;
        }
        throw new zzfc(zzl);
    }

    public final y h(z zVar) {
        if (this.c) {
            d();
            this.c = false;
        }
        c(this.b, zVar);
        return this;
    }

    @Override // defpackage.m5d
    public final /* bridge */ /* synthetic */ i4d zzm() {
        return this.a;
    }
}
