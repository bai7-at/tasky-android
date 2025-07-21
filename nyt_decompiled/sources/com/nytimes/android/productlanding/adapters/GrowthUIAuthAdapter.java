package com.nytimes.android.productlanding.adapters;

import android.content.Context;
import com.nytimes.android.growthui.common.models.Subscription;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.n98;
import defpackage.t43;
import defpackage.u43;
import defpackage.ww8;
import defpackage.z58;
import defpackage.zq3;
import java.util.ArrayList;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class GrowthUIAuthAdapter implements t43 {
    private final z58 a;
    private final CoroutineScope b;
    private final MutableStateFlow c;
    private final SharedFlow d;

    @fc1(c = "com.nytimes.android.productlanding.adapters.GrowthUIAuthAdapter$1", f = "GrowthUIAuthAdapter.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.productlanding.adapters.GrowthUIAuthAdapter$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NYTUser.StateChangeType stateChangeType, by0 by0Var) {
            return ((AnonymousClass1) create(stateChangeType, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return GrowthUIAuthAdapter.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            GrowthUIAuthAdapter.this.d();
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.android.productlanding.adapters.GrowthUIAuthAdapter$2", f = "GrowthUIAuthAdapter.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.productlanding.adapters.GrowthUIAuthAdapter$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass2(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return GrowthUIAuthAdapter.this.new AnonymousClass2(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            GrowthUIAuthAdapter.this.d();
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public GrowthUIAuthAdapter(CoroutineDispatcher coroutineDispatcher, z58 z58Var) {
        zq3.h(coroutineDispatcher, "dispatcher");
        zq3.h(z58Var, "subauthClient");
        this.a = z58Var;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.b = CoroutineScope;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(u43.a.b);
        this.c = MutableStateFlow;
        this.d = FlowKt.shareIn(MutableStateFlow, CoroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), 1);
        FlowKt.launchIn(FlowKt.onEach(z58Var.h().h(), new AnonymousClass1(null)), CoroutineScope);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        Object value;
        String L = this.a.L();
        ArrayList arrayList = new ArrayList();
        if (this.a.O()) {
            arrayList.add(Subscription.Games);
        }
        if (this.a.F()) {
            arrayList.add(Subscription.News);
        }
        MutableStateFlow mutableStateFlow = this.c;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, new u43.b(L, i.c1(arrayList))));
    }

    @Override // defpackage.t43
    public Object a(Context context, by0 by0Var) {
        Object a = n98.a.a(this.a, context, false, RegiInterface.RegiWelcome, null, by0Var, 10, null);
        return a == a.h() ? a : ww8.a;
    }

    @Override // defpackage.t43
    public SharedFlow b() {
        return this.d;
    }
}
