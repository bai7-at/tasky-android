package androidx.compose.material;

import androidx.compose.runtime.y;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {735}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnchoredDraggableKt$restartable$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $block;
    final /* synthetic */ qs2 $inputs;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    static final class AnonymousClass1 implements FlowCollector {
        final /* synthetic */ Ref$ObjectRef a;
        final /* synthetic */ CoroutineScope b;
        final /* synthetic */ gt2 c;

        @fc1(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {741}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements gt2 {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ gt2 $block;
            final /* synthetic */ Object $latestInputs;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(gt2 gt2Var, Object obj, CoroutineScope coroutineScope, by0 by0Var) {
                super(2, by0Var);
                this.$block = gt2Var;
                this.$latestInputs = obj;
                this.$$this$coroutineScope = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object h = kotlin.coroutines.intrinsics.a.h();
                int i = this.label;
                if (i == 0) {
                    kotlin.f.b(obj);
                    gt2 gt2Var = this.$block;
                    Object obj2 = this.$latestInputs;
                    this.label = 1;
                    if (gt2Var.invoke(obj2, this) == h) {
                        return h;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                }
                CoroutineScopeKt.cancel(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                return ww8.a;
            }

            @Override // defpackage.gt2
            public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        AnonymousClass1(Ref$ObjectRef ref$ObjectRef, CoroutineScope coroutineScope, gt2 gt2Var) {
            this.a = ref$ObjectRef;
            this.b = coroutineScope;
            this.c = gt2Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Type inference failed for: r6v3, types: [T, kotlinx.coroutines.Job] */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, defpackage.by0 r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3b
                if (r2 != r3) goto L33
                java.lang.Object r6 = r0.L$2
                kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
                java.lang.Object r7 = r0.L$1
                java.lang.Object r6 = r0.L$0
                androidx.compose.material.AnchoredDraggableKt$restartable$2$1 r6 = (androidx.compose.material.AnchoredDraggableKt$restartable$2.AnonymousClass1) r6
                kotlin.f.b(r8)
                goto L5d
            L33:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3b:
                kotlin.f.b(r8)
                kotlin.jvm.internal.Ref$ObjectRef r8 = r6.a
                T r8 = r8.element
                kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
                if (r8 == 0) goto L5d
                androidx.compose.material.AnchoredDragFinishedSignal r2 = new androidx.compose.material.AnchoredDragFinishedSignal
                r2.<init>()
                r8.cancel(r2)
                r0.L$0 = r6
                r0.L$1 = r7
                r0.L$2 = r8
                r0.label = r3
                java.lang.Object r8 = r8.join(r0)
                if (r8 != r1) goto L5d
                return r1
            L5d:
                kotlin.jvm.internal.Ref$ObjectRef r8 = r6.a
                kotlinx.coroutines.CoroutineScope r0 = r6.b
                kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2 r3 = new androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2
                gt2 r6 = r6.c
                r1 = 0
                r3.<init>(r6, r7, r0, r1)
                r4 = 1
                r5 = 0
                kotlinx.coroutines.Job r6 = kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                r8.element = r6
                ww8 r6 = defpackage.ww8.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableKt$restartable$2.AnonymousClass1.emit(java.lang.Object, by0):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$restartable$2(qs2 qs2Var, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.$inputs = qs2Var;
        this.$block = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.$inputs, this.$block, by0Var);
        anchoredDraggableKt$restartable$2.L$0 = obj;
        return anchoredDraggableKt$restartable$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Flow p = y.p(this.$inputs);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, coroutineScope, this.$block);
            this.label = 1;
            if (p.collect(anonymousClass1, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AnchoredDraggableKt$restartable$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
