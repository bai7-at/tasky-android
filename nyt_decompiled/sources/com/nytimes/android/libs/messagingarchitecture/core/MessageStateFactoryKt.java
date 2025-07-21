package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.lifecycle.q;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.libs.messagingarchitecture.model.Message;
import defpackage.by0;
import defpackage.cc7;
import defpackage.cs4;
import defpackage.ds4;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.py1;
import defpackage.s5;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.z12;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public abstract class MessageStateFactoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Message message, Composer composer, final int i) {
        Composer h = composer.h(638648612);
        if (b.G()) {
            b.S(638648612, i, -1, "com.nytimes.android.libs.messagingarchitecture.core.DisposableEffectSendAnalyticsFor (MessageStateFactory.kt:267)");
        }
        h.z(1396128245);
        ComponentActivity d = s5.d(h, 0);
        h.z(363804603);
        Object A = h.A();
        if (A == Composer.a.a()) {
            try {
                zq3.e(d);
                A = z12.a(d, cs4.class);
            } catch (Exception unused) {
                A = null;
            }
            h.q(A);
        }
        h.R();
        h.R();
        cs4 cs4Var = (cs4) A;
        final ds4 l = cs4Var != null ? cs4Var.l() : null;
        py1.a(ww8.a, new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$DisposableEffectSendAnalyticsFor$1

            public static final class a implements ms1 {
                final /* synthetic */ ds4 a;
                final /* synthetic */ Message b;

                public a(ds4 ds4Var, Message message) {
                    this.a = ds4Var;
                    this.b = message;
                }

                @Override // defpackage.ms1
                public void dispose() {
                    ds4 ds4Var = this.a;
                    if (ds4Var != null) {
                        ds4Var.c(this.b);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ms1 invoke(ns1 ns1Var) {
                zq3.h(ns1Var, "$this$DisposableEffect");
                ds4 ds4Var = ds4.this;
                if (ds4Var != null) {
                    ds4Var.d(message);
                }
                return new a(ds4.this, message);
            }
        }, h, 6);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$DisposableEffectSendAnalyticsFor$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    MessageStateFactoryKt.a(Message.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final Flow c(q qVar, String str, StateFlow stateFlow, MessageStateFactory messageStateFactory) {
        zq3.h(qVar, "<this>");
        zq3.h(str, "unitName");
        zq3.h(stateFlow, "composablePositionMapStateFlow");
        zq3.h(messageStateFactory, "messageStateFactory");
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Flow debounce = FlowKt.debounce(stateFlow, 250L);
        return FlowKt.onEach(FlowKt.transformLatest(new Flow() { // from class: com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$firstMessageForUnit$$inlined$filter$1

            /* renamed from: com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$firstMessageForUnit$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ Ref$BooleanRef b;

                @fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$firstMessageForUnit$$inlined$filter$1$2", f = "MessageStateFactory.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$firstMessageForUnit$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, Ref$BooleanRef ref$BooleanRef) {
                    this.a = flowCollector;
                    this.b = ref$BooleanRef;
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
                        boolean r0 = r6 instanceof com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$firstMessageForUnit$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$firstMessageForUnit$$inlined$filter$1$2$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$firstMessageForUnit$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$firstMessageForUnit$$inlined$filter$1$2$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$firstMessageForUnit$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                        r2 = r5
                        java.util.Map r2 = (java.util.Map) r2
                        kotlin.jvm.internal.Ref$BooleanRef r4 = r4.b
                        boolean r4 = r4.element
                        if (r4 != 0) goto L4e
                        boolean r4 = r2.isEmpty()
                        if (r4 != 0) goto L4e
                        r0.label = r3
                        java.lang.Object r4 = r6.emit(r5, r0)
                        if (r4 != r1) goto L4e
                        return r1
                    L4e:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt$firstMessageForUnit$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, ref$BooleanRef), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        }, new MessageStateFactoryKt$firstMessageForUnit$$inlined$flatMapLatest$1(null, messageStateFactory, str, qVar)), new MessageStateFactoryKt$firstMessageForUnit$3(ref$BooleanRef, null));
    }
}
