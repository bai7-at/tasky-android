package com.google.android.gms.internal.ads;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.yje;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* loaded from: classes3.dex */
abstract class pb extends bb {
    private static final mb j;
    private static final fc k = new fc(pb.class);
    private volatile Set h = null;
    private volatile int i;

    static {
        mb obVar;
        Throwable th;
        yje yjeVar = null;
        try {
            obVar = new nb(AtomicReferenceFieldUpdater.newUpdater(pb.class, Set.class, QueryKeys.HOST), AtomicIntegerFieldUpdater.newUpdater(pb.class, QueryKeys.VIEW_TITLE));
            th = null;
        } catch (Throwable th2) {
            obVar = new ob(yjeVar);
            th = th2;
        }
        j = obVar;
        if (th != null) {
            k.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    pb(int i) {
        this.i = i;
    }

    final int C() {
        return j.a(this);
    }

    final Set E() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        I(newSetFromMap);
        j.b(this, null, newSetFromMap);
        Set set2 = this.h;
        Objects.requireNonNull(set2);
        return set2;
    }

    final void H() {
        this.h = null;
    }

    abstract void I(Set set);
}
