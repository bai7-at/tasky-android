package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class d implements Comparator {
    d() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
    }
}
