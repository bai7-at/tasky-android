package androidx.compose.runtime;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@fc1(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SdkStubsFallbackFrameClock$withFrameNanos$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $onFrame;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SdkStubsFallbackFrameClock$withFrameNanos$2(ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.$onFrame = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.$onFrame, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            this.label = 1;
            if (DelayKt.delay(16L, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return this.$onFrame.invoke(cc0.d(System.nanoTime()));
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
