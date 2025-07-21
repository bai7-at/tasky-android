package com.google.android.gms.internal.ads;

import defpackage.pie;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class zzfyc extends zzfyt implements pie {
    protected zzfyc(Map map) {
        super(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfyt
    final Collection h(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzfyt
    final Collection i(Object obj, Collection collection) {
        return k(obj, (List) collection, null);
    }
}
