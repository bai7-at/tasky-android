package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes2.dex */
public abstract class SwipeRefreshKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0415  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.google.accompanist.swiperefresh.SwipeRefreshState r22, final defpackage.qs2 r23, androidx.compose.ui.Modifier r24, boolean r25, float r26, androidx.compose.ui.Alignment r27, defpackage.ym5 r28, defpackage.kt2 r29, boolean r30, final defpackage.gt2 r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 1233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.swiperefresh.SwipeRefreshKt.a(com.google.accompanist.swiperefresh.SwipeRefreshState, qs2, androidx.compose.ui.Modifier, boolean, float, androidx.compose.ui.Alignment, ym5, kt2, boolean, gt2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final SwipeRefreshState b(boolean z, Composer composer, int i) {
        composer.z(-1963273955);
        if (b.G()) {
            b.S(-1963273955, i, -1, "com.google.accompanist.swiperefresh.rememberSwipeRefreshState (SwipeRefresh.kt:72)");
        }
        composer.z(-492369756);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = new SwipeRefreshState(z);
            composer.q(A);
        }
        composer.R();
        SwipeRefreshState swipeRefreshState = (SwipeRefreshState) A;
        swipeRefreshState.g(z);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return swipeRefreshState;
    }
}
