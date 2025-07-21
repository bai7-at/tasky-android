package defpackage;

import android.graphics.BlendMode;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import defpackage.b90;

/* loaded from: classes.dex */
public abstract class ud {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BlendMode.values().length];
            try {
                iArr[BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            a = iArr;
        }
    }

    public static final BlendMode a(int i) {
        b90.a aVar = b90.a;
        return b90.E(i, aVar.a()) ? BlendMode.CLEAR : b90.E(i, aVar.x()) ? BlendMode.SRC : b90.E(i, aVar.g()) ? BlendMode.DST : b90.E(i, aVar.B()) ? BlendMode.SRC_OVER : b90.E(i, aVar.k()) ? BlendMode.DST_OVER : b90.E(i, aVar.z()) ? BlendMode.SRC_IN : b90.E(i, aVar.i()) ? BlendMode.DST_IN : b90.E(i, aVar.A()) ? BlendMode.SRC_OUT : b90.E(i, aVar.j()) ? BlendMode.DST_OUT : b90.E(i, aVar.y()) ? BlendMode.SRC_ATOP : b90.E(i, aVar.h()) ? BlendMode.DST_ATOP : b90.E(i, aVar.C()) ? BlendMode.XOR : b90.E(i, aVar.t()) ? BlendMode.PLUS : b90.E(i, aVar.q()) ? BlendMode.MODULATE : b90.E(i, aVar.v()) ? BlendMode.SCREEN : b90.E(i, aVar.s()) ? BlendMode.OVERLAY : b90.E(i, aVar.e()) ? BlendMode.DARKEN : b90.E(i, aVar.o()) ? BlendMode.LIGHTEN : b90.E(i, aVar.d()) ? BlendMode.COLOR_DODGE : b90.E(i, aVar.c()) ? BlendMode.COLOR_BURN : b90.E(i, aVar.m()) ? BlendMode.HARD_LIGHT : b90.E(i, aVar.w()) ? BlendMode.SOFT_LIGHT : b90.E(i, aVar.f()) ? BlendMode.DIFFERENCE : b90.E(i, aVar.l()) ? BlendMode.EXCLUSION : b90.E(i, aVar.r()) ? BlendMode.MULTIPLY : b90.E(i, aVar.n()) ? BlendMode.HUE : b90.E(i, aVar.u()) ? BlendMode.SATURATION : b90.E(i, aVar.b()) ? BlendMode.COLOR : b90.E(i, aVar.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final int b(BlendMode blendMode) {
        switch (a.a[blendMode.ordinal()]) {
            case 1:
                return b90.a.a();
            case 2:
                return b90.a.x();
            case 3:
                return b90.a.g();
            case 4:
                return b90.a.B();
            case 5:
                return b90.a.k();
            case 6:
                return b90.a.z();
            case 7:
                return b90.a.i();
            case 8:
                return b90.a.A();
            case 9:
                return b90.a.j();
            case 10:
                return b90.a.y();
            case 11:
                return b90.a.h();
            case 12:
                return b90.a.C();
            case 13:
                return b90.a.t();
            case 14:
                return b90.a.q();
            case 15:
                return b90.a.v();
            case 16:
                return b90.a.s();
            case 17:
                return b90.a.e();
            case 18:
                return b90.a.o();
            case 19:
                return b90.a.d();
            case 20:
                return b90.a.c();
            case 21:
                return b90.a.m();
            case 22:
                return b90.a.w();
            case 23:
                return b90.a.f();
            case 24:
                return b90.a.l();
            case EventType.SUBS /* 25 */:
                return b90.a.r();
            case EventType.CDN /* 26 */:
                return b90.a.n();
            case 27:
                return b90.a.u();
            case 28:
                return b90.a.b();
            case BuildConfig.VERSION_CODE /* 29 */:
                return b90.a.p();
            default:
                return b90.a.B();
        }
    }
}
