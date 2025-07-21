package com.nytimes.subauth.ui.purr.tcf;

import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.subauth.core.purr.a;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import defpackage.b22;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h55;
import defpackage.mm6;
import defpackage.p96;
import defpackage.q96;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.z38;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class TCFViewModel extends q {
    public static final Companion g = new Companion(null);
    public static final int h = 8;
    private final a a;
    private final h55 b;
    private final MutableSharedFlow c;
    private final CoroutineDispatcher d;
    private MutableStateFlow e;
    private final StateFlow f;

    @fc1(c = "com.nytimes.subauth.ui.purr.tcf.TCFViewModel$1", f = "TCFViewModel.kt", l = {71, 71}, m = "invokeSuspend")
    /* renamed from: com.nytimes.subauth.ui.purr.tcf.TCFViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = TCFViewModel.this.new AnonymousClass1(by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                flowCollector = (FlowCollector) this.L$0;
                a aVar = TCFViewModel.this.a;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = aVar.a(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    return ww8.a;
                }
                flowCollector = (FlowCollector) this.L$0;
                f.b(obj);
            }
            this.L$0 = null;
            this.label = 2;
            if (flowCollector.emit(obj, this) == h) {
                return h;
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
            return ((AnonymousClass1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "com.nytimes.subauth.ui.purr.tcf.TCFViewModel$2", f = "TCFViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.subauth.ui.purr.tcf.TCFViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass2(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PrivacyConfiguration privacyConfiguration, by0 by0Var) {
            return ((AnonymousClass2) create(privacyConfiguration, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return TCFViewModel.this.new AnonymousClass2(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            if (TCFViewModel.this.s()) {
                TCFViewModel tCFViewModel = TCFViewModel.this;
                tCFViewModel.G(tCFViewModel.a.r() ? Companion.TCFScreenValue.BLOCKER_CARD : Companion.TCFScreenValue.HIDDEN);
            }
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.subauth.ui.purr.tcf.TCFViewModel$5", f = "TCFViewModel.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: com.nytimes.subauth.ui.purr.tcf.TCFViewModel$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass5(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Companion.TCFScreenValue tCFScreenValue, by0 by0Var) {
            return ((AnonymousClass5) create(tCFScreenValue, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return TCFViewModel.this.new AnonymousClass5(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                MutableSharedFlow mutableSharedFlow = TCFViewModel.this.c;
                q96.a.C0515a c0515a = q96.a.C0515a.c;
                this.label = 1;
                if (mutableSharedFlow.emit(c0515a, this) == h) {
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

    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TCFConsentMethod {
            private static final /* synthetic */ b22 $ENTRIES;
            private static final /* synthetic */ TCFConsentMethod[] $VALUES;
            public static final TCFConsentMethod ACCEPT = new TCFConsentMethod("ACCEPT", 0, "accept");
            public static final TCFConsentMethod REJECT = new TCFConsentMethod("REJECT", 1, "reject");
            public static final TCFConsentMethod SAVE = new TCFConsentMethod("SAVE", 2, "save");
            private final String method;

            private static final /* synthetic */ TCFConsentMethod[] $values() {
                return new TCFConsentMethod[]{ACCEPT, REJECT, SAVE};
            }

            static {
                TCFConsentMethod[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private TCFConsentMethod(String str, int i, String str2) {
                this.method = str2;
            }

            public static b22 getEntries() {
                return $ENTRIES;
            }

            public static TCFConsentMethod valueOf(String str) {
                return (TCFConsentMethod) Enum.valueOf(TCFConsentMethod.class, str);
            }

            public static TCFConsentMethod[] values() {
                return (TCFConsentMethod[]) $VALUES.clone();
            }

            public final String getMethod() {
                return this.method;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TCFExperience {
            private static final /* synthetic */ b22 $ENTRIES;
            private static final /* synthetic */ TCFExperience[] $VALUES;
            public static final TCFExperience BLOCKER_CARD_EXPERIENCE = new TCFExperience("BLOCKER_CARD_EXPERIENCE", 0);
            public static final TCFExperience MANAGE_PREFERENCES_EXPERIENCE = new TCFExperience("MANAGE_PREFERENCES_EXPERIENCE", 1);

            private static final /* synthetic */ TCFExperience[] $values() {
                return new TCFExperience[]{BLOCKER_CARD_EXPERIENCE, MANAGE_PREFERENCES_EXPERIENCE};
            }

            static {
                TCFExperience[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private TCFExperience(String str, int i) {
            }

            public static b22 getEntries() {
                return $ENTRIES;
            }

            public static TCFExperience valueOf(String str) {
                return (TCFExperience) Enum.valueOf(TCFExperience.class, str);
            }

            public static TCFExperience[] values() {
                return (TCFExperience[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TCFScreenValue {
            private static final /* synthetic */ b22 $ENTRIES;
            private static final /* synthetic */ TCFScreenValue[] $VALUES;
            public static final TCFScreenValue HIDDEN = new TCFScreenValue("HIDDEN", 0);
            public static final TCFScreenValue BLOCKER_CARD = new TCFScreenValue("BLOCKER_CARD", 1);
            public static final TCFScreenValue MANAGE_PREFERENCES = new TCFScreenValue("MANAGE_PREFERENCES", 2);
            public static final TCFScreenValue FINISH = new TCFScreenValue("FINISH", 3);

            private static final /* synthetic */ TCFScreenValue[] $values() {
                return new TCFScreenValue[]{HIDDEN, BLOCKER_CARD, MANAGE_PREFERENCES, FINISH};
            }

            static {
                TCFScreenValue[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private TCFScreenValue(String str, int i) {
            }

            public static b22 getEntries() {
                return $ENTRIES;
            }

            public static TCFScreenValue valueOf(String str) {
                return (TCFScreenValue) Enum.valueOf(TCFScreenValue.class, str);
            }

            public static TCFScreenValue[] values() {
                return (TCFScreenValue[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static final class a {
            private final TCFExperience a;
            private final TCFScreenValue b;
            private final boolean c;
            private final Integer d;
            private final boolean e;
            private final boolean f;

            public a(TCFExperience tCFExperience, TCFScreenValue tCFScreenValue, boolean z, Integer num, boolean z2, boolean z3) {
                zq3.h(tCFExperience, "tcfExperience");
                zq3.h(tCFScreenValue, "tcfScreen");
                this.a = tCFExperience;
                this.b = tCFScreenValue;
                this.c = z;
                this.d = num;
                this.e = z2;
                this.f = z3;
            }

            public static /* synthetic */ a b(a aVar, TCFExperience tCFExperience, TCFScreenValue tCFScreenValue, boolean z, Integer num, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    tCFExperience = aVar.a;
                }
                if ((i & 2) != 0) {
                    tCFScreenValue = aVar.b;
                }
                TCFScreenValue tCFScreenValue2 = tCFScreenValue;
                if ((i & 4) != 0) {
                    z = aVar.c;
                }
                boolean z4 = z;
                if ((i & 8) != 0) {
                    num = aVar.d;
                }
                Integer num2 = num;
                if ((i & 16) != 0) {
                    z2 = aVar.e;
                }
                boolean z5 = z2;
                if ((i & 32) != 0) {
                    z3 = aVar.f;
                }
                return aVar.a(tCFExperience, tCFScreenValue2, z4, num2, z5, z3);
            }

            public final a a(TCFExperience tCFExperience, TCFScreenValue tCFScreenValue, boolean z, Integer num, boolean z2, boolean z3) {
                zq3.h(tCFExperience, "tcfExperience");
                zq3.h(tCFScreenValue, "tcfScreen");
                return new a(tCFExperience, tCFScreenValue, z, num, z2, z3);
            }

            public final TCFExperience c() {
                return this.a;
            }

            public final TCFScreenValue d() {
                return this.b;
            }

            public final Integer e() {
                return this.d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && zq3.c(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f;
            }

            public final boolean f() {
                return this.e;
            }

            public final boolean g() {
                return this.f;
            }

            public final boolean h() {
                return this.c;
            }

            public int hashCode() {
                int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31;
                Integer num = this.d;
                return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f);
            }

            public String toString() {
                return "TCFState(tcfExperience=" + this.a + ", tcfScreen=" + this.b + ", isShowProgress=" + this.c + ", toastMessageId=" + this.d + ", isFidesUiChanged=" + this.e + ", isShowLoseSavedChangesDialog=" + this.f + ")";
            }

            public /* synthetic */ a(TCFExperience tCFExperience, TCFScreenValue tCFScreenValue, boolean z, Integer num, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? TCFExperience.BLOCKER_CARD_EXPERIENCE : tCFExperience, (i & 2) != 0 ? TCFScreenValue.HIDDEN : tCFScreenValue, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num, (i & 16) != 0 ? false : z2, (i & 32) == 0 ? z3 : false);
            }
        }
    }

    public TCFViewModel(a aVar, h55 h55Var, MutableSharedFlow mutableSharedFlow, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        zq3.h(aVar, "purrManager");
        zq3.h(h55Var, "networkStatus");
        zq3.h(mutableSharedFlow, "tcfAnalyticEventFlow");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(coroutineDispatcher2, "defaultDispatcher");
        this.a = aVar;
        this.b = h55Var;
        this.c = mutableSharedFlow;
        this.d = coroutineDispatcher;
        final MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new Companion.a(null, null, false, null, false, false, 63, null));
        this.e = MutableStateFlow;
        this.f = MutableStateFlow;
        FlowKt.launchIn(FlowKt.flowOn(FlowKt.onEach(FlowKt.onStart(aVar.l(), new AnonymousClass1(null)), new AnonymousClass2(null)), coroutineDispatcher2), r.a(this));
        final Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new Flow() { // from class: com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$map$1

            /* renamed from: com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$map$1$2", f = "TCFViewModel.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                        boolean r0 = r6 instanceof com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$map$1$2$1 r0 = (com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$map$1$2$1 r0 = new com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        com.nytimes.subauth.ui.purr.tcf.TCFViewModel$Companion$a r5 = (com.nytimes.subauth.ui.purr.tcf.TCFViewModel.Companion.a) r5
                        com.nytimes.subauth.ui.purr.tcf.TCFViewModel$Companion$TCFScreenValue r5 = r5.d()
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L45
                        return r1
                    L45:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        });
        FlowKt.launchIn(FlowKt.flowOn(FlowKt.onEach(new Flow() { // from class: com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$filter$1

            /* renamed from: com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$filter$1$2", f = "TCFViewModel.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$filter$1$2$1 r0 = (com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$filter$1$2$1 r0 = new com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$filter$1$2$1
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
                        com.nytimes.subauth.ui.purr.tcf.TCFViewModel$Companion$TCFScreenValue r6 = (com.nytimes.subauth.ui.purr.tcf.TCFViewModel.Companion.TCFScreenValue) r6
                        com.nytimes.subauth.ui.purr.tcf.TCFViewModel$Companion$TCFScreenValue r2 = com.nytimes.subauth.ui.purr.tcf.TCFViewModel.Companion.TCFScreenValue.BLOCKER_CARD
                        if (r6 != r2) goto L46
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L46
                        return r1
                    L46:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.purr.tcf.TCFViewModel$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        }, new AnonymousClass5(null)), coroutineDispatcher2), r.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(boolean z) {
        this.e.setValue(Companion.a.b((Companion.a) this.f.getValue(), null, null, z, null, false, false, 59, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(Integer num) {
        this.e.setValue(Companion.a.b((Companion.a) this.f.getValue(), null, null, false, num, false, false, 55, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(boolean z) {
        this.e.setValue(Companion.a.b((Companion.a) this.f.getValue(), null, null, false, null, z, false, 47, null));
    }

    private final void F(boolean z) {
        this.e.setValue(Companion.a.b((Companion.a) this.f.getValue(), null, null, false, null, false, z, 31, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(Companion.TCFScreenValue tCFScreenValue) {
        this.e.setValue(Companion.a.b((Companion.a) this.f.getValue(), null, tCFScreenValue, false, null, false, false, 57, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s() {
        return ((Companion.a) this.f.getValue()).c() == Companion.TCFExperience.BLOCKER_CARD_EXPERIENCE;
    }

    private final void y(ss2 ss2Var, gt2 gt2Var) {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), this.d, null, new TCFViewModel$tcfAcceptRejectAll$1(this, ss2Var, gt2Var, null), 2, null);
    }

    private final void z(ss2 ss2Var, gt2 gt2Var) {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), this.d, null, new TCFViewModel$tcfApplyManageSettingsPreference$1(this, ss2Var, gt2Var, null), 2, null);
    }

    public final void A() {
        y(new TCFViewModel$tcfRejectAll$1(this, null), new TCFViewModel$tcfRejectAll$2(this, null));
    }

    public final void B(String str) {
        zq3.h(str, "text");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new TCFViewModel$trackLinkedText$1(str, this, null), 3, null);
    }

    public final void m(String str) {
        zq3.h(str, "url");
        CookieManager cookieManager = CookieManager.getInstance();
        z38 z38Var = z38.a;
        String format = String.format(Locale.getDefault(), "%s=%s; Domain=%s; Path=/", Arrays.copyOf(new Object[]{"fides_consent", "", "nytimes.com"}, 3));
        zq3.g(format, "format(...)");
        cookieManager.setCookie(str, format);
    }

    public final String n() {
        Uri.Builder appendQueryParameter = Uri.parse("https://www.nytimes.com/privacy/manage-settings?").buildUpon().appendQueryParameter("fides_embed", "true").appendQueryParameter("fides_disable_save_api", "true");
        String tcfString = this.a.v().getTcfString();
        if (tcfString == null) {
            tcfString = "";
        }
        String uri = appendQueryParameter.appendQueryParameter(p96.TCF_COOKIE, tcfString).appendQueryParameter("fides-override", "true").appendQueryParameter("fides-toggle", "true").build().toString();
        zq3.g(uri, "toString(...)");
        return uri;
    }

    public final StateFlow o() {
        return this.f;
    }

    @JavascriptInterface
    public final void onFidesElementInteracted(String str) {
        zq3.h(str, "elementName");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new TCFViewModel$onFidesElementInteracted$1(this, str, null), 3, null);
    }

    @JavascriptInterface
    public final void onFidesUIChanged() {
        E(true);
        ul8.a.z("PURR").a("onFidesUIChanged is true", new Object[0]);
    }

    @JavascriptInterface
    public final void onFidesUpdated(String str, String str2) {
        zq3.h(str, "tcString");
        zq3.h(str2, "consentMethod");
        if (zq3.c(str2, Companion.TCFConsentMethod.ACCEPT.getMethod())) {
            z(new TCFViewModel$onFidesUpdated$1(this, str, null), new TCFViewModel$onFidesUpdated$2(this, null));
        } else if (zq3.c(str2, Companion.TCFConsentMethod.REJECT.getMethod())) {
            z(new TCFViewModel$onFidesUpdated$3(this, str, null), new TCFViewModel$onFidesUpdated$4(this, null));
        } else {
            z(new TCFViewModel$onFidesUpdated$5(this, str, null), new TCFViewModel$onFidesUpdated$6(this, null));
        }
    }

    public final void p() {
        if (((Companion.a) this.f.getValue()).d() == Companion.TCFScreenValue.MANAGE_PREFERENCES) {
            if (((Companion.a) this.f.getValue()).f()) {
                F(true);
            } else if (s()) {
                G(Companion.TCFScreenValue.BLOCKER_CARD);
            } else {
                G(Companion.TCFScreenValue.FINISH);
            }
            BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new TCFViewModel$handleBack$1(this, null), 3, null);
        }
    }

    public final void q(boolean z) {
        F(false);
        if (z) {
            E(false);
            if (s()) {
                G(Companion.TCFScreenValue.BLOCKER_CARD);
            } else {
                G(Companion.TCFScreenValue.FINISH);
            }
        }
    }

    public final void r(Companion.TCFExperience tCFExperience) {
        zq3.h(tCFExperience, "tcfExperience");
        this.e.setValue(Companion.a.b((Companion.a) this.f.getValue(), tCFExperience, tCFExperience == Companion.TCFExperience.MANAGE_PREFERENCES_EXPERIENCE ? Companion.TCFScreenValue.MANAGE_PREFERENCES : ((Companion.a) this.f.getValue()).d(), false, null, false, false, 60, null));
    }

    public final boolean t() {
        return this.b.a();
    }

    public final void u() {
        if (!t()) {
            D(Integer.valueOf(mm6.purr_ui_error_device_offline));
        } else {
            G(Companion.TCFScreenValue.MANAGE_PREFERENCES);
            C(true);
        }
    }

    public final void v() {
        D(null);
    }

    public final void w() {
        C(false);
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new TCFViewModel$onWebLoaded$1(this, null), 3, null);
    }

    public final void x() {
        y(new TCFViewModel$tcfAcceptAll$1(this, null), new TCFViewModel$tcfAcceptAll$2(this, null));
    }
}
