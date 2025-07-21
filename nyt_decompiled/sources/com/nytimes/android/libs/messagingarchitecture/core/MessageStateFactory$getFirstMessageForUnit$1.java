package com.nytimes.android.libs.messagingarchitecture.core;

import com.comscore.android.util.AndroidTcfDataLoader;
import defpackage.as0;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactory$getFirstMessageForUnit$1", f = "MessageStateFactory.kt", l = {AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX, 87, 103, 129, 159, 190, 244, 252}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MessageStateFactory$getFirstMessageForUnit$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Map<String, as0> $composablePositionMap;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ String $unit;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MessageStateFactory this$0;

    @fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactory$getFirstMessageForUnit$1$1", f = "MessageStateFactory.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactory$getFirstMessageForUnit$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ float $presentationRule;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f, by0 by0Var) {
            super(2, by0Var);
            this.$presentationRule = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$presentationRule, by0Var);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i, by0 by0Var) {
            return ((AnonymousClass1) create(Integer.valueOf(i), by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return cc0.a(((float) this.I$0) / 100.0f > this.$presentationRule);
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (by0) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageStateFactory$getFirstMessageForUnit$1(MessageStateFactory messageStateFactory, String str, CoroutineScope coroutineScope, Map map, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = messageStateFactory;
        this.$unit = str;
        this.$coroutineScope = coroutineScope;
        this.$composablePositionMap = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        MessageStateFactory$getFirstMessageForUnit$1 messageStateFactory$getFirstMessageForUnit$1 = new MessageStateFactory$getFirstMessageForUnit$1(this.this$0, this.$unit, this.$coroutineScope, this.$composablePositionMap, by0Var);
        messageStateFactory$getFirstMessageForUnit$1.L$0 = obj;
        return messageStateFactory$getFirstMessageForUnit$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x029c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c5  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactory$getFirstMessageForUnit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((MessageStateFactory$getFirstMessageForUnit$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
