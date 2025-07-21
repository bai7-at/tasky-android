package com.google.android.material.carousel;

import com.google.android.material.carousel.f;
import defpackage.hg4;
import defpackage.hi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
class g {
    private final f a;
    private final List b;
    private final List c;
    private final float[] d;
    private final float[] e;
    private final float f;
    private final float g;

    private g(f fVar, List list, List list2) {
        this.a = fVar;
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        float f = ((f) list.get(list.size() - 1)).c().a - fVar.c().a;
        this.f = f;
        float f2 = fVar.j().a - ((f) list2.get(list2.size() - 1)).j().a;
        this.g = f2;
        this.d = m(f, list, true);
        this.e = m(f2, list2, false);
    }

    private f a(List list, float f, float[] fArr) {
        float[] o = o(list, f, fArr);
        return o[0] >= 0.5f ? (f) list.get((int) o[2]) : (f) list.get((int) o[1]);
    }

    private static int b(f fVar, float f) {
        for (int i = fVar.i(); i < fVar.g().size(); i++) {
            if (f == ((f.c) fVar.g().get(i)).c) {
                return i;
            }
        }
        return fVar.g().size() - 1;
    }

    private static int c(f fVar) {
        for (int i = 0; i < fVar.g().size(); i++) {
            if (!((f.c) fVar.g().get(i)).e) {
                return i;
            }
        }
        return -1;
    }

    private static int d(f fVar, float f) {
        for (int b = fVar.b() - 1; b >= 0; b--) {
            if (f == ((f.c) fVar.g().get(b)).c) {
                return b;
            }
        }
        return 0;
    }

    private static int e(f fVar) {
        for (int size = fVar.g().size() - 1; size >= 0; size--) {
            if (!((f.c) fVar.g().get(size)).e) {
                return size;
            }
        }
        return -1;
    }

    static g f(b bVar, f fVar, float f, float f2, float f3) {
        return new g(fVar, p(bVar, fVar, f, f2), n(bVar, fVar, f, f3));
    }

    private static float[] m(float f, List list, boolean z) {
        int size = list.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            f fVar = (f) list.get(i2);
            f fVar2 = (f) list.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? fVar2.c().a - fVar.c().a : fVar.j().a - fVar2.j().a) / f);
            i++;
        }
        return fArr;
    }

    private static List n(b bVar, f fVar, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int e = e(fVar);
        float b = bVar.f() ? bVar.b() : bVar.c();
        if (r(bVar, fVar) || e == -1) {
            if (f2 > 0.0f) {
                arrayList.add(u(fVar, f2, b, false, f));
            }
            return arrayList;
        }
        int i = e - fVar.i();
        float f3 = fVar.c().b - (fVar.c().d / 2.0f);
        if (i <= 0 && fVar.h().f > 0.0f) {
            arrayList.add(v(fVar, f3 - fVar.h().f, b));
            return arrayList;
        }
        float f4 = 0.0f;
        int i2 = 0;
        while (i2 < i) {
            f fVar2 = (f) arrayList.get(arrayList.size() - 1);
            int i3 = e - i2;
            float f5 = f4 + ((f.c) fVar.g().get(i3)).f;
            int i4 = i3 + 1;
            int i5 = i2;
            f t = t(fVar2, e, i4 < fVar.g().size() ? d(fVar2, ((f.c) fVar.g().get(i4)).c) + 1 : 0, f3 - f5, fVar.b() + i2 + 1, fVar.i() + i2 + 1, b);
            if (i5 == i - 1 && f2 > 0.0f) {
                t = u(t, f2, b, false, f);
            }
            arrayList.add(t);
            i2 = i5 + 1;
            f4 = f5;
        }
        return arrayList;
    }

    private static float[] o(List list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                return new float[]{hi.b(0.0f, 1.0f, f2, f3, f), i - 1, i};
            }
            i++;
            f2 = f3;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List p(b bVar, f fVar, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int c = c(fVar);
        float b = bVar.f() ? bVar.b() : bVar.c();
        int i = 1;
        if (q(fVar) || c == -1) {
            if (f2 > 0.0f) {
                arrayList.add(u(fVar, f2, b, true, f));
            }
            return arrayList;
        }
        int b2 = fVar.b() - c;
        float f3 = fVar.c().b - (fVar.c().d / 2.0f);
        if (b2 <= 0 && fVar.a().f > 0.0f) {
            arrayList.add(v(fVar, f3 + fVar.a().f, b));
            return arrayList;
        }
        int i2 = 0;
        float f4 = 0.0f;
        while (i2 < b2) {
            f fVar2 = (f) arrayList.get(arrayList.size() - i);
            int i3 = c + i2;
            int size = fVar.g().size() - i;
            float f5 = f4 + ((f.c) fVar.g().get(i3)).f;
            int i4 = i3 - i;
            int b3 = i4 >= 0 ? b(fVar2, ((f.c) fVar.g().get(i4)).c) - i : size;
            int i5 = i2;
            f t = t(fVar2, c, b3, f3 + f5, (fVar.b() - i2) - 1, (fVar.i() - i2) - 1, b);
            if (i5 == b2 - 1 && f2 > 0.0f) {
                t = u(t, f2, b, true, f);
            }
            arrayList.add(t);
            i2 = i5 + 1;
            f4 = f5;
            i = 1;
        }
        return arrayList;
    }

    private static boolean q(f fVar) {
        return fVar.a().b - (fVar.a().d / 2.0f) >= 0.0f && fVar.a() == fVar.d();
    }

    private static boolean r(b bVar, f fVar) {
        int c = bVar.c();
        if (bVar.f()) {
            c = bVar.b();
        }
        return fVar.h().b + (fVar.h().d / 2.0f) <= ((float) c) && fVar.h() == fVar.k();
    }

    private static f s(List list, float f, float[] fArr) {
        float[] o = o(list, f, fArr);
        return f.m((f) list.get((int) o[1]), (f) list.get((int) o[2]), o[0]);
    }

    private static f t(f fVar, int i, int i2, float f, int i3, int i4, float f2) {
        ArrayList arrayList = new ArrayList(fVar.g());
        arrayList.add(i2, (f.c) arrayList.remove(i));
        f.b bVar = new f.b(fVar.f(), f2);
        int i5 = 0;
        while (i5 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i5);
            float f3 = cVar.d;
            bVar.e(f + (f3 / 2.0f), cVar.c, f3, i5 >= i3 && i5 <= i4, cVar.e, cVar.f);
            f += cVar.d;
            i5++;
        }
        return bVar.i();
    }

    private static f u(f fVar, float f, float f2, boolean z, float f3) {
        ArrayList arrayList = new ArrayList(fVar.g());
        f.b bVar = new f.b(fVar.f(), f2);
        float l = f / fVar.l();
        float f4 = z ? f : 0.0f;
        int i = 0;
        while (i < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i);
            if (cVar.e) {
                bVar.e(cVar.b, cVar.c, cVar.d, false, true, cVar.f);
            } else {
                boolean z2 = i >= fVar.b() && i <= fVar.i();
                float f5 = cVar.d - l;
                float b = d.b(f5, fVar.f(), f3);
                float f6 = (f5 / 2.0f) + f4;
                float f7 = f6 - cVar.b;
                bVar.f(f6, b, f5, z2, false, cVar.f, z ? f7 : 0.0f, z ? 0.0f : f7);
                f4 += f5;
            }
            i++;
        }
        return bVar.i();
    }

    private static f v(f fVar, float f, float f2) {
        return t(fVar, 0, 0, f, fVar.b(), fVar.i(), f2);
    }

    f g() {
        return this.a;
    }

    f h() {
        return (f) this.c.get(r1.size() - 1);
    }

    Map i(int i, int i2, int i3, boolean z) {
        float f = this.a.f();
        HashMap hashMap = new HashMap();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= i) {
                break;
            }
            int i6 = z ? (i - i4) - 1 : i4;
            if (i6 * f * (z ? -1 : 1) > i3 - this.g || i4 >= i - this.c.size()) {
                Integer valueOf = Integer.valueOf(i6);
                List list = this.c;
                hashMap.put(valueOf, (f) list.get(hg4.b(i5, 0, list.size() - 1)));
                i5++;
            }
            i4++;
        }
        int i7 = 0;
        for (int i8 = i - 1; i8 >= 0; i8--) {
            int i9 = z ? (i - i8) - 1 : i8;
            if (i9 * f * (z ? -1 : 1) < i2 + this.f || i8 < this.b.size()) {
                Integer valueOf2 = Integer.valueOf(i9);
                List list2 = this.b;
                hashMap.put(valueOf2, (f) list2.get(hg4.b(i7, 0, list2.size() - 1)));
                i7++;
            }
        }
        return hashMap;
    }

    public f j(float f, float f2, float f3) {
        return k(f, f2, f3, false);
    }

    f k(float f, float f2, float f3, boolean z) {
        float b;
        List list;
        float[] fArr;
        float f4 = this.f + f2;
        float f5 = f3 - this.g;
        float f6 = l().a().g;
        float f7 = h().h().h;
        if (this.f == f6) {
            f4 += f6;
        }
        if (this.g == f7) {
            f5 -= f7;
        }
        if (f < f4) {
            b = hi.b(1.0f, 0.0f, f2, f4, f);
            list = this.b;
            fArr = this.d;
        } else {
            if (f <= f5) {
                return this.a;
            }
            b = hi.b(0.0f, 1.0f, f5, f3, f);
            list = this.c;
            fArr = this.e;
        }
        return z ? a(list, b, fArr) : s(list, b, fArr);
    }

    f l() {
        return (f) this.b.get(r1.size() - 1);
    }
}
