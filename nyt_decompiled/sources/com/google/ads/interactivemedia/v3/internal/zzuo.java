package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.zzub;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
class zzuo extends zzub.zzi {
    private static final zzuk zza;
    private static final Logger zzc = Logger.getLogger(zzuo.class.getName());
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzuk zzunVar;
        Throwable th;
        zzum zzumVar = null;
        try {
            zzunVar = new zzul(AtomicReferenceFieldUpdater.newUpdater(zzuo.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzuo.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e) {
            zzunVar = new zzun(zzumVar);
            th = e;
        }
        zza = zzunVar;
        if (th != null) {
            zzc.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzuo(int i) {
        this.remaining = i;
    }

    final int zzt() {
        return zza.zza(this);
    }

    final void zzv() {
        this.seenExceptions = null;
    }
}
