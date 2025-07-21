package androidx.datastore.core;

import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* loaded from: classes.dex */
public final class SimpleActor {
    private final CoroutineScope a;
    private final gt2 b;
    private final Channel c;
    private final AtomicInteger d;

    public SimpleActor(CoroutineScope coroutineScope, final ss2 ss2Var, final gt2 gt2Var, gt2 gt2Var2) {
        zq3.h(coroutineScope, "scope");
        zq3.h(ss2Var, "onComplete");
        zq3.h(gt2Var, "onUndeliveredElement");
        zq3.h(gt2Var2, "consumeMessage");
        this.a = coroutineScope;
        this.b = gt2Var2;
        this.c = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.d = new AtomicInteger(0);
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key);
        if (job == null) {
            return;
        }
        job.invokeOnCompletion(new ss2() { // from class: androidx.datastore.core.SimpleActor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                ww8 ww8Var;
                ss2.this.invoke(th);
                this.c.close(th);
                do {
                    Object m897getOrNullimpl = ChannelResult.m897getOrNullimpl(this.c.mo887tryReceivePtdJZtk());
                    if (m897getOrNullimpl == null) {
                        ww8Var = null;
                    } else {
                        gt2Var.invoke(m897getOrNullimpl, th);
                        ww8Var = ww8.a;
                    }
                } while (ww8Var != null);
            }
        });
    }

    public final void e(Object obj) {
        Object mo129trySendJP2dKIU = this.c.mo129trySendJP2dKIU(obj);
        if (mo129trySendJP2dKIU instanceof ChannelResult.Closed) {
            Throwable m896exceptionOrNullimpl = ChannelResult.m896exceptionOrNullimpl(mo129trySendJP2dKIU);
            if (m896exceptionOrNullimpl != null) {
                throw m896exceptionOrNullimpl;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!ChannelResult.m902isSuccessimpl(mo129trySendJP2dKIU)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.d.getAndIncrement() == 0) {
            BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new SimpleActor$offer$2(this, null), 3, null);
        }
    }
}
