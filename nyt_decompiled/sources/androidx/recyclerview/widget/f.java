package androidx.recyclerview.widget;

import defpackage.d64;
import defpackage.v60;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f {
    private static final Comparator a = new a();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.a - dVar2.a;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i, int i2);

        public abstract boolean b(int i, int i2);

        public abstract Object c(int i, int i2);

        public abstract int d();

        public abstract int e();
    }

    static class c {
        private final int[] a;
        private final int b;

        c(int i) {
            int[] iArr = new int[i];
            this.a = iArr;
            this.b = iArr.length / 2;
        }

        int[] a() {
            return this.a;
        }

        int b(int i) {
            return this.a[i + this.b];
        }

        void c(int i, int i2) {
            this.a[i + this.b] = i2;
        }
    }

    static class d {
        public final int a;
        public final int b;
        public final int c;

        d(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        int a() {
            return this.a + this.c;
        }

        int b() {
            return this.b + this.c;
        }
    }

    public static class e {
        private final List a;
        private final int[] b;
        private final int[] c;
        private final b d;
        private final int e;
        private final int f;
        private final boolean g;

        e(b bVar, List list, int[] iArr, int[] iArr2, boolean z) {
            this.a = list;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.d = bVar;
            this.e = bVar.e();
            this.f = bVar.d();
            this.g = z;
            a();
            e();
        }

        private void a() {
            d dVar = this.a.isEmpty() ? null : (d) this.a.get(0);
            if (dVar == null || dVar.a != 0 || dVar.b != 0) {
                this.a.add(0, new d(0, 0, 0));
            }
            this.a.add(new d(this.e, this.f, 0));
        }

        private void d(int i) {
            int size = this.a.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                d dVar = (d) this.a.get(i3);
                while (i2 < dVar.b) {
                    if (this.c[i2] == 0 && this.d.b(i, i2)) {
                        int i4 = this.d.a(i, i2) ? 8 : 4;
                        this.b[i] = (i2 << 4) | i4;
                        this.c[i2] = (i << 4) | i4;
                        return;
                    }
                    i2++;
                }
                i2 = dVar.b();
            }
        }

        private void e() {
            for (d dVar : this.a) {
                for (int i = 0; i < dVar.c; i++) {
                    int i2 = dVar.a + i;
                    int i3 = dVar.b + i;
                    int i4 = this.d.a(i2, i3) ? 1 : 2;
                    this.b[i2] = (i3 << 4) | i4;
                    this.c[i3] = (i2 << 4) | i4;
                }
            }
            if (this.g) {
                f();
            }
        }

        private void f() {
            int i = 0;
            for (d dVar : this.a) {
                while (i < dVar.a) {
                    if (this.b[i] == 0) {
                        d(i);
                    }
                    i++;
                }
                i = dVar.a();
            }
        }

        private static g g(Collection collection, int i, boolean z) {
            g gVar;
            Iterator it2 = collection.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = (g) it2.next();
                if (gVar.a == i && gVar.c == z) {
                    it2.remove();
                    break;
                }
            }
            while (it2.hasNext()) {
                g gVar2 = (g) it2.next();
                if (z) {
                    gVar2.b--;
                } else {
                    gVar2.b++;
                }
            }
            return gVar;
        }

        public int b(int i) {
            if (i >= 0 && i < this.e) {
                int i2 = this.b[i];
                if ((i2 & 15) == 0) {
                    return -1;
                }
                return i2 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.e);
        }

        public void c(d64 d64Var) {
            int i;
            v60 v60Var = d64Var instanceof v60 ? (v60) d64Var : new v60(d64Var);
            int i2 = this.e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.e;
            int i4 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                d dVar = (d) this.a.get(size);
                int a = dVar.a();
                int b = dVar.b();
                while (true) {
                    if (i3 <= a) {
                        break;
                    }
                    i3--;
                    int i5 = this.b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        g g = g(arrayDeque, i6, false);
                        if (g != null) {
                            int i7 = (i2 - g.b) - 1;
                            v60Var.d(i3, i7);
                            if ((i5 & 4) != 0) {
                                v60Var.c(i7, 1, this.d.c(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new g(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        v60Var.b(i3, 1);
                        i2--;
                    }
                }
                while (i4 > b) {
                    i4--;
                    int i8 = this.c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        g g2 = g(arrayDeque, i9, true);
                        if (g2 == null) {
                            arrayDeque.add(new g(i4, i2 - i3, false));
                        } else {
                            v60Var.d((i2 - g2.b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                v60Var.c(i3, 1, this.d.c(i9, i4));
                            }
                        }
                    } else {
                        v60Var.a(i3, 1);
                        i2++;
                    }
                }
                int i10 = dVar.a;
                int i11 = dVar.b;
                for (i = 0; i < dVar.c; i++) {
                    if ((this.b[i10] & 15) == 2) {
                        v60Var.c(i10, 1, this.d.c(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = dVar.a;
                i4 = dVar.b;
            }
            v60Var.e();
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0113f {
        public abstract boolean a(Object obj, Object obj2);

        public abstract boolean b(Object obj, Object obj2);

        public Object c(Object obj, Object obj2) {
            return null;
        }
    }

    private static class g {
        int a;
        int b;
        boolean c;

        g(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    static class h {
        int a;
        int b;
        int c;
        int d;

        public h() {
        }

        int a() {
            return this.d - this.c;
        }

        int b() {
            return this.b - this.a;
        }

        public h(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    static class i {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        i() {
        }

        int a() {
            return Math.min(this.c - this.a, this.d - this.b);
        }

        boolean b() {
            return this.d - this.b != this.c - this.a;
        }

        boolean c() {
            return this.d - this.b > this.c - this.a;
        }

        d d() {
            if (b()) {
                return this.e ? new d(this.a, this.b, a()) : c() ? new d(this.a, this.b + 1, a()) : new d(this.a + 1, this.b, a());
            }
            int i = this.a;
            return new d(i, this.b, this.c - i);
        }
    }

    private static i a(h hVar, b bVar, c cVar, c cVar2, int i2) {
        int b2;
        int i3;
        int i4;
        boolean z = (hVar.b() - hVar.a()) % 2 == 0;
        int b3 = hVar.b() - hVar.a();
        int i5 = -i2;
        for (int i6 = i5; i6 <= i2; i6 += 2) {
            if (i6 == i5 || (i6 != i2 && cVar2.b(i6 + 1) < cVar2.b(i6 - 1))) {
                b2 = cVar2.b(i6 + 1);
                i3 = b2;
            } else {
                b2 = cVar2.b(i6 - 1);
                i3 = b2 - 1;
            }
            int i7 = hVar.d - ((hVar.b - i3) - i6);
            int i8 = (i2 == 0 || i3 != b2) ? i7 : i7 + 1;
            while (i3 > hVar.a && i7 > hVar.c && bVar.b(i3 - 1, i7 - 1)) {
                i3--;
                i7--;
            }
            cVar2.c(i6, i3);
            if (z && (i4 = b3 - i6) >= i5 && i4 <= i2 && cVar.b(i4) >= i3) {
                i iVar = new i();
                iVar.a = i3;
                iVar.b = i7;
                iVar.c = b2;
                iVar.d = i8;
                iVar.e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e b(b bVar, boolean z) {
        int e2 = bVar.e();
        int d2 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, e2, 0, d2));
        int i2 = ((((e2 + d2) + 1) / 2) * 2) + 1;
        c cVar = new c(i2);
        c cVar2 = new c(i2);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            i d3 = d(hVar, bVar, cVar, cVar2);
            if (d3 != null) {
                if (d3.a() > 0) {
                    arrayList.add(d3.d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.a = hVar.a;
                hVar2.c = hVar.c;
                hVar2.b = d3.a;
                hVar2.d = d3.b;
                arrayList2.add(hVar2);
                hVar.b = hVar.b;
                hVar.d = hVar.d;
                hVar.a = d3.c;
                hVar.c = d3.d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z);
    }

    private static i c(h hVar, b bVar, c cVar, c cVar2, int i2) {
        int b2;
        int i3;
        int i4;
        boolean z = Math.abs(hVar.b() - hVar.a()) % 2 == 1;
        int b3 = hVar.b() - hVar.a();
        int i5 = -i2;
        for (int i6 = i5; i6 <= i2; i6 += 2) {
            if (i6 == i5 || (i6 != i2 && cVar.b(i6 + 1) > cVar.b(i6 - 1))) {
                b2 = cVar.b(i6 + 1);
                i3 = b2;
            } else {
                b2 = cVar.b(i6 - 1);
                i3 = b2 + 1;
            }
            int i7 = (hVar.c + (i3 - hVar.a)) - i6;
            int i8 = (i2 == 0 || i3 != b2) ? i7 : i7 - 1;
            while (i3 < hVar.b && i7 < hVar.d && bVar.b(i3, i7)) {
                i3++;
                i7++;
            }
            cVar.c(i6, i3);
            if (z && (i4 = b3 - i6) >= i5 + 1 && i4 <= i2 - 1 && cVar2.b(i4) <= i3) {
                i iVar = new i();
                iVar.a = b2;
                iVar.b = i8;
                iVar.c = i3;
                iVar.d = i7;
                iVar.e = false;
                return iVar;
            }
        }
        return null;
    }

    private static i d(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int b2 = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.c(1, hVar.a);
            cVar2.c(1, hVar.b);
            for (int i2 = 0; i2 < b2; i2++) {
                i c2 = c(hVar, bVar, cVar, cVar2, i2);
                if (c2 != null) {
                    return c2;
                }
                i a2 = a(hVar, bVar, cVar, cVar2, i2);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }
}
