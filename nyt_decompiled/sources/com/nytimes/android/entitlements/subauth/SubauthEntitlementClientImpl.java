package com.nytimes.android.entitlements.subauth;

import android.content.SharedPreferences;
import com.nytimes.android.api.config.model.EComm;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.subauth.core.api.client.SubscriptionLevel;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import defpackage.by0;
import defpackage.c78;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.my3;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt;

/* loaded from: classes4.dex */
public final class SubauthEntitlementClientImpl implements c78 {
    public static final a Companion = new a(null);
    private final Subauth a;
    private final MutableStateFlow b;

    @fc1(c = "com.nytimes.android.entitlements.subauth.SubauthEntitlementClientImpl$1", f = "SubauthEntitlementClientImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.entitlements.subauth.SubauthEntitlementClientImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ SharedPreferences $sharedPreferences;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SharedPreferences sharedPreferences, by0 by0Var) {
            super(2, by0Var);
            this.$sharedPreferences = sharedPreferences;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(EComm eComm, by0 by0Var) {
            return ((AnonymousClass1) create(eComm, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = SubauthEntitlementClientImpl.this.new AnonymousClass1(this.$sharedPreferences, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            EComm eComm = (EComm) this.L$0;
            SubauthEntitlementClientImpl.this.b.setValue(i.X0(b0.m(eComm.getNytSkus(), eComm.getPreviousSkus())));
            this.$sharedPreferences.edit().putStringSet("nytSkus", eComm.getNytSkus()).putStringSet("prevSku", eComm.getPreviousSkus()).apply();
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.android.entitlements.subauth.SubauthEntitlementClientImpl$2", f = "SubauthEntitlementClientImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.entitlements.subauth.SubauthEntitlementClientImpl$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements it2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(by0 by0Var) {
            super(3, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            NYTLogger.i((Throwable) this.L$0, "Unable to stream latestEcomm flow used for getting news skus", new Object[0]);
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(by0Var);
            anonymousClass2.L$0 = th;
            return anonymousClass2.invokeSuspend(ww8.a);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SubauthEntitlementClientImpl(Subauth subauth, my3 my3Var, SharedPreferences sharedPreferences, CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(subauth, "subauth");
        zq3.h(my3Var, "latestEComm");
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(coroutineScope, "applicationScope");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        this.a = subauth;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.b = MutableStateFlow;
        Set<String> stringSet = sharedPreferences.getStringSet("prevSku", b0.e());
        zq3.f(stringSet, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        Set<String> stringSet2 = sharedPreferences.getStringSet("nytSkus", b0.e());
        zq3.f(stringSet2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        MutableStateFlow.setValue(i.X0(b0.m(stringSet, stringSet2)));
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.flowOn(FlowKt.onEach(RxConvertKt.asFlow(my3Var.stream()), new AnonymousClass1(sharedPreferences, null)), coroutineDispatcher), new AnonymousClass2(null)), coroutineScope);
    }

    @Override // defpackage.c78
    public boolean F() {
        return this.a.i().a();
    }

    @Override // defpackage.c78
    public List N() {
        return (List) this.b.getValue();
    }

    @Override // defpackage.c78
    public boolean O() {
        return this.a.i().b();
    }

    @Override // defpackage.c78
    public boolean Q() {
        return this.a.i().l() == SubscriptionLevel.REGISTERED_SUBSCRIBED_LINKED;
    }

    @Override // defpackage.c78
    public Set o() {
        return i.c1(this.a.i().i());
    }

    @Override // defpackage.c78
    public boolean p() {
        SubscriptionLevel l = this.a.i().l();
        return l == SubscriptionLevel.ANONYMOUSLY_SUBSCRIBED || l == SubscriptionLevel.REGISTERED_SUBSCRIBED_UNLINKED;
    }

    @Override // defpackage.c78
    public boolean s() {
        Set a2 = com.nytimes.android.subauth.core.database.userdata.subscription.a.a();
        ArrayList arrayList = new ArrayList(i.w(a2, 10));
        Iterator it2 = a2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((UserSubscriptionEntitlement) it2.next()).getRawValue());
        }
        return !i.D0(arrayList, i.c1(this.a.i().i())).isEmpty();
    }

    @Override // defpackage.c78
    public boolean x() {
        return this.a.i().s();
    }

    @Override // defpackage.c78
    public boolean z() {
        SubscriptionLevel l = this.a.i().l();
        return l == SubscriptionLevel.ANONYMOUSLY_SUBSCRIBED || l == SubscriptionLevel.REGISTERED_SUBSCRIBED_UNLINKED;
    }
}
