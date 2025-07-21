package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import com.comscore.streaming.ContentFeedType;
import defpackage.by0;
import defpackage.dy4;
import defpackage.e26;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ll0;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@fc1(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {301, ContentFeedType.WEST_SD}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ClickableKt$handlePressInteraction$2$delayJob$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ qs2 $delayPressInteraction;
    final /* synthetic */ AbstractClickableNode.a $interactionData;
    final /* synthetic */ dy4 $interactionSource;
    final /* synthetic */ long $pressPoint;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickableKt$handlePressInteraction$2$delayJob$1(qs2 qs2Var, long j, dy4 dy4Var, AbstractClickableNode.a aVar, by0 by0Var) {
        super(2, by0Var);
        this.$delayPressInteraction = qs2Var;
        this.$pressPoint = j;
        this.$interactionSource = dy4Var;
        this.$interactionData = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e26 e26Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            if (((Boolean) this.$delayPressInteraction.mo865invoke()).booleanValue()) {
                long a = ll0.a();
                this.label = 1;
                if (DelayKt.delay(a, this) == h) {
                    return h;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e26Var = (e26) this.L$0;
                kotlin.f.b(obj);
                this.$interactionData.e(e26Var);
                return ww8.a;
            }
            kotlin.f.b(obj);
        }
        e26 e26Var2 = new e26(this.$pressPoint, null);
        dy4 dy4Var = this.$interactionSource;
        this.L$0 = e26Var2;
        this.label = 2;
        if (dy4Var.a(e26Var2, this) == h) {
            return h;
        }
        e26Var = e26Var2;
        this.$interactionData.e(e26Var);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
