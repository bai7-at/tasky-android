package defpackage;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b7a implements nv9 {
    public static final fw9 d = new fw9() { // from class: a7a
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new b7a()};
        }
    };
    private final c7a a = new c7a(null);
    private final b9e b = new b9e(2786);
    private boolean c;

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        this.c = false;
        this.a.zze();
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        b9e b9eVar = new b9e(10);
        int i = 0;
        while (true) {
            bv9 bv9Var = (bv9) ov9Var;
            bv9Var.d(b9eVar.m(), 0, 10, false);
            b9eVar.k(0);
            if (b9eVar.D() != 4801587) {
                break;
            }
            b9eVar.l(3);
            int A = b9eVar.A();
            i += A + 10;
            bv9Var.k(A, false);
        }
        ov9Var.zzj();
        bv9 bv9Var2 = (bv9) ov9Var;
        bv9Var2.k(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            bv9Var2.d(b9eVar.m(), 0, 6, false);
            b9eVar.k(0);
            if (b9eVar.F() != 2935) {
                ov9Var.zzj();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                bv9Var2.k(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int b = bu9.b(b9eVar.m());
                if (b == -1) {
                    return false;
                }
                bv9Var2.k(b - 6, false);
            }
        }
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.a.c(sv9Var, new m9a(RecyclerView.UNDEFINED_DURATION, 0, 1));
        sv9Var.b();
        sv9Var.m(new fx9(-9223372036854775807L, 0L));
    }

    @Override // defpackage.nv9
    public final int n(ov9 ov9Var, cx9 cx9Var) {
        int b = ov9Var.b(this.b.m(), 0, 2786);
        if (b == -1) {
            return -1;
        }
        this.b.k(0);
        this.b.j(b);
        if (!this.c) {
            this.a.d(0L, 4);
            this.c = true;
        }
        this.a.b(this.b);
        return 0;
    }
}
