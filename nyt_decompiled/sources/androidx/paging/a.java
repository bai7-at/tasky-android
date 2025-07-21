package androidx.paging;

import androidx.paging.PageEvent;
import androidx.paging.d;
import defpackage.qm3;
import defpackage.uo6;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    private int a;
    private int b;
    private final kotlin.collections.c c = new kotlin.collections.c();
    private final f d = new f();
    private e e;
    private boolean f;

    /* renamed from: androidx.paging.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0107a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    private final void c(PageEvent.Insert insert) {
        this.d.b(insert.k());
        this.e = insert.g();
        int i = C0107a.a[insert.f().ordinal()];
        if (i == 1) {
            this.a = insert.j();
            Iterator it2 = uo6.r(insert.h().size() - 1, 0).iterator();
            while (it2.hasNext()) {
                this.c.addFirst(insert.h().get(((qm3) it2).c()));
            }
            return;
        }
        if (i == 2) {
            this.b = insert.i();
            this.c.addAll(insert.h());
        } else {
            if (i != 3) {
                return;
            }
            this.c.clear();
            this.b = insert.i();
            this.a = insert.j();
            this.c.addAll(insert.h());
        }
    }

    private final void d(PageEvent.b bVar) {
        this.d.b(bVar.d());
        this.e = bVar.c();
    }

    private final void e(PageEvent.a aVar) {
        this.d.c(aVar.c(), d.c.b.b());
        int i = C0107a.a[aVar.c().ordinal()];
        int i2 = 0;
        if (i == 1) {
            this.a = aVar.g();
            int f = aVar.f();
            while (i2 < f) {
                this.c.removeFirst();
                i2++;
            }
            return;
        }
        if (i != 2) {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
        this.b = aVar.g();
        int f2 = aVar.f();
        while (i2 < f2) {
            this.c.removeLast();
            i2++;
        }
    }

    public final void a(PageEvent pageEvent) {
        zq3.h(pageEvent, "event");
        this.f = true;
        if (pageEvent instanceof PageEvent.Insert) {
            c((PageEvent.Insert) pageEvent);
        } else if (pageEvent instanceof PageEvent.a) {
            e((PageEvent.a) pageEvent);
        } else if (pageEvent instanceof PageEvent.b) {
            d((PageEvent.b) pageEvent);
        }
    }

    public final List b() {
        if (!this.f) {
            return kotlin.collections.i.l();
        }
        ArrayList arrayList = new ArrayList();
        e d = this.d.d();
        if (this.c.isEmpty()) {
            arrayList.add(new PageEvent.b(d, this.e));
        } else {
            arrayList.add(PageEvent.Insert.g.c(kotlin.collections.i.X0(this.c), this.a, this.b, d, this.e));
        }
        return arrayList;
    }
}
