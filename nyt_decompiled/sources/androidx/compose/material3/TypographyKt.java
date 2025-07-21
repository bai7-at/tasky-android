package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.text.j;
import defpackage.m76;
import defpackage.qs2;
import defpackage.zu8;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class TypographyKt {
    private static final m76 a = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.material3.TypographyKt$LocalTypography$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final zu8 mo865invoke() {
            return new zu8(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
    });

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TypographyKeyTokens.values().length];
            try {
                iArr[TypographyKeyTokens.DisplayLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypographyKeyTokens.DisplayMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypographyKeyTokens.DisplaySmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineMedium.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineSmall.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TypographyKeyTokens.TitleLarge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TypographyKeyTokens.TitleMedium.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TypographyKeyTokens.TitleSmall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TypographyKeyTokens.BodyLarge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TypographyKeyTokens.BodyMedium.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TypographyKeyTokens.BodySmall.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TypographyKeyTokens.LabelLarge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TypographyKeyTokens.LabelMedium.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TypographyKeyTokens.LabelSmall.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            a = iArr;
        }
    }

    public static final j a(zu8 zu8Var, TypographyKeyTokens typographyKeyTokens) {
        switch (a.a[typographyKeyTokens.ordinal()]) {
            case 1:
                return zu8Var.d();
            case 2:
                return zu8Var.e();
            case 3:
                return zu8Var.f();
            case 4:
                return zu8Var.g();
            case 5:
                return zu8Var.h();
            case 6:
                return zu8Var.i();
            case 7:
                return zu8Var.m();
            case 8:
                return zu8Var.n();
            case 9:
                return zu8Var.o();
            case 10:
                return zu8Var.a();
            case 11:
                return zu8Var.b();
            case 12:
                return zu8Var.c();
            case 13:
                return zu8Var.j();
            case 14:
                return zu8Var.k();
            case 15:
                return zu8Var.l();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final m76 b() {
        return a;
    }
}
