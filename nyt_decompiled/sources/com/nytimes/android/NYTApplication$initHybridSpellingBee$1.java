package com.nytimes.android;

import com.nytimes.android.subauth.core.api.client.NYTUser;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.NYTApplication$initHybridSpellingBee$1", f = "NYTApplication.kt", l = {327}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NYTApplication$initHybridSpellingBee$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NYTApplication this$0;

    @fc1(c = "com.nytimes.android.NYTApplication$initHybridSpellingBee$1$1", f = "NYTApplication.kt", l = {330}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.NYTApplication$initHybridSpellingBee$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;
        final /* synthetic */ NYTApplication this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NYTApplication nYTApplication, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = nYTApplication;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NYTUser.StateChangeType stateChangeType, by0 by0Var) {
            return ((AnonymousClass1) create(stateChangeType, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d0;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                NYTApplication nYTApplication = this.this$0;
                this.label = 1;
                d0 = nYTApplication.d0(this);
                if (d0 == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NYTApplication$initHybridSpellingBee$1(NYTApplication nYTApplication, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = nYTApplication;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        NYTApplication$initHybridSpellingBee$1 nYTApplication$initHybridSpellingBee$1 = new NYTApplication$initHybridSpellingBee$1(this.this$0, by0Var);
        nYTApplication$initHybridSpellingBee$1.L$0 = obj;
        return nYTApplication$initHybridSpellingBee$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d0;
        CoroutineScope coroutineScope;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            NYTApplication nYTApplication = this.this$0;
            this.L$0 = coroutineScope2;
            this.label = 1;
            d0 = nYTApplication.d0(this);
            if (d0 == h) {
                return h;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            kotlin.f.b(obj);
        }
        FlowKt.launchIn(FlowKt.onEach(this.this$0.m().h(), new AnonymousClass1(this.this$0, null)), coroutineScope);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NYTApplication$initHybridSpellingBee$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
