package com.nytimes.android.dailyfive.domain;

import com.nytimes.android.utils.MoshiFileSystemPersister;
import defpackage.by0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.l81;
import defpackage.w71;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Maybe;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.rx2.RxAwaitKt;

@fc1(c = "com.nytimes.android.dailyfive.domain.DailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1", f = "DailyFiveFeedStore.kt", l = {16, 16}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class DailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ MoshiFileSystemPersister $feedPersister$inlined;
    final /* synthetic */ l81 $it$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DailyFiveFeedStore this$0;

    @fc1(c = "com.nytimes.android.dailyfive.domain.DailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1$1", f = "DailyFiveFeedStore.kt", l = {31}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.dailyfive.domain.DailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ MoshiFileSystemPersister $feedPersister$inlined;
        final /* synthetic */ l81 $it$inlined;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(by0 by0Var, MoshiFileSystemPersister moshiFileSystemPersister, l81 l81Var) {
            super(2, by0Var);
            this.$feedPersister$inlined = moshiFileSystemPersister;
            this.$it$inlined = l81Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(by0Var, this.$feedPersister$inlined, this.$it$inlined);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Maybe d = this.$feedPersister$inlined.d(this.$it$inlined);
                this.label = 1;
                obj = RxAwaitKt.awaitSingleOrNull(d, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            zq3.e(obj);
            return obj;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "com.nytimes.android.dailyfive.domain.DailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1$2", f = "DailyFiveFeedStore.kt", l = {31}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.dailyfive.domain.DailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        int label;
        final /* synthetic */ DailyFiveFeedStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(by0 by0Var, DailyFiveFeedStore dailyFiveFeedStore) {
            super(2, by0Var);
            this.this$0 = dailyFiveFeedStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass2(by0Var, this.this$0);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            w71 w71Var;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                w71Var = this.this$0.a;
                Maybe d = w71Var.d(ww8.a);
                this.label = 1;
                obj = RxAwaitKt.awaitSingleOrNull(d, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            zq3.e(obj);
            return obj;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1(by0 by0Var, MoshiFileSystemPersister moshiFileSystemPersister, l81 l81Var, DailyFiveFeedStore dailyFiveFeedStore) {
        super(2, by0Var);
        this.$feedPersister$inlined = moshiFileSystemPersister;
        this.$it$inlined = l81Var;
        this.this$0 = dailyFiveFeedStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1 dailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1 = new DailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1(by0Var, this.$feedPersister$inlined, this.$it$inlined, this.this$0);
        dailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1.L$0 = obj;
        return dailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Deferred async$default2;
        Deferred deferred;
        Object obj2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(null, this.$feedPersister$inlined, this.$it$inlined), 3, null);
            async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass2(null, this.this$0), 3, null);
            this.L$0 = async$default2;
            this.label = 1;
            Object await = async$default.await(this);
            if (await == h) {
                return h;
            }
            deferred = async$default2;
            obj = await;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                f.b(obj);
                return du8.a(obj2, obj);
            }
            deferred = (Deferred) this.L$0;
            f.b(obj);
        }
        this.L$0 = obj;
        this.label = 2;
        Object await2 = deferred.await(this);
        if (await2 == h) {
            return h;
        }
        Object obj3 = obj;
        obj = await2;
        obj2 = obj3;
        return du8.a(obj2, obj);
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DailyFiveFeedStore$parallelStore$2$invokeSuspend$$inlined$combine$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
