package androidx.compose.foundation.gestures;

import defpackage.a30;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@fc1(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1", f = "Draggable.kt", l = {456}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AbstractDraggableNode$pointerInputNode$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractDraggableNode this$0;

    @fc1(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1", f = "Draggable.kt", l = {458}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ fy5 $$this$SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractDraggableNode this$0;

        @fc1(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1", f = "Draggable.kt", l = {460, 475}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00201 extends RestrictedSuspendLambda implements gt2 {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ AbstractDraggableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00201(CoroutineScope coroutineScope, AbstractDraggableNode abstractDraggableNode, by0 by0Var) {
                super(2, by0Var);
                this.$$this$coroutineScope = coroutineScope;
                this.this$0 = abstractDraggableNode;
            }

            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(a30 a30Var, by0 by0Var) {
                return ((C00201) create(a30Var, by0Var)).invokeSuspend(ww8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                C00201 c00201 = new C00201(this.$$this$coroutineScope, this.this$0, by0Var);
                c00201.L$0 = obj;
                return c00201;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(8:27|(1:29)|30|31|32|33|34|(1:36)(10:38|9|10|11|(0)(0)|17|18|19|20|(2:67|68)(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0137, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0138, code lost:
            
                r4 = r16;
                r2 = r19;
                r3 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0133, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
            
                r3 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0144, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0145, code lost:
            
                r19 = r5;
                r20 = r6;
                r16 = r7;
                r12 = r8;
                r18 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x013f, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0140, code lost:
            
                r20 = r6;
                r12 = r8;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x00fc  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0155  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0171 A[Catch: all -> 0x0172, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0172, blocks: (B:43:0x014f, B:46:0x0171), top: B:42:0x014f }] */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0183  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x01b3  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01b9  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0123  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00df -> B:9:0x00e6). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0155 -> B:18:0x012c). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01b3 -> B:20:0x0054). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    Method dump skipped, instructions count: 444
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1.C00201.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(fy5 fy5Var, AbstractDraggableNode abstractDraggableNode, by0 by0Var) {
            super(2, by0Var);
            this.$$this$SuspendingPointerInputModifierNode = fy5Var;
            this.this$0 = abstractDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$SuspendingPointerInputModifierNode, this.this$0, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
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
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r7 = r7.L$0
                kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
                kotlin.f.b(r8)     // Catch: java.util.concurrent.CancellationException -> L13
                goto L43
            L13:
                r8 = move-exception
                goto L3d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1d:
                kotlin.f.b(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
                fy5 r1 = r7.$$this$SuspendingPointerInputModifierNode     // Catch: java.util.concurrent.CancellationException -> L39
                androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1 r3 = new androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1     // Catch: java.util.concurrent.CancellationException -> L39
                androidx.compose.foundation.gestures.AbstractDraggableNode r4 = r7.this$0     // Catch: java.util.concurrent.CancellationException -> L39
                r5 = 0
                r3.<init>(r8, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L39
                r7.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L39
                r7.label = r2     // Catch: java.util.concurrent.CancellationException -> L39
                java.lang.Object r7 = r1.X(r3, r7)     // Catch: java.util.concurrent.CancellationException -> L39
                if (r7 != r0) goto L43
                return r0
            L39:
                r7 = move-exception
                r6 = r8
                r8 = r7
                r7 = r6
            L3d:
                boolean r7 = kotlinx.coroutines.CoroutineScopeKt.isActive(r7)
                if (r7 == 0) goto L46
            L43:
                ww8 r7 = defpackage.ww8.a
                return r7
            L46:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractDraggableNode$pointerInputNode$1(AbstractDraggableNode abstractDraggableNode, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = abstractDraggableNode;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fy5 fy5Var, by0 by0Var) {
        return ((AbstractDraggableNode$pointerInputNode$1) create(fy5Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AbstractDraggableNode$pointerInputNode$1 abstractDraggableNode$pointerInputNode$1 = new AbstractDraggableNode$pointerInputNode$1(this.this$0, by0Var);
        abstractDraggableNode$pointerInputNode$1.L$0 = obj;
        return abstractDraggableNode$pointerInputNode$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            fy5 fy5Var = (fy5) this.L$0;
            if (!this.this$0.w2()) {
                return ww8.a;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(fy5Var, this.this$0, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == h) {
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
