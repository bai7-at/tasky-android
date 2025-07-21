package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import defpackage.bu1;
import defpackage.go0;
import defpackage.m76;
import defpackage.nn0;
import defpackage.pn0;
import defpackage.qs2;
import defpackage.wn0;
import defpackage.xn0;
import defpackage.zf4;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public abstract class ColorSchemeKt {
    private static final m76 a = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final go0 mo865invoke() {
            return ColorSchemeKt.l(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    });
    private static final m76 b = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.material3.ColorSchemeKt$LocalTonalElevationEnabled$1
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Boolean mo865invoke() {
            return Boolean.TRUE;
        }
    });

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            a = iArr;
        }
    }

    public static final long a(go0 go0Var, long j, float f, Composer composer, int i) {
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1610977682, i, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:841)");
        }
        boolean booleanValue = ((Boolean) composer.m(b)).booleanValue();
        if (nn0.t(j, go0Var.C()) && booleanValue) {
            j = o(go0Var, f);
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        return j;
    }

    public static final long b(go0 go0Var, long j) {
        if (nn0.t(j, go0Var.x())) {
            return go0Var.n();
        }
        if (nn0.t(j, go0Var.A())) {
            return go0Var.p();
        }
        if (nn0.t(j, go0Var.M())) {
            return go0Var.t();
        }
        if (nn0.t(j, go0Var.a())) {
            return go0Var.k();
        }
        if (nn0.t(j, go0Var.f())) {
            return go0Var.l();
        }
        if (nn0.t(j, go0Var.y())) {
            return go0Var.o();
        }
        if (nn0.t(j, go0Var.B())) {
            return go0Var.q();
        }
        if (nn0.t(j, go0Var.N())) {
            return go0Var.u();
        }
        if (nn0.t(j, go0Var.g())) {
            return go0Var.m();
        }
        if (nn0.t(j, go0Var.j())) {
            return go0Var.h();
        }
        if (nn0.t(j, go0Var.C())) {
            return go0Var.r();
        }
        if (nn0.t(j, go0Var.L())) {
            return go0Var.s();
        }
        if (!nn0.t(j, go0Var.D()) && !nn0.t(j, go0Var.E()) && !nn0.t(j, go0Var.F()) && !nn0.t(j, go0Var.G()) && !nn0.t(j, go0Var.H()) && !nn0.t(j, go0Var.I())) {
            return nn0.b.g();
        }
        return go0Var.r();
    }

    public static final long c(long j, Composer composer, int i) {
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:823)");
        }
        long b2 = b(zf4.a.a(composer, 6), j);
        if (b2 == nn0.b.g()) {
            b2 = ((nn0) composer.m(ContentColorKt.a())).B();
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        return b2;
    }

    public static final go0 d(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return new go0(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, null);
    }

    public static /* synthetic */ go0 e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, Object obj) {
        long t = (i & 1) != 0 ? pn0.a.t() : j;
        return d(t, (i & 2) != 0 ? pn0.a.j() : j2, (i & 4) != 0 ? pn0.a.u() : j3, (i & 8) != 0 ? pn0.a.k() : j4, (i & 16) != 0 ? pn0.a.e() : j5, (i & 32) != 0 ? pn0.a.w() : j6, (i & 64) != 0 ? pn0.a.l() : j7, (i & 128) != 0 ? pn0.a.x() : j8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? pn0.a.m() : j9, (i & 512) != 0 ? pn0.a.H() : j10, (i & 1024) != 0 ? pn0.a.p() : j11, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? pn0.a.I() : j12, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? pn0.a.q() : j13, (i & 8192) != 0 ? pn0.a.a() : j14, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? pn0.a.g() : j15, (i & 32768) != 0 ? pn0.a.y() : j16, (i & 65536) != 0 ? pn0.a.n() : j17, (i & 131072) != 0 ? pn0.a.G() : j18, (i & 262144) != 0 ? pn0.a.o() : j19, (i & 524288) != 0 ? t : j20, (i & Constants.MB) != 0 ? pn0.a.f() : j21, (i & 2097152) != 0 ? pn0.a.d() : j22, (i & 4194304) != 0 ? pn0.a.b() : j23, (i & 8388608) != 0 ? pn0.a.h() : j24, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? pn0.a.c() : j25, (i & 33554432) != 0 ? pn0.a.i() : j26, (i & 67108864) != 0 ? pn0.a.r() : j27, (i & 134217728) != 0 ? pn0.a.s() : j28, (i & 268435456) != 0 ? pn0.a.v() : j29, (i & 536870912) != 0 ? pn0.a.z() : j30, (i & 1073741824) != 0 ? pn0.a.A() : j31, (i & RecyclerView.UNDEFINED_DURATION) != 0 ? pn0.a.B() : j32, (i2 & 1) != 0 ? pn0.a.C() : j33, (i2 & 2) != 0 ? pn0.a.D() : j34, (i2 & 4) != 0 ? pn0.a.E() : j35, (i2 & 8) != 0 ? pn0.a.F() : j36);
    }

    public static final /* synthetic */ go0 f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return e(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    public static /* synthetic */ go0 g(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long t = (i & 1) != 0 ? pn0.a.t() : j;
        return f(t, (i & 2) != 0 ? pn0.a.j() : j2, (i & 4) != 0 ? pn0.a.u() : j3, (i & 8) != 0 ? pn0.a.k() : j4, (i & 16) != 0 ? pn0.a.e() : j5, (i & 32) != 0 ? pn0.a.w() : j6, (i & 64) != 0 ? pn0.a.l() : j7, (i & 128) != 0 ? pn0.a.x() : j8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? pn0.a.m() : j9, (i & 512) != 0 ? pn0.a.H() : j10, (i & 1024) != 0 ? pn0.a.p() : j11, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? pn0.a.I() : j12, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? pn0.a.q() : j13, (i & 8192) != 0 ? pn0.a.a() : j14, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? pn0.a.g() : j15, (i & 32768) != 0 ? pn0.a.y() : j16, (i & 65536) != 0 ? pn0.a.n() : j17, (i & 131072) != 0 ? pn0.a.G() : j18, (i & 262144) != 0 ? pn0.a.o() : j19, (i & 524288) != 0 ? t : j20, (i & Constants.MB) != 0 ? pn0.a.f() : j21, (i & 2097152) != 0 ? pn0.a.d() : j22, (i & 4194304) != 0 ? pn0.a.b() : j23, (i & 8388608) != 0 ? pn0.a.h() : j24, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? pn0.a.c() : j25, (i & 33554432) != 0 ? pn0.a.i() : j26, (i & 67108864) != 0 ? pn0.a.r() : j27, (i & 134217728) != 0 ? pn0.a.s() : j28, (i & 268435456) != 0 ? pn0.a.v() : j29);
    }

    public static final long h(go0 go0Var, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (a.a[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return go0Var.a();
            case 2:
                return go0Var.f();
            case 3:
                return go0Var.g();
            case 4:
                return go0Var.h();
            case 5:
                return go0Var.i();
            case 6:
                return go0Var.j();
            case 7:
                return go0Var.k();
            case 8:
                return go0Var.l();
            case 9:
                return go0Var.m();
            case 10:
                return go0Var.n();
            case 11:
                return go0Var.o();
            case 12:
                return go0Var.p();
            case 13:
                return go0Var.q();
            case 14:
                return go0Var.r();
            case 15:
                return go0Var.s();
            case 16:
                return go0Var.K();
            case 17:
                return go0Var.t();
            case 18:
                return go0Var.u();
            case 19:
                return go0Var.v();
            case 20:
                return go0Var.w();
            case 21:
                return go0Var.x();
            case 22:
                return go0Var.y();
            case 23:
                return go0Var.z();
            case 24:
                return go0Var.A();
            case EventType.SUBS /* 25 */:
                return go0Var.B();
            case EventType.CDN /* 26 */:
                return go0Var.C();
            case 27:
                return go0Var.L();
            case 28:
                return go0Var.D();
            case BuildConfig.VERSION_CODE /* 29 */:
                return go0Var.E();
            case 30:
                return go0Var.F();
            case 31:
                return go0Var.G();
            case 32:
                return go0Var.H();
            case 33:
                return go0Var.I();
            case 34:
                return go0Var.J();
            case 35:
                return go0Var.M();
            case 36:
                return go0Var.N();
            default:
                return nn0.b.g();
        }
    }

    public static final m76 i() {
        return a;
    }

    public static final long j(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i) {
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-810780884, i, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:945)");
        }
        long h = h(zf4.a.a(composer, 6), colorSchemeKeyTokens);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        return h;
    }

    public static final go0 k(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return new go0(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, null);
    }

    public static /* synthetic */ go0 l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, Object obj) {
        long t = (i & 1) != 0 ? xn0.a.t() : j;
        return k(t, (i & 2) != 0 ? xn0.a.j() : j2, (i & 4) != 0 ? xn0.a.u() : j3, (i & 8) != 0 ? xn0.a.k() : j4, (i & 16) != 0 ? xn0.a.e() : j5, (i & 32) != 0 ? xn0.a.w() : j6, (i & 64) != 0 ? xn0.a.l() : j7, (i & 128) != 0 ? xn0.a.x() : j8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? xn0.a.m() : j9, (i & 512) != 0 ? xn0.a.H() : j10, (i & 1024) != 0 ? xn0.a.p() : j11, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? xn0.a.I() : j12, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? xn0.a.q() : j13, (i & 8192) != 0 ? xn0.a.a() : j14, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? xn0.a.g() : j15, (i & 32768) != 0 ? xn0.a.y() : j16, (i & 65536) != 0 ? xn0.a.n() : j17, (i & 131072) != 0 ? xn0.a.G() : j18, (i & 262144) != 0 ? xn0.a.o() : j19, (i & 524288) != 0 ? t : j20, (i & Constants.MB) != 0 ? xn0.a.f() : j21, (i & 2097152) != 0 ? xn0.a.d() : j22, (i & 4194304) != 0 ? xn0.a.b() : j23, (i & 8388608) != 0 ? xn0.a.h() : j24, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? xn0.a.c() : j25, (i & 33554432) != 0 ? xn0.a.i() : j26, (i & 67108864) != 0 ? xn0.a.r() : j27, (i & 134217728) != 0 ? xn0.a.s() : j28, (i & 268435456) != 0 ? xn0.a.v() : j29, (i & 536870912) != 0 ? xn0.a.z() : j30, (i & 1073741824) != 0 ? xn0.a.A() : j31, (i & RecyclerView.UNDEFINED_DURATION) != 0 ? xn0.a.B() : j32, (i2 & 1) != 0 ? xn0.a.C() : j33, (i2 & 2) != 0 ? xn0.a.D() : j34, (i2 & 4) != 0 ? xn0.a.E() : j35, (i2 & 8) != 0 ? xn0.a.F() : j36);
    }

    public static final /* synthetic */ go0 m(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return l(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    public static /* synthetic */ go0 n(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long t = (i & 1) != 0 ? xn0.a.t() : j;
        return m(t, (i & 2) != 0 ? xn0.a.j() : j2, (i & 4) != 0 ? xn0.a.u() : j3, (i & 8) != 0 ? xn0.a.k() : j4, (i & 16) != 0 ? xn0.a.e() : j5, (i & 32) != 0 ? xn0.a.w() : j6, (i & 64) != 0 ? xn0.a.l() : j7, (i & 128) != 0 ? xn0.a.x() : j8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? xn0.a.m() : j9, (i & 512) != 0 ? xn0.a.H() : j10, (i & 1024) != 0 ? xn0.a.p() : j11, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? xn0.a.I() : j12, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? xn0.a.q() : j13, (i & 8192) != 0 ? xn0.a.a() : j14, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? xn0.a.g() : j15, (i & 32768) != 0 ? xn0.a.y() : j16, (i & 65536) != 0 ? xn0.a.n() : j17, (i & 131072) != 0 ? xn0.a.G() : j18, (i & 262144) != 0 ? xn0.a.o() : j19, (i & 524288) != 0 ? t : j20, (i & Constants.MB) != 0 ? xn0.a.f() : j21, (i & 2097152) != 0 ? xn0.a.d() : j22, (i & 4194304) != 0 ? xn0.a.b() : j23, (i & 8388608) != 0 ? xn0.a.h() : j24, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? xn0.a.c() : j25, (i & 33554432) != 0 ? xn0.a.i() : j26, (i & 67108864) != 0 ? xn0.a.r() : j27, (i & 134217728) != 0 ? xn0.a.s() : j28, (i & 268435456) != 0 ? xn0.a.v() : j29);
    }

    public static final long o(go0 go0Var, float f) {
        if (bu1.j(f, bu1.g(0))) {
            return go0Var.C();
        }
        return wn0.g(nn0.r(go0Var.K(), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), go0Var.C());
    }
}
