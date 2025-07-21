package com.nytimes.android.firebase.compliance;

import android.os.Bundle;
import com.nytimes.android.entitlements.purr.client.DirectiveKeys;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.d96;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ic;
import defpackage.it2;
import defpackage.uc;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class FirebasePurrEventInterceptor implements ic {
    private final d96 a;
    private final CoroutineScope b;
    private final List c;
    private Map d;

    @fc1(c = "com.nytimes.android.firebase.compliance.FirebasePurrEventInterceptor$1", f = "FirebasePurrEventInterceptor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.firebase.compliance.FirebasePurrEventInterceptor$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Map map, by0 by0Var) {
            return ((AnonymousClass1) create(map, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = FirebasePurrEventInterceptor.this.new AnonymousClass1(by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            FirebasePurrEventInterceptor.this.d((Map) this.L$0);
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.android.firebase.compliance.FirebasePurrEventInterceptor$2", f = "FirebasePurrEventInterceptor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.firebase.compliance.FirebasePurrEventInterceptor$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements it2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(by0 by0Var) {
            super(3, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
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

    public FirebasePurrEventInterceptor(d96 d96Var, CoroutineDispatcher coroutineDispatcher) {
        CompletableJob Job$default;
        zq3.h(d96Var, "purrManager");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.a = d96Var;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(coroutineDispatcher));
        this.b = CoroutineScope;
        List e = i.e(DirectiveKeys.AcceptableTrackersDirectiveV2.getKey());
        this.c = e;
        this.d = t.i();
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(d96Var.c(e), new AnonymousClass1(null)), new AnonymousClass2(null)), CoroutineScope);
    }

    @Override // defpackage.ic
    public void a(Bundle bundle) {
        zq3.h(bundle, "bundle");
        for (Map.Entry entry : this.d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // defpackage.ic
    public void b(Map map) {
        zq3.h(map, "builder");
        for (Map.Entry entry : this.d.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.ic
    public boolean c(uc ucVar) {
        zq3.h(ucVar, "event");
        return true;
    }

    public final void d(Map map) {
        zq3.h(map, "<set-?>");
        this.d = map;
    }
}
