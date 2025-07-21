package com.nytimes.android.mainactivity;

import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.mainactivity.MainBottomNavViewModel$fetchFeed$1", f = "MainBottomNavViewModel.kt", l = {34, 37}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MainBottomNavViewModel$fetchFeed$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ MainBottomNavViewModel this$0;

    @fc1(c = "com.nytimes.android.mainactivity.MainBottomNavViewModel$fetchFeed$1$1", f = "MainBottomNavViewModel.kt", l = {35}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.mainactivity.MainBottomNavViewModel$fetchFeed$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;
        final /* synthetic */ MainBottomNavViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainBottomNavViewModel mainBottomNavViewModel, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = mainBottomNavViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FeedStore feedStore;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                feedStore = this.this$0.a;
                this.label = 1;
                obj = FeedStore.d(feedStore, false, this, 1, null);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return obj;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainBottomNavViewModel$fetchFeed$1(MainBottomNavViewModel mainBottomNavViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = mainBottomNavViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new MainBottomNavViewModel$fetchFeed$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineDispatcher coroutineDispatcher;
        com.nytimes.android.entitlements.a aVar;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
        } catch (Exception e) {
            NYTLogger.g("Failed to fetch feed: " + e, new Object[0]);
        }
        if (i == 0) {
            f.b(obj);
            coroutineDispatcher = this.this$0.d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            f.b(obj);
        }
        aVar = this.this$0.b;
        Flow c = aVar.c();
        this.label = 2;
        if (FlowKt.first(c, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((MainBottomNavViewModel$fetchFeed$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
