package com.nytimes.android.utils;

import android.app.Application;
import android.content.Context;
import com.comscore.Analytics;
import com.comscore.PublisherConfiguration;
import com.comscore.UsagePropertiesAutoUpdateMode;
import com.google.common.collect.ImmutableMap;
import com.nytimes.android.entitlements.purr.client.contracts.models.PurrTrackerType;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.secrets.Secrets;
import defpackage.bp0;
import defpackage.by0;
import defpackage.d96;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class ComScoreWrapperImpl implements bp0 {
    public static final a Companion = new a(null);
    public static final int g = 8;
    private final CoroutineDispatcher a;
    private final AtomicBoolean b;
    private final WeakReference c;
    private final AppPreferences d;
    private final d96 e;
    private final CoroutineScope f;

    @fc1(c = "com.nytimes.android.utils.ComScoreWrapperImpl$1", f = "ComScoreWrapperImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.utils.ComScoreWrapperImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        public final Object b(boolean z, by0 by0Var) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return ComScoreWrapperImpl.this.new AnonymousClass1(by0Var);
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Boolean) obj).booleanValue(), (by0) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            ComScoreWrapperImpl.this.b();
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.android.utils.ComScoreWrapperImpl$2", f = "ComScoreWrapperImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.utils.ComScoreWrapperImpl$2, reason: invalid class name */
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
            NYTLogger.i((Throwable) this.L$0, "Error on gdpr status change", new Object[0]);
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

    public ComScoreWrapperImpl(Application application, AppPreferences appPreferences, d96 d96Var, CoroutineDispatcher coroutineDispatcher) {
        CompletableJob Job$default;
        zq3.h(application, "context");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(d96Var, "purrManagerClient");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.a = coroutineDispatcher;
        this.b = new AtomicBoolean(false);
        this.c = new WeakReference(application);
        this.d = appPreferences;
        this.e = d96Var;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(coroutineDispatcher));
        this.f = CoroutineScope;
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(d96Var.e(PurrTrackerType.CONTROLLER), new AnonymousClass1(null)), new AnonymousClass2(null)), CoroutineScope);
    }

    public boolean a() {
        return this.d.n("COMSCORE_DISABLED", false) || !this.e.f(PurrTrackerType.CONTROLLER);
    }

    @Override // defpackage.bp0
    public void b() {
        Context context;
        if (a() || !this.b.compareAndSet(false, true) || (context = (Context) this.c.get()) == null) {
            return;
        }
        Analytics.getConfiguration().addClient(new PublisherConfiguration.Builder().publisherId(Secrets.COMSCORE_CUSTOMER_C2.decode()).persistentLabels(ImmutableMap.q("cs_ucfr", "0")).build());
        Analytics.getConfiguration().setUsagePropertiesAutoUpdateMode(UsagePropertiesAutoUpdateMode.FOREGROUND_AND_BACKGROUND);
        Analytics.start(context);
    }

    @Override // defpackage.bp0
    public void c(boolean z) {
    }

    @Override // defpackage.bp0
    public void d() {
        if (a()) {
            return;
        }
        Analytics.notifyUxActive();
    }

    @Override // defpackage.bp0
    public void e() {
        if (a()) {
            return;
        }
        Analytics.notifyEnterForeground();
    }

    @Override // defpackage.bp0
    public void f() {
        if (a()) {
            return;
        }
        Analytics.notifyUxInactive();
    }

    @Override // defpackage.bp0
    public void g() {
        if (a()) {
            return;
        }
        Analytics.notifyExitForeground();
    }
}
