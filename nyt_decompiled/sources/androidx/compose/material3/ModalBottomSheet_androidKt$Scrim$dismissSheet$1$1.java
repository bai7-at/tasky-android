package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fd5;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1", f = "ModalBottomSheet.android.kt", l = {380}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ qs2 $onDismissRequest;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(qs2 qs2Var, by0 by0Var) {
        super(2, by0Var);
        this.$onDismissRequest = qs2Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fy5 fy5Var, by0 by0Var) {
        return ((ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1) create(fy5Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1 modalBottomSheet_androidKt$Scrim$dismissSheet$1$1 = new ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(this.$onDismissRequest, by0Var);
        modalBottomSheet_androidKt$Scrim$dismissSheet$1$1.L$0 = obj;
        return modalBottomSheet_androidKt$Scrim$dismissSheet$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            fy5 fy5Var = (fy5) this.L$0;
            final qs2 qs2Var = this.$onDismissRequest;
            ss2 ss2Var = new ss2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1.1
                {
                    super(1);
                }

                public final void b(long j) {
                    qs2.this.mo865invoke();
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b(((fd5) obj2).x());
                    return ww8.a;
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.j(fy5Var, null, null, null, ss2Var, this, 7, null) == h) {
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
