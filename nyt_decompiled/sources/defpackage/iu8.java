package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import defpackage.y31;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes2.dex */
public final class iu8 extends rs7 {
    private final yo5 o;
    private final boolean p;
    private final int q;
    private final int r;
    private final String s;
    private final float t;
    private final int u;

    public iu8(List list) {
        super("Tx3gDecoder");
        this.o = new yo5();
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.q = 0;
            this.r = -1;
            this.s = "sans-serif";
            this.p = false;
            this.t = 0.85f;
            this.u = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.q = bArr[24];
        this.r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.s = "Serif".equals(z19.F(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.u = i;
        boolean z = (bArr[0] & 32) != 0;
        this.p = z;
        if (z) {
            this.t = z19.p(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.t = 0.85f;
        }
    }

    private void B(yo5 yo5Var, SpannableStringBuilder spannableStringBuilder) {
        C(yo5Var.a() >= 12);
        int N = yo5Var.N();
        int N2 = yo5Var.N();
        yo5Var.V(2);
        int H = yo5Var.H();
        yo5Var.V(1);
        int q = yo5Var.q();
        if (N2 > spannableStringBuilder.length()) {
            a84.j("Tx3gDecoder", "Truncating styl end (" + N2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            N2 = spannableStringBuilder.length();
        }
        if (N < N2) {
            int i = N2;
            E(spannableStringBuilder, H, this.q, N, i, 0);
            D(spannableStringBuilder, q, this.r, N, i, 0);
            return;
        }
        a84.j("Tx3gDecoder", "Ignoring styl with start (" + N + ") >= end (" + N2 + ").");
    }

    private static void C(boolean z) {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    private static void D(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    private static void F(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    private static String G(yo5 yo5Var) {
        C(yo5Var.a() >= 2);
        int N = yo5Var.N();
        if (N == 0) {
            return "";
        }
        int f = yo5Var.f();
        Charset P = yo5Var.P();
        int f2 = N - (yo5Var.f() - f);
        if (P == null) {
            P = zj0.c;
        }
        return yo5Var.F(f2, P);
    }

    @Override // defpackage.rs7
    protected ub8 z(byte[] bArr, int i, boolean z) {
        this.o.S(bArr, i);
        String G = G(this.o);
        if (G.isEmpty()) {
            return ju8.b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(G);
        E(spannableStringBuilder, this.q, 0, 0, spannableStringBuilder.length(), 16711680);
        D(spannableStringBuilder, this.r, -1, 0, spannableStringBuilder.length(), 16711680);
        F(spannableStringBuilder, this.s, 0, spannableStringBuilder.length());
        float f = this.t;
        while (this.o.a() >= 8) {
            int f2 = this.o.f();
            int q = this.o.q();
            int q2 = this.o.q();
            if (q2 == 1937013100) {
                C(this.o.a() >= 2);
                int N = this.o.N();
                for (int i2 = 0; i2 < N; i2++) {
                    B(this.o, spannableStringBuilder);
                }
            } else if (q2 == 1952608120 && this.p) {
                C(this.o.a() >= 2);
                f = z19.p(this.o.N() / this.u, 0.0f, 0.95f);
            }
            this.o.U(f2 + q);
        }
        return new ju8(new y31.b().o(spannableStringBuilder).h(f, 0).i(0).a());
    }
}
