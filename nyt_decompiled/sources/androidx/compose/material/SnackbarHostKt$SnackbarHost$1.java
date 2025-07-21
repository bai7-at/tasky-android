package androidx.compose.material;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.tv7;
import defpackage.ww8;
import defpackage.z2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@fc1(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SnackbarHostKt$SnackbarHost$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ z2 $accessibilityManager;
    final /* synthetic */ tv7 $currentSnackbarData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$SnackbarHost$1(tv7 tv7Var, z2 z2Var, by0 by0Var) {
        super(2, by0Var);
        this.$currentSnackbarData = tv7Var;
        this.$accessibilityManager = z2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SnackbarHostKt$SnackbarHost$1(this.$currentSnackbarData, this.$accessibilityManager, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            tv7 tv7Var = this.$currentSnackbarData;
            if (tv7Var != null) {
                long h2 = SnackbarHostKt.h(tv7Var.getDuration(), this.$currentSnackbarData.b() != null, this.$accessibilityManager);
                this.label = 1;
                if (DelayKt.delay(h2, this) == h) {
                    return h;
                }
            }
            return ww8.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        this.$currentSnackbarData.dismiss();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SnackbarHostKt$SnackbarHost$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
