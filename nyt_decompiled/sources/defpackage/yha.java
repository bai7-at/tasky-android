package defpackage;

import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class yha extends cia {
    public yha(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2) {
        super(jgaVar, "CYcH4LBpiH+KaEScKuk48/IbmIORuaeHTHx2iwUA0vRWrbIkTWIgIbVYJ8eozDwX", "AtCF0F/Ugi3KOt6zYtgfLSsd+8KzXVTsnhwfj9NoYBY=", u0Var, i, 48);
    }

    @Override // defpackage.cia
    protected final void a() {
        this.e.W(3);
        boolean booleanValue = ((Boolean) this.f.invoke(null, this.b.b())).booleanValue();
        synchronized (this.e) {
            try {
                if (booleanValue) {
                    this.e.W(2);
                } else {
                    this.e.W(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
