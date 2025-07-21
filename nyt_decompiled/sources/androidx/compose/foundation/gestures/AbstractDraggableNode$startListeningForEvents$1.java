package androidx.compose.foundation.gestures;

import defpackage.by0;
import defpackage.e1;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1", f = "Draggable.kt", l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AbstractDraggableNode$startListeningForEvents$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractDraggableNode this$0;

    @fc1(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {437, 438}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ Ref$ObjectRef<a> $event;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AbstractDraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref$ObjectRef ref$ObjectRef, AbstractDraggableNode abstractDraggableNode, by0 by0Var) {
            super(2, by0Var);
            this.$event = ref$ObjectRef;
            this.this$0 = abstractDraggableNode;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e1 e1Var, by0 by0Var) {
            return ((AnonymousClass1) create(e1Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0073 -> B:6:0x0076). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r7.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                java.lang.Object r4 = r7.L$0
                e1 r4 = (defpackage.e1) r4
                kotlin.f.b(r8)
                goto L76
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L22:
                java.lang.Object r1 = r7.L$0
                e1 r1 = (defpackage.e1) r1
                kotlin.f.b(r8)
                goto L60
            L2a:
                kotlin.f.b(r8)
                java.lang.Object r8 = r7.L$0
                e1 r8 = (defpackage.e1) r8
                r1 = r8
            L32:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.a> r8 = r7.$event
                T r8 = r8.element
                boolean r4 = r8 instanceof androidx.compose.foundation.gestures.a.d
                if (r4 != 0) goto L7a
                boolean r4 = r8 instanceof androidx.compose.foundation.gestures.a.C0026a
                if (r4 != 0) goto L7a
                boolean r4 = r8 instanceof androidx.compose.foundation.gestures.a.b
                r5 = 0
                if (r4 == 0) goto L47
                r4 = r8
                androidx.compose.foundation.gestures.a$b r4 = (androidx.compose.foundation.gestures.a.b) r4
                goto L48
            L47:
                r4 = r5
            L48:
                if (r4 == 0) goto L60
                androidx.compose.foundation.gestures.AbstractDraggableNode r4 = r7.this$0
                java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragDelta"
                defpackage.zq3.f(r8, r6)
                androidx.compose.foundation.gestures.a$b r8 = (androidx.compose.foundation.gestures.a.b) r8
                r7.L$0 = r1
                r7.L$1 = r5
                r7.label = r3
                java.lang.Object r8 = r4.u2(r1, r8, r7)
                if (r8 != r0) goto L60
                return r0
            L60:
                r4 = r1
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.a> r1 = r7.$event
                androidx.compose.foundation.gestures.AbstractDraggableNode r8 = r7.this$0
                kotlinx.coroutines.channels.Channel r8 = androidx.compose.foundation.gestures.AbstractDraggableNode.j2(r8)
                r7.L$0 = r4
                r7.L$1 = r1
                r7.label = r2
                java.lang.Object r8 = r8.receive(r7)
                if (r8 != r0) goto L76
                return r0
            L76:
                r1.element = r8
                r1 = r4
                goto L32
            L7a:
                ww8 r7 = defpackage.ww8.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractDraggableNode$startListeningForEvents$1(AbstractDraggableNode abstractDraggableNode, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AbstractDraggableNode$startListeningForEvents$1 abstractDraggableNode$startListeningForEvents$1 = new AbstractDraggableNode$startListeningForEvents$1(this.this$0, by0Var);
        abstractDraggableNode$startListeningForEvents$1.L$0 = obj;
        return abstractDraggableNode$startListeningForEvents$1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:19|20|(1:39)|22|23|24|(2:29|(2:31|(1:33)))(2:26|(1:28))|8|(2:43|44)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f6, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba A[Catch: CancellationException -> 0x00d1, TryCatch #0 {CancellationException -> 0x00d1, blocks: (B:24:0x00b4, B:26:0x00ba, B:29:0x00d3, B:31:0x00d7), top: B:23:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3 A[Catch: CancellationException -> 0x00d1, TryCatch #0 {CancellationException -> 0x00d1, blocks: (B:24:0x00b4, B:26:0x00ba, B:29:0x00d3, B:31:0x00d7), top: B:23:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ce -> B:8:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d5 -> B:8:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e4 -> B:8:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f4 -> B:7:0x0027). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f7 -> B:8:0x005d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AbstractDraggableNode$startListeningForEvents$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
