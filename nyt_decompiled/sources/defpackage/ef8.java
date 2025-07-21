package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public final class ef8 {
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

    public /* synthetic */ ef8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18);
    }

    public final long a() {
        return this.n;
    }

    public final long b() {
        return this.o;
    }

    public final long c() {
        return this.p;
    }

    public final long d() {
        return this.h;
    }

    public final long e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef8)) {
            return false;
        }
        ef8 ef8Var = (ef8) obj;
        return nn0.t(this.a, ef8Var.a) && nn0.t(this.b, ef8Var.b) && nn0.t(this.c, ef8Var.c) && nn0.t(this.d, ef8Var.d) && nn0.t(this.e, ef8Var.e) && nn0.t(this.f, ef8Var.f) && nn0.t(this.g, ef8Var.g) && nn0.t(this.h, ef8Var.h) && nn0.t(this.i, ef8Var.i) && nn0.t(this.j, ef8Var.j) && nn0.t(this.k, ef8Var.k) && nn0.t(this.l, ef8Var.l) && nn0.t(this.m, ef8Var.m) && nn0.t(this.n, ef8Var.n) && nn0.t(this.o, ef8Var.o) && nn0.t(this.p, ef8Var.p) && nn0.t(this.q, ef8Var.q) && nn0.t(this.r, ef8Var.r);
    }

    public final long f() {
        return this.g;
    }

    public final long g() {
        return this.a;
    }

    public final long h() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((nn0.z(this.a) * 31) + nn0.z(this.b)) * 31) + nn0.z(this.c)) * 31) + nn0.z(this.d)) * 31) + nn0.z(this.e)) * 31) + nn0.z(this.f)) * 31) + nn0.z(this.g)) * 31) + nn0.z(this.h)) * 31) + nn0.z(this.i)) * 31) + nn0.z(this.j)) * 31) + nn0.z(this.k)) * 31) + nn0.z(this.l)) * 31) + nn0.z(this.m)) * 31) + nn0.z(this.n)) * 31) + nn0.z(this.o)) * 31) + nn0.z(this.p)) * 31) + nn0.z(this.q)) * 31) + nn0.z(this.r);
    }

    public final long i() {
        return this.c;
    }

    public final long j() {
        return this.d;
    }

    public final long k() {
        return this.k;
    }

    public final long l() {
        return this.m;
    }

    public String toString() {
        return "TPLThemeColors(contentPrimary=" + nn0.A(this.a) + ", contentPrimaryDim=" + nn0.A(this.b) + ", contentSecondary=" + nn0.A(this.c) + ", contentSecondaryDim=" + nn0.A(this.d) + ", contentAccent=" + nn0.A(this.e) + ", contentAccentDim=" + nn0.A(this.f) + ", contentPositive=" + nn0.A(this.g) + ", contentNegative=" + nn0.A(this.h) + ", contentBreaking=" + nn0.A(this.i) + ", contentPlaceholder=" + nn0.A(this.j) + ", strokePrimary=" + nn0.A(this.k) + ", strokeSecondary=" + nn0.A(this.l) + ", strokeTertiary=" + nn0.A(this.m) + ", backgroundPrimary=" + nn0.A(this.n) + ", backgroundSecondary=" + nn0.A(this.o) + ", backgroundTertiary=" + nn0.A(this.p) + ", backgroundHighlight=" + nn0.A(this.q) + ", backgroundScrim=" + nn0.A(this.r) + ")";
    }

    private ef8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
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
    }

    public /* synthetic */ ef8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ff8.c(bf8.a().l()) : j, (i & 2) != 0 ? ff8.c(bf8.a().m()) : j2, (i & 4) != 0 ? ff8.c(bf8.a().n()) : j3, (i & 8) != 0 ? ff8.c(bf8.a().o()) : j4, (i & 16) != 0 ? ff8.c(bf8.a().f()) : j5, (i & 32) != 0 ? ff8.c(bf8.a().g()) : j6, (i & 64) != 0 ? ff8.c(bf8.a().k()) : j7, (i & 128) != 0 ? ff8.c(bf8.a().i()) : j8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? ff8.c(bf8.a().h()) : j9, (i & 512) != 0 ? ff8.c(bf8.a().j()) : j10, (i & 1024) != 0 ? ff8.c(bf8.a().p()) : j11, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? ff8.c(bf8.a().q()) : j12, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? ff8.c(bf8.a().r()) : j13, (i & 8192) != 0 ? ff8.c(bf8.a().b()) : j14, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? ff8.c(bf8.a().d()) : j15, (i & 32768) != 0 ? ff8.c(bf8.a().e()) : j16, (i & 65536) != 0 ? ff8.c(bf8.a().a()) : j17, (i & 131072) != 0 ? ff8.c(bf8.a().c()) : j18, null);
    }
}
