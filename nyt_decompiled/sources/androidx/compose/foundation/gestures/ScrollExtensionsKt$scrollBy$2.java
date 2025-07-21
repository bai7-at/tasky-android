package androidx.compose.foundation.gestures;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qc7;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$FloatRef;

@fc1(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollExtensionsKt$scrollBy$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Ref$FloatRef $consumed;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollExtensionsKt$scrollBy$2(Ref$FloatRef ref$FloatRef, float f, by0 by0Var) {
        super(2, by0Var);
        this.$consumed = ref$FloatRef;
        this.$value = f;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(qc7 qc7Var, by0 by0Var) {
        return ((ScrollExtensionsKt$scrollBy$2) create(qc7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.$consumed, this.$value, by0Var);
        scrollExtensionsKt$scrollBy$2.L$0 = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        qc7 qc7Var = (qc7) this.L$0;
        this.$consumed.element = qc7Var.a(this.$value);
        return ww8.a;
    }
}
