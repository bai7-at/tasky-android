package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.g;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.bd8;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.d35;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hm5;
import defpackage.hn5;
import defpackage.im5;
import defpackage.jv3;
import defpackage.kt2;
import defpackage.m04;
import defpackage.qs2;
import defpackage.rl0;
import defpackage.sc7;
import defpackage.ss2;
import defpackage.tn5;
import defpackage.vy4;
import defpackage.w04;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import kotlin.jvm.internal.PropertyReference0Impl;

/* loaded from: classes.dex */
public abstract class LazyLayoutPagerKt {
    public static final void a(final Modifier modifier, final PagerState pagerState, final ym5 ym5Var, final boolean z, final Orientation orientation, final SnapFlingBehavior snapFlingBehavior, final boolean z2, int i, float f, final a aVar, final d35 d35Var, final ss2 ss2Var, final Alignment.b bVar, final Alignment.c cVar, final kt2 kt2Var, Composer composer, final int i2, final int i3, final int i4) {
        Composer h = composer.h(-301644943);
        int i5 = (i4 & 128) != 0 ? 0 : i;
        float g = (i4 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? bu1.g(0) : f;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-301644943, i2, i3, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:95)");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(("beyondBoundsPageCount should be greater than or equal to 0, you selected " + i5).toString());
        }
        sc7 sc7Var = sc7.a;
        hm5 c = sc7Var.c(h, 6);
        h.z(1320096574);
        boolean S = h.S(pagerState);
        Object A = h.A();
        if (S || A == Composer.a.a()) {
            A = new qs2() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$pagerItemProvider$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Integer mo865invoke() {
                    return Integer.valueOf(PagerState.this.E());
                }
            };
            h.q(A);
        }
        h.R();
        int i6 = i2 >> 3;
        int i7 = i6 & 14;
        qs2 c2 = c(pagerState, kt2Var, ss2Var, (qs2) A, h, i7 | ((i3 >> 9) & ContentType.LONG_FORM_ON_DEMAND) | ((i3 << 3) & 896));
        g i8 = PagerStateKt.i();
        h.z(1320097128);
        boolean S2 = h.S(pagerState);
        Object A2 = h.A();
        if (S2 || A2 == Composer.a.a()) {
            A2 = new qs2() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$measurePolicy$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Integer mo865invoke() {
                    return Integer.valueOf(PagerState.this.E());
                }
            };
            h.q(A2);
        }
        h.R();
        int i9 = i2 & 7168;
        int i10 = i2 >> 6;
        int i11 = i3 << 18;
        final int i12 = i5;
        gt2 b = PagerMeasurePolicyKt.b(c2, pagerState, ym5Var, z, orientation, i5, g, aVar, bVar, cVar, i8, (qs2) A2, h, (65520 & i2) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (234881024 & i11) | (i11 & 1879048192), 0);
        h.z(511388516);
        boolean S3 = h.S(snapFlingBehavior) | h.S(pagerState);
        Object A3 = h.A();
        if (S3 || A3 == Composer.a.a()) {
            A3 = new PagerWrapperFlingBehavior(snapFlingBehavior, pagerState);
            h.q(A3);
        }
        h.R();
        PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) A3;
        w04 a = tn5.a(pagerState, z, orientation == Orientation.Vertical, h, i7 | (i10 & ContentType.LONG_FORM_ON_DEMAND));
        h.z(1157296644);
        boolean S4 = h.S(pagerState);
        Object A4 = h.A();
        if (S4 || A4 == Composer.a.a()) {
            A4 = new b(pagerState);
            h.q(A4);
        }
        h.R();
        LazyLayoutKt.a(c2, androidx.compose.ui.input.nestedscroll.a.b(b(ScrollableKt.i(im5.a(m04.b(rl0.a(LazyLayoutSemanticsKt.a(modifier.h(pagerState.O()).h(pagerState.u()), c2, a, orientation, z2, z, h, (i6 & 7168) | (i10 & 57344) | ((i2 << 6) & 458752)), orientation), hn5.a(pagerState, i12, h, i7 | ((i2 >> 18) & ContentType.LONG_FORM_ON_DEMAND)), pagerState.v(), z, (LayoutDirection) h.m(CompositionLocalsKt.j()), orientation, z2, h, (vy4.d << 6) | i9 | ((i2 << 3) & 458752) | (i2 & 3670016)), c), pagerState, orientation, c, z2, sc7Var.d((LayoutDirection) h.m(CompositionLocalsKt.j()), orientation, z), pagerWrapperFlingBehavior, pagerState.B(), (b) A4), pagerState), d35Var, null, 2, null), pagerState.L(), b, h, 0, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final float f2 = g;
            k.a(new gt2() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i13) {
                    LazyLayoutPagerKt.a(Modifier.this, pagerState, ym5Var, z, orientation, snapFlingBehavior, z2, i12, f2, aVar, d35Var, ss2Var, bVar, cVar, kt2Var, composer2, gt6.a(i2 | 1), gt6.a(i3), i4);
                }
            });
        }
    }

    private static final Modifier b(Modifier modifier, PagerState pagerState) {
        return modifier.h(bd8.c(Modifier.a, pagerState, new LazyLayoutPagerKt$dragDirectionDetector$1(pagerState, null)));
    }

    private static final qs2 c(final PagerState pagerState, kt2 kt2Var, ss2 ss2Var, final qs2 qs2Var, Composer composer, int i) {
        composer.z(-1372505274);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1372505274, i, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:247)");
        }
        final x08 o = y.o(kt2Var, composer, (i >> 3) & 14);
        final x08 o2 = y.o(ss2Var, composer, (i >> 6) & 14);
        Object[] objArr = {pagerState, o, o2, qs2Var};
        composer.z(-568225417);
        boolean z = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z |= composer.S(objArr[i2]);
        }
        Object A = composer.A();
        if (z || A == Composer.a.a()) {
            final x08 e = y.e(y.n(), new qs2() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c mo865invoke() {
                    return new c((kt2) x08.this.getValue(), (ss2) o2.getValue(), ((Number) qs2Var.mo865invoke()).intValue());
                }
            });
            final x08 e2 = y.e(y.n(), new qs2() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final PagerLazyLayoutItemProvider mo865invoke() {
                    c cVar = (c) x08.this.getValue();
                    return new PagerLazyLayoutItemProvider(pagerState, cVar, new NearestRangeKeyIndexMap(pagerState.D(), cVar));
                }
            });
            A = new PropertyReference0Impl(e2) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                @Override // defpackage.jv3
                public Object get() {
                    return ((x08) this.receiver).getValue();
                }
            };
            composer.q(A);
        }
        composer.R();
        jv3 jv3Var = (jv3) A;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return jv3Var;
    }
}
