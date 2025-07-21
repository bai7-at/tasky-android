package kotlinx.coroutines.rx2;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

@fc1(c = "kotlinx.coroutines.rx2.RxConvertKt$asSingle$1", f = "RxConvert.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RxConvertKt$asSingle$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Deferred<T> $this_asSingle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RxConvertKt$asSingle$1(Deferred<? extends T> deferred, by0<? super RxConvertKt$asSingle$1> by0Var) {
        super(2, by0Var);
        this.$this_asSingle = deferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        return new RxConvertKt$asSingle$1(this.$this_asSingle, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Deferred<T> deferred = this.$this_asSingle;
            this.label = 1;
            obj = deferred.await(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super T> by0Var) {
        return ((RxConvertKt$asSingle$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
