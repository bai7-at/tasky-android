package androidx.paging;

import androidx.paging.PagingSource;
import defpackage.xn5;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class m {
    private final List a;
    private final Integer b;
    private final xn5 c;
    private final int d;

    public m(List list, Integer num, xn5 xn5Var, int i) {
        zq3.h(list, "pages");
        zq3.h(xn5Var, "config");
        this.a = list;
        this.b = num;
        this.c = xn5Var;
        this.d = i;
    }

    public final Object b(int i) {
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (!((PagingSource.b.C0106b) it2.next()).c().isEmpty()) {
                int i2 = i - this.d;
                int i3 = 0;
                while (i3 < kotlin.collections.i.n(e()) && i2 > kotlin.collections.i.n(((PagingSource.b.C0106b) e().get(i3)).c())) {
                    i2 -= ((PagingSource.b.C0106b) e().get(i3)).c().size();
                    i3++;
                }
                for (PagingSource.b.C0106b c0106b : this.a) {
                    if (!c0106b.c().isEmpty()) {
                        List list2 = this.a;
                        ListIterator listIterator = list2.listIterator(list2.size());
                        while (listIterator.hasPrevious()) {
                            PagingSource.b.C0106b c0106b2 = (PagingSource.b.C0106b) listIterator.previous();
                            if (!c0106b2.c().isEmpty()) {
                                return i2 < 0 ? kotlin.collections.i.k0(c0106b.c()) : (i3 != kotlin.collections.i.n(this.a) || i2 <= kotlin.collections.i.n(((PagingSource.b.C0106b) kotlin.collections.i.w0(this.a)).c())) ? ((PagingSource.b.C0106b) this.a.get(i3)).c().get(i2) : kotlin.collections.i.w0(c0106b2.c());
                            }
                        }
                        throw new NoSuchElementException("List contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        return null;
    }

    public final PagingSource.b.C0106b c(int i) {
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (!((PagingSource.b.C0106b) it2.next()).c().isEmpty()) {
                int i2 = i - this.d;
                int i3 = 0;
                while (i3 < kotlin.collections.i.n(e()) && i2 > kotlin.collections.i.n(((PagingSource.b.C0106b) e().get(i3)).c())) {
                    i2 -= ((PagingSource.b.C0106b) e().get(i3)).c().size();
                    i3++;
                }
                return i2 < 0 ? (PagingSource.b.C0106b) kotlin.collections.i.k0(this.a) : (PagingSource.b.C0106b) this.a.get(i3);
            }
        }
        return null;
    }

    public final Integer d() {
        return this.b;
    }

    public final List e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (zq3.c(this.a, mVar.a) && zq3.c(this.b, mVar.b) && zq3.c(this.c, mVar.c) && this.d == mVar.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0) + this.c.hashCode() + Integer.hashCode(this.d);
    }

    public String toString() {
        return "PagingState(pages=" + this.a + ", anchorPosition=" + this.b + ", config=" + this.c + ", leadingPlaceholderCount=" + this.d + ')';
    }
}
