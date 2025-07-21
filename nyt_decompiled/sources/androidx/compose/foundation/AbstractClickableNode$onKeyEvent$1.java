package androidx.compose.foundation;

import com.comscore.streaming.ContentDeliveryAdvertisementCapability;
import defpackage.by0;
import defpackage.dy4;
import defpackage.e26;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {ContentDeliveryAdvertisementCapability.LINEAR_7DAY}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AbstractClickableNode$onKeyEvent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ e26 $press;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClickableNode$onKeyEvent$1(AbstractClickableNode abstractClickableNode, e26 e26Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = abstractClickableNode;
        this.$press = e26Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AbstractClickableNode$onKeyEvent$1(this.this$0, this.$press, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dy4 dy4Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            dy4Var = this.this$0.s;
            e26 e26Var = this.$press;
            this.label = 1;
            if (dy4Var.a(e26Var, this) == h) {
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
        return ((AbstractClickableNode$onKeyEvent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
