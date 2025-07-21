package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.comscore.streaming.ContentType;
import defpackage.ni0;
import defpackage.y31;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import zendesk.core.BuildConfig;

/* loaded from: classes2.dex */
public final class ni0 extends pi0 {
    private final yo5 g = new yo5();
    private final xo5 h = new xo5();
    private int i = -1;
    private final boolean j;
    private final int k;
    private final b[] l;
    private b m;
    private List n;
    private List o;
    private c p;
    private int q;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private static final Comparator c = new Comparator() { // from class: mi0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c2;
                c2 = ni0.a.c((ni0.a) obj, (ni0.a) obj2);
                return c2;
            }
        };
        public final y31 a;
        public final int b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            y31.b n = new y31.b().o(charSequence).p(alignment).h(f, i).i(i2).k(f2).l(i3).n(f3);
            if (z) {
                n.s(i4);
            }
            this.a = n.a();
            this.b = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.b, aVar.b);
        }
    }

    private static final class b {
        private static final int[] A;
        private static final int[] B;
        private static final boolean[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        private static final int[] G;
        public static final int w = h(2, 2, 2, 0);
        public static final int x;
        public static final int y;
        private static final int[] z;
        private final List a = new ArrayList();
        private final SpannableStringBuilder b = new SpannableStringBuilder();
        private boolean c;
        private boolean d;
        private int e;
        private boolean f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int s;
        private int t;
        private int u;
        private int v;

        static {
            int h = h(0, 0, 0, 0);
            x = h;
            int h2 = h(0, 0, 0, 3);
            y = h2;
            z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{h, h2, h, h, h2, h, h};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{h, h, h, h, h, h2, h2};
        }

        public b() {
            l();
        }

        public static int g(int i, int i2, int i3) {
            return h(i, i2, i3, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                defpackage.ur.c(r4, r0, r1)
                defpackage.ur.c(r5, r0, r1)
                defpackage.ur.c(r6, r0, r1)
                defpackage.ur.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r2
                goto L21
            L1d:
                r7 = r0
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r1) goto L25
                r4 = r2
                goto L26
            L25:
                r4 = r0
            L26:
                if (r5 <= r1) goto L2a
                r5 = r2
                goto L2b
            L2a:
                r5 = r0
            L2b:
                if (r6 <= r1) goto L2e
                r0 = r2
            L2e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ni0.b.h(int, int, int, int):int");
        }

        public void a(char c) {
            if (c != '\n') {
                this.b.append(c);
                return;
            }
            this.a.add(d());
            this.b.clear();
            if (this.p != -1) {
                this.p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.r != -1) {
                this.r = 0;
            }
            if (this.t != -1) {
                this.t = 0;
            }
            while (true) {
                if ((!this.k || this.a.size() < this.j) && this.a.size() < 15) {
                    return;
                } else {
                    this.a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.b.length();
            if (length > 0) {
                this.b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ni0.a c() {
            /*
                Method dump skipped, instructions count: 193
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ni0.b.c():ni0$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.a.clear();
            this.b.clear();
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.t = -1;
            this.v = 0;
        }

        public void f(boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.c = true;
            this.d = z2;
            this.k = z3;
            this.e = i;
            this.f = z5;
            this.g = i2;
            this.h = i3;
            this.i = i6;
            int i9 = i4 + 1;
            if (this.j != i9) {
                this.j = i9;
                while (true) {
                    if ((!z3 || this.a.size() < this.j) && this.a.size() < 15) {
                        break;
                    } else {
                        this.a.remove(0);
                    }
                }
            }
            if (i7 != 0 && this.m != i7) {
                this.m = i7;
                int i10 = i7 - 1;
                q(D[i10], y, C[i10], 0, A[i10], B[i10], z[i10]);
            }
            if (i8 == 0 || this.n == i8) {
                return;
            }
            this.n = i8;
            int i11 = i8 - 1;
            m(0, 1, 1, false, false, F[i11], E[i11]);
            n(w, G[i11], x);
        }

        public boolean i() {
            return this.c;
        }

        public boolean j() {
            return !i() || (this.a.isEmpty() && this.b.length() == 0);
        }

        public boolean k() {
            return this.d;
        }

        public void l() {
            e();
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = true;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            int i = x;
            this.o = i;
            this.s = w;
            this.u = i;
        }

        public void m(int i, int i2, int i3, boolean z2, boolean z3, int i4, int i5) {
            if (this.p != -1) {
                if (!z2) {
                    this.b.setSpan(new StyleSpan(2), this.p, this.b.length(), 33);
                    this.p = -1;
                }
            } else if (z2) {
                this.p = this.b.length();
            }
            if (this.q == -1) {
                if (z3) {
                    this.q = this.b.length();
                }
            } else {
                if (z3) {
                    return;
                }
                this.b.setSpan(new UnderlineSpan(), this.q, this.b.length(), 33);
                this.q = -1;
            }
        }

        public void n(int i, int i2, int i3) {
            if (this.r != -1 && this.s != i) {
                this.b.setSpan(new ForegroundColorSpan(this.s), this.r, this.b.length(), 33);
            }
            if (i != w) {
                this.r = this.b.length();
                this.s = i;
            }
            if (this.t != -1 && this.u != i2) {
                this.b.setSpan(new BackgroundColorSpan(this.u), this.t, this.b.length(), 33);
            }
            if (i2 != x) {
                this.t = this.b.length();
                this.u = i2;
            }
        }

        public void o(int i, int i2) {
            if (this.v != i) {
                a('\n');
            }
            this.v = i;
        }

        public void p(boolean z2) {
            this.d = z2;
        }

        public void q(int i, int i2, boolean z2, int i3, int i4, int i5, int i6) {
            this.o = i;
            this.l = i6;
        }
    }

    private static final class c {
        public final int a;
        public final int b;
        public final byte[] c;
        int d = 0;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = new byte[(i2 * 2) - 1];
        }
    }

    public ni0(int i, List list) {
        this.k = i == -1 ? 1 : i;
        this.j = list != null && wm0.i(list);
        this.l = new b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.l[i2] = new b();
        }
        this.m = this.l[0];
    }

    private void A() {
        int h = b.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        int h2 = b.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        this.h.r(2);
        this.m.n(h, h2, b.g(this.h.h(2), this.h.h(2), this.h.h(2)));
    }

    private void B() {
        this.h.r(4);
        int h = this.h.h(4);
        this.h.r(2);
        this.m.o(h, this.h.h(6));
    }

    private void C() {
        int h = b.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        int h2 = this.h.h(2);
        int g = b.g(this.h.h(2), this.h.h(2), this.h.h(2));
        if (this.h.g()) {
            h2 |= 4;
        }
        boolean g2 = this.h.g();
        int h3 = this.h.h(2);
        int h4 = this.h.h(2);
        int h5 = this.h.h(2);
        this.h.r(8);
        this.m.q(h, g, g2, h2, h3, h4, h5);
    }

    private void D() {
        c cVar = this.p;
        if (cVar.d != (cVar.b * 2) - 1) {
            a84.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.b * 2) - 1) + ", but current index is " + this.p.d + " (sequence number " + this.p.a + ");");
        }
        xo5 xo5Var = this.h;
        c cVar2 = this.p;
        xo5Var.o(cVar2.c, cVar2.d);
        boolean z = false;
        while (true) {
            if (this.h.b() <= 0) {
                break;
            }
            int h = this.h.h(3);
            int h2 = this.h.h(5);
            if (h == 7) {
                this.h.r(2);
                h = this.h.h(6);
                if (h < 7) {
                    a84.j("Cea708Decoder", "Invalid extended service number: " + h);
                }
            }
            if (h2 == 0) {
                if (h != 0) {
                    a84.j("Cea708Decoder", "serviceNumber is non-zero (" + h + ") when blockSize is 0");
                }
            } else if (h != this.k) {
                this.h.s(h2);
            } else {
                int e = this.h.e() + (h2 * 8);
                while (this.h.e() < e) {
                    int h3 = this.h.h(8);
                    if (h3 == 16) {
                        int h4 = this.h.h(8);
                        if (h4 <= 31) {
                            s(h4);
                        } else {
                            if (h4 <= 127) {
                                x(h4);
                            } else if (h4 <= 159) {
                                t(h4);
                            } else if (h4 <= 255) {
                                y(h4);
                            } else {
                                a84.j("Cea708Decoder", "Invalid extended command: " + h4);
                            }
                            z = true;
                        }
                    } else if (h3 <= 31) {
                        q(h3);
                    } else {
                        if (h3 <= 127) {
                            v(h3);
                        } else if (h3 <= 159) {
                            r(h3);
                        } else if (h3 <= 255) {
                            w(h3);
                        } else {
                            a84.j("Cea708Decoder", "Invalid base command: " + h3);
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            this.n = p();
        }
    }

    private void E() {
        for (int i = 0; i < 8; i++) {
            this.l[i].l();
        }
    }

    private void o() {
        if (this.p == null) {
            return;
        }
        D();
        this.p = null;
    }

    private List p() {
        a c2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.l[i].j() && this.l[i].k() && (c2 = this.l[i].c()) != null) {
                arrayList.add(c2);
            }
        }
        Collections.sort(arrayList, a.c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((a) arrayList.get(i2)).a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void q(int i) {
        if (i != 0) {
            if (i == 3) {
                this.n = p();
            }
            if (i == 8) {
                this.m.b();
                return;
            }
            switch (i) {
                case 12:
                    E();
                    break;
                case 13:
                    this.m.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i >= 17 && i <= 23) {
                        a84.j("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        this.h.r(8);
                        break;
                    } else if (i >= 24 && i <= 31) {
                        a84.j("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        this.h.r(16);
                        break;
                    } else {
                        a84.j("Cea708Decoder", "Invalid C0 command: " + i);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void r(int i) {
        int i2 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i3 = i - 128;
                if (this.q != i3) {
                    this.q = i3;
                    this.m = this.l[i3];
                    break;
                }
                break;
            case 136:
                while (i2 <= 8) {
                    if (this.h.g()) {
                        this.l[8 - i2].e();
                    }
                    i2++;
                }
                break;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.h.g()) {
                        this.l[8 - i4].p(true);
                    }
                }
                break;
            case 138:
                while (i2 <= 8) {
                    if (this.h.g()) {
                        this.l[8 - i2].p(false);
                    }
                    i2++;
                }
                break;
            case 139:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.h.g()) {
                        this.l[8 - i5].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i2 <= 8) {
                    if (this.h.g()) {
                        this.l[8 - i2].l();
                    }
                    i2++;
                }
                break;
            case 141:
                this.h.r(8);
                break;
            case 142:
                break;
            case 143:
                E();
                break;
            case 144:
                if (this.m.i()) {
                    z();
                    break;
                } else {
                    this.h.r(16);
                    break;
                }
            case 145:
                if (this.m.i()) {
                    A();
                    break;
                } else {
                    this.h.r(24);
                    break;
                }
            case 146:
                if (this.m.i()) {
                    B();
                    break;
                } else {
                    this.h.r(16);
                    break;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                a84.j("Cea708Decoder", "Invalid C1 command: " + i);
                break;
            case 151:
                if (this.m.i()) {
                    C();
                    break;
                } else {
                    this.h.r(32);
                    break;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i6 = i - 152;
                u(i6);
                if (this.q != i6) {
                    this.q = i6;
                    this.m = this.l[i6];
                    break;
                }
                break;
        }
    }

    private void s(int i) {
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            this.h.r(8);
        } else if (i <= 23) {
            this.h.r(16);
        } else if (i <= 31) {
            this.h.r(24);
        }
    }

    private void t(int i) {
        if (i <= 135) {
            this.h.r(32);
            return;
        }
        if (i <= 143) {
            this.h.r(40);
        } else if (i <= 159) {
            this.h.r(2);
            this.h.r(this.h.h(6) * 8);
        }
    }

    private void u(int i) {
        b bVar = this.l[i];
        this.h.r(2);
        boolean g = this.h.g();
        boolean g2 = this.h.g();
        boolean g3 = this.h.g();
        int h = this.h.h(3);
        boolean g4 = this.h.g();
        int h2 = this.h.h(7);
        int h3 = this.h.h(8);
        int h4 = this.h.h(4);
        int h5 = this.h.h(4);
        this.h.r(2);
        int h6 = this.h.h(6);
        this.h.r(2);
        bVar.f(g, g2, g3, h, g4, h2, h3, h5, h6, h4, this.h.h(3), this.h.h(3));
    }

    private void v(int i) {
        if (i == 127) {
            this.m.a((char) 9835);
        } else {
            this.m.a((char) (i & 255));
        }
    }

    private void w(int i) {
        this.m.a((char) (i & 255));
    }

    private void x(int i) {
        if (i == 32) {
            this.m.a(' ');
        }
        if (i == 33) {
            this.m.a((char) 160);
            return;
        }
        if (i == 37) {
            this.m.a((char) 8230);
            return;
        }
        if (i == 42) {
            this.m.a((char) 352);
            return;
        }
        if (i == 44) {
            this.m.a((char) 338);
            return;
        }
        if (i == 63) {
            this.m.a((char) 376);
            return;
        }
        if (i == 57) {
            this.m.a((char) 8482);
            return;
        }
        if (i == 58) {
            this.m.a((char) 353);
            return;
        }
        if (i == 60) {
            this.m.a((char) 339);
            return;
        }
        if (i == 61) {
            this.m.a((char) 8480);
            return;
        }
        switch (i) {
            case 48:
                this.m.a((char) 9608);
                break;
            case 49:
                this.m.a((char) 8216);
                break;
            case 50:
                this.m.a((char) 8217);
                break;
            case 51:
                this.m.a((char) 8220);
                break;
            case 52:
                this.m.a((char) 8221);
                break;
            case BuildConfig.VERSION_CODE /* 53 */:
                this.m.a((char) 8226);
                break;
            default:
                switch (i) {
                    case 118:
                        this.m.a((char) 8539);
                        break;
                    case 119:
                        this.m.a((char) 8540);
                        break;
                    case 120:
                        this.m.a((char) 8541);
                        break;
                    case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                        this.m.a((char) 8542);
                        break;
                    case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                        this.m.a((char) 9474);
                        break;
                    case ContentType.USER_GENERATED_LIVE /* 123 */:
                        this.m.a((char) 9488);
                        break;
                    case 124:
                        this.m.a((char) 9492);
                        break;
                    case 125:
                        this.m.a((char) 9472);
                        break;
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                        this.m.a((char) 9496);
                        break;
                    case 127:
                        this.m.a((char) 9484);
                        break;
                    default:
                        a84.j("Cea708Decoder", "Invalid G2 character: " + i);
                        break;
                }
        }
    }

    private void y(int i) {
        if (i == 160) {
            this.m.a((char) 13252);
            return;
        }
        a84.j("Cea708Decoder", "Invalid G3 character: " + i);
        this.m.a('_');
    }

    private void z() {
        this.m.m(this.h.h(4), this.h.h(2), this.h.h(2), this.h.g(), this.h.g(), this.h.h(3), this.h.h(3));
    }

    @Override // defpackage.pi0, defpackage.vb8
    public /* bridge */ /* synthetic */ void a(long j) {
        super.a(j);
    }

    @Override // defpackage.pi0
    protected ub8 e() {
        List list = this.n;
        this.o = list;
        return new qi0((List) ur.e(list));
    }

    @Override // defpackage.pi0
    protected void f(yb8 yb8Var) {
        ByteBuffer byteBuffer = (ByteBuffer) ur.e(yb8Var.c);
        this.g.S(byteBuffer.array(), byteBuffer.limit());
        while (this.g.a() >= 3) {
            int H = this.g.H();
            int i = H & 3;
            boolean z = (H & 4) == 4;
            byte H2 = (byte) this.g.H();
            byte H3 = (byte) this.g.H();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        o();
                        int i2 = (H2 & 192) >> 6;
                        int i3 = this.i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            E();
                            a84.j("Cea708Decoder", "Sequence number discontinuity. previous=" + this.i + " current=" + i2);
                        }
                        this.i = i2;
                        int i4 = H2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        c cVar = new c(i2, i4);
                        this.p = cVar;
                        byte[] bArr = cVar.c;
                        int i5 = cVar.d;
                        cVar.d = i5 + 1;
                        bArr[i5] = H3;
                    } else {
                        ur.a(i == 2);
                        c cVar2 = this.p;
                        if (cVar2 == null) {
                            a84.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.c;
                            int i6 = cVar2.d;
                            int i7 = i6 + 1;
                            cVar2.d = i7;
                            bArr2[i6] = H2;
                            cVar2.d = i6 + 2;
                            bArr2[i7] = H3;
                        }
                    }
                    c cVar3 = this.p;
                    if (cVar3.d == (cVar3.b * 2) - 1) {
                        o();
                    }
                }
            }
        }
    }

    @Override // defpackage.pi0, defpackage.vc1
    public void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        E();
        this.p = null;
    }

    @Override // defpackage.pi0
    /* renamed from: g */
    public /* bridge */ /* synthetic */ yb8 d() {
        return super.d();
    }

    @Override // defpackage.pi0
    /* renamed from: h */
    public /* bridge */ /* synthetic */ zb8 b() {
        return super.b();
    }

    @Override // defpackage.pi0
    protected boolean k() {
        return this.n != this.o;
    }

    @Override // defpackage.pi0
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void c(yb8 yb8Var) {
        super.c(yb8Var);
    }

    @Override // defpackage.pi0, defpackage.vc1
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
