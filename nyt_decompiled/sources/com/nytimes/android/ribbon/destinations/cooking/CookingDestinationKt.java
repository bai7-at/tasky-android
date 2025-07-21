package com.nytimes.android.ribbon.destinations.cooking;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.coroutinesutils.DownloadState;
import defpackage.gt2;
import defpackage.x08;

/* loaded from: classes4.dex */
public abstract class CookingDestinationKt {
    private static final gt2 a = new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingDestinationKt$getCarouselLazyListState$1
        public final LazyListState b(Composer composer, int i) {
            composer.z(95524532);
            if (b.G()) {
                b.S(95524532, i, -1, "com.nytimes.android.ribbon.destinations.cooking.getCarouselLazyListState.<anonymous> (CookingDestination.kt:174)");
            }
            LazyListState c = LazyListStateKt.c(0, 0, composer, 0, 3);
            if (b.G()) {
                b.R();
            }
            composer.R();
            return c;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((Composer) obj, ((Number) obj2).intValue());
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r33, final androidx.compose.foundation.lazy.LazyListState r34, androidx.compose.ui.Modifier r35, com.nytimes.android.ribbon.destinations.cooking.CookingViewModel r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.cooking.CookingDestinationKt.a(boolean, androidx.compose.foundation.lazy.LazyListState, androidx.compose.ui.Modifier, com.nytimes.android.ribbon.destinations.cooking.CookingViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadState b(x08 x08Var) {
        return (DownloadState) x08Var.getValue();
    }

    public static final gt2 d() {
        return a;
    }
}
