package com.google.android.gms.internal.ads;

import defpackage.vze;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class xh extends vze {
    private final yh a;
    protected yh b;

    protected xh(yh yhVar) {
        this.a = yhVar;
        if (yhVar.G()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = yhVar.n();
    }

    private static void d(Object obj, Object obj2) {
        ui.a().b(obj.getClass()).zzg(obj, obj2);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final xh clone() {
        xh xhVar = (xh) this.a.I(5, null, null);
        xhVar.b = H0();
        return xhVar;
    }

    public final xh g(yh yhVar) {
        if (!this.a.equals(yhVar)) {
            if (!this.b.G()) {
                m();
            }
            d(this.b, yhVar);
        }
        return this;
    }

    public final xh h(byte[] bArr, int i, int i2, ph phVar) {
        if (!this.b.G()) {
            m();
        }
        try {
            ui.a().b(this.b.getClass()).c(this.b, bArr, 0, i2, new vg(phVar));
            return this;
        } catch (zzhag e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzhag.j();
        }
    }

    public final yh i() {
        yh H0 = H0();
        if (H0.F()) {
            return H0;
        }
        throw new zzhco(H0);
    }

    @Override // defpackage.v1f
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public yh H0() {
        if (!this.b.G()) {
            return this.b;
        }
        this.b.B();
        return this.b;
    }

    protected final void l() {
        if (this.b.G()) {
            return;
        }
        m();
    }

    protected void m() {
        yh n = this.a.n();
        d(n, this.b);
        this.b = n;
    }
}
