package androidx.compose.material3;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.id;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ru1;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {530}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnchoredDraggableState$anchoredDrag$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ it2 $block;
    int label;
    final /* synthetic */ AnchoredDraggableState this$0;

    @fc1(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {531}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ it2 $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(it2 it2Var, AnchoredDraggableState anchoredDraggableState, by0 by0Var) {
            super(2, by0Var);
            this.$block = it2Var;
            this.this$0 = anchoredDraggableState;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ru1 ru1Var, by0 by0Var) {
            return ((AnonymousClass2) create(ru1Var, by0Var)).invokeSuspend(ww8.a);
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
                ru1 ru1Var = (ru1) this.L$0;
                it2 it2Var = this.$block;
                idVar = this.this$0.o;
                this.label = 1;
                if (it2Var.invoke(idVar, ru1Var, this) == h) {
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
    AnchoredDraggableState$anchoredDrag$2(AnchoredDraggableState anchoredDraggableState, it2 it2Var, by0 by0Var) {
        super(1, by0Var);
        this.this$0 = anchoredDraggableState;
        this.$block = it2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new AnchoredDraggableState$anchoredDrag$2(this.this$0, this.$block, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((AnchoredDraggableState$anchoredDrag$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            final AnchoredDraggableState anchoredDraggableState = this.this$0;
            qs2 qs2Var = new qs2() { // from class: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2.1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ru1 mo865invoke() {
                    return AnchoredDraggableState.this.o();
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
