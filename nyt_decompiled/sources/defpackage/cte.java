package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class cte extends ple {
    private final mue a;

    public cte(mue mueVar) {
        this.a = mueVar;
    }

    public final mue b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cte)) {
            return false;
        }
        mue mueVar = ((cte) obj).a;
        return this.a.c().P().equals(mueVar.c().P()) && this.a.c().R().equals(mueVar.c().R()) && this.a.c().Q().equals(mueVar.c().Q());
    }

    public final int hashCode() {
        mue mueVar = this.a;
        return Objects.hash(mueVar.c(), mueVar.zzd());
    }

    public final String toString() {
        String R = this.a.c().R();
        zzgvz P = this.a.c().P();
        zzgvz zzgvzVar = zzgvz.UNKNOWN_PREFIX;
        int ordinal = P.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", R, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
