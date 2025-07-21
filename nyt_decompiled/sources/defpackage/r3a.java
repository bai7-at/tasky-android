package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzcc;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r3a implements nv9 {
    public static final fw9 d = new fw9() { // from class: q3a
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new r3a()};
        }
    };
    private sv9 a;
    private h4a b;
    private boolean c;

    private final boolean a(ov9 ov9Var) {
        t3a t3aVar = new t3a();
        if (t3aVar.b(ov9Var, true) && (t3aVar.a & 2) == 2) {
            int min = Math.min(t3aVar.e, 8);
            b9e b9eVar = new b9e(min);
            ((bv9) ov9Var).d(b9eVar.m(), 0, min, false);
            b9eVar.k(0);
            if (b9eVar.q() >= 5 && b9eVar.B() == 127 && b9eVar.J() == 1179402563) {
                this.b = new p3a();
            } else {
                b9eVar.k(0);
                try {
                    if (cy9.d(1, b9eVar, true)) {
                        this.b = new j4a();
                    }
                } catch (zzcc unused) {
                }
                b9eVar.k(0);
                if (d4a.j(b9eVar)) {
                    this.b = new d4a();
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        h4a h4aVar = this.b;
        if (h4aVar != null) {
            h4aVar.i(j, j2);
        }
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        try {
            return a(ov9Var);
        } catch (zzcc unused) {
            return false;
        }
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.a = sv9Var;
    }

    @Override // defpackage.nv9
    public final int n(ov9 ov9Var, cx9 cx9Var) {
        wad.b(this.a);
        if (this.b == null) {
            if (!a(ov9Var)) {
                throw zzcc.a("Failed to determine bitstream type", null);
            }
            ov9Var.zzj();
        }
        if (!this.c) {
            tx9 zzw = this.a.zzw(0, 1);
            this.a.b();
            this.b.g(this.a, zzw);
            this.c = true;
        }
        return this.b.d(ov9Var, cx9Var);
    }
}
