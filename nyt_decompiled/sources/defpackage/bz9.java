package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class bz9 implements caa {
    private final boolean a;

    public bz9(Boolean bool) {
        this.a = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.caa
    public final caa a(String str, xhe xheVar, List list) {
        if ("toString".equals(str)) {
            return new eda(Boolean.toString(this.a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.a), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz9) && this.a == ((bz9) obj).a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // defpackage.caa
    public final caa zzd() {
        return new bz9(Boolean.valueOf(this.a));
    }

    @Override // defpackage.caa
    public final Boolean zzg() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.caa
    public final Double zzh() {
        return Double.valueOf(true != this.a ? 0.0d : 1.0d);
    }

    @Override // defpackage.caa
    public final String zzi() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.caa
    public final Iterator zzl() {
        return null;
    }
}
