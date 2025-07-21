package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class waa implements caa {
    private final String a;
    private final ArrayList b;

    public waa(String str, List list) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(list);
    }

    @Override // defpackage.caa
    public final caa a(String str, xhe xheVar, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final String b() {
        return this.a;
    }

    public final ArrayList c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof waa)) {
            return false;
        }
        waa waaVar = (waa) obj;
        String str = this.a;
        if (str == null ? waaVar.a == null : str.equals(waaVar.a)) {
            return this.b.equals(waaVar.b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b.hashCode();
    }

    @Override // defpackage.caa
    public final caa zzd() {
        return this;
    }

    @Override // defpackage.caa
    public final Boolean zzg() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // defpackage.caa
    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // defpackage.caa
    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.caa
    public final Iterator zzl() {
        return null;
    }
}
