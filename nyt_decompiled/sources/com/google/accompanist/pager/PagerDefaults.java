package com.google.accompanist.pager;

import androidx.compose.runtime.Composer;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.bu1;
import defpackage.ci;
import defpackage.cz7;
import defpackage.i14;
import defpackage.it2;
import defpackage.oc1;
import defpackage.qk2;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.zq3;
import dev.chrisbanes.snapper.SnapOffsets;
import dev.chrisbanes.snapper.SnapperFlingBehavior;
import dev.chrisbanes.snapper.SnapperFlingBehaviorDefaults;

/* loaded from: classes2.dex */
public final class PagerDefaults {
    public static final PagerDefaults a = new PagerDefaults();
    private static final ss2 b = new ss2() { // from class: com.google.accompanist.pager.PagerDefaults$singlePageFlingDistance$1
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke(dev.chrisbanes.snapper.b bVar) {
            zq3.h(bVar, "layoutInfo");
            return Float.valueOf(bVar.f() - bVar.g());
        }
    };
    private static final it2 c = new it2() { // from class: com.google.accompanist.pager.PagerDefaults$singlePageSnapIndex$1
        public final Integer b(dev.chrisbanes.snapper.b bVar, int i, int i2) {
            zq3.h(bVar, "layoutInfo");
            return Integer.valueOf(uo6.m(uo6.m(i2, i - 1, i + 1), 0, bVar.h() - 1));
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((dev.chrisbanes.snapper.b) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    };

    private PagerDefaults() {
    }

    public final qk2 a(PagerState pagerState, oc1 oc1Var, ci ciVar, float f, Composer composer, int i, int i2) {
        zq3.h(pagerState, TransferTable.COLUMN_STATE);
        composer.z(132228799);
        oc1 b2 = (i2 & 2) != 0 ? cz7.b(composer, 0) : oc1Var;
        ci b3 = (i2 & 4) != 0 ? SnapperFlingBehaviorDefaults.a.b() : ciVar;
        float g = (i2 & 8) != 0 ? bu1.g(0) : f;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(132228799, i, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:178)");
        }
        qk2 b4 = b(pagerState, b2, b3, g, c, composer, (i & 14) | 576 | (i & 7168) | ((i << 3) & 458752), 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return b4;
    }

    public final qk2 b(PagerState pagerState, oc1 oc1Var, ci ciVar, float f, it2 it2Var, Composer composer, int i, int i2) {
        zq3.h(pagerState, TransferTable.COLUMN_STATE);
        zq3.h(it2Var, "snapIndex");
        composer.z(-776119664);
        oc1 b2 = (i2 & 2) != 0 ? cz7.b(composer, 0) : oc1Var;
        ci b3 = (i2 & 4) != 0 ? SnapperFlingBehaviorDefaults.a.b() : ciVar;
        float g = (i2 & 8) != 0 ? bu1.g(0) : f;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-776119664, i, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:148)");
        }
        SnapperFlingBehavior b4 = i14.b(pagerState.o(), SnapOffsets.a.b(), g, b2, b3, it2Var, composer, ((i >> 3) & 896) | 36864 | ((i << 3) & 458752), 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return b4;
    }
}
