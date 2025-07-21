package defpackage;

import android.graphics.Bitmap;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.y31;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class vs5 extends rs7 {
    private final yo5 o;
    private final yo5 p;
    private final a q;
    private Inflater r;

    private static final class a {
        private final yo5 a = new yo5();
        private final int[] b = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(yo5 yo5Var, int i) {
            int K;
            if (i < 4) {
                return;
            }
            yo5Var.V(3);
            int i2 = i - 4;
            if ((yo5Var.H() & 128) != 0) {
                if (i2 < 7 || (K = yo5Var.K()) < 4) {
                    return;
                }
                this.h = yo5Var.N();
                this.i = yo5Var.N();
                this.a.Q(K - 4);
                i2 = i - 11;
            }
            int f = this.a.f();
            int g = this.a.g();
            if (f >= g || i2 <= 0) {
                return;
            }
            int min = Math.min(i2, g - f);
            yo5Var.l(this.a.e(), f, min);
            this.a.U(f + min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(yo5 yo5Var, int i) {
            if (i < 19) {
                return;
            }
            this.d = yo5Var.N();
            this.e = yo5Var.N();
            yo5Var.V(11);
            this.f = yo5Var.N();
            this.g = yo5Var.N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(yo5 yo5Var, int i) {
            if (i % 5 != 2) {
                return;
            }
            yo5Var.V(2);
            Arrays.fill(this.b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int H = yo5Var.H();
                int H2 = yo5Var.H();
                int H3 = yo5Var.H();
                int H4 = yo5Var.H();
                double d = H2;
                double d2 = H3 - 128;
                double d3 = H4 - 128;
                this.b[H] = (z19.q((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (yo5Var.H() << 24) | (z19.q((int) ((1.402d * d2) + d), 0, 255) << 16) | z19.q((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.c = true;
        }

        public y31 d() {
            int i;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.a.g() == 0 || this.a.f() != this.a.g() || !this.c) {
                return null;
            }
            this.a.U(0);
            int i2 = this.h * this.i;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int H = this.a.H();
                if (H != 0) {
                    i = i3 + 1;
                    iArr[i3] = this.b[H];
                } else {
                    int H2 = this.a.H();
                    if (H2 != 0) {
                        i = ((H2 & 64) == 0 ? H2 & 63 : ((H2 & 63) << 8) | this.a.H()) + i3;
                        Arrays.fill(iArr, i3, i, (H2 & 128) == 0 ? 0 : this.b[this.a.H()]);
                    }
                }
                i3 = i;
            }
            return new y31.b().f(Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888)).k(this.f / this.d).l(0).h(this.g / this.e, 0).i(0).n(this.h / this.d).g(this.i / this.e).a();
        }

        public void h() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.a.Q(0);
            this.c = false;
        }
    }

    public vs5() {
        super("PgsDecoder");
        this.o = new yo5();
        this.p = new yo5();
        this.q = new a();
    }

    private void B(yo5 yo5Var) {
        if (yo5Var.a() <= 0 || yo5Var.j() != 120) {
            return;
        }
        if (this.r == null) {
            this.r = new Inflater();
        }
        if (z19.s0(yo5Var, this.p, this.r)) {
            yo5Var.S(this.p.e(), this.p.g());
        }
    }

    private static y31 C(yo5 yo5Var, a aVar) {
        int g = yo5Var.g();
        int H = yo5Var.H();
        int N = yo5Var.N();
        int f = yo5Var.f() + N;
        y31 y31Var = null;
        if (f > g) {
            yo5Var.U(g);
            return null;
        }
        if (H != 128) {
            switch (H) {
                case 20:
                    aVar.g(yo5Var, N);
                    break;
                case 21:
                    aVar.e(yo5Var, N);
                    break;
                case 22:
                    aVar.f(yo5Var, N);
                    break;
            }
        } else {
            y31Var = aVar.d();
            aVar.h();
        }
        yo5Var.U(f);
        return y31Var;
    }

    @Override // defpackage.rs7
    protected ub8 z(byte[] bArr, int i, boolean z) {
        this.o.S(bArr, i);
        B(this.o);
        this.q.h();
        ArrayList arrayList = new ArrayList();
        while (this.o.a() >= 3) {
            y31 C = C(this.o, this.q);
            if (C != null) {
                arrayList.add(C);
            }
        }
        return new ws5(Collections.unmodifiableList(arrayList));
    }
}
