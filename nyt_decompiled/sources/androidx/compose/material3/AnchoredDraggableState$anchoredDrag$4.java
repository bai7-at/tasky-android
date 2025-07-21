package androidx.compose.material3;

import defpackage.by0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.id;
import defpackage.kt2;
import defpackage.qs2;
import defpackage.ru1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {577}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnchoredDraggableState$anchoredDrag$4 extends SuspendLambda implements ss2 {
    final /* synthetic */ kt2 $block;
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ AnchoredDraggableState this$0;

    @fc1(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {580}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ kt2 $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(kt2 kt2Var, AnchoredDraggableState anchoredDraggableState, by0 by0Var) {
            super(2, by0Var);
            this.$block = kt2Var;
            this.this$0 = anchoredDraggableState;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Pair pair, by0 by0Var) {
            return ((AnonymousClass2) create(pair, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, by0Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            id idVar;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                Pair pair = (Pair) this.L$0;
                ru1 ru1Var = (ru1) pair.a();
                Object b = pair.b();
                kt2 kt2Var = this.$block;
                idVar = this.this$0.o;
                this.label = 1;
                if (kt2Var.invoke(idVar, ru1Var, b, this) == h) {
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableState$anchoredDrag$4(AnchoredDraggableState anchoredDraggableState, Object obj, kt2 kt2Var, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = anchoredDraggableState;
        this.$targetValue = obj;
        this.$block = kt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new AnchoredDraggableState$anchoredDrag$4(this.this$0, this.$targetValue, this.$block, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((AnchoredDraggableState$anchoredDrag$4) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            this.this$0.D(this.$targetValue);
            final AnchoredDraggableState anchoredDraggableState = this.this$0;
            qs2 qs2Var = new qs2() { // from class: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$4.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Pair mo865invoke() {
                    return du8.a(AnchoredDraggableState.this.o(), AnchoredDraggableState.this.x());
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
            this.label = 1;
            g = AnchoredDraggableKt.g(qs2Var, anonymousClass2, this);
            if (g == h) {
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
}
