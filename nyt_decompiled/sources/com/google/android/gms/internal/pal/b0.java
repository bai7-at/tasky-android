package com.google.android.gms.internal.pal;

import defpackage.ev9;
import defpackage.lt9;
import defpackage.zx9;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class b0 extends lt9 {
    private final c0 a;
    protected c0 b;
    protected boolean c = false;

    protected b0(c0 c0Var) {
        this.a = c0Var;
        this.b = (c0) c0Var.q(4, null, null);
    }

    private static final void c(c0 c0Var, c0 c0Var2) {
        z0.a().b(c0Var.getClass()).zzg(c0Var, c0Var2);
    }

    @Override // defpackage.by9
    public final /* synthetic */ zx9 a() {
        return this.a;
    }

    @Override // defpackage.lt9
    protected final /* synthetic */ lt9 b(d dVar) {
        e((c0) dVar);
        return this;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final b0 clone() {
        b0 b0Var = (b0) this.a.q(5, null, null);
        b0Var.e(t0());
        return b0Var;
    }

    public final b0 e(c0 c0Var) {
        if (this.c) {
            i();
            this.c = false;
        }
        c(this.b, c0Var);
        return this;
    }

    public final b0 f(byte[] bArr, int i, int i2, ev9 ev9Var) {
        if (this.c) {
            i();
            this.c = false;
        }
        try {
            z0.a().b(this.b.getClass()).a(this.b, bArr, 0, i2, new g(ev9Var));
            return this;
        } catch (zzadi e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzadi.i();
        }
    }

    public final c0 g() {
        c0 t0 = t0();
        if (t0.i()) {
            return t0;
        }
        throw new zzafh(t0);
    }

    @Override // defpackage.xx9
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public c0 t0() {
        if (this.c) {
            return this.b;
        }
        c0 c0Var = this.b;
        z0.a().b(c0Var.getClass()).zzf(c0Var);
        this.c = true;
        return this.b;
    }

    protected void i() {
        c0 c0Var = (c0) this.b.q(4, null, null);
        c(c0Var, this.b);
        this.b = c0Var;
    }
}
