package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class u0g implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ p3g b;

    u0g(p3g p3gVar, CharSequence charSequence) {
        this.b = p3gVar;
        this.a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator h;
        h = this.b.h(this.a);
        return h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it2 = iterator();
        try {
            if (it2.hasNext()) {
                sb.append(zrf.a(it2.next(), ", "));
                while (it2.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(zrf.a(it2.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
