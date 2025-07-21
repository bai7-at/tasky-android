package androidx.paging.compose;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1", f = "LazyPagingItems.kt", l = {220, 222}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LazyPagingItemsKt$collectAsLazyPagingItems$2$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ CoroutineContext $context;
    final /* synthetic */ LazyPagingItems $lazyPagingItems;
    int label;

    @fc1(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1$1", f = "LazyPagingItems.kt", l = {223}, m = "invokeSuspend")
    /* renamed from: androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ LazyPagingItems $lazyPagingItems;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LazyPagingItems lazyPagingItems, by0 by0Var) {
            super(2, by0Var);
            this.$lazyPagingItems = lazyPagingItems;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$lazyPagingItems, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                LazyPagingItems lazyPagingItems = this.$lazyPagingItems;
                this.label = 1;
                if (lazyPagingItems.d(this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyPagingItemsKt$collectAsLazyPagingItems$2$1(CoroutineContext coroutineContext, LazyPagingItems lazyPagingItems, by0 by0Var) {
        super(2, by0Var);
        this.$context = coroutineContext;
        this.$lazyPagingItems = lazyPagingItems;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new LazyPagingItemsKt$collectAsLazyPagingItems$2$1(this.$context, this.$lazyPagingItems, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            if (zq3.c(this.$context, EmptyCoroutineContext.a)) {
                LazyPagingItems lazyPagingItems = this.$lazyPagingItems;
                this.label = 1;
                if (lazyPagingItems.d(this) == h) {
                    return h;
                }
            } else {
                CoroutineContext coroutineContext = this.$context;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lazyPagingItems, null);
                this.label = 2;
                if (BuildersKt.withContext(coroutineContext, anonymousClass1, this) == h) {
                    return h;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LazyPagingItemsKt$collectAsLazyPagingItems$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
