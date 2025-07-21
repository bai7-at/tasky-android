package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import defpackage.y31;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public final class li0 extends pi0 {
    private final int h;
    private final int i;
    private final int j;
    private final long k;
    private List n;
    private List o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private byte t;
    private byte u;
    private boolean w;
    private long x;
    private static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, ContentType.SHORT_FORM_ON_DEMAND, ContentType.LONG_FORM_ON_DEMAND, ContentType.LIVE, 114, 115, 116, 117, 118, 119, 120, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL, 247, 209, 241, 9632};
    private static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, 226, AdvertisementType.BRANDED_AS_CONTENT, 238, 244, 251};
    private static final int[] D = {193, 201, AdvertisementType.ON_DEMAND_PRE_ROLL, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, ContentType.BUMPER, 200, 202, 203, AdvertisementType.BRANDED_DURING_LIVE, 206, 207, 239, AdvertisementType.ON_DEMAND_MID_ROLL, 217, 249, 219, 171, 187};
    private static final int[] E = {195, 227, 205, 204, 236, 210, 242, AdvertisementType.ON_DEMAND_POST_ROLL, 245, ContentType.USER_GENERATED_LIVE, 125, 92, 94, 95, 124, WebSocketProtocol.PAYLOAD_SHORT, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final yo5 g = new yo5();
    private final ArrayList l = new ArrayList();
    private a m = new a(0, 4);
    private int v = 0;

    private static final class a {
        private final List a = new ArrayList();
        private final List b = new ArrayList();
        private final StringBuilder c = new StringBuilder();
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;

        /* renamed from: li0$a$a, reason: collision with other inner class name */
        private static class C0505a {
            public final int a;
            public final boolean b;
            public int c;

            public C0505a(int i, boolean z, int i2) {
                this.a = i;
                this.b = z;
                this.c = i2;
            }
        }

        public a(int i, int i2) {
            j(i);
            this.h = i2;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 < this.a.size()) {
                C0505a c0505a = (C0505a) this.a.get(i5);
                boolean z2 = c0505a.b;
                int i7 = c0505a.a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = li0.A[i7];
                    }
                    z = z3;
                }
                int i8 = c0505a.c;
                i5++;
                if (i8 != (i5 < this.a.size() ? ((C0505a) this.a.get(i5)).c : length)) {
                    if (i != -1 && !z2) {
                        q(spannableStringBuilder, i, i8);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        o(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        n(spannableStringBuilder, i6, i8, i3);
                        i3 = i4;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                q(spannableStringBuilder, i, length);
            }
            if (i2 != -1 && i2 != length) {
                o(spannableStringBuilder, i2, length);
            }
            if (i6 != length) {
                n(spannableStringBuilder, i6, length, i3);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        public void e(char c) {
            if (this.c.length() < 32) {
                this.c.append(c);
            }
        }

        public void f() {
            int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                for (int size = this.a.size() - 1; size >= 0; size--) {
                    C0505a c0505a = (C0505a) this.a.get(size);
                    int i = c0505a.c;
                    if (i != length) {
                        return;
                    }
                    c0505a.c = i - 1;
                }
            }
        }

        public y31 g(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.b.get(i2));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.e + this.f;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.g != 2 || i4 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i5 = this.d;
            if (i5 > 7) {
                i5 -= 17;
            } else if (this.g == 1) {
                i5 -= this.h - 1;
            }
            return new y31.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i5, 1).k(f).l(i).a();
        }

        public boolean i() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }

        public void j(int i) {
            this.g = i;
            this.a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public void k() {
            this.b.add(h());
            this.c.setLength(0);
            this.a.clear();
            int min = Math.min(this.h, this.d);
            while (this.b.size() >= min) {
                this.b.remove(0);
            }
        }

        public void l(int i) {
            this.g = i;
        }

        public void m(int i) {
            this.h = i;
        }

        public void p(int i, boolean z) {
            this.a.add(new C0505a(i, z, this.c.length()));
        }
    }

    public li0(String str, int i, long j) {
        this.k = j > 0 ? j * 1000 : -9223372036854775807L;
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.j = 0;
            this.i = 0;
        } else if (i == 2) {
            this.j = 1;
            this.i = 0;
        } else if (i == 3) {
            this.j = 0;
            this.i = 1;
        } else if (i != 4) {
            a84.j("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.j = 0;
            this.i = 0;
        } else {
            this.j = 1;
            this.i = 1;
        }
        M(0);
        L();
        this.w = true;
        this.x = -9223372036854775807L;
    }

    private static boolean A(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    private static boolean B(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    private static boolean C(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    private static boolean D(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    private static boolean E(byte b) {
        return (b & 240) == 16;
    }

    private boolean F(boolean z2, byte b, byte b2) {
        if (!z2 || !E(b)) {
            this.s = false;
        } else {
            if (this.s && this.t == b && this.u == b2) {
                this.s = false;
                return true;
            }
            this.s = true;
            this.t = b;
            this.u = b2;
        }
        return false;
    }

    private static boolean G(byte b) {
        return (b & 246) == 20;
    }

    private static boolean H(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    private static boolean I(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    private static boolean J(byte b) {
        return 1 <= b && b <= 15;
    }

    private void K(byte b, byte b2) {
        if (J(b)) {
            this.w = false;
            return;
        }
        if (G(b)) {
            if (b2 != 32 && b2 != 47) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 42:
                            case 43:
                                this.w = false;
                                break;
                        }
                }
            }
            this.w = true;
        }
    }

    private void L() {
        this.m.j(this.p);
        this.l.clear();
        this.l.add(this.m);
    }

    private void M(int i) {
        int i2 = this.p;
        if (i2 == i) {
            return;
        }
        this.p = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                ((a) this.l.get(i3)).l(i);
            }
            return;
        }
        L();
        if (i2 == 3 || i == 1 || i == 0) {
            this.n = Collections.emptyList();
        }
    }

    private void N(int i) {
        this.q = i;
        this.m.m(i);
    }

    private boolean O() {
        return (this.k == -9223372036854775807L || this.x == -9223372036854775807L || j() - this.x < this.k) ? false : true;
    }

    private boolean P(byte b) {
        if (z(b)) {
            this.v = q(b);
        }
        return this.v == this.j;
    }

    private static char p(byte b) {
        return (char) B[(b & Byte.MAX_VALUE) - 32];
    }

    private static int q(byte b) {
        return (b >> 3) & 1;
    }

    private List r() {
        int size = this.l.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            y31 g = ((a) this.l.get(i2)).g(RecyclerView.UNDEFINED_DURATION);
            arrayList.add(g);
            if (g != null) {
                i = Math.min(i, g.i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            y31 y31Var = (y31) arrayList.get(i3);
            if (y31Var != null) {
                if (y31Var.i != i) {
                    y31Var = (y31) ur.e(((a) this.l.get(i3)).g(i));
                }
                arrayList2.add(y31Var);
            }
        }
        return arrayList2;
    }

    private static char s(byte b) {
        return (char) D[b & 31];
    }

    private static char t(byte b) {
        return (char) E[b & 31];
    }

    private static char u(byte b, byte b2) {
        return (b & 1) == 0 ? s(b2) : t(b2);
    }

    private static char v(byte b) {
        return (char) C[b & 15];
    }

    private void w(byte b) {
        this.m.e(' ');
        this.m.p((b >> 1) & 7, (b & 1) == 1);
    }

    private void x(byte b) {
        if (b == 32) {
            M(2);
            return;
        }
        if (b == 41) {
            M(3);
            return;
        }
        switch (b) {
            case 37:
                M(1);
                N(2);
                break;
            case 38:
                M(1);
                N(3);
                break;
            case 39:
                M(1);
                N(4);
                break;
            default:
                int i = this.p;
                if (i != 0) {
                    if (b == 33) {
                        this.m.f();
                        break;
                    } else {
                        switch (b) {
                            case 44:
                                this.n = Collections.emptyList();
                                int i2 = this.p;
                                if (i2 == 1 || i2 == 3) {
                                    L();
                                    break;
                                }
                            case 45:
                                if (i == 1 && !this.m.i()) {
                                    this.m.k();
                                    break;
                                }
                                break;
                            case 46:
                                L();
                                break;
                            case 47:
                                this.n = r();
                                L();
                                break;
                        }
                    }
                }
                break;
        }
    }

    private void y(byte b, byte b2) {
        int i = y[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.m.d) {
            if (this.p != 1 && !this.m.i()) {
                a aVar = new a(this.p, this.q);
                this.m = aVar;
                this.l.add(aVar);
            }
            this.m.d = i;
        }
        boolean z2 = (b2 & 16) == 16;
        boolean z3 = (b2 & 1) == 1;
        int i2 = (b2 >> 1) & 7;
        this.m.p(z2 ? 8 : i2, z3);
        if (z2) {
            this.m.e = z[i2];
        }
    }

    private static boolean z(byte b) {
        return (b & 224) == 0;
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017 A[SYNTHETIC] */
    @Override // defpackage.pi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void f(defpackage.yb8 r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li0.f(yb8):void");
    }

    @Override // defpackage.pi0, defpackage.vc1
    public void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        M(0);
        N(4);
        L();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // defpackage.pi0
    /* renamed from: g */
    public /* bridge */ /* synthetic */ yb8 d() {
        return super.d();
    }

    @Override // defpackage.pi0, defpackage.vc1
    /* renamed from: h */
    public zb8 b() {
        zb8 i;
        zb8 b = super.b();
        if (b != null) {
            return b;
        }
        if (!O() || (i = i()) == null) {
            return null;
        }
        this.n = Collections.emptyList();
        this.x = -9223372036854775807L;
        i.t(j(), e(), Long.MAX_VALUE);
        return i;
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
    public void release() {
    }
}
