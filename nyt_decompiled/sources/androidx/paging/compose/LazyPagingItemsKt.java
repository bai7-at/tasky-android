package androidx.paging.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.paging.d;
import androidx.paging.e;
import defpackage.gt2;
import defpackage.py1;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public abstract class LazyPagingItemsKt {
    private static final d.c a;
    private static final e b;

    static {
        d.c cVar = new d.c(false);
        a = cVar;
        b = new e(d.b.b, cVar, cVar);
    }

    public static final LazyPagingItems b(Flow flow, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        zq3.h(flow, "<this>");
        composer.z(388053246);
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        if (b.G()) {
            b.S(388053246, i, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:203)");
        }
        composer.z(1046463091);
        boolean S = composer.S(flow);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new LazyPagingItems(flow);
            composer.q(A);
        }
        LazyPagingItems lazyPagingItems = (LazyPagingItems) A;
        composer.R();
        composer.z(1046463169);
        boolean C = composer.C(coroutineContext) | composer.C(lazyPagingItems);
        Object A2 = composer.A();
        if (C || A2 == Composer.a.a()) {
            A2 = new LazyPagingItemsKt$collectAsLazyPagingItems$1$1(coroutineContext, lazyPagingItems, null);
            composer.q(A2);
        }
        composer.R();
        py1.d(lazyPagingItems, (gt2) A2, composer, 0);
        composer.z(1046463438);
        boolean C2 = composer.C(coroutineContext) | composer.C(lazyPagingItems);
        Object A3 = composer.A();
        if (C2 || A3 == Composer.a.a()) {
            A3 = new LazyPagingItemsKt$collectAsLazyPagingItems$2$1(coroutineContext, lazyPagingItems, null);
            composer.q(A3);
        }
        composer.R();
        py1.d(lazyPagingItems, (gt2) A3, composer, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return lazyPagingItems;
    }
}
