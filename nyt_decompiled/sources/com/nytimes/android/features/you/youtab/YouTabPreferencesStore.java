package com.nytimes.android.features.you.youtab;

import android.app.Application;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ba1;
import defpackage.by0;
import defpackage.fc1;
import defpackage.nm9;
import defpackage.s16;
import defpackage.u16;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class YouTabPreferencesStore {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private static final s16.a d = u16.a("is_new");
    private final ba1 a;
    private final Flow b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s16.a a() {
            return YouTabPreferencesStore.d;
        }

        private a() {
        }
    }

    public YouTabPreferencesStore(Application application) {
        ba1 b;
        zq3.h(application, "application");
        b = nm9.b(application);
        this.a = b;
        final Flow data = b.getData();
        this.b = new Flow() { // from class: com.nytimes.android.features.you.youtab.YouTabPreferencesStore$special$$inlined$map$1

            /* renamed from: com.nytimes.android.features.you.youtab.YouTabPreferencesStore$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.features.you.youtab.YouTabPreferencesStore$special$$inlined$map$1$2", f = "YouTabPreferences.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.features.you.youtab.YouTabPreferencesStore$special$$inlined$map$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.nytimes.android.features.you.youtab.YouTabPreferencesStore$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.features.you.youtab.YouTabPreferencesStore$special$$inlined$map$1$2$1 r0 = (com.nytimes.android.features.you.youtab.YouTabPreferencesStore$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.features.you.youtab.YouTabPreferencesStore$special$$inlined$map$1$2$1 r0 = new com.nytimes.android.features.you.youtab.YouTabPreferencesStore$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L58
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        s16 r5 = (defpackage.s16) r5
                        mm9 r6 = new mm9
                        s16$a r2 = com.nytimes.android.features.you.youtab.YouTabPreferencesStore.a()
                        java.lang.Object r5 = r5.c(r2)
                        java.lang.Boolean r5 = (java.lang.Boolean) r5
                        if (r5 == 0) goto L4b
                        boolean r5 = r5.booleanValue()
                        goto L4c
                    L4b:
                        r5 = r3
                    L4c:
                        r6.<init>(r5)
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r6, r0)
                        if (r4 != r1) goto L58
                        return r1
                    L58:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.YouTabPreferencesStore$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        };
    }

    public final Flow b() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.features.you.youtab.YouTabPreferencesStore$isNew$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.features.you.youtab.YouTabPreferencesStore$isNew$1 r0 = (com.nytimes.android.features.you.youtab.YouTabPreferencesStore$isNew$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.you.youtab.YouTabPreferencesStore$isNew$1 r0 = new com.nytimes.android.features.you.youtab.YouTabPreferencesStore$isNew$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            boolean r5 = r0.Z$0
            kotlin.f.b(r6)
            goto L49
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r6)
            ba1 r4 = r4.a
            com.nytimes.android.features.you.youtab.YouTabPreferencesStore$isNew$2 r6 = new com.nytimes.android.features.you.youtab.YouTabPreferencesStore$isNew$2
            r2 = 0
            r6.<init>(r5, r2)
            r0.Z$0 = r5
            r0.label = r3
            java.lang.Object r4 = androidx.datastore.preferences.core.PreferencesKt.a(r4, r6, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r4 = defpackage.cc0.a(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.you.youtab.YouTabPreferencesStore.c(boolean, by0):java.lang.Object");
    }
}
