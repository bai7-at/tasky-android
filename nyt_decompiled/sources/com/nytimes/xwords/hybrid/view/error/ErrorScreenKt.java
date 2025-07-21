package com.nytimes.xwords.hybrid.view.error;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.airbnb.lottie.compose.c;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.xwords.hybrid.ThemeKt;
import com.nytimes.xwords.hybrid.utils.ErrorType;
import defpackage.ap0;
import defpackage.bc0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.e50;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.ij6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.lc4;
import defpackage.nm6;
import defpackage.py1;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class ErrorScreenKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ErrorType.values().length];
            try {
                iArr[ErrorType.OFFLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorType.GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(ErrorType errorType) {
        int i = a.a[errorType.ordinal()];
        if (i == 1) {
            return ij6.offline_icon_animation;
        }
        if (i == 2) {
            return ij6.error_icon_animation;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int B(ErrorType errorType) {
        int i = a.a[errorType.ordinal()];
        if (i == 1) {
            return nm6.user_offline_notice;
        }
        if (i == 2) {
            return nm6.generic_something_went_wrong_error_msg;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void a(Modifier modifier, final int i, final long j, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        Composer h = composer.h(-719357492);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (h.S(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i4 |= h.d(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= h.e(j) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i6 = i4;
        if ((i6 & 731) == 146 && h.i()) {
            h.K();
            modifier3 = modifier2;
        } else {
            modifier3 = i5 != 0 ? Modifier.a : modifier2;
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-719357492, i6, -1, "com.nytimes.xwords.hybrid.view.error.AnimatedIcon (ErrorScreen.kt:157)");
            }
            h.z(-1374898204);
            Object A = h.A();
            Composer.a aVar = Composer.a;
            if (A == aVar.a()) {
                A = b0.e(Boolean.FALSE, null, 2, null);
                h.q(A);
            }
            sy4 sy4Var = (sy4) A;
            h.R();
            lc4 r = RememberLottieCompositionKt.r(c.a.a(c.a.b(i)), null, null, null, null, null, h, 0, 62);
            ww8 ww8Var = ww8.a;
            h.z(-1374891648);
            boolean e = h.e(j) | h.S(sy4Var);
            Object A2 = h.A();
            if (e || A2 == aVar.a()) {
                A2 = new ErrorScreenKt$AnimatedIcon$1$1(j, sy4Var, null);
                h.q(A2);
            }
            h.R();
            py1.d(ww8Var, (gt2) A2, h, 70);
            LottieAnimationKt.LottieAnimation(d(r), modifier3, b(sy4Var), false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, null, h, ((i6 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 8, 0, 262136);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier4 = modifier3;
            k.a(new gt2() { // from class: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$AnimatedIcon$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    ErrorScreenKt.a(Modifier.this, i, j, composer2, i2 | 1, i3);
                }
            });
        }
    }

    private static final boolean b(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    private static final LottieComposition d(lc4 lc4Var) {
        return (LottieComposition) lc4Var.getValue();
    }

    public static final void e(Modifier modifier, final ErrorType errorType, final long j, final qs2 qs2Var, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        zq3.h(errorType, "errorType");
        zq3.h(qs2Var, "onBackClick");
        Composer h = composer.h(236458894);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(errorType) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.e(j) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.S(qs2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.a : modifier2;
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(236458894, i3, -1, "com.nytimes.xwords.hybrid.view.error.ErrorScreen (ErrorScreen.kt:95)");
            }
            final Modifier modifier5 = modifier4;
            ThemeKt.a(false, zr0.b(h, -1422920872, true, new gt2() { // from class: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$ErrorScreen$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(-1422920872, i5, -1, "com.nytimes.xwords.hybrid.view.error.ErrorScreen.<anonymous> (ErrorScreen.kt:97)");
                    }
                    Modifier d = BackgroundKt.d(Modifier.this, j, null, 2, null);
                    final Modifier modifier6 = Modifier.this;
                    final ErrorType errorType2 = errorType;
                    final qs2 qs2Var2 = qs2Var;
                    BoxWithConstraintsKt.a(d, null, false, zr0.b(composer2, -1354270270, true, new it2() { // from class: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$ErrorScreen$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        public final void b(bc0 bc0Var, Composer composer3, int i6) {
                            int i7;
                            int B;
                            int A;
                            zq3.h(bc0Var, "$this$BoxWithConstraints");
                            if ((i6 & 14) == 0) {
                                i7 = i6 | (composer3.S(bc0Var) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 91) == 18 && composer3.i()) {
                                composer3.K();
                                return;
                            }
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.S(-1354270270, i7, -1, "com.nytimes.xwords.hybrid.view.error.ErrorScreen.<anonymous>.<anonymous> (ErrorScreen.kt:100)");
                            }
                            composer3.z(-1150264057);
                            Object A2 = composer3.A();
                            Composer.a aVar = Composer.a;
                            if (A2 == aVar.a()) {
                                A2 = (bu1.f(bc0Var.d(), bu1.g((float) 750)) < 0 || bu1.f(bc0Var.a(), bu1.g((float) 550)) < 0) ? new c(0L, 0L, 0.0f, 0.0f, 0L, 0.0f, 63, null) : new b(0L, 0L, 0.0f, 0.0f, 0L, 0.0f, 63, null);
                                composer3.q(A2);
                            }
                            a aVar2 = (a) A2;
                            composer3.R();
                            composer3.z(-1150257318);
                            Object A3 = composer3.A();
                            if (A3 == aVar.a()) {
                                A3 = new e50();
                                composer3.q(A3);
                            }
                            e50 e50Var = (e50) A3;
                            composer3.R();
                            composer3.z(-1150254114);
                            ErrorType errorType3 = errorType2;
                            Object A4 = composer3.A();
                            if (A4 == aVar.a()) {
                                A = ErrorScreenKt.A(errorType3);
                                A4 = Integer.valueOf(A);
                                composer3.q(A4);
                            }
                            int intValue = ((Number) A4).intValue();
                            composer3.R();
                            Modifier f = SizeKt.f(Modifier.this, 0.0f, 1, null);
                            Alignment.b g = Alignment.a.g();
                            Arrangement.f b = Arrangement.a.b();
                            ErrorType errorType4 = errorType2;
                            qs2 qs2Var3 = qs2Var2;
                            composer3.z(-483455358);
                            rg4 a2 = d.a(b, g, composer3, 54);
                            composer3.z(-1323940314);
                            fm1 fm1Var = (fm1) composer3.m(CompositionLocalsKt.e());
                            LayoutDirection layoutDirection = (LayoutDirection) composer3.m(CompositionLocalsKt.j());
                            r99 r99Var = (r99) composer3.m(CompositionLocalsKt.p());
                            ComposeUiNode.Companion companion = ComposeUiNode.F;
                            qs2 a3 = companion.a();
                            it2 b2 = LayoutKt.b(f);
                            if (composer3.j() == null) {
                                cs0.c();
                            }
                            composer3.G();
                            if (composer3.f()) {
                                composer3.D(a3);
                            } else {
                                composer3.p();
                            }
                            composer3.H();
                            Composer a4 = Updater.a(composer3);
                            Updater.c(a4, a2, companion.e());
                            Updater.c(a4, fm1Var, companion.c());
                            Updater.c(a4, layoutDirection, companion.d());
                            Updater.c(a4, r99Var, companion.h());
                            composer3.c();
                            b2.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                            composer3.z(2058660585);
                            composer3.z(-1163856341);
                            ap0 ap0Var = ap0.a;
                            Modifier.a aVar3 = Modifier.a;
                            ErrorScreenKt.a(SizeKt.n(aVar3, aVar2.a()), intValue, 67L, composer3, 432, 0);
                            SpacerKt.a(SizeKt.i(aVar3, aVar2.d()), composer3, 0);
                            B = ErrorScreenKt.B(errorType4);
                            ErrorScreenKt.f(aVar3, aVar2.c(), k48.b(B, composer3, 0), aVar2.b(), e50Var.b(), e50Var.a(), composer3, 221190, 0);
                            SpacerKt.a(SizeKt.i(aVar3, aVar2.f()), composer3, 0);
                            ErrorScreenKt.k(aVar3, k48.b(nm6.back_btn_text, composer3, 0), aVar2.e(), e50Var.d(), e50Var.c(), e50Var.e(), qs2Var3, composer3, 224262, 0);
                            composer3.R();
                            composer3.R();
                            composer3.t();
                            composer3.R();
                            composer3.R();
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.R();
                            }
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            b((bc0) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }
                    }), composer2, 3072, 6);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, 48, 1);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
            modifier3 = modifier4;
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt$ErrorScreen$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    ErrorScreenKt.e(Modifier.this, errorType, j, qs2Var, composer2, i | 1, i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(androidx.compose.ui.Modifier r26, final long r27, final java.lang.String r29, final long r30, final defpackage.ei r32, final defpackage.ei r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt.f(androidx.compose.ui.Modifier, long, java.lang.String, long, ei, ei, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(sy4 sy4Var, float f) {
        sy4Var.setValue(Float.valueOf(f));
    }

    private static final float h(sy4 sy4Var) {
        return ((bu1) sy4Var.getValue()).n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(sy4 sy4Var, float f) {
        sy4Var.setValue(bu1.d(f));
    }

    private static final float j(sy4 sy4Var) {
        return ((Number) sy4Var.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(androidx.compose.ui.Modifier r31, final java.lang.String r32, final long r33, final defpackage.ei r35, final defpackage.ei r36, final defpackage.ei r37, final defpackage.qs2 r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.xwords.hybrid.view.error.ErrorScreenKt.k(androidx.compose.ui.Modifier, java.lang.String, long, ei, ei, ei, qs2, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final float l(sy4 sy4Var) {
        return ((bu1) sy4Var.getValue()).n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(sy4 sy4Var, float f) {
        sy4Var.setValue(bu1.d(f));
    }

    private static final float n(sy4 sy4Var) {
        return ((Number) sy4Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(sy4 sy4Var, float f) {
        sy4Var.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float p(sy4 sy4Var) {
        return ((Number) sy4Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(sy4 sy4Var, float f) {
        sy4Var.setValue(Float.valueOf(f));
    }
}
