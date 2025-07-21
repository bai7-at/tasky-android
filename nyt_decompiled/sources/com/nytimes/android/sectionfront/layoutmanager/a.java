package com.nytimes.android.sectionfront.layoutmanager;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import com.nytimes.android.sectionfront.layoutmanager.SpannableGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class a {
    int a;
    int b;
    private final List c = new ArrayList();
    private final SparseArray d = new SparseArray();
    private boolean e = true;

    /* renamed from: com.nytimes.android.sectionfront.layoutmanager.a$a, reason: collision with other inner class name */
    static class C0404a {
        final int a;
        b b;
        int c;
        View d;
        Rect e;
        float f;
        float g;
        boolean h;
        private boolean i;
        private boolean j;

        C0404a(int i) {
            this.a = i;
        }

        float d() {
            return this.f + this.g;
        }

        boolean e(int i) {
            return i == 1 ? this.i : this.j;
        }

        boolean f(int i) {
            return i == 1 ? this.j : this.i;
        }

        void g(SpannableGridLayoutManager.c cVar) {
            cVar.f = this.i;
            cVar.g = this.j;
            cVar.h = this.g < ((float) cVar.e);
        }
    }

    static class b {
        private final int a;
        private final List b = new ArrayList();

        b(int i) {
            this.a = i;
        }

        void b(C0404a c0404a, int i) {
            if (this.b.isEmpty()) {
                c0404a.i = true;
                c0404a.f = 0.0f;
            } else {
                List list = this.b;
                c0404a.f = ((C0404a) list.get(list.size() - 1)).d();
            }
            if (c0404a.f + c0404a.g == i) {
                c0404a.j = true;
            }
            c0404a.b = this;
            this.b.add(c0404a);
        }

        List c() {
            return this.b;
        }

        C0404a d(int i) {
            if (i == 1) {
                return (C0404a) this.b.get(0);
            }
            List list = this.b;
            return (C0404a) list.get(list.size() - 1);
        }

        int e() {
            Iterator it2 = this.b.iterator();
            int i = 0;
            while (it2.hasNext()) {
                i = Math.max(i, ((C0404a) it2.next()).c);
            }
            return i;
        }

        boolean f(int i) {
            if (this.b.isEmpty()) {
                return true;
            }
            List list = this.b;
            return ((C0404a) list.get(list.size() - 1)).d() < ((float) i);
        }

        void g(int i, int i2) {
            float size = i2 / this.b.size();
            boolean z = size < ((float) i);
            int i3 = 0;
            for (C0404a c0404a : this.b) {
                c0404a.f = i3 * size;
                c0404a.g = size;
                c0404a.b = this;
                c0404a.i = false;
                c0404a.j = false;
                c0404a.h = z;
                i3++;
            }
            ((C0404a) this.b.get(0)).i = true;
            List list = this.b;
            ((C0404a) list.get(list.size() - 1)).j = true;
        }
    }

    a() {
    }

    private b d(int i) {
        if (!this.c.isEmpty()) {
            if (((b) this.c.get(r0.size() - 1)).f(i)) {
                return (b) this.c.get(r2.size() - 1);
            }
        }
        b bVar = new b(this.c.size());
        this.c.add(bVar);
        return bVar;
    }

    void a(int i, int i2) {
        C0404a c0404a = new C0404a(i);
        c0404a.g = i2;
        d(this.a).b(c0404a, this.a);
        this.d.put(i, c0404a);
    }

    void b() {
        if (this.c.isEmpty()) {
            return;
        }
        List list = this.c;
        b bVar = (b) list.get(list.size() - 1);
        if (((C0404a) bVar.c().get(bVar.c().size() - 1)).j) {
            return;
        }
        int i = this.b;
        int i2 = i * 3;
        int i3 = this.a;
        if (i2 != i3) {
            if (i * 2 == i3 && bVar.b.size() == 1) {
                bVar.g(this.b, this.a);
                return;
            }
            return;
        }
        if (bVar.c().size() == 2) {
            bVar.g(this.b, this.a);
            return;
        }
        if (bVar.c().size() != 1 || this.c.size() <= 1) {
            return;
        }
        C0404a c0404a = (C0404a) bVar.c().get(0);
        List list2 = this.c;
        list2.remove(list2.size() - 1);
        List list3 = this.c;
        b bVar2 = (b) list3.get(list3.size() - 1);
        bVar2.b.add(c0404a);
        bVar2.g(this.b, this.a);
    }

    C0404a c(int i) {
        return (C0404a) this.d.get(i);
    }

    void e() {
        this.e = true;
    }

    boolean f() {
        return this.e;
    }

    void g(int i, int i2) {
        this.e = false;
        this.b = i2;
        this.a = i;
        this.c.clear();
        this.d.clear();
    }
}
