package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class d0a implements caa {
    private final caa a;
    private final String b;

    public d0a(String str) {
        this.a = caa.T;
        this.b = str;
    }

    @Override // defpackage.caa
    public final caa a(String str, xhe xheVar, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final caa b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0a)) {
            return false;
        }
        d0a d0aVar = (d0a) obj;
        return this.b.equals(d0aVar.b) && this.a.equals(d0aVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.caa
    public final caa zzd() {
        return new d0a(this.b, this.a.zzd());
    }

    @Override // defpackage.caa
    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.caa
    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // defpackage.caa
    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.caa
    public final Iterator zzl() {
        return null;
    }

    public d0a(String str, caa caaVar) {
        this.a = caaVar;
        this.b = str;
    }
}
