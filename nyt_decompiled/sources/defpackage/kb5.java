package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.nytimes.android.designsystem.uicompose.ui.NytTextStyle;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class kb5 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[NytTextStyle.values().length];
            try {
                iArr[NytTextStyle.HEADLINE_NEWS_XLARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_NEWS_XLARGEITALIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_NEWS_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_NEWS_LARGEITALIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_NEWS_MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_NEWS_MEDIUMITALIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_NEWS_SMALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_NEUTRAL_LARGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_NEUTRAL_MEDIUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_NEUTRAL_MEDIUMLIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_NEUTRAL_SMALL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_NEUTRAL_SMALLLIGHT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_NEUTRAL_XSMALL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_NEUTRAL_XXSMALL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_FEATURE_LARGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_FEATURE_MEDIUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_OPINION_LARGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_OPINION_MEDIUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[NytTextStyle.HEADLINE_OPINION_SMALL.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[NytTextStyle.SUMMARY_LARGE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[NytTextStyle.SUMMARY_SMALL.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[NytTextStyle.CAPTION_LARGE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[NytTextStyle.CAPTION_SMALL.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[NytTextStyle.CREDIT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[NytTextStyle.LABEL_STATUS_LARGE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[NytTextStyle.LABEL_STATUS_SMALL.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[NytTextStyle.LABEL_BLOCKTITLE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[NytTextStyle.LABEL_BLOCKTITLEOPINION.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[NytTextStyle.LABEL_LEVEL2MOBILE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[NytTextStyle.LABEL_LEVEL2.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[NytTextStyle.PACKAGESUBHEAD_LARGE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[NytTextStyle.PACKAGESUBHEAD_SMALL.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[NytTextStyle.BYLINE_OPINIONDEDICATED.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[NytTextStyle.BYLINE_OPINIONSTANDARD.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[NytTextStyle.ALERT_LARGE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[NytTextStyle.ALERT_SMALL.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[NytTextStyle.UTILITY_BOLD_LARGE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[NytTextStyle.UTILITY_BOLD_SMALL.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[NytTextStyle.UTILITY_STANDARD.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[NytTextStyle.SUMMARY_MEDIUM.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[NytTextStyle.TIMESTAMP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[NytTextStyle.COMMENT_COUNT.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[NytTextStyle.INFO_LABEL.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[NytTextStyle.INFO_DESCRIPTION.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[NytTextStyle.BUTTON_LARGE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[NytTextStyle.KICKER_SECTION_FRONT.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[NytTextStyle.MESSAGE_NORMAL.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[NytTextStyle.MESSAGE_BOLD.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[NytTextStyle.MESSAGE_TITLE.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[NytTextStyle.MESSAGE_BUTTON.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[NytTextStyle.MESSAGE_ITALIC.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[NytTextStyle.MESSAGE_KICKER.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[NytTextStyle.BYLINE_OPINIONDISCOVERY.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            a = iArr;
        }
    }

    public static final androidx.compose.ui.text.a a(String str, NytTextStyle nytTextStyle, boolean z, Composer composer, int i, int i2) {
        zq3.h(str, "<this>");
        zq3.h(nytTextStyle, "style");
        composer.z(-2028733148);
        if ((i2 & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        if (b.G()) {
            b.S(-2028733148, i, -1, "com.nytimes.android.designsystem.uicompose.ui.toAnnotatedString (NytTextStyle.kt:141)");
        }
        androidx.compose.ui.text.a a2 = ri.a(str, b(nytTextStyle, null, z2, composer, ((i >> 3) & 14) | (i & 896), 1), composer, i & 14);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a2;
    }

    public static final j b(NytTextStyle nytTextStyle, ob5 ob5Var, boolean z, Composer composer, int i, int i2) {
        j V;
        zq3.h(nytTextStyle, "<this>");
        composer.z(1040937114);
        ob5 c = (i2 & 1) != 0 ? eb5.Companion.c(composer, 6) : ob5Var;
        boolean z2 = (i2 & 2) != 0 ? false : z;
        if (b.G()) {
            b.S(1040937114, i, -1, "com.nytimes.android.designsystem.uicompose.ui.toTextStyle (NytTextStyle.kt:75)");
        }
        switch (a.a[nytTextStyle.ordinal()]) {
            case 1:
                V = c.V();
                break;
            case 2:
                V = c.W();
                break;
            case 3:
                V = c.Q();
                break;
            case 4:
                V = c.R();
                break;
            case 5:
                V = c.S();
                break;
            case 6:
                V = c.T();
                break;
            case 7:
                V = c.U();
                break;
            case 8:
                V = c.J();
                break;
            case 9:
                V = c.K();
                break;
            case 10:
                V = c.L();
                break;
            case 11:
                V = c.M();
                break;
            case 12:
                V = c.N();
                break;
            case 13:
                V = c.O();
                break;
            case 14:
                V = c.P();
                break;
            case 15:
                V = c.H();
                break;
            case 16:
                V = c.I();
                break;
            case 17:
                V = c.X();
                break;
            case 18:
                V = c.Y();
                break;
            case 19:
                V = c.Z();
                break;
            case 20:
                V = c.W0();
                break;
            case 21:
                V = c.Y0();
                break;
            case 22:
                V = c.j();
                break;
            case 23:
                V = c.k();
                break;
            case 24:
                V = c.w();
                break;
            case EventType.SUBS /* 25 */:
                V = c.n0();
                break;
            case EventType.CDN /* 26 */:
                V = c.o0();
                break;
            case 27:
                V = c.j0();
                break;
            case 28:
                V = c.k0();
                break;
            case BuildConfig.VERSION_CODE /* 29 */:
                V = c.m0();
                break;
            case 30:
                V = c.l0();
                break;
            case 31:
                V = c.F0();
                break;
            case 32:
                V = c.G0();
                break;
            case 33:
                V = c.g();
                break;
            case 34:
                V = c.i();
                break;
            case 35:
                V = c.c();
                break;
            case 36:
                V = c.d();
                break;
            case 37:
                V = c.o1();
                break;
            case 38:
                V = c.p1();
                break;
            case 39:
                V = c.q1();
                break;
            case 40:
                V = c.X0();
                break;
            case 41:
                V = c.h1();
                break;
            case 42:
                V = c.r();
                break;
            case 43:
                V = c.c0();
                break;
            case 44:
                V = c.b0();
                break;
            case 45:
                V = c.f();
                break;
            case 46:
                V = c.i0();
                break;
            case 47:
                V = c.q0();
                break;
            case 48:
                V = c.j1();
                break;
            case 49:
                V = c.n1();
                break;
            case 50:
                V = c.k1();
                break;
            case 51:
                V = c.l1();
                break;
            case 52:
                V = c.m1();
                break;
            case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                V = c.h();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        j jVar = V;
        if (z2) {
            jVar = jVar.f((r48 & 1) != 0 ? jVar.a.i() : nn0.r(jVar.l(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), (r48 & 2) != 0 ? jVar.a.m() : 0L, (r48 & 4) != 0 ? jVar.a.p() : null, (r48 & 8) != 0 ? jVar.a.n() : null, (r48 & 16) != 0 ? jVar.a.o() : null, (r48 & 32) != 0 ? jVar.a.k() : null, (r48 & 64) != 0 ? jVar.a.l() : null, (r48 & 128) != 0 ? jVar.a.q() : 0L, (r48 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? jVar.a.g() : null, (r48 & 512) != 0 ? jVar.a.w() : null, (r48 & 1024) != 0 ? jVar.a.r() : null, (r48 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? jVar.a.f() : 0L, (r48 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? jVar.a.u() : null, (r48 & 8192) != 0 ? jVar.a.t() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? jVar.a.j() : null, (r48 & 32768) != 0 ? jVar.b.h() : 0, (r48 & 65536) != 0 ? jVar.b.i() : 0, (r48 & 131072) != 0 ? jVar.b.e() : 0L, (r48 & 262144) != 0 ? jVar.b.j() : null, (r48 & 524288) != 0 ? jVar.c : null, (r48 & Constants.MB) != 0 ? jVar.b.f() : null, (r48 & 2097152) != 0 ? jVar.b.d() : 0, (r48 & 4194304) != 0 ? jVar.b.c() : 0, (r48 & 8388608) != 0 ? jVar.b.k() : null);
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return jVar;
    }
}
