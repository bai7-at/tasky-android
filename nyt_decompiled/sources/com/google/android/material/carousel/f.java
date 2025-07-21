package com.google.android.material.carousel;

import defpackage.hi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class f {
    private final float a;
    private final List b;
    private final int c;
    private final int d;

    static final class b {
        private final float a;
        private final float b;
        private c d;
        private c e;
        private final List c = new ArrayList();
        private int f = -1;
        private int g = -1;
        private float h = 0.0f;
        private int i = -1;

        b(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        private static float j(float f, float f2, int i, int i2) {
            return (f - (i * f2)) + (i2 * f2);
        }

        b a(float f, float f2, float f3) {
            return d(f, f2, f3, false, true);
        }

        b b(float f, float f2, float f3) {
            return c(f, f2, f3, false);
        }

        b c(float f, float f2, float f3, boolean z) {
            return d(f, f2, f3, z, false);
        }

        b d(float f, float f2, float f3, boolean z, boolean z2) {
            float f4;
            float f5 = f3 / 2.0f;
            float f6 = f - f5;
            float f7 = f5 + f;
            float f8 = this.b;
            if (f7 > f8) {
                f4 = Math.abs(f7 - Math.max(f7 - f3, f8));
            } else {
                f4 = 0.0f;
                if (f6 < 0.0f) {
                    f4 = Math.abs(f6 - Math.min(f6 + f3, 0.0f));
                }
            }
            return e(f, f2, f3, z, z2, f4);
        }

        b e(float f, float f2, float f3, boolean z, boolean z2, float f4) {
            return f(f, f2, f3, z, z2, f4, 0.0f, 0.0f);
        }

        b f(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
            if (f3 <= 0.0f) {
                return this;
            }
            if (z2) {
                if (z) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i = this.i;
                if (i != -1 && i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.i = this.c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
            if (z) {
                if (this.d == null) {
                    this.d = cVar;
                    this.f = this.c.size();
                }
                if (this.g != -1 && this.c.size() - this.g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.d.d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.e = cVar;
                this.g = this.c.size();
            } else {
                if (this.d == null && cVar.d < this.h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.e != null && cVar.d > this.h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.h = cVar.d;
            this.c.add(cVar);
            return this;
        }

        b g(float f, float f2, float f3, int i) {
            return h(f, f2, f3, i, false);
        }

        b h(float f, float f2, float f3, int i, boolean z) {
            if (i > 0 && f3 > 0.0f) {
                for (int i2 = 0; i2 < i; i2++) {
                    c((i2 * f3) + f, f2, f3, z);
                }
            }
            return this;
        }

        f i() {
            if (this.d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.c.size(); i++) {
                c cVar = (c) this.c.get(i);
                arrayList.add(new c(j(this.d.b, this.a, this.f, i), cVar.b, cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h));
            }
            return new f(this.a, arrayList, this.f, this.g);
        }
    }

    static final class c {
        final float a;
        final float b;
        final float c;
        final float d;
        final boolean e;
        final float f;
        final float g;
        final float h;

        c(float f, float f2, float f3, float f4) {
            this(f, f2, f3, f4, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, float f) {
            return new c(hi.a(cVar.a, cVar2.a, f), hi.a(cVar.b, cVar2.b, f), hi.a(cVar.c, cVar2.c, f), hi.a(cVar.d, cVar2.d, f));
        }

        c(float f, float f2, float f3, float f4, boolean z, float f5, float f6, float f7) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = z;
            this.f = f5;
            this.g = f6;
            this.h = f7;
        }
    }

    static f m(f fVar, f fVar2, float f) {
        if (fVar.f() != fVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List g = fVar.g();
        List g2 = fVar2.g();
        if (g.size() != g2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < fVar.g().size(); i++) {
            arrayList.add(c.a((c) g.get(i), (c) g2.get(i), f));
        }
        return new f(fVar.f(), arrayList, hi.c(fVar.b(), fVar2.b(), f), hi.c(fVar.i(), fVar2.i(), f));
    }

    static f n(f fVar, float f) {
        b bVar = new b(fVar.f(), f);
        float f2 = (f - fVar.j().b) - (fVar.j().d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = (c) fVar.g().get(size);
            bVar.d(f2 + (cVar.d / 2.0f), cVar.c, cVar.d, size >= fVar.b() && size <= fVar.i(), cVar.e);
            f2 += cVar.d;
            size--;
        }
        return bVar.i();
    }

    c a() {
        return (c) this.b.get(this.c);
    }

    int b() {
        return this.c;
    }

    c c() {
        return (c) this.b.get(0);
    }

    c d() {
        for (int i = 0; i < this.b.size(); i++) {
            c cVar = (c) this.b.get(i);
            if (!cVar.e) {
                return cVar;
            }
        }
        return null;
    }

    List e() {
        return this.b.subList(this.c, this.d + 1);
    }

    float f() {
        return this.a;
    }

    List g() {
        return this.b;
    }

    c h() {
        return (c) this.b.get(this.d);
    }

    int i() {
        return this.d;
    }

    c j() {
        return (c) this.b.get(r1.size() - 1);
    }

    c k() {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            c cVar = (c) this.b.get(size);
            if (!cVar.e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        Iterator it2 = this.b.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (((c) it2.next()).e) {
                i++;
            }
        }
        return this.b.size() - i;
    }

    private f(float f, List list, int i, int i2) {
        this.a = f;
        this.b = Collections.unmodifiableList(list);
        this.c = i;
        this.d = i2;
    }
}
