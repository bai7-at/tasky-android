package com.google.android.gms.internal.ads;

import defpackage.uge;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
final class zzfxh implements Serializable, uge {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfxh) {
            return this.zza.equals(((zzfxh) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z = true;
        for (Object obj : this.zza) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.uge
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((uge) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
