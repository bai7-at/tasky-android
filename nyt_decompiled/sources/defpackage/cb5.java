package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.nytimes.android.designsystem.uicompose.ui.NytColor;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class cb5 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[NytColor.values().length];
            try {
                iArr[NytColor.times_black.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NytColor.gray66.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NytColor.grayE2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NytColor.grayF7.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NytColor.developing.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NytColor.background_primary_inverse.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NytColor.stroke_secondary.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NytColor.gray10.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[NytColor.content_primary_inverse.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[NytColor.content_primary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[NytColor.text_primary.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[NytColor.stroke_quaternary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[NytColor.content_secondary.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[NytColor.signal_breaking.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[NytColor.signal_highlight.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[NytColor.stroke_primary.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[NytColor.signal_positive.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[NytColor.content_quintary.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[NytColor.background_primary.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[NytColor.background_secondary_inverse.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[NytColor.background_overlay.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[NytColor.background_tertiary.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[NytColor.background_secondary.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[NytColor.text_primary_inverse.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[NytColor.signal_negative.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[NytColor.signal_editorial.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[NytColor.static_gray_100.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[NytColor.static_white.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[NytColor.content_tertiary.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[NytColor.content_quaternary.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[NytColor.stroke_tertiary.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[NytColor.opinion_gray.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[NytColor.stroke_primary_inverse.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            a = iArr;
        }
    }

    public static final long a(NytColor nytColor, lb5 lb5Var, Composer composer, int i, int i2) {
        long Z;
        zq3.h(nytColor, "<this>");
        composer.z(-431331179);
        if ((i2 & 1) != 0) {
            lb5Var = eb5.Companion.a(composer, 6);
        }
        if (b.G()) {
            b.S(-431331179, i, -1, "com.nytimes.android.designsystem.uicompose.ui.toColor (NytColor.kt:111)");
        }
        switch (a.a[nytColor.ordinal()]) {
            case 1:
                Z = lb5Var.Z();
                break;
            case 2:
                Z = lb5Var.z();
                break;
            case 3:
                Z = lb5Var.B();
                break;
            case 4:
                Z = lb5Var.C();
                break;
            case 5:
                Z = lb5Var.v();
                break;
            case 6:
                Z = lb5Var.f();
                break;
            case 7:
                Z = lb5Var.V();
                break;
            case 8:
                Z = lb5Var.x();
                break;
            case 9:
                Z = lb5Var.o();
                break;
            case 10:
                Z = lb5Var.l();
                break;
            case 11:
                Z = lb5Var.X();
                break;
            case 12:
                Z = lb5Var.U();
                break;
            case 13:
                Z = lb5Var.r();
                break;
            case 14:
                Z = lb5Var.K();
                break;
            case 15:
                Z = lb5Var.N();
                break;
            case 16:
                Z = lb5Var.S();
                break;
            case 17:
                Z = lb5Var.P();
                break;
            case 18:
                Z = lb5Var.q();
                break;
            case 19:
                Z = lb5Var.d();
                break;
            case 20:
                Z = lb5Var.i();
                break;
            case 21:
                Z = lb5Var.c();
                break;
            case 22:
                Z = lb5Var.j();
                break;
            case 23:
                Z = lb5Var.h();
                break;
            case 24:
                Z = lb5Var.Y();
                break;
            case EventType.SUBS /* 25 */:
                Z = lb5Var.O();
                break;
            case EventType.CDN /* 26 */:
                Z = lb5Var.L();
                break;
            case 27:
                Z = lb5Var.Q();
                break;
            case 28:
                Z = lb5Var.R();
                break;
            case BuildConfig.VERSION_CODE /* 29 */:
                Z = lb5Var.u();
                break;
            case 30:
                Z = lb5Var.p();
                break;
            case 31:
                Z = lb5Var.W();
                break;
            case 32:
                Z = lb5Var.H();
                break;
            case 33:
                Z = lb5Var.T();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return Z;
    }
}
