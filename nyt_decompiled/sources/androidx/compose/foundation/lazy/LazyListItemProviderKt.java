package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import defpackage.jv3;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.x08;
import kotlin.jvm.internal.PropertyReference0Impl;

/* loaded from: classes.dex */
public abstract class LazyListItemProviderKt {
    public static final qs2 a(final LazyListState lazyListState, ss2 ss2Var, Composer composer, int i) {
        composer.z(-343736148);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-343736148, i, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)");
        }
        final x08 o = y.o(ss2Var, composer, (i >> 3) & 14);
        composer.z(1157296644);
        boolean S = composer.S(lazyListState);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            final a aVar = new a();
            final x08 e = y.e(y.n(), new qs2() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$intervalContentState$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final LazyListIntervalContent mo865invoke() {
                    return new LazyListIntervalContent((ss2) x08.this.getValue());
                }
            });
            final x08 e2 = y.e(y.n(), new qs2() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final LazyListItemProviderImpl mo865invoke() {
                    LazyListIntervalContent lazyListIntervalContent = (LazyListIntervalContent) x08.this.getValue();
                    return new LazyListItemProviderImpl(lazyListState, lazyListIntervalContent, aVar, new NearestRangeKeyIndexMap(lazyListState.y(), lazyListIntervalContent));
                }
            });
            A = new PropertyReference0Impl(e2) { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1
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
