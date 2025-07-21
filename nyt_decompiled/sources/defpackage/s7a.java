package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class s7a implements caa {
    @Override // defpackage.caa
    public final caa a(String str, xhe xheVar, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof s7a;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.caa
    public final caa zzd() {
        return caa.U;
    }

    @Override // defpackage.caa
    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    @Override // defpackage.caa
    public final Double zzh() {
        return Double.valueOf(0.0d);
    }

    @Override // defpackage.caa
    public final String zzi() {
        return Constants.NULL_VERSION_ID;
    }

    @Override // defpackage.caa
    public final Iterator zzl() {
        return null;
    }
}
