package androidx.paging;

import androidx.paging.PageEvent;
import androidx.paging.k;
import androidx.paging.s;
import defpackage.an3;
import defpackage.rr3;
import defpackage.zq3;
import defpackage.zt5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class h implements zt5 {
    public static final a e = new a(null);
    private static final h f = new h(PageEvent.Insert.g.e());
    private final List a;
    private int b;
    private int c;
    private int d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(PageEvent.Insert insert) {
            if (insert != null) {
                return new h(insert);
            }
            h hVar = h.f;
            zq3.f(hVar, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
            return hVar;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public h(List list, int i, int i2) {
        zq3.h(list, "pages");
        this.a = kotlin.collections.i.a1(list);
        this.b = i(list);
        this.c = i;
        this.d = i2;
    }

    private final void e(int i) {
        if (i < 0 || i >= a()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + a());
        }
    }

    private final k g(PageEvent.a aVar) {
        int h = h(new an3(aVar.e(), aVar.d()));
        this.b = c() - h;
        if (aVar.c() == LoadType.PREPEND) {
            int f2 = f();
            this.c = aVar.g();
            return new k.c(h, f(), f2);
        }
        int j = j();
        this.d = aVar.g();
        return new k.b(f() + c(), h, aVar.g(), j);
    }

    private final int h(an3 an3Var) {
        Iterator it2 = this.a.iterator();
        int i = 0;
        while (it2.hasNext()) {
            r rVar = (r) it2.next();
            int[] e2 = rVar.e();
            int length = e2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (an3Var.q(e2[i2])) {
                    i += rVar.b().size();
                    it2.remove();
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    private final int i(List list) {
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += ((r) it2.next()).b().size();
        }
        return i;
    }

    private final int l() {
        Integer v0 = kotlin.collections.d.v0(((r) kotlin.collections.i.k0(this.a)).e());
        zq3.e(v0);
        return v0.intValue();
    }

    private final int m() {
        Integer u0 = kotlin.collections.d.u0(((r) kotlin.collections.i.w0(this.a)).e());
        zq3.e(u0);
        return u0.intValue();
    }

    private final k o(PageEvent.Insert insert) {
        int i = i(insert.h());
        int i2 = b.a[insert.f().ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (i2 == 2) {
            int f2 = f();
            this.a.addAll(0, insert.h());
            this.b = c() + i;
            this.c = insert.j();
            List h = insert.h();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = h.iterator();
            while (it2.hasNext()) {
                kotlin.collections.i.B(arrayList, ((r) it2.next()).b());
            }
            return new k.d(arrayList, f(), f2);
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int j = j();
        int c = c();
        List list = this.a;
        list.addAll(list.size(), insert.h());
        this.b = c() + i;
        this.d = insert.i();
        int f3 = f() + c;
        List h2 = insert.h();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = h2.iterator();
        while (it3.hasNext()) {
            kotlin.collections.i.B(arrayList2, ((r) it3.next()).b());
        }
        return new k.a(f3, arrayList2, j(), j);
    }

    @Override // defpackage.zt5
    public int a() {
        return f() + c() + j();
    }

    @Override // defpackage.zt5
    public int c() {
        return this.b;
    }

    public final s.a d(int i) {
        int i2 = 0;
        int f2 = i - f();
        while (f2 >= ((r) this.a.get(i2)).b().size() && i2 < kotlin.collections.i.n(this.a)) {
            f2 -= ((r) this.a.get(i2)).b().size();
            i2++;
        }
        return ((r) this.a.get(i2)).f(f2, i - f(), ((a() - i) - j()) - 1, l(), m());
    }

    @Override // defpackage.zt5
    public int f() {
        return this.c;
    }

    @Override // defpackage.zt5
    public Object getItem(int i) {
        int size = this.a.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((r) this.a.get(i2)).b().size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((r) this.a.get(i2)).b().get(i);
    }

    @Override // defpackage.zt5
    public int j() {
        return this.d;
    }

    public final Object k(int i) {
        e(i);
        int f2 = i - f();
        if (f2 < 0 || f2 >= c()) {
            return null;
        }
        return getItem(f2);
    }

    public final s.b n() {
        int c = c() / 2;
        return new s.b(c, c, l(), m());
    }

    public final k p(PageEvent pageEvent) {
        zq3.h(pageEvent, "pageEvent");
        if (pageEvent instanceof PageEvent.Insert) {
            return o((PageEvent.Insert) pageEvent);
        }
        if (pageEvent instanceof PageEvent.a) {
            return g((PageEvent.a) pageEvent);
        }
        throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
    }

    public final rr3 q() {
        int f2 = f();
        int j = j();
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            kotlin.collections.i.B(arrayList, ((r) it2.next()).b());
        }
        return new rr3(f2, j, arrayList);
    }

    public String toString() {
        int c = c();
        ArrayList arrayList = new ArrayList(c);
        for (int i = 0; i < c; i++) {
            arrayList.add(getItem(i));
        }
        return "[(" + f() + " placeholders), " + kotlin.collections.i.u0(arrayList, null, null, null, 0, null, null, 63, null) + ", (" + j() + " placeholders)]";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(PageEvent.Insert insert) {
        this(insert.h(), insert.j(), insert.i());
        zq3.h(insert, "insertEvent");
    }
}
