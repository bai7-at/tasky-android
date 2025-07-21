package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.designsystem.uicompose.ui.HomeDesignSystemColor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes4.dex */
public final class lb5 {
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
    private final long O;
    private final long P;
    private final long Q;
    private final long R;
    private final long S;
    private final long T;
    private final long U;
    private final long V;
    private final long W;
    private final long X;
    private final long Y;
    private final long Z;
    private final long a;
    private final long a0;
    private final long b;
    private final long b0;
    private final long c;
    private final long c0;
    private final long d;
    private final long d0;
    private final long e;
    private final long e0;
    private final long f;
    private final long f0;
    private final long g;
    private final long g0;
    private final long h;
    private final long h0;
    private final long i;
    private final long i0;
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

    public /* synthetic */ lb5(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61);
    }

    public final long A() {
        return this.e;
    }

    public final long B() {
        return this.h;
    }

    public final long C() {
        return this.i;
    }

    public final long D() {
        return this.g0;
    }

    public final long E() {
        return this.i0;
    }

    public final long F() {
        return this.f0;
    }

    public final long G() {
        return this.h0;
    }

    public final long H() {
        return this.W;
    }

    public final long I() {
        return this.a;
    }

    public final long J() {
        return this.A;
    }

    public final long K() {
        return this.y;
    }

    public final long L() {
        return this.P;
    }

    public final long M() {
        return this.Q;
    }

    public final long N() {
        return this.z;
    }

    public final long O() {
        return this.O;
    }

    public final long P() {
        return this.C;
    }

    public final long Q() {
        return this.R;
    }

    public final long R() {
        return this.S;
    }

    public final long S() {
        return this.B;
    }

    public final long T() {
        return this.X;
    }

    public final long U() {
        return this.w;
    }

    public final long V() {
        return this.p;
    }

    public final long W() {
        return this.V;
    }

    public final long X() {
        return this.v;
    }

    public final long Y() {
        return this.N;
    }

    public final long Z() {
        return this.b;
    }

    public final long a() {
        return this.F;
    }

    public final long a0() {
        return this.j;
    }

    public final long b() {
        return this.G;
    }

    public final long c() {
        return this.I;
    }

    public final long d() {
        return this.H;
    }

    public final long e() {
        return this.o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb5)) {
            return false;
        }
        lb5 lb5Var = (lb5) obj;
        return nn0.t(this.a, lb5Var.a) && nn0.t(this.b, lb5Var.b) && nn0.t(this.c, lb5Var.c) && nn0.t(this.d, lb5Var.d) && nn0.t(this.e, lb5Var.e) && nn0.t(this.f, lb5Var.f) && nn0.t(this.g, lb5Var.g) && nn0.t(this.h, lb5Var.h) && nn0.t(this.i, lb5Var.i) && nn0.t(this.j, lb5Var.j) && nn0.t(this.k, lb5Var.k) && nn0.t(this.l, lb5Var.l) && nn0.t(this.m, lb5Var.m) && nn0.t(this.n, lb5Var.n) && nn0.t(this.o, lb5Var.o) && nn0.t(this.p, lb5Var.p) && nn0.t(this.q, lb5Var.q) && nn0.t(this.r, lb5Var.r) && nn0.t(this.s, lb5Var.s) && nn0.t(this.t, lb5Var.t) && nn0.t(this.u, lb5Var.u) && nn0.t(this.v, lb5Var.v) && nn0.t(this.w, lb5Var.w) && nn0.t(this.x, lb5Var.x) && nn0.t(this.y, lb5Var.y) && nn0.t(this.z, lb5Var.z) && nn0.t(this.A, lb5Var.A) && nn0.t(this.B, lb5Var.B) && nn0.t(this.C, lb5Var.C) && nn0.t(this.D, lb5Var.D) && nn0.t(this.E, lb5Var.E) && nn0.t(this.F, lb5Var.F) && nn0.t(this.G, lb5Var.G) && nn0.t(this.H, lb5Var.H) && nn0.t(this.I, lb5Var.I) && nn0.t(this.J, lb5Var.J) && nn0.t(this.K, lb5Var.K) && nn0.t(this.L, lb5Var.L) && nn0.t(this.M, lb5Var.M) && nn0.t(this.N, lb5Var.N) && nn0.t(this.O, lb5Var.O) && nn0.t(this.P, lb5Var.P) && nn0.t(this.Q, lb5Var.Q) && nn0.t(this.R, lb5Var.R) && nn0.t(this.S, lb5Var.S) && nn0.t(this.T, lb5Var.T) && nn0.t(this.U, lb5Var.U) && nn0.t(this.V, lb5Var.V) && nn0.t(this.W, lb5Var.W) && nn0.t(this.X, lb5Var.X) && nn0.t(this.Y, lb5Var.Y) && nn0.t(this.Z, lb5Var.Z) && nn0.t(this.a0, lb5Var.a0) && nn0.t(this.b0, lb5Var.b0) && nn0.t(this.c0, lb5Var.c0) && nn0.t(this.d0, lb5Var.d0) && nn0.t(this.e0, lb5Var.e0) && nn0.t(this.f0, lb5Var.f0) && nn0.t(this.g0, lb5Var.g0) && nn0.t(this.h0, lb5Var.h0) && nn0.t(this.i0, lb5Var.i0);
    }

    public final long f() {
        return this.n;
    }

    public final long g() {
        return this.M;
    }

    public final long h() {
        return this.K;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((nn0.z(this.a) * 31) + nn0.z(this.b)) * 31) + nn0.z(this.c)) * 31) + nn0.z(this.d)) * 31) + nn0.z(this.e)) * 31) + nn0.z(this.f)) * 31) + nn0.z(this.g)) * 31) + nn0.z(this.h)) * 31) + nn0.z(this.i)) * 31) + nn0.z(this.j)) * 31) + nn0.z(this.k)) * 31) + nn0.z(this.l)) * 31) + nn0.z(this.m)) * 31) + nn0.z(this.n)) * 31) + nn0.z(this.o)) * 31) + nn0.z(this.p)) * 31) + nn0.z(this.q)) * 31) + nn0.z(this.r)) * 31) + nn0.z(this.s)) * 31) + nn0.z(this.t)) * 31) + nn0.z(this.u)) * 31) + nn0.z(this.v)) * 31) + nn0.z(this.w)) * 31) + nn0.z(this.x)) * 31) + nn0.z(this.y)) * 31) + nn0.z(this.z)) * 31) + nn0.z(this.A)) * 31) + nn0.z(this.B)) * 31) + nn0.z(this.C)) * 31) + nn0.z(this.D)) * 31) + nn0.z(this.E)) * 31) + nn0.z(this.F)) * 31) + nn0.z(this.G)) * 31) + nn0.z(this.H)) * 31) + nn0.z(this.I)) * 31) + nn0.z(this.J)) * 31) + nn0.z(this.K)) * 31) + nn0.z(this.L)) * 31) + nn0.z(this.M)) * 31) + nn0.z(this.N)) * 31) + nn0.z(this.O)) * 31) + nn0.z(this.P)) * 31) + nn0.z(this.Q)) * 31) + nn0.z(this.R)) * 31) + nn0.z(this.S)) * 31) + nn0.z(this.T)) * 31) + nn0.z(this.U)) * 31) + nn0.z(this.V)) * 31) + nn0.z(this.W)) * 31) + nn0.z(this.X)) * 31) + nn0.z(this.Y)) * 31) + nn0.z(this.Z)) * 31) + nn0.z(this.a0)) * 31) + nn0.z(this.b0)) * 31) + nn0.z(this.c0)) * 31) + nn0.z(this.d0)) * 31) + nn0.z(this.e0)) * 31) + nn0.z(this.f0)) * 31) + nn0.z(this.g0)) * 31) + nn0.z(this.h0)) * 31) + nn0.z(this.i0);
    }

    public final long i() {
        return this.L;
    }

    public final long j() {
        return this.J;
    }

    public final long k() {
        return this.l;
    }

    public final long l() {
        return this.r;
    }

    public final long m() {
        return this.u;
    }

    public final long n() {
        return this.b0;
    }

    public final long o() {
        return this.s;
    }

    public final long p() {
        return this.U;
    }

    public final long q() {
        return this.D;
    }

    public final long r() {
        return this.x;
    }

    public final long s() {
        return this.a0;
    }

    public final long t() {
        return this.t;
    }

    public String toString() {
        return "NytThemeColors(permaWhite=" + nn0.A(this.a) + ", times_black=" + nn0.A(this.b) + ", gray55=" + nn0.A(this.c) + ", gray66=" + nn0.A(this.d) + ", gray88=" + nn0.A(this.e) + ", grayB3=" + nn0.A(this.f) + ", grayCC=" + nn0.A(this.g) + ", grayE2=" + nn0.A(this.h) + ", grayF7=" + nn0.A(this.i) + ", times_white=" + nn0.A(this.j) + ", opinion=" + nn0.A(this.k) + ", blue30=" + nn0.A(this.l) + ", developing=" + nn0.A(this.m) + ", background_primary_inverse=" + nn0.A(this.n) + ", background_primary_alwaysDark=" + nn0.A(this.o) + ", stroke_secondary=" + nn0.A(this.p) + ", gray10=" + nn0.A(this.q) + ", content_primary=" + nn0.A(this.r) + ", content_primary_inverse=" + nn0.A(this.s) + ", content_secondary_inverse=" + nn0.A(this.t) + ", content_primary_alwaysDark=" + nn0.A(this.u) + ", text_primary=" + nn0.A(this.v) + ", stroke_quaternary=" + nn0.A(this.w) + ", content_secondary=" + nn0.A(this.x) + ", signal_breaking=" + nn0.A(this.y) + ", signal_highlight=" + nn0.A(this.z) + ", signal_accent=" + nn0.A(this.A) + ", stroke_primary=" + nn0.A(this.B) + ", signal_positive=" + nn0.A(this.C) + ", content_quintary=" + nn0.A(this.D) + ", content_quintary_inverse=" + nn0.A(this.E) + ", background_elevated=" + nn0.A(this.F) + ", background_elevated_inverse=" + nn0.A(this.G) + ", background_primary=" + nn0.A(this.H) + ", background_overlay=" + nn0.A(this.I) + ", background_tertiary=" + nn0.A(this.J) + ", background_secondary=" + nn0.A(this.K) + ", background_secondary_inverse=" + nn0.A(this.L) + ", background_quaternary=" + nn0.A(this.M) + ", text_primary_inverse=" + nn0.A(this.N) + ", signal_negative=" + nn0.A(this.O) + ", signal_editorial=" + nn0.A(this.P) + ", signal_editorial_alwaysLight=" + nn0.A(this.Q) + ", static_gray_100=" + nn0.A(this.R) + ", static_white=" + nn0.A(this.S) + ", content_tertiary=" + nn0.A(this.T) + ", content_quaternary=" + nn0.A(this.U) + ", stroke_tertiary=" + nn0.A(this.V) + ", opinion_gray=" + nn0.A(this.W) + ", stroke_primary_inverse=" + nn0.A(this.X) + ", empty_view_background=" + nn0.A(this.Y) + ", tooltip_background=" + nn0.A(this.Z) + ", content_secondary_alwaysLight=" + nn0.A(this.a0) + ", content_primary_alwaysLight=" + nn0.A(this.b0) + ", background_primary_alwaysLight=" + nn0.A(this.c0) + ", games_card_stroke=" + nn0.A(this.d0) + ", games_button_transparency=" + nn0.A(this.e0) + ", notifications_switch_track_active=" + nn0.A(this.f0) + ", notifications_switch_thumb_active=" + nn0.A(this.g0) + ", notifications_switch_track_inactive=" + nn0.A(this.h0) + ", notifications_switch_thumb_inactive=" + nn0.A(this.i0) + ")";
    }

    public final long u() {
        return this.T;
    }

    public final long v() {
        return this.m;
    }

    public final long w() {
        return this.Y;
    }

    public final long x() {
        return this.q;
    }

    public final long y() {
        return this.c;
    }

    public final long z() {
        return this.d;
    }

    private lb5(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61) {
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
        this.O = j41;
        this.P = j42;
        this.Q = j43;
        this.R = j44;
        this.S = j45;
        this.T = j46;
        this.U = j47;
        this.V = j48;
        this.W = j49;
        this.X = j50;
        this.Y = j51;
        this.Z = j52;
        this.a0 = j53;
        this.b0 = j54;
        this.c0 = j55;
        this.d0 = j56;
        this.e0 = j57;
        this.f0 = j58;
        this.g0 = j59;
        this.h0 = j60;
        this.i0 = j61;
    }

    public /* synthetic */ lb5(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? mb5.d(nt5.a().s()) : j, (i & 2) != 0 ? mb5.d(nt5.a().r()) : j2, (i & 4) != 0 ? mb5.e(HomeDesignSystemColor.gray55) : j3, (i & 8) != 0 ? mb5.e(HomeDesignSystemColor.gray66) : j4, (i & 16) != 0 ? mb5.e(HomeDesignSystemColor.gray88) : j5, (i & 32) != 0 ? mb5.e(HomeDesignSystemColor.grayB3) : j6, (i & 64) != 0 ? mb5.e(HomeDesignSystemColor.grayCC) : j7, (i & 128) != 0 ? mb5.e(HomeDesignSystemColor.grayE2) : j8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? mb5.e(HomeDesignSystemColor.grayF7) : j9, (i & 512) != 0 ? mb5.e(HomeDesignSystemColor.times_white) : j10, (i & 1024) != 0 ? mb5.e(HomeDesignSystemColor.opinion) : j11, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? mb5.e(HomeDesignSystemColor.blue30) : j12, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? mb5.e(HomeDesignSystemColor.developing) : j13, (i & 8192) != 0 ? mb5.d(nt5.a().b().d()) : j14, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? mb5.d(nt5.a().b().a()) : j15, (i & 32768) != 0 ? mb5.d(nt5.a().v()) : j16, (i & 65536) != 0 ? mb5.d(nt5.a().f()) : j17, (i & 131072) != 0 ? mb5.d(nt5.a().f()) : j18, (i & 262144) != 0 ? mb5.d(nt5.a().f().d()) : j19, (i & 524288) != 0 ? mb5.d(nt5.a().i().d()) : j20, (i & Constants.MB) != 0 ? mb5.d(nt5.a().f().a()) : j21, (i & 2097152) != 0 ? mb5.d(nt5.a().b().d()) : j22, (i & 4194304) != 0 ? mb5.d(nt5.a().u()) : j23, (i & 8388608) != 0 ? mb5.d(nt5.a().i()) : j24, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? mb5.d(nt5.a().m()) : j25, (i & 33554432) != 0 ? mb5.d(nt5.a().o()) : j26, (i & 67108864) != 0 ? mb5.d(nt5.a().l()) : j27, (i & 134217728) != 0 ? mb5.d(nt5.a().t()) : j28, (i & 268435456) != 0 ? mb5.d(nt5.a().q()) : j29, (i & 536870912) != 0 ? mb5.d(nt5.a().h()) : j30, (i & 1073741824) != 0 ? mb5.d(nt5.a().h().d()) : j31, (i & RecyclerView.UNDEFINED_DURATION) != 0 ? mb5.d(nt5.a().a()) : j32, (i2 & 1) != 0 ? mb5.d(nt5.a().a().d()) : j33, (i2 & 2) != 0 ? mb5.d(nt5.a().b()) : j34, (i2 & 4) != 0 ? nn0.r(mb5.d(nt5.a().k()), 0.5f, 0.0f, 0.0f, 0.0f, 14, null) : j35, (i2 & 8) != 0 ? mb5.d(nt5.a().e()) : j36, (i2 & 16) != 0 ? mb5.d(nt5.a().d()) : j37, (i2 & 32) != 0 ? mb5.d(nt5.a().d().d()) : j38, (i2 & 64) != 0 ? mb5.d(nt5.a().c()) : j39, (i2 & 128) != 0 ? mb5.d(nt5.a().b()) : j40, (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? mb5.d(nt5.a().p()) : j41, (i2 & 512) != 0 ? mb5.d(nt5.a().n()) : j42, (i2 & 1024) != 0 ? mb5.d(nt5.a().n().b()) : j43, (i2 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? mb5.d(nt5.a().r()) : j44, (i2 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? mb5.d(nt5.a().s()) : j45, (i2 & 8192) != 0 ? mb5.d(nt5.a().j()) : j46, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? mb5.d(nt5.a().g()) : j47, (i2 & 32768) != 0 ? mb5.d(nt5.a().w()) : j48, (i2 & 65536) != 0 ? mb5.e(HomeDesignSystemColor.opinion) : j49, (i2 & 131072) != 0 ? mb5.d(nt5.a().t().d()) : j50, (i2 & 262144) != 0 ? mb5.e(HomeDesignSystemColor.grayF7) : j51, (i2 & 524288) != 0 ? mb5.d(nt5.a().l()) : j52, (i2 & Constants.MB) != 0 ? mb5.d(nt5.a().i().b()) : j53, (i2 & 2097152) != 0 ? mb5.d(nt5.a().f()) : j54, (4194304 & i2) != 0 ? mb5.d(nt5.a().b()) : j55, (8388608 & i2) != 0 ? mb5.d(nt5.a().t()) : j56, (16777216 & i2) != 0 ? mb5.d(nt5.a().f()) : j57, (33554432 & i2) != 0 ? mb5.d(nt5.a().n()) : j58, (67108864 & i2) != 0 ? mb5.d(nt5.a().n()) : j59, (134217728 & i2) != 0 ? mb5.d(nt5.a().h()) : j60, (268435456 & i2) != 0 ? mb5.d(nt5.a().e()) : j61, null);
    }
}
