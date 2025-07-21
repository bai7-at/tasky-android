package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class qda implements caa {
    @Override // defpackage.caa
    public final caa a(String str, xhe xheVar, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof qda;
    }

    @Override // defpackage.caa
    public final caa zzd() {
        return caa.T;
    }

    @Override // defpackage.caa
    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    @Override // defpackage.caa
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.caa
    public final String zzi() {
        return "undefined";
    }

    @Override // defpackage.caa
    public final Iterator zzl() {
        return null;
    }
}
