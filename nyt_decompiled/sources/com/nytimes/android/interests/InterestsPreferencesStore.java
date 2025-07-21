package com.nytimes.android.interests;

import android.app.Application;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.at3;
import defpackage.ba1;
import defpackage.by0;
import defpackage.dt3;
import defpackage.fc1;
import defpackage.hq3;
import defpackage.s16;
import defpackage.ss2;
import defpackage.tt3;
import defpackage.u16;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;

/* loaded from: classes4.dex */
public final class InterestsPreferencesStore {
    public static final a Companion = new a(null);
    private static final long f = LocalDateTime.of(2024, 9, 1, 11, 0).toInstant(ZoneOffset.of("-05:00")).getEpochSecond();
    private final ba1 a;
    private final s16.a b;
    private final s16.a c;
    private final at3 d;
    private final Flow e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return InterestsPreferencesStore.f;
        }

        private a() {
        }
    }

    public InterestsPreferencesStore(Application application) {
        ba1 b;
        zq3.h(application, "application");
        b = hq3.b(application);
        this.a = b;
        this.b = u16.f("interestsOrder");
        this.c = u16.e("lastAutoAddedAt");
        this.d = tt3.b(null, new ss2() { // from class: com.nytimes.android.interests.InterestsPreferencesStore$json$1
            public final void b(dt3 dt3Var) {
                zq3.h(dt3Var, "$this$Json");
                dt3Var.e(false);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((dt3) obj);
                return ww8.a;
            }
        }, 1, null);
        final Flow data = b.getData();
        this.e = new Flow() { // from class: com.nytimes.android.interests.InterestsPreferencesStore$special$$inlined$map$1

            /* renamed from: com.nytimes.android.interests.InterestsPreferencesStore$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ InterestsPreferencesStore b;

                @fc1(c = "com.nytimes.android.interests.InterestsPreferencesStore$special$$inlined$map$1$2", f = "InterestsPreferencesStore.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.interests.InterestsPreferencesStore$special$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, InterestsPreferencesStore interestsPreferencesStore) {
                    this.a = flowCollector;
                    this.b = interestsPreferencesStore;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, defpackage.by0 r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.nytimes.android.interests.InterestsPreferencesStore$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.nytimes.android.interests.InterestsPreferencesStore$special$$inlined$map$1$2$1 r0 = (com.nytimes.android.interests.InterestsPreferencesStore$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.interests.InterestsPreferencesStore$special$$inlined$map$1$2$1 r0 = new com.nytimes.android.interests.InterestsPreferencesStore$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r8)
                        goto L8a
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.f.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.a
                        s16 r7 = (defpackage.s16) r7
                        com.nytimes.android.interests.InterestsPreferencesStore r2 = r6.b
                        s16$a r2 = com.nytimes.android.interests.InterestsPreferencesStore.c(r2)
                        java.lang.Object r2 = r7.c(r2)
                        java.lang.String r2 = (java.lang.String) r2
                        if (r2 == 0) goto L5f
                        com.nytimes.android.interests.InterestsPreferencesStore r4 = r6.b
                        at3 r4 = r4.e()
                        com.nytimes.android.interests.InterestsOrder$Companion r5 = com.nytimes.android.interests.InterestsOrder.Companion
                        kotlinx.serialization.KSerializer r5 = r5.serializer()
                        java.lang.Object r2 = r4.c(r5, r2)
                        com.nytimes.android.interests.InterestsOrder r2 = (com.nytimes.android.interests.InterestsOrder) r2
                        if (r2 == 0) goto L5f
                        java.util.List r2 = r2.b()
                        goto L60
                    L5f:
                        r2 = 0
                    L60:
                        com.nytimes.android.interests.InterestsOrder r4 = new com.nytimes.android.interests.InterestsOrder
                        r4.<init>(r2)
                        com.nytimes.android.interests.InterestsPreferencesStore r6 = r6.b
                        s16$a r6 = com.nytimes.android.interests.InterestsPreferencesStore.b(r6)
                        java.lang.Object r6 = r7.c(r6)
                        java.lang.Long r6 = (java.lang.Long) r6
                        if (r6 == 0) goto L78
                        long r6 = r6.longValue()
                        goto L7c
                    L78:
                        long r6 = com.nytimes.android.interests.InterestsPreferencesStore.a()
                    L7c:
                        gq3 r2 = new gq3
                        r2.<init>(r4, r6)
                        r0.label = r3
                        java.lang.Object r6 = r8.emit(r2, r0)
                        if (r6 != r1) goto L8a
                        return r1
                    L8a:
                        ww8 r6 = defpackage.ww8.a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsPreferencesStore$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }

    public final Flow d() {
        return this.e;
    }

    public final at3 e() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.interests.InterestsPreferencesStore$getLastAutoAddedAtTime$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.interests.InterestsPreferencesStore$getLastAutoAddedAtTime$1 r0 = (com.nytimes.android.interests.InterestsPreferencesStore$getLastAutoAddedAtTime$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.interests.InterestsPreferencesStore$getLastAutoAddedAtTime$1 r0 = new com.nytimes.android.interests.InterestsPreferencesStore$getLastAutoAddedAtTime$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            kotlinx.coroutines.flow.Flow r4 = r4.e
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r4, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            gq3 r5 = (defpackage.gq3) r5
            if (r5 == 0) goto L48
            long r4 = r5.b()
            goto L4a
        L48:
            long r4 = com.nytimes.android.interests.InterestsPreferencesStore.f
        L4a:
            java.lang.Long r4 = defpackage.cc0.d(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.interests.InterestsPreferencesStore.f(by0):java.lang.Object");
    }

    public final Object g(List list, by0 by0Var) {
        Object a2 = PreferencesKt.a(this.a, new InterestsPreferencesStore$setInterestOrder$2(this, list, null), by0Var);
        return a2 == kotlin.coroutines.intrinsics.a.h() ? a2 : ww8.a;
    }

    public final Object h(long j, by0 by0Var) {
        Object a2 = PreferencesKt.a(this.a, new InterestsPreferencesStore$setLastAutoAddedAtTime$2(this, j, null), by0Var);
        return a2 == kotlin.coroutines.intrinsics.a.h() ? a2 : ww8.a;
    }
}
