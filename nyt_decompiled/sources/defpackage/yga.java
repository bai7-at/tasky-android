package defpackage;

import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class yga extends cia {
    public yga(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2) {
        super(jgaVar, "nK4MIXXv/sY+coqtAjalB6f9NiJ1zVnlRnfsJ++LIaOoNJXY+cpXhUK9rjjc0N2G", "gziBDgIPHk3UnbqAN9Ta9zRxJ8KBrTfiKBXyCZDQ588=", u0Var, i, 5);
    }

    @Override // defpackage.cia
    protected final void a() {
        this.e.k0(-1L);
        this.e.j0(-1L);
        int[] iArr = (int[]) this.f.invoke(null, this.b.b());
        synchronized (this.e) {
            try {
                this.e.k0(iArr[0]);
                this.e.j0(iArr[1]);
                int i = iArr[2];
                if (i != Integer.MIN_VALUE) {
                    this.e.i0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
