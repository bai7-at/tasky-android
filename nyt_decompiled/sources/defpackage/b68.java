package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.subauth.ui.ui.theme.ColorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes4.dex */
public final class b68 {
    private final long A;
    private final long B;
    private final long C;
    private final long D;
    private final long E;
    private final long F;
    private final long G;
    private final long H;
    private final long I;
    private final long J;
    private final long K;
    private final long L;
    private final long M;
    private final long N;
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    private final long n;
    private final long o;
    private final long p;
    private final long q;
    private final long r;
    private final long s;
    private final long t;
    private final long u;
    private final long v;
    private final long w;
    private final long x;
    private final long y;
    private final long z;

    public b68(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.p = j16;
        this.q = j17;
        this.r = j18;
        this.s = j19;
        this.t = j20;
        this.u = j21;
        this.v = j22;
        this.w = j23;
        this.x = j24;
        this.y = j25;
        this.z = j26;
        this.A = j27;
        this.B = j28;
        this.C = j29;
        this.D = j30;
        this.E = j31;
        this.F = j32;
        this.G = j33;
        this.H = j34;
        this.I = j35;
        this.J = j36;
        this.K = j37;
        this.L = j38;
        this.M = j39;
        this.N = j40;
    }

    public final long A() {
        return this.H;
    }

    public final long B() {
        return this.h;
    }

    public final long C() {
        return this.i;
    }

    public final long D() {
        return this.K;
    }

    public final long E() {
        return this.L;
    }

    public final long F() {
        return this.c;
    }

    public final long G() {
        return this.o;
    }

    public final long H() {
        return this.d;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.m;
    }

    public final long c() {
        return this.s;
    }

    public final long d() {
        return this.t;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b68)) {
            return false;
        }
        b68 b68Var = (b68) obj;
        return this.a == b68Var.a && this.b == b68Var.b && this.c == b68Var.c && this.d == b68Var.d && this.e == b68Var.e && this.f == b68Var.f && this.g == b68Var.g && this.h == b68Var.h && this.i == b68Var.i && this.j == b68Var.j && this.k == b68Var.k && this.l == b68Var.l && this.m == b68Var.m && this.n == b68Var.n && this.o == b68Var.o && this.p == b68Var.p && this.q == b68Var.q && this.r == b68Var.r && this.s == b68Var.s && this.t == b68Var.t && this.u == b68Var.u && this.v == b68Var.v && this.w == b68Var.w && this.x == b68Var.x && this.y == b68Var.y && this.z == b68Var.z && this.A == b68Var.A && this.B == b68Var.B && this.C == b68Var.C && this.D == b68Var.D && this.E == b68Var.E && this.F == b68Var.F && this.G == b68Var.G && this.H == b68Var.H && this.I == b68Var.I && this.J == b68Var.J && this.K == b68Var.K && this.L == b68Var.L && this.M == b68Var.M && this.N == b68Var.N;
    }

    public final long f() {
        return this.p;
    }

    public final long g() {
        return this.q;
    }

    public final long h() {
        return this.r;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + Long.hashCode(this.d)) * 31) + Long.hashCode(this.e)) * 31) + Long.hashCode(this.f)) * 31) + Long.hashCode(this.g)) * 31) + Long.hashCode(this.h)) * 31) + Long.hashCode(this.i)) * 31) + Long.hashCode(this.j)) * 31) + Long.hashCode(this.k)) * 31) + Long.hashCode(this.l)) * 31) + Long.hashCode(this.m)) * 31) + Long.hashCode(this.n)) * 31) + Long.hashCode(this.o)) * 31) + Long.hashCode(this.p)) * 31) + Long.hashCode(this.q)) * 31) + Long.hashCode(this.r)) * 31) + Long.hashCode(this.s)) * 31) + Long.hashCode(this.t)) * 31) + Long.hashCode(this.u)) * 31) + Long.hashCode(this.v)) * 31) + Long.hashCode(this.w)) * 31) + Long.hashCode(this.x)) * 31) + Long.hashCode(this.y)) * 31) + Long.hashCode(this.z)) * 31) + Long.hashCode(this.A)) * 31) + Long.hashCode(this.B)) * 31) + Long.hashCode(this.C)) * 31) + Long.hashCode(this.D)) * 31) + Long.hashCode(this.E)) * 31) + Long.hashCode(this.F)) * 31) + Long.hashCode(this.G)) * 31) + Long.hashCode(this.H)) * 31) + Long.hashCode(this.I)) * 31) + Long.hashCode(this.J)) * 31) + Long.hashCode(this.K)) * 31) + Long.hashCode(this.L)) * 31) + Long.hashCode(this.M)) * 31) + Long.hashCode(this.N);
    }

    public final long i() {
        return this.f;
    }

    public final long j() {
        return this.g;
    }

    public final long k() {
        return this.u;
    }

    public final long l() {
        return this.w;
    }

    public final long m() {
        return this.v;
    }

    public final long n() {
        return this.j;
    }

    public final long o() {
        return this.y;
    }

    public final long p() {
        return this.F;
    }

    public final long q() {
        return this.z;
    }

    public final long r() {
        return this.B;
    }

    public final long s() {
        return this.D;
    }

    public final long t() {
        return this.E;
    }

    public String toString() {
        return "SubauthColors(appBarColor=" + this.a + ", onAppBarColor=" + this.b + ", statusBarColor=" + this.c + ", toolbarColor=" + this.d + ", buttonBorderColor=" + this.e + ", ctaButtonBackground=" + this.f + ", ctaButtonTextColor=" + this.g + ", ssoButtonBackground=" + this.h + ", ssoButtonTextColor=" + this.i + ", disabledButtonBackgroundColor=" + this.j + ", selectedButtonBackgroundColor=" + this.k + ", linkColor=" + this.l + ", backgroundColor=" + this.m + ", surfaceColor=" + this.n + ", titleTextColor=" + this.o + ", contentPrimary=" + this.p + ", contentSecondary=" + this.q + ", contentTertiary=" + this.r + ", body1TextColor=" + this.s + ", body2TextColor=" + this.t + ", dialogBackground=" + this.u + ", dialogSemiBold=" + this.v + ", dialogContent=" + this.w + ", dialogScrim=" + this.x + ", disabledTextColor=" + this.y + ", inputBorderColor=" + this.z + ", inputBorderFocusedColor=" + this.A + ", inputBorderDisabledColor=" + this.B + ", inputPlaceholderColor=" + this.C + ", inputLabelColor=" + this.D + ", inputLabelFocusedColor=" + this.E + ", dismissDialogTextColor=" + this.F + ", dismissDialogButtonColor=" + this.G + ", snackBarTextColor=" + this.H + ", snackBarBackgroundColor=" + this.I + ", showPasswordColor=" + this.J + ", ssoDividerLineColor=" + this.K + ", ssoDividerTextColor=" + this.L + ", deleteAccountSubTitle=" + this.M + ", passwordCheckErrorColor=" + this.N + ")";
    }

    public final long u() {
        return this.C;
    }

    public final long v() {
        return this.l;
    }

    public final long w() {
        return this.b;
    }

    public final long x() {
        return this.k;
    }

    public final long y() {
        return this.J;
    }

    public final long z() {
        return this.I;
    }

    public /* synthetic */ b68(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ColorKt.C(ColorKt.o()) : j, (i & 2) != 0 ? ColorKt.C(ColorKt.b()) : j2, (i & 4) != 0 ? ColorKt.C(ColorKt.o()) : j3, (i & 8) != 0 ? ColorKt.C(ColorKt.a()) : j4, (i & 16) != 0 ? ColorKt.C(ColorKt.k()) : j5, (i & 32) != 0 ? ColorKt.C(ColorKt.a()) : j6, (i & 64) != 0 ? ColorKt.C(nn0.b.h()) : j7, (i & 128) != 0 ? ColorKt.C(nn0.b.h()) : j8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? ColorKt.C(ColorKt.a()) : j9, (i & 512) != 0 ? ColorKt.C(ColorKt.h()) : j10, (i & 1024) != 0 ? ColorKt.C(ColorKt.m()) : j11, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? ColorKt.C(ColorKt.a()) : j12, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? ColorKt.C(nn0.b.h()) : j13, (i & 8192) != 0 ? ColorKt.C(nn0.b.h()) : j14, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? ColorKt.C(ColorKt.a()) : j15, (i & 32768) != 0 ? ColorKt.C(ColorKt.a()) : j16, (i & 65536) != 0 ? ColorKt.C(ColorKt.g()) : j17, (i & 131072) != 0 ? ColorKt.C(ColorKt.n()) : j18, (i & 262144) != 0 ? ColorKt.C(ColorKt.a()) : j19, (i & 524288) != 0 ? ColorKt.C(ColorKt.j()) : j20, (i & Constants.MB) != 0 ? ColorKt.C(nn0.b.h()) : j21, (i & 2097152) != 0 ? ColorKt.C(ColorKt.a()) : j22, (i & 4194304) != 0 ? ColorKt.C(ColorKt.i()) : j23, (i & 8388608) != 0 ? ColorKt.C(ColorKt.p()) : j24, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? ColorKt.C(ColorKt.u()) : j25, (i & 33554432) != 0 ? ColorKt.C(ColorKt.q()) : j26, (i & 67108864) != 0 ? ColorKt.C(ColorKt.s()) : j27, (i & 134217728) != 0 ? ColorKt.C(ColorKt.r()) : j28, (i & 268435456) != 0 ? ColorKt.C(ColorKt.w()) : j29, (i & 536870912) != 0 ? ColorKt.C(ColorKt.t()) : j30, (i & 1073741824) != 0 ? ColorKt.C(ColorKt.v()) : j31, (i & RecyclerView.UNDEFINED_DURATION) != 0 ? ColorKt.C(ColorKt.f()) : j32, (i2 & 1) != 0 ? ColorKt.C(ColorKt.e()) : j33, (i2 & 2) != 0 ? ColorKt.C(ColorKt.o()) : j34, (i2 & 4) != 0 ? ColorKt.C(ColorKt.d()) : j35, (i2 & 8) != 0 ? ColorKt.C(ColorKt.a()) : j36, (i2 & 16) != 0 ? ColorKt.C(ColorKt.l()) : j37, (i2 & 32) != 0 ? ColorKt.C(ColorKt.j()) : j38, (i2 & 64) != 0 ? ColorKt.C(ColorKt.a()) : j39, (i2 & 128) != 0 ? ColorKt.C(ColorKt.y()) : j40);
    }
}
