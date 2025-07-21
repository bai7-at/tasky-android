package defpackage;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public final class e7a implements nv9 {
    public static final fw9 d = new fw9() { // from class: d7a
        @Override // defpackage.fw9
        public final /* synthetic */ nv9[] a(Uri uri, Map map) {
            int i = dw9.a;
            return new nv9[]{new e7a()};
        }
    };
    private final f7a a = new f7a(null);
    private final b9e b = new b9e(Http2.INITIAL_MAX_FRAME_SIZE);
    private boolean c;

    @Override // defpackage.nv9
    public final void k(long j, long j2) {
        this.c = false;
        this.a.zze();
    }

    @Override // defpackage.nv9
    public final boolean l(ov9 ov9Var) {
        int i;
        boolean z = true;
        b9e b9eVar = new b9e(10);
        int i2 = 0;
        while (true) {
            bv9 bv9Var = (bv9) ov9Var;
            bv9Var.d(b9eVar.m(), 0, 10, false);
            b9eVar.k(0);
            if (b9eVar.D() != 4801587) {
                break;
            }
            b9eVar.l(3);
            int A = b9eVar.A();
            i2 += A + 10;
            bv9Var.k(A, false);
            z = true;
        }
        ov9Var.zzj();
        bv9 bv9Var2 = (bv9) ov9Var;
        bv9Var2.k(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            bv9Var2.d(b9eVar.m(), 0, 7, false);
            b9eVar.k(0);
            int F = b9eVar.F();
            if (F == 44096 || F == 44097) {
                i3 += z ? 1 : 0;
                if (i3 >= 4) {
                    return z;
                }
                byte[] m = b9eVar.m();
                int i6 = fu9.b;
                if (m.length < 7) {
                    i = -1;
                } else {
                    int i7 = (m[3] & 255) | ((m[2] & 255) << 8);
                    if (i7 == 65535) {
                        i7 = ((m[4] & 255) << 16) | ((m[5] & 255) << 8) | (m[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (F == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                bv9Var2.k(i - 7, false);
                z = true;
            } else {
                ov9Var.zzj();
                i4 += z ? 1 : 0;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                bv9Var2.k(i4, false);
                i3 = 0;
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
        int b = ov9Var.b(this.b.m(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
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
