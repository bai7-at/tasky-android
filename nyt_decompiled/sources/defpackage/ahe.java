package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class ahe implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ dhe b;

    ahe(dhe dheVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = dheVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator g;
        g = this.b.g(this.a);
        return g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        hge.b(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
