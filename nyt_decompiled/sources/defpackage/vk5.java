package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;
import defpackage.r38;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
final class vk5 extends r38 {
    private static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean n;

    vk5() {
    }

    private static boolean n(yo5 yo5Var, byte[] bArr) {
        if (yo5Var.a() < bArr.length) {
            return false;
        }
        int f = yo5Var.f();
        byte[] bArr2 = new byte[bArr.length];
        yo5Var.l(bArr2, 0, bArr.length);
        yo5Var.U(f);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(yo5 yo5Var) {
        return n(yo5Var, o);
    }

    @Override // defpackage.r38
    protected long f(yo5 yo5Var) {
        return c(wk5.e(yo5Var.e()));
    }

    @Override // defpackage.r38
    protected boolean i(yo5 yo5Var, long j, r38.b bVar) {
        if (n(yo5Var, o)) {
            byte[] copyOf = Arrays.copyOf(yo5Var.e(), yo5Var.g());
            int c = wk5.c(copyOf);
            List a = wk5.a(copyOf);
            if (bVar.a != null) {
                return true;
            }
            bVar.a = new t0.b().g0("audio/opus").J(c).h0(48000).V(a).G();
            return true;
        }
        byte[] bArr = p;
        if (!n(yo5Var, bArr)) {
            ur.i(bVar.a);
            return false;
        }
        ur.i(bVar.a);
        if (this.n) {
            return true;
        }
        this.n = true;
        yo5Var.V(bArr.length);
        Metadata c2 = oc9.c(ImmutableList.u(oc9.i(yo5Var, false, false).b));
        if (c2 == null) {
            return true;
        }
        bVar.a = bVar.a.c().Z(c2.b(bVar.a.j)).G();
        return true;
    }

    @Override // defpackage.r38
    protected void l(boolean z) {
        super.l(z);
        if (z) {
            this.n = false;
        }
    }
}
