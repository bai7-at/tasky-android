package com.nytimes.android.performancetrackerclientphoenix.event;

import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.monitor.b;
import com.nytimes.android.utils.TimeDuration;
import defpackage.by0;
import defpackage.cr5;
import defpackage.d44;
import defpackage.ei1;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zo2;
import defpackage.zq3;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes4.dex */
public final class MetricsTracker implements ei1 {
    public static final a Companion = new a(null);
    private static final long e = new TimeDuration(1, TimeUnit.MINUTES).d(TimeUnit.MILLISECONDS);
    private final Set a;
    private final cr5 b;
    private final zo2 c;
    private final CoroutineScope d;

    @fc1(c = "com.nytimes.android.performancetrackerclientphoenix.event.MetricsTracker$1", f = "MetricsTracker.kt", l = {34}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.performancetrackerclientphoenix.event.MetricsTracker$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return MetricsTracker.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long a;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            do {
                if (MetricsTracker.this.c.a()) {
                    Set set = MetricsTracker.this.a;
                    MetricsTracker metricsTracker = MetricsTracker.this;
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        AppEvent b = ((b) it2.next()).b();
                        if (b != null) {
                            metricsTracker.b.d(AppEvent.toEventConvertible$default(b, null, 1, null));
                        }
                    }
                }
                a = MetricsTracker.Companion.a();
                this.label = 1;
            } while (DelayKt.delay(a, this) != h);
            return h;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return MetricsTracker.e;
        }

        private a() {
        }
    }

    public MetricsTracker(Set set, cr5 cr5Var, zo2 zo2Var, CoroutineScope coroutineScope) {
        zq3.h(set, "monitors");
        zq3.h(cr5Var, "performanceTrackerClient");
        zq3.h(zo2Var, "foregroundState");
        zq3.h(coroutineScope, "coroutineScope");
        this.a = set;
        this.b = cr5Var;
        this.c = zo2Var;
        this.d = coroutineScope;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // defpackage.ei1
    public void onPause(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.c.b(false);
    }

    @Override // defpackage.ei1
    public void onResume(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.c.b(true);
        BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new MetricsTracker$onResume$1(this, null), 3, null);
    }
}
