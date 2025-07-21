package com.dropbox.flow.multicast;

import com.comscore.android.util.AndroidTcfDataLoader;
import com.dropbox.flow.multicast.ChannelManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ClosedSendChannelException;

@fc1(c = "com.dropbox.flow.multicast.SharedFlowProducer$start$1", f = "SharedFlowProducer.kt", l = {72, AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX, AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SharedFlowProducer$start$1 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ SharedFlowProducer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedFlowProducer$start$1(SharedFlowProducer sharedFlowProducer, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = sharedFlowProducer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SharedFlowProducer$start$1(this.this$0, by0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.dropbox.flow.multicast.SharedFlowProducer] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gt2 gt2Var;
        Job job;
        gt2 gt2Var2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        int i2 = 3;
        try {
            if (i == 0) {
                f.b(obj);
                job = this.this$0.d;
                this.label = 1;
                if (job.join(this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        f.b(obj);
                        return ww8.a;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) this.L$0;
                    try {
                        f.b(obj);
                        throw th;
                    } catch (ClosedSendChannelException unused) {
                        throw th;
                    }
                }
                f.b(obj);
            }
            gt2Var2 = this.this$0.c;
            i2 = this.this$0;
            ChannelManager.b.AbstractC0166b.C0167b c0167b = new ChannelManager.b.AbstractC0166b.C0167b(i2);
            this.label = 2;
            this = gt2Var2.invoke(c0167b, this);
            if (this == h) {
                return h;
            }
            return ww8.a;
        } catch (Throwable th2) {
            try {
                gt2Var = this.this$0.c;
                Object c0167b2 = new ChannelManager.b.AbstractC0166b.C0167b(this.this$0);
                this.L$0 = th2;
                this.label = i2;
                if (gt2Var.invoke(c0167b2, this) == h) {
                    return h;
                }
            } catch (ClosedSendChannelException unused2) {
            }
            throw th2;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SharedFlowProducer$start$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
