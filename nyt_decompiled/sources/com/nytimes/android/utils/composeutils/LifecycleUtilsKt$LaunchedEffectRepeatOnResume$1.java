package com.nytimes.android.utils.composeutils;

import androidx.lifecycle.Lifecycle;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.utils.composeutils.LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1", f = "LifecycleUtils.kt", l = {EventType.SUBS}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $block;
    final /* synthetic */ Lifecycle $lifecycle;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @fc1(c = "com.nytimes.android.utils.composeutils.LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1$1", f = "LifecycleUtils.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.utils.composeutils.LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Lifecycle.Event event, by0 by0Var) {
            return ((AnonymousClass1) create(event, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return cc0.a(((Lifecycle.Event) this.L$0) == Lifecycle.Event.ON_PAUSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1(Lifecycle lifecycle, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.$lifecycle = lifecycle;
        this.$block = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1 lifecycleUtilsKt$LaunchedEffectRepeatOnResume$1 = new LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1(this.$lifecycle, this.$block, by0Var);
        lifecycleUtilsKt$LaunchedEffectRepeatOnResume$1.L$0 = obj;
        return lifecycleUtilsKt$LaunchedEffectRepeatOnResume$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x004f -> B:5:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r10.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r10.L$1
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            java.lang.Object r4 = r10.L$0
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            kotlin.f.b(r11)
            r11 = r4
            goto L52
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L21:
            kotlin.f.b(r11)
            java.lang.Object r11 = r10.L$0
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
        L28:
            com.nytimes.android.utils.composeutils.LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1$job$1 r7 = new com.nytimes.android.utils.composeutils.LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1$job$1
            androidx.lifecycle.Lifecycle r1 = r10.$lifecycle
            gt2 r4 = r10.$block
            r7.<init>(r1, r4, r3)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            r4 = r11
            kotlinx.coroutines.Job r1 = kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
            androidx.lifecycle.Lifecycle r4 = r10.$lifecycle
            kotlinx.coroutines.flow.Flow r4 = com.nytimes.android.utils.composeutils.LifecycleUtilsKt.b(r4)
            com.nytimes.android.utils.composeutils.LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1$1 r5 = new com.nytimes.android.utils.composeutils.LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1$1
            r5.<init>(r3)
            r10.L$0 = r11
            r10.L$1 = r1
            r10.label = r2
            java.lang.Object r4 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r4, r5, r10)
            if (r4 != r0) goto L52
            return r0
        L52:
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r1, r3, r2, r3)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.utils.composeutils.LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((LifecycleUtilsKt$LaunchedEffectRepeatOnResume$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
