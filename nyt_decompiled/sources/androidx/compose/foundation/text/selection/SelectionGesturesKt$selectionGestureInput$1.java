package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import defpackage.a30;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.iw4;
import defpackage.ox5;
import defpackage.vx5;
import defpackage.ww8;
import defpackage.xh8;
import java.util.List;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1", f = "SelectionGestures.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SelectionGesturesKt$selectionGestureInput$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ iw4 $mouseSelectionObserver;
    final /* synthetic */ xh8 $textDragObserver;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {100, 106, 108}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements gt2 {
        final /* synthetic */ b $clicksCounter;
        final /* synthetic */ iw4 $mouseSelectionObserver;
        final /* synthetic */ xh8 $textDragObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(iw4 iw4Var, b bVar, xh8 xh8Var, by0 by0Var) {
            super(2, by0Var);
            this.$mouseSelectionObserver = iw4Var;
            this.$clicksCounter = bVar;
            this.$textDragObserver = xh8Var;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a30 a30Var, by0 by0Var) {
            return ((AnonymousClass1) create(a30Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseSelectionObserver, this.$clicksCounter, this.$textDragObserver, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a30 a30Var;
            Object i;
            Object g;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.f.b(obj);
                a30Var = (a30) this.L$0;
                this.L$0 = a30Var;
                this.label = 1;
                obj = SelectionGesturesKt.d(a30Var, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                    return ww8.a;
                }
                a30Var = (a30) this.L$0;
                kotlin.f.b(obj);
            }
            androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) obj;
            if (SelectionGesturesKt.f(cVar) && ox5.b(cVar.b())) {
                List c = cVar.c();
                int size = c.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (!((vx5) c.get(i3)).q()) {
                    }
                }
                iw4 iw4Var = this.$mouseSelectionObserver;
                b bVar = this.$clicksCounter;
                this.L$0 = null;
                this.label = 2;
                g = SelectionGesturesKt.g(a30Var, iw4Var, bVar, cVar, this);
                if (g == h) {
                    return h;
                }
                return ww8.a;
            }
            if (!SelectionGesturesKt.f(cVar)) {
                xh8 xh8Var = this.$textDragObserver;
                this.L$0 = null;
                this.label = 3;
                i = SelectionGesturesKt.i(a30Var, xh8Var, cVar, this);
                if (i == h) {
                    return h;
                }
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionGesturesKt$selectionGestureInput$1(iw4 iw4Var, xh8 xh8Var, by0 by0Var) {
        super(2, by0Var);
        this.$mouseSelectionObserver = iw4Var;
        this.$textDragObserver = xh8Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fy5 fy5Var, by0 by0Var) {
        return ((SelectionGesturesKt$selectionGestureInput$1) create(fy5Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SelectionGesturesKt$selectionGestureInput$1 selectionGesturesKt$selectionGestureInput$1 = new SelectionGesturesKt$selectionGestureInput$1(this.$mouseSelectionObserver, this.$textDragObserver, by0Var);
        selectionGesturesKt$selectionGestureInput$1.L$0 = obj;
        return selectionGesturesKt$selectionGestureInput$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            fy5 fy5Var = (fy5) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseSelectionObserver, new b(fy5Var.getViewConfiguration()), this.$textDragObserver, null);
            this.label = 1;
            if (ForEachGestureKt.c(fy5Var, anonymousClass1, this) == h) {
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
