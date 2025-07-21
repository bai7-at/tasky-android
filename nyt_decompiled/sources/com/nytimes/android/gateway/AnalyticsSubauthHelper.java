package com.nytimes.android.gateway;

import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.e32;
import defpackage.e52;
import defpackage.e58;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.i78;
import defpackage.it2;
import defpackage.jc;
import defpackage.s52;
import defpackage.s98;
import defpackage.tx1;
import defpackage.ue4;
import defpackage.v32;
import defpackage.ww8;
import defpackage.x28;
import defpackage.xl1;
import defpackage.y28;
import defpackage.y88;
import defpackage.z88;
import defpackage.zq3;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class AnalyticsSubauthHelper {
    public static final a Companion = new a(null);
    public static final int f = 8;
    private static final SimpleDateFormat g = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
    private final jc a;
    private final ET2SimpleScope b;
    private final xl1 c;
    private final s52 d;
    private CoroutineScope e;

    @fc1(c = "com.nytimes.android.gateway.AnalyticsSubauthHelper$1", f = "AnalyticsSubauthHelper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.gateway.AnalyticsSubauthHelper$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e58 e58Var, by0 by0Var) {
            return ((AnonymousClass1) create(e58Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = AnalyticsSubauthHelper.this.new AnonymousClass1(by0Var);
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
            AnalyticsSubauthHelper.this.c.a((e58) this.L$0);
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.android.gateway.AnalyticsSubauthHelper$2", f = "AnalyticsSubauthHelper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.gateway.AnalyticsSubauthHelper$2, reason: invalid class name */
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
            NYTLogger.h((Throwable) this.L$0);
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(by0Var);
            anonymousClass2.L$0 = th;
            return anonymousClass2.invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "com.nytimes.android.gateway.AnalyticsSubauthHelper$3", f = "AnalyticsSubauthHelper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.gateway.AnalyticsSubauthHelper$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements gt2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i78 i78Var, by0 by0Var) {
            return ((AnonymousClass3) create(i78Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass3 anonymousClass3 = AnalyticsSubauthHelper.this.new AnonymousClass3(by0Var);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            i78 i78Var = (i78) this.L$0;
            if (i78Var instanceof i78.e) {
                AnalyticsSubauthHelper.this.i(((i78.e) i78Var).a());
            } else if (i78Var instanceof i78.a) {
                AnalyticsSubauthHelper.this.h(new e52.d(), ((i78.a) i78Var).a());
            } else if (i78Var instanceof i78.b) {
                AnalyticsSubauthHelper.this.h(new e52.e(), ((i78.b) i78Var).a());
            } else if (i78Var instanceof i78.d) {
                AnalyticsSubauthHelper.this.g();
            }
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.android.gateway.AnalyticsSubauthHelper$4", f = "AnalyticsSubauthHelper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.gateway.AnalyticsSubauthHelper$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements it2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass4(by0 by0Var) {
            super(3, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            NYTLogger.h((Throwable) this.L$0);
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(by0Var);
            anonymousClass4.L$0 = th;
            return anonymousClass4.invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "com.nytimes.android.gateway.AnalyticsSubauthHelper$5", f = "AnalyticsSubauthHelper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.gateway.AnalyticsSubauthHelper$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements gt2 {
        final /* synthetic */ z88 $subauthPurchaseClient;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(z88 z88Var, by0 by0Var) {
            super(2, by0Var);
            this.$subauthPurchaseClient = z88Var;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y88.a aVar, by0 by0Var) {
            return ((AnonymousClass5) create(aVar, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass5 anonymousClass5 = AnalyticsSubauthHelper.this.new AnonymousClass5(this.$subauthPurchaseClient, by0Var);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            y28 a = ((y88.a) this.L$0).a();
            if (a instanceof y28.b) {
                AnalyticsSubauthHelper.this.j(((y28.b) a).b(), this.$subauthPurchaseClient.t(), this.$subauthPurchaseClient.S());
            }
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.android.gateway.AnalyticsSubauthHelper$6", f = "AnalyticsSubauthHelper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.gateway.AnalyticsSubauthHelper$6, reason: invalid class name */
    static final class AnonymousClass6 extends SuspendLambda implements it2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass6(by0 by0Var) {
            super(3, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            NYTLogger.h((Throwable) this.L$0);
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(by0Var);
            anonymousClass6.L$0 = th;
            return anonymousClass6.invokeSuspend(ww8.a);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AnalyticsSubauthHelper(jc jcVar, s98 s98Var, z88 z88Var, ET2SimpleScope eT2SimpleScope, xl1 xl1Var, s52 s52Var, CoroutineScope coroutineScope) {
        CompletableJob Job$default;
        zq3.h(jcVar, "analyticsClient");
        zq3.h(s98Var, "subauthUserUI");
        zq3.h(z88Var, "subauthPurchaseClient");
        zq3.h(eT2SimpleScope, "et2Scope");
        zq3.h(xl1Var, "deleteAccountAnalyticsHelper");
        zq3.h(s52Var, "eventTrackerWrapper");
        zq3.h(coroutineScope, "applicationScope");
        this.a = jcVar;
        this.b = eT2SimpleScope;
        this.c = xl1Var;
        this.d = s52Var;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.e = CoroutineScopeKt.CoroutineScope(Job$default);
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(s98Var.P(), new AnonymousClass1(null)), new AnonymousClass2(null)), coroutineScope);
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(s98Var.R(), new AnonymousClass3(null)), new AnonymousClass4(null)), coroutineScope);
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(z88Var.i(), new AnonymousClass5(z88Var, null)), new AnonymousClass6(null)), coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        CoroutineScopeKt.cancel$default(this.e, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(e52 e52Var, v32 v32Var) {
        if (v32Var != null) {
            ET2PageScope.DefaultImpls.a(this.b, e52Var, v32Var.b(), v32Var.a(), null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(e32 e32Var) {
        k();
        BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new AnalyticsSubauthHelper$reportPageEvent$1(this, e32Var, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(x28 x28Var, String str, String str2) {
        PageContext pageContext;
        this.a.v(str, x28Var.h(), x28Var);
        Pair[] pairArr = (Pair[]) i.q(new Pair("event_name", "purchase"), new Pair("oc", l(x28Var.h())), new Pair("sku", x28Var.h()), new Pair("transaction_id", x28Var.b()), new Pair("purchase_date", g.format(new Date(x28Var.f()))), new Pair("auto_renew_flag", String.valueOf(x28Var.j())), str2 != null ? new Pair("region", str2) : null).toArray(new Pair[0]);
        ue4 ue4Var = new ue4((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        s52 s52Var = this.d;
        tx1 c = this.b.c();
        if (c == null || (pageContext = c.i()) == null) {
            pageContext = new PageContext(null, null, null, null, 0, 31, null);
        }
        s52Var.a(pageContext, new e52.k(), ue4Var.a());
    }

    private final void k() {
        CompletableJob Job$default;
        if (CoroutineScopeKt.isActive(this.e)) {
            return;
        }
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.e = CoroutineScopeKt.CoroutineScope(Job$default);
    }

    private final String l(String str) {
        if (h.P(str, "oc.", false, 2, null)) {
            return h.U0(str, "oc.", null, 2, null);
        }
        return null;
    }
}
