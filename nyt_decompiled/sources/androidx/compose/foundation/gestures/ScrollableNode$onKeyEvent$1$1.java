package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.by0;
import defpackage.fc1;
import defpackage.g35;
import defpackage.gt2;
import defpackage.qc7;
import defpackage.tc7;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {442}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollableNode$onKeyEvent$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ long $scrollAmount;
    final /* synthetic */ ScrollingLogic $this_with;
    int label;

    @fc1(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ long $scrollAmount;
        final /* synthetic */ ScrollingLogic $this_with;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScrollingLogic scrollingLogic, long j, by0 by0Var) {
            super(2, by0Var);
            this.$this_with = scrollingLogic;
            this.$scrollAmount = j;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(qc7 qc7Var, by0 by0Var) {
            return ((AnonymousClass1) create(qc7Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_with, this.$scrollAmount, by0Var);
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
            this.$this_with.c((qc7) this.L$0, this.$scrollAmount, g35.a.c());
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableNode$onKeyEvent$1$1(ScrollingLogic scrollingLogic, long j, by0 by0Var) {
        super(2, by0Var);
        this.$this_with = scrollingLogic;
        this.$scrollAmount = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ScrollableNode$onKeyEvent$1$1(this.$this_with, this.$scrollAmount, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            tc7 e = this.$this_with.e();
            MutatePriority mutatePriority = MutatePriority.UserInput;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_with, this.$scrollAmount, null);
            this.label = 1;
            if (e.b(mutatePriority, anonymousClass1, this) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ScrollableNode$onKeyEvent$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
