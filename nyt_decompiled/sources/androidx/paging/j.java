package androidx.paging;

import androidx.paging.LegacyPageFetcher;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import defpackage.uo6;
import defpackage.xn5;
import defpackage.zq3;
import defpackage.zt5;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends AbstractList implements LegacyPageFetcher.a, zt5 {
    private final List a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private int g;

    public interface a {
        void a(int i, int i2);

        void c(int i, int i2);

        void e(int i, int i2, int i3);

        void f(int i, int i2, int i3);

        void j(int i);
    }

    public j() {
        this.a = new ArrayList();
        this.e = true;
    }

    private final void v(int i, PagingSource.b.C0106b c0106b, int i2, int i3, boolean z) {
        this.b = i;
        this.a.clear();
        this.a.add(c0106b);
        this.c = i2;
        this.d = i3;
        this.f = c0106b.c().size();
        this.e = z;
        this.g = c0106b.c().size() / 2;
    }

    private final boolean w(int i, int i2, int i3) {
        return c() > i && this.a.size() > 2 && c() - ((PagingSource.b.C0106b) this.a.get(i3)).c().size() >= i2;
    }

    public /* bridge */ Object A(int i) {
        return super.remove(i);
    }

    public final void B(int i) {
        this.g = uo6.m(i - f(), 0, c() - 1);
    }

    public final boolean C(int i, int i2, int i3) {
        return c() + i3 > i && this.a.size() > 1 && c() >= i2;
    }

    public final j D() {
        return new j(this);
    }

    public final boolean E(boolean z, int i, int i2, a aVar) {
        zq3.h(aVar, "callback");
        int i3 = 0;
        while (x(i, i2)) {
            List list = this.a;
            int size = ((PagingSource.b.C0106b) list.remove(list.size() - 1)).c().size();
            i3 += size;
            this.f = c() - size;
        }
        this.g = uo6.i(this.g, c() - 1);
        if (i3 > 0) {
            int f = f() + c();
            if (z) {
                this.c = j() + i3;
                aVar.a(f, i3);
            } else {
                aVar.c(f, i3);
            }
        }
        return i3 > 0;
    }

    public final boolean F(boolean z, int i, int i2, a aVar) {
        zq3.h(aVar, "callback");
        int i3 = 0;
        while (y(i, i2)) {
            int size = ((PagingSource.b.C0106b) this.a.remove(0)).c().size();
            i3 += size;
            this.f = c() - size;
        }
        this.g = uo6.d(this.g - i3, 0);
        if (i3 > 0) {
            if (z) {
                int f = f();
                this.b = f() + i3;
                aVar.a(f, i3);
            } else {
                this.d += i3;
                aVar.c(f(), i3);
            }
        }
        return i3 > 0;
    }

    @Override // defpackage.zt5
    public int a() {
        return f() + c() + j();
    }

    @Override // defpackage.zt5
    public int c() {
        return this.f;
    }

    @Override // androidx.paging.LegacyPageFetcher.a
    public Object e() {
        if (!this.e || j() > 0) {
            return ((PagingSource.b.C0106b) kotlin.collections.i.w0(this.a)).j();
        }
        return null;
    }

    @Override // defpackage.zt5
    public int f() {
        return this.b;
    }

    @Override // androidx.paging.LegacyPageFetcher.a
    public Object g() {
        if (!this.e || f() + this.d > 0) {
            return ((PagingSource.b.C0106b) kotlin.collections.i.k0(this.a)).n();
        }
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        int f = i - f();
        if (i >= 0 && i < size()) {
            if (f < 0 || f >= c()) {
                return null;
            }
            return getItem(f);
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size());
    }

    @Override // defpackage.zt5
    public Object getItem(int i) {
        int size = this.a.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((PagingSource.b.C0106b) this.a.get(i2)).c().size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((PagingSource.b.C0106b) this.a.get(i2)).c().get(i);
    }

    @Override // defpackage.zt5
    public int j() {
        return this.c;
    }

    public final void k(PagingSource.b.C0106b c0106b, a aVar) {
        zq3.h(c0106b, "page");
        int size = c0106b.c().size();
        if (size == 0) {
            return;
        }
        this.a.add(c0106b);
        this.f = c() + size;
        int min = Math.min(j(), size);
        int i = size - min;
        if (min != 0) {
            this.c = j() - min;
        }
        if (aVar != null) {
            aVar.e((f() + c()) - size, min, i);
        }
    }

    public final Object n() {
        return kotlin.collections.i.k0(((PagingSource.b.C0106b) kotlin.collections.i.k0(this.a)).c());
    }

    public final int o() {
        return f() + this.g;
    }

    public final Object p() {
        return kotlin.collections.i.w0(((PagingSource.b.C0106b) kotlin.collections.i.w0(this.a)).c());
    }

    public final int q() {
        return f() + (c() / 2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return A(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }

    public final m t(PagedList.c cVar) {
        zq3.h(cVar, "config");
        if (this.a.isEmpty()) {
            return null;
        }
        List X0 = kotlin.collections.i.X0(this.a);
        zq3.f(X0, "null cannot be cast to non-null type kotlin.collections.List<androidx.paging.PagingSource.LoadResult.Page<kotlin.Any, T of androidx.paging.PagedStorage>>");
        return new m(X0, Integer.valueOf(o()), new xn5(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, 0, 32, null), f());
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "leading " + f() + ", dataCount " + c() + ", trailing " + j() + ' ' + kotlin.collections.i.u0(this.a, " ", null, null, 0, null, null, 62, null);
    }

    public final void u(int i, PagingSource.b.C0106b c0106b, int i2, int i3, a aVar, boolean z) {
        zq3.h(c0106b, "page");
        zq3.h(aVar, "callback");
        v(i, c0106b, i2, i3, z);
        aVar.j(size());
    }

    public final boolean x(int i, int i2) {
        return w(i, i2, this.a.size() - 1);
    }

    public final boolean y(int i, int i2) {
        return w(i, i2, 0);
    }

    public final void z(PagingSource.b.C0106b c0106b, a aVar) {
        zq3.h(c0106b, "page");
        int size = c0106b.c().size();
        if (size == 0) {
            return;
        }
        this.a.add(0, c0106b);
        this.f = c() + size;
        int min = Math.min(f(), size);
        int i = size - min;
        if (min != 0) {
            this.b = f() - min;
        }
        this.d -= i;
        if (aVar != null) {
            aVar.f(f(), min, i);
        }
    }

    private j(j jVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.e = true;
        arrayList.addAll(jVar.a);
        this.b = jVar.f();
        this.c = jVar.j();
        this.d = jVar.d;
        this.e = jVar.e;
        this.f = jVar.c();
        this.g = jVar.g;
    }
}
