package com.nytimes.android.features.discovery.discoverytab;

import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.utils.LifecycleOwnersKtxKt;
import defpackage.ai0;
import defpackage.by0;
import defpackage.d44;
import defpackage.di0;
import defpackage.e44;
import defpackage.e52;
import defpackage.ei1;
import defpackage.fc1;
import defpackage.g90;
import defpackage.gt2;
import defpackage.j38;
import defpackage.jk;
import defpackage.ki0;
import defpackage.mh7;
import defpackage.qs2;
import defpackage.s42;
import defpackage.u32;
import defpackage.ue4;
import defpackage.uv4;
import defpackage.ww8;
import defpackage.y32;
import defpackage.zq3;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class DiscoveryEventTracker {
    private final ET2Scope a;
    private final jk b;
    private final Set c;
    private final MutableSharedFlow d;
    private final SharedFlow e;

    @fc1(c = "com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$2", f = "DiscoveryEventTracker.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Lifecycle.Event event, by0 by0Var) {
            return ((AnonymousClass2) create(event, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = DiscoveryEventTracker.this.new AnonymousClass2(by0Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Lifecycle.Event event = (Lifecycle.Event) this.L$0;
                MutableSharedFlow mutableSharedFlow = DiscoveryEventTracker.this.d;
                this.label = 1;
                if (mutableSharedFlow.emit(event, this) == h) {
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
    }

    public DiscoveryEventTracker(ET2Scope eT2Scope, jk jkVar) {
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(jkVar, "activity");
        this.a = eT2Scope;
        this.b = jkVar;
        this.c = new LinkedHashSet();
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.d = MutableSharedFlow$default;
        this.e = FlowKt.asSharedFlow(MutableSharedFlow$default);
        Lifecycle lifecycle = jkVar.getLifecycle();
        zq3.g(lifecycle, "<get-lifecycle>(...)");
        final Flow a = LifecycleOwnersKtxKt.a(lifecycle);
        FlowKt.launchIn(FlowKt.onEach(new Flow() { // from class: com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$special$$inlined$filter$1

            /* renamed from: com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$special$$inlined$filter$1$2", f = "DiscoveryEventTracker.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$special$$inlined$filter$1$2$1 r0 = (com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$special$$inlined$filter$1$2$1 r0 = new com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L46
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        r6 = r5
                        androidx.lifecycle.Lifecycle$Event r6 = (androidx.lifecycle.Lifecycle.Event) r6
                        androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_START
                        if (r6 != r2) goto L46
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L46
                        return r1
                    L46:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        }, new AnonymousClass2(null)), e44.a(jkVar));
        jkVar.getLifecycle().a(new ei1() { // from class: com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker.3
            @Override // defpackage.ei1
            public void onResume(d44 d44Var) {
                zq3.h(d44Var, "owner");
                DiscoveryEventTracker.this.c.clear();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(final ki0 ki0Var) {
        if (this.c.add(ki0Var.c())) {
            ET2PageScope.DefaultImpls.a(this.a, new e52.d(), null, null, new qs2() { // from class: com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker$trackCarouselStoryLockup$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ue4 mo865invoke() {
                    return new di0(new g90(ki0.this.e(), null, ki0.this.f(), null, 10, null), new ai0(ki0.this.c(), ki0.this.d(), ki0.this.g(), null, null, 24, null), null, 4, null);
                }
            }, 6, null);
        }
    }

    private final void i(ki0 ki0Var) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("asset tap", ki0Var.e(), null, null, null, null, null, new y32(null, ki0Var.c(), ki0Var.d(), null, null, null, 57, null), ki0Var.f(), 124, null), new u32(null, "section tab", "tap", 1, null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(j38 j38Var) {
        if (this.c.add(j38Var.c())) {
            ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42(null, null, null, null, null, null, j38Var.c(), null, null, 447, null), null, null, 12, null);
        }
    }

    private final void o(j38 j38Var) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42(null, null, null, null, null, null, j38Var.c(), null, null, 447, null), null, null, 12, null);
    }

    public final SharedFlow f() {
        return this.e;
    }

    public final void g() {
        this.a.b();
    }

    public final Job j(j38 j38Var) {
        Job launch$default;
        zq3.h(j38Var, "storyLockup");
        launch$default = BuildersKt__Builders_commonKt.launch$default(e44.a(this.b), null, null, new DiscoveryEventTracker$trackImpression$1(this, j38Var, null), 3, null);
        return launch$default;
    }

    public final void k(j38 j38Var) {
        zq3.h(j38Var, "storyLockup");
        if (j38Var instanceof ki0) {
            i((ki0) j38Var);
        } else {
            o(j38Var);
        }
    }

    public final void l(uv4 uv4Var) {
        zq3.h(uv4Var, "lockup");
        ET2Scope eT2Scope = this.a;
        e52.e eVar = new e52.e();
        String b = uv4Var.b();
        String f = uv4Var.f();
        ET2PageScope.DefaultImpls.a(eT2Scope, eVar, new s42("more in " + uv4Var.b() + " tap", null, null, null, null, null, null, new y32(b, uv4Var.e(), f, "Carousel." + uv4Var.c(), null, null, 48, null), null, 382, null), new u32(null, "section tab", "tap", 1, null), null, 8, null);
    }

    public final void m(mh7 mh7Var) {
        zq3.h(mh7Var, "lockup");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("section front tap", null, null, null, null, null, null, new y32(mh7Var.c().c(), mh7Var.d(), null, mh7Var.b(), null, null, 52, null), null, 382, null), new u32(null, "section tab", "tap", 1, null), null, 8, null);
    }
}
