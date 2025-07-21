package com.nytimes.android.subauth.core.network.config;

import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b22;
import defpackage.ba1;
import defpackage.by0;
import defpackage.fc1;
import defpackage.hm6;
import defpackage.s16;
import defpackage.u16;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final class SubauthEnvironment {
    public static final Companion Companion = new Companion(null);
    private static final s16.a e = u16.f("SA_LIRE_ENV_KEY");
    private final Resources a;
    private final ba1 b;
    private final CoroutineScope c;
    private final StateFlow d;

    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class LireEnv {
            private static final /* synthetic */ b22 $ENTRIES;
            private static final /* synthetic */ LireEnv[] $VALUES;
            private final String title;
            public static final LireEnv LIRE_ENV_STG = new LireEnv("LIRE_ENV_STG", 0, "Staging");
            public static final LireEnv LIRE_ENV_PROD = new LireEnv("LIRE_ENV_PROD", 1, "Production");

            private static final /* synthetic */ LireEnv[] $values() {
                return new LireEnv[]{LIRE_ENV_STG, LIRE_ENV_PROD};
            }

            static {
                LireEnv[] $values = $values();
                $VALUES = $values;
                $ENTRIES = a.a($values);
            }

            private LireEnv(String str, int i, String str2) {
                this.title = str2;
            }

            public static b22 getEntries() {
                return $ENTRIES;
            }

            public static LireEnv valueOf(String str) {
                return (LireEnv) Enum.valueOf(LireEnv.class, str);
            }

            public static LireEnv[] values() {
                return (LireEnv[]) $VALUES.clone();
            }

            public final String getTitle() {
                return this.title;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s16.a a() {
            return SubauthEnvironment.e;
        }

        private Companion() {
        }
    }

    public SubauthEnvironment(Resources resources, ba1 ba1Var, CoroutineDispatcher coroutineDispatcher) {
        Object runBlocking$default;
        zq3.h(resources, "resources");
        zq3.h(ba1Var, "dataStore");
        zq3.h(coroutineDispatcher, "dispatcher");
        this.a = resources;
        this.b = ba1Var;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.c = CoroutineScope;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new SubauthEnvironment$lireEnvFlow$1(this, null), 1, null);
        final Flow data = ba1Var.getData();
        this.d = FlowKt.stateIn(FlowKt.distinctUntilChanged(new Flow() { // from class: com.nytimes.android.subauth.core.network.config.SubauthEnvironment$lireEnvFlow$lambda$1$$inlined$map$1

            /* renamed from: com.nytimes.android.subauth.core.network.config.SubauthEnvironment$lireEnvFlow$lambda$1$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.subauth.core.network.config.SubauthEnvironment$lireEnvFlow$lambda$1$$inlined$map$1$2", f = "SubauthEnvironment.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.subauth.core.network.config.SubauthEnvironment$lireEnvFlow$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.nytimes.android.subauth.core.network.config.SubauthEnvironment$lireEnvFlow$lambda$1$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.subauth.core.network.config.SubauthEnvironment$lireEnvFlow$lambda$1$$inlined$map$1$2$1 r0 = (com.nytimes.android.subauth.core.network.config.SubauthEnvironment$lireEnvFlow$lambda$1$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.subauth.core.network.config.SubauthEnvironment$lireEnvFlow$lambda$1$$inlined$map$1$2$1 r0 = new com.nytimes.android.subauth.core.network.config.SubauthEnvironment$lireEnvFlow$lambda$1$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        s16 r5 = (defpackage.s16) r5
                        s16$a r6 = com.nytimes.android.subauth.core.network.config.SubauthEnvironment.b()
                        java.lang.Object r5 = r5.c(r6)
                        java.lang.String r5 = (java.lang.String) r5
                        if (r5 != 0) goto L46
                        java.lang.String r5 = "LIRE_ENV_PROD"
                    L46:
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L4f
                        return r1
                    L4f:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.network.config.SubauthEnvironment$lireEnvFlow$lambda$1$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        }), CoroutineScope, SharingStarted.Companion.getEagerly(), (String) runBlocking$default);
    }

    public final String c() {
        String string = zq3.c(this.d.getValue(), "LIRE_ENV_STG") ? this.a.getString(hm6.subauth_lire_server_stg) : this.a.getString(hm6.subauth_lire_server_prod);
        zq3.e(string);
        return string;
    }

    public final String d() {
        String string = zq3.c(this.d.getValue(), "LIRE_ENV_STG") ? this.a.getString(hm6.subauth_targeting_server_stg) : this.a.getString(hm6.subauth_targeting_server_prod);
        zq3.e(string);
        return string;
    }

    public /* synthetic */ SubauthEnvironment(Resources resources, ba1 ba1Var, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, ba1Var, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
