package io.reactivex.internal.util;

import defpackage.va8;

/* loaded from: classes5.dex */
public interface QueueDrain<T, U> {
    boolean accept(va8 va8Var, T t);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i);

    long produced(long j);

    long requested();
}
