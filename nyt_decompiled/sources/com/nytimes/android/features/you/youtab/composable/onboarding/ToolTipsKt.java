package com.nytimes.android.features.you.youtab.composable.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.recyclerview.widget.RecyclerView;
import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.ArrowOrientationRules;
import com.skydoves.balloon.ArrowPositionRules;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAnimation;
import defpackage.f40;
import defpackage.gd6;
import defpackage.mv6;
import defpackage.re6;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class ToolTipsKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r37, final java.lang.String r38, final defpackage.qs2 r39, androidx.compose.ui.Modifier r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.composable.onboarding.ToolTipsKt.a(java.lang.String, java.lang.String, qs2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Balloon.a b(Composer composer, int i) {
        composer.z(1454527640);
        if (b.G()) {
            b.S(1454527640, i, -1, "com.nytimes.android.features.you.youtab.composable.onboarding.rememberOnboardingBalloonBuilder (ToolTips.kt:72)");
        }
        Balloon.a a = mv6.a(null, null, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.onboarding.ToolTipsKt$rememberOnboardingBalloonBuilder$1
            public final void b(Balloon.a aVar) {
                zq3.h(aVar, "$this$rememberBalloonBuilder");
                aVar.d1(24);
                aVar.W0(re6.top_pointer);
                aVar.X0(1);
                aVar.s1(16);
                aVar.b1(ArrowPositionRules.ALIGN_ANCHOR);
                aVar.a1(0.5f);
                aVar.Y0(ArrowOrientation.TOP);
                aVar.Z0(ArrowOrientationRules.ALIGN_ANCHOR);
                aVar.A1(true);
                aVar.i1(false);
                aVar.j1(false);
                aVar.h1(false);
                aVar.o1(true);
                aVar.k1(false);
                aVar.z1(new f40(100.0f, 100.0f));
                aVar.y1(gd6.background_overlay);
                aVar.B1(RecyclerView.UNDEFINED_DURATION);
                aVar.m1(RecyclerView.UNDEFINED_DURATION);
                aVar.g1(4.0f);
                aVar.e1(gd6.background_elevated);
                aVar.f1(BalloonAnimation.FADE);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Balloon.a) obj);
                return ww8.a;
            }
        }, composer, 384, 3);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a;
    }
}
