package defpackage;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h7a implements nv9 {
    public static final fw9 j = new fw9() { // from class: g7a
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new h7a(0)};
        }
    };
    private final b9e c;
    private final g8e d;
    private sv9 e;
    private long f;
    private boolean h;
    private boolean i;
    private final i7a a = new i7a(true, null);
    private final b9e b = new b9e(ProgressEvent.PART_COMPLETED_EVENT_CODE);
    private long g = -1;

    public h7a(int i) {
        b9e b9eVar = new b9e(10);
        this.c = b9eVar;
        byte[] m = b9eVar.m();
        this.d = new g8e(m, m.length);
    }

    @Override // defpackage.nv9
    public final void k(long j2, long j3) {
        this.h = false;
        this.a.zze();
        this.f = j3;
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        int i = 0;
        while (true) {
            bv9 bv9Var = (bv9) ov9Var;
            bv9Var.d(this.c.m(), 0, 10, false);
            this.c.k(0);
            if (this.c.D() != 4801587) {
                break;
            }
            this.c.l(3);
            int A = this.c.A();
            i += A + 10;
            bv9Var.k(A, false);
        }
        ov9Var.zzj();
        bv9 bv9Var2 = (bv9) ov9Var;
        bv9Var2.k(i, false);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            bv9Var2.d(this.c.m(), 0, 2, false);
            this.c.k(0);
            if (i7a.e(this.c.F())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                bv9Var2.d(this.c.m(), 0, 4, false);
                this.d.k(14);
                int d = this.d.d(13);
                if (d <= 6) {
                    i4++;
                    ov9Var.zzj();
                    bv9Var2.k(i4, false);
                } else {
                    bv9Var2.k(d - 6, false);
                    i3 += d;
                }
            } else {
                i4++;
                ov9Var.zzj();
                bv9Var2.k(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.nv9
    public final void m(sv9 sv9Var) {
        this.e = sv9Var;
        this.a.c(sv9Var, new m9a(RecyclerView.UNDEFINED_DURATION, 0, 1));
        sv9Var.b();
    }

    @Override // defpackage.nv9
    public final int n(ov9 ov9Var, cx9 cx9Var) {
        wad.b(this.e);
        int b = ov9Var.b(this.b.m(), 0, ProgressEvent.PART_COMPLETED_EVENT_CODE);
        if (!this.i) {
            this.e.m(new fx9(-9223372036854775807L, 0L));
            this.i = true;
        }
        if (b == -1) {
            return -1;
        }
        this.b.k(0);
        this.b.j(b);
        if (!this.h) {
            this.a.d(this.f, 4);
            this.h = true;
        }
        this.a.b(this.b);
        return 0;
    }
}
