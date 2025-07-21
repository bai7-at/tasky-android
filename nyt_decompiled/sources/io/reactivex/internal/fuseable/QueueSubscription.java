package io.reactivex.internal.fuseable;

import defpackage.hb8;

/* loaded from: classes5.dex */
public interface QueueSubscription<T> extends QueueFuseable<T>, hb8 {
    @Override // defpackage.hb8
    /* synthetic */ void cancel();

    @Override // defpackage.hb8
    /* synthetic */ void request(long j);
}
