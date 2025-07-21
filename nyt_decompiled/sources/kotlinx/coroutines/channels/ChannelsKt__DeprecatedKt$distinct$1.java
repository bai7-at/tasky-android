package kotlinx.coroutines.channels;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$distinct$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    ChannelsKt__DeprecatedKt$distinct$1(by0<? super ChannelsKt__DeprecatedKt$distinct$1> by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        ChannelsKt__DeprecatedKt$distinct$1 channelsKt__DeprecatedKt$distinct$1 = new ChannelsKt__DeprecatedKt$distinct$1(by0Var);
        channelsKt__DeprecatedKt$distinct$1.L$0 = obj;
        return channelsKt__DeprecatedKt$distinct$1;
    }

    @Override // defpackage.gt2
    public final Object invoke(Object obj, by0 by0Var) {
        return ((ChannelsKt__DeprecatedKt$distinct$1) create(obj, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return this.L$0;
    }
}
