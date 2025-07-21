package com.nytimes.android.subauth.core.di;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.ba1;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.subauth.core.di.SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1", f = "SubauthModule.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ba1 $dataStore;
    final /* synthetic */ String $overrideTargetingDataKey;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1(ba1 ba1Var, String str, by0 by0Var) {
        super(2, by0Var);
        this.$dataStore = ba1Var;
        this.$overrideTargetingDataKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1(this.$dataStore, this.$overrideTargetingDataKey, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final Flow data = this.$dataStore.getData();
            final String str = this.$overrideTargetingDataKey;
            Flow flow = new Flow() { // from class: com.nytimes.android.subauth.core.di.SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1$invokeSuspend$$inlined$map$1

                /* renamed from: com.nytimes.android.subauth.core.di.SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2 implements FlowCollector {
                    final /* synthetic */ FlowCollector a;
                    final /* synthetic */ String b;

                    @fc1(c = "com.nytimes.android.subauth.core.di.SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1$invokeSuspend$$inlined$map$1$2", f = "SubauthModule.kt", l = {219}, m = "emit")
                    /* renamed from: com.nytimes.android.subauth.core.di.SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, String str) {
                        this.a = flowCollector;
                        this.b = str;
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
                            boolean r0 = r6 instanceof com.nytimes.android.subauth.core.di.SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.nytimes.android.subauth.core.di.SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.nytimes.android.subauth.core.di.SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.nytimes.android.subauth.core.di.SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.nytimes.android.subauth.core.di.SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.f.b(r6)
                            goto L4b
                        L29:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                            r4.<init>(r5)
                            throw r4
                        L31:
                            kotlin.f.b(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                            s16 r5 = (defpackage.s16) r5
                            java.lang.String r4 = r4.b
                            s16$a r4 = defpackage.u16.a(r4)
                            java.lang.Object r4 = r5.c(r4)
                            r0.label = r3
                            java.lang.Object r4 = r6.emit(r4, r0)
                            if (r4 != r1) goto L4b
                            return r1
                        L4b:
                            ww8 r4 = defpackage.ww8.a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.di.SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector flowCollector, by0 by0Var) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, str), by0Var);
                    return collect == a.h() ? collect : ww8.a;
                }
            };
            this.label = 1;
            obj = FlowKt.firstOrNull(flow, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SubauthModule$provideTargetingServiceProvider$useDevSettingsOverride$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
