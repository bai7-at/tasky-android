package com.nytimes.android.ribbon.et2;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.ribbon.config.RibbonConfig;
import defpackage.by0;
import defpackage.di0;
import defpackage.du8;
import defpackage.e52;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.s42;
import defpackage.s55;
import defpackage.tx1;
import defpackage.u32;
import defpackage.ue4;
import defpackage.wt6;
import defpackage.ww8;
import defpackage.y32;
import defpackage.zq3;
import java.util.HashSet;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public final class DestinationEventTracker {
    public static final a Companion = new a(null);
    public static final int f = 8;
    private final ET2SimpleScope a;
    private final CoroutineDispatcher b;
    private final CoroutineScope c;
    private RibbonConfig d;
    private final HashSet e;

    @fc1(c = "com.nytimes.android.ribbon.et2.DestinationEventTracker$1", f = "DestinationEventTracker.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.ribbon.et2.DestinationEventTracker$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;

        /* renamed from: com.nytimes.android.ribbon.et2.DestinationEventTracker$1$a */
        static final class a implements FlowCollector {
            final /* synthetic */ DestinationEventTracker a;

            a(DestinationEventTracker destinationEventTracker) {
                this.a = destinationEventTracker;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(tx1 tx1Var, by0 by0Var) {
                this.a.j();
                return ww8.a;
            }
        }

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return DestinationEventTracker.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                final Flow filterNotNull = FlowKt.filterNotNull(DestinationEventTracker.this.a.f());
                Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new Flow() { // from class: com.nytimes.android.ribbon.et2.DestinationEventTracker$1$invokeSuspend$$inlined$filter$1

                    /* renamed from: com.nytimes.android.ribbon.et2.DestinationEventTracker$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 implements FlowCollector {
                        final /* synthetic */ FlowCollector a;

                        @fc1(c = "com.nytimes.android.ribbon.et2.DestinationEventTracker$1$invokeSuspend$$inlined$filter$1$2", f = "DestinationEventTracker.kt", l = {219}, m = "emit")
                        /* renamed from: com.nytimes.android.ribbon.et2.DestinationEventTracker$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                boolean r0 = r6 instanceof com.nytimes.android.ribbon.et2.DestinationEventTracker$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.nytimes.android.ribbon.et2.DestinationEventTracker$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.nytimes.android.ribbon.et2.DestinationEventTracker$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                com.nytimes.android.ribbon.et2.DestinationEventTracker$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.nytimes.android.ribbon.et2.DestinationEventTracker$1$invokeSuspend$$inlined$filter$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.f.b(r6)
                                goto L4a
                            L29:
                                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                r4.<init>(r5)
                                throw r4
                            L31:
                                kotlin.f.b(r6)
                                kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                                r6 = r5
                                tx1 r6 = (defpackage.tx1) r6
                                e32 r6 = r6.h()
                                boolean r6 = r6 instanceof defpackage.zl9
                                if (r6 == 0) goto L4a
                                r0.label = r3
                                java.lang.Object r4 = r4.emit(r5, r0)
                                if (r4 != r1) goto L4a
                                return r1
                            L4a:
                                ww8 r4 = defpackage.ww8.a
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.et2.DestinationEventTracker$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector flowCollector, by0 by0Var) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                        return collect == a.h() ? collect : ww8.a;
                    }
                });
                a aVar = new a(DestinationEventTracker.this);
                this.label = 1;
                if (distinctUntilChanged.collect(aVar, this) == h) {
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

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(RibbonConfig ribbonConfig) {
            zq3.h(ribbonConfig, "<this>");
            if (ribbonConfig == RibbonConfig.TODAY) {
                return "home";
            }
            return ribbonConfig.getEt2Name() + " panel";
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RibbonConfig.values().length];
            try {
                iArr[RibbonConfig.LIFESTYLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RibbonConfig.ELECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RibbonConfig.BEST_OF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RibbonConfig.TODAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public DestinationEventTracker(ET2SimpleScope eT2SimpleScope, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(eT2SimpleScope, "et2Scope");
        zq3.h(coroutineDispatcher, "dispatcher");
        this.a = eT2SimpleScope;
        this.b = coroutineDispatcher;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.c = CoroutineScope;
        this.e = new HashSet();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        this.e.clear();
    }

    private final s55 k(RibbonConfig ribbonConfig) {
        int i = b.a[ribbonConfig.ordinal()];
        return (i == 1 || i == 2) ? new s55.x(Companion.a(ribbonConfig)) : i != 4 ? new s55.w(Companion.a(ribbonConfig)) : s55.f.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l(RibbonConfig ribbonConfig) {
        return ribbonConfig == this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m(RibbonConfig ribbonConfig) {
        return ribbonConfig != this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ue4 n(RibbonConfig ribbonConfig, String str) {
        int i = b.a[ribbonConfig.ordinal()];
        if (i == 1) {
            return new ue4(du8.a("canonical_url", str));
        }
        if (i == 2) {
            return new ue4(du8.a("canonical_url", str));
        }
        if (i != 3) {
            return null;
        }
        return new ue4(du8.a("canonical_url", str));
    }

    public static /* synthetic */ Job t(DestinationEventTracker destinationEventTracker, RibbonConfig ribbonConfig, s42 s42Var, u32 u32Var, ue4 ue4Var, int i, Object obj) {
        if ((i & 8) != 0) {
            ue4Var = null;
        }
        return destinationEventTracker.s(ribbonConfig, s42Var, u32Var, ue4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(String str, RibbonConfig ribbonConfig) {
        if (ribbonConfig != null) {
            ET2SimpleScope eT2SimpleScope = this.a;
            e52.e eVar = new e52.e();
            a aVar = Companion;
            y32 y32Var = new y32(aVar.a(ribbonConfig), null, null, null, null, null, 62, null);
            RibbonConfig ribbonConfig2 = this.d;
            s42 s42Var = new s42(str, null, null, null, null, null, null, y32Var, ribbonConfig2 != null ? aVar.a(ribbonConfig2) : null, WebSocketProtocol.PAYLOAD_SHORT, null);
            RibbonConfig ribbonConfig3 = this.d;
            ET2PageScope.DefaultImpls.a(eT2SimpleScope, eVar, s42Var, new u32(null, ribbonConfig3 != null ? aVar.a(ribbonConfig3) : null, null, 5, null), null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(CoroutineScope coroutineScope, final RibbonConfig ribbonConfig, final String str, wt6 wt6Var, by0 by0Var) {
        if (ribbonConfig == null) {
            return ww8.a;
        }
        this.d = ribbonConfig;
        Object i = ET2SimpleScope.i(this.a, k(ribbonConfig), null, null, wt6Var, null, new qs2() { // from class: com.nytimes.android.ribbon.et2.DestinationEventTracker$trackPage$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ue4 mo865invoke() {
                ue4 n;
                n = DestinationEventTracker.this.n(ribbonConfig, str);
                return n;
            }
        }, null, null, coroutineScope, by0Var, 214, null);
        return i == kotlin.coroutines.intrinsics.a.h() ? i : ww8.a;
    }

    static /* synthetic */ Object z(DestinationEventTracker destinationEventTracker, CoroutineScope coroutineScope, RibbonConfig ribbonConfig, String str, wt6 wt6Var, by0 by0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            wt6Var = null;
        }
        return destinationEventTracker.y(coroutineScope, ribbonConfig, str, wt6Var, by0Var);
    }

    public final Job o(RibbonConfig ribbonConfig, String str) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new DestinationEventTracker$pageSwipeEvent$1(this, ribbonConfig, str, null), 3, null);
        return launch$default;
    }

    public final Job p(RibbonConfig ribbonConfig, String str) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new DestinationEventTracker$pageTapEvent$1(this, ribbonConfig, str, null), 3, null);
        return launch$default;
    }

    public final Job q(RibbonConfig ribbonConfig, s42 s42Var) {
        Job launch$default;
        zq3.h(ribbonConfig, "config");
        zq3.h(s42Var, "eventModule");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new DestinationEventTracker$sendHandoffInteractionEvent$1(this, ribbonConfig, s42Var, null), 3, null);
        return launch$default;
    }

    public final Job r(Key key, RibbonConfig ribbonConfig, s42 s42Var) {
        Job launch$default;
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(ribbonConfig, "config");
        zq3.h(s42Var, "eventModule");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new DestinationEventTracker$sendImpressionEvent$1(this, key, ribbonConfig, s42Var, null), 3, null);
        return launch$default;
    }

    public final Job s(RibbonConfig ribbonConfig, s42 s42Var, u32 u32Var, ue4 ue4Var) {
        Job launch$default;
        zq3.h(ribbonConfig, "config");
        zq3.h(s42Var, "module");
        zq3.h(u32Var, "eventData");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new DestinationEventTracker$sendInteractionEvent$1(this, ribbonConfig, s42Var, u32Var, ue4Var, null), 3, null);
        return launch$default;
    }

    public final Job u(Key key, RibbonConfig ribbonConfig, s42 s42Var, di0 di0Var) {
        Job launch$default;
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(ribbonConfig, "config");
        zq3.h(s42Var, "eventModule");
        zq3.h(di0Var, "cardImpression");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new DestinationEventTracker$sendListItemImpressionEvent$1(this, key, ribbonConfig, s42Var, di0Var, null), 3, null);
        return launch$default;
    }

    public final Job v(Key key, RibbonConfig ribbonConfig, s42 s42Var, ue4 ue4Var) {
        Job launch$default;
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(ribbonConfig, "config");
        zq3.h(s42Var, "eventModule");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new DestinationEventTracker$sendListItemImpressionEvent$2(this, key, ribbonConfig, s42Var, ue4Var, null), 3, null);
        return launch$default;
    }

    public final void w(RibbonConfig ribbonConfig, String str, wt6 wt6Var) {
        if (ribbonConfig != null) {
            BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new DestinationEventTracker$sendPage$1(this, ribbonConfig, str, wt6Var, null), 3, null);
        }
    }
}
