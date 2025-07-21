package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class r implements Iterator {
    final Iterator a;
    final /* synthetic */ zzau b;

    r(zzau zzauVar) {
        Bundle bundle;
        this.b = zzauVar;
        bundle = zzauVar.zza;
        this.a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
