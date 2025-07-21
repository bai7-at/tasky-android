package com.nytimes.android.subauth.core.devsettings;

import android.content.Context;
import com.nytimes.android.subauth.core.auth.network.response.d;
import defpackage.ba1;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hm6;
import defpackage.mg8;
import defpackage.s16;
import defpackage.u16;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class DevSettingsTargetingService implements mg8 {
    private final ba1 a;
    private final CoroutineScope b;
    private MutableStateFlow c;
    private final StateFlow d;
    private final s16.a e;

    @fc1(c = "com.nytimes.android.subauth.core.devsettings.DevSettingsTargetingService$1", f = "DevSettingsTargetingService.kt", l = {37}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.core.devsettings.DevSettingsTargetingService$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return DevSettingsTargetingService.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                MutableStateFlow mutableStateFlow2 = DevSettingsTargetingService.this.c;
                DevSettingsTargetingService devSettingsTargetingService = DevSettingsTargetingService.this;
                this.L$0 = mutableStateFlow2;
                this.label = 1;
                Object e = devSettingsTargetingService.e(this);
                if (e == h) {
                    return h;
                }
                obj = e;
                mutableStateFlow = mutableStateFlow2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.L$0;
                f.b(obj);
            }
            mutableStateFlow.setValue(obj);
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public DevSettingsTargetingService(ba1 ba1Var, Context context, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(ba1Var, "dataStore");
        zq3.h(context, "context");
        zq3.h(coroutineDispatcher, "dispatcher");
        this.a = ba1Var;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.b = CoroutineScope;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.c = MutableStateFlow;
        this.d = MutableStateFlow;
        String string = context.getString(hm6.subauth_override_targeting_data_content);
        zq3.g(string, "getString(...)");
        this.e = u16.f(string);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.subauth.core.devsettings.DevSettingsTargetingService$fromDataStore$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.subauth.core.devsettings.DevSettingsTargetingService$fromDataStore$1 r0 = (com.nytimes.android.subauth.core.devsettings.DevSettingsTargetingService$fromDataStore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.subauth.core.devsettings.DevSettingsTargetingService$fromDataStore$1 r0 = new com.nytimes.android.subauth.core.devsettings.DevSettingsTargetingService$fromDataStore$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.subauth.core.devsettings.DevSettingsTargetingService r4 = (com.nytimes.android.subauth.core.devsettings.DevSettingsTargetingService) r4
            kotlin.f.b(r5)
            goto L49
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            ba1 r5 = r4.a
            kotlinx.coroutines.flow.Flow r5 = r5.getData()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            s16 r5 = (defpackage.s16) r5
            r0 = 0
            if (r5 == 0) goto L6c
            s16$a r4 = r4.e
            java.lang.Object r4 = r5.c(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L6c
            com.nytimes.android.subauth.core.auth.network.response.d$a r5 = com.nytimes.android.subauth.core.auth.network.response.d.Companion
            com.nytimes.android.subauth.core.auth.network.response.e r4 = r5.a(r4)
            boolean r5 = r4 instanceof com.nytimes.android.subauth.core.auth.network.response.e.b
            if (r5 == 0) goto L65
            com.nytimes.android.subauth.core.auth.network.response.e$b r4 = (com.nytimes.android.subauth.core.auth.network.response.e.b) r4
            goto L66
        L65:
            r4 = r0
        L66:
            if (r4 == 0) goto L6c
            com.nytimes.android.subauth.core.auth.network.response.d r0 = r4.a()
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.devsettings.DevSettingsTargetingService.e(by0):java.lang.Object");
    }

    @Override // defpackage.mg8
    public d a() {
        return (d) this.d.getValue();
    }

    @Override // defpackage.mg8
    public Object b(boolean z, by0 by0Var) {
        return ww8.a;
    }

    public /* synthetic */ DevSettingsTargetingService(ba1 ba1Var, Context context, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ba1Var, context, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
