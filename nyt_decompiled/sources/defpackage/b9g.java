package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class b9g {
    private static final Comparator g = new Comparator() { // from class: x8g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((a9g) obj).a - ((a9g) obj2).a;
        }
    };
    private static final Comparator h = new Comparator() { // from class: y8g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((a9g) obj).c, ((a9g) obj2).c);
        }
    };
    private int d;
    private int e;
    private int f;
    private final a9g[] b = new a9g[5];
    private final ArrayList a = new ArrayList();
    private int c = -1;

    public b9g(int i) {
    }

    public final float a(float f) {
        if (this.c != 0) {
            Collections.sort(this.a, h);
            this.c = 0;
        }
        float f2 = this.e;
        int i = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            float f3 = 0.5f * f2;
            a9g a9gVar = (a9g) this.a.get(i2);
            i += a9gVar.b;
            if (i >= f3) {
                return a9gVar.c;
            }
        }
        if (this.a.isEmpty()) {
            return Float.NaN;
        }
        return ((a9g) this.a.get(r5.size() - 1)).c;
    }

    public final void b(int i, float f) {
        a9g a9gVar;
        if (this.c != 1) {
            Collections.sort(this.a, g);
            this.c = 1;
        }
        int i2 = this.f;
        if (i2 > 0) {
            a9g[] a9gVarArr = this.b;
            int i3 = i2 - 1;
            this.f = i3;
            a9gVar = a9gVarArr[i3];
        } else {
            a9gVar = new a9g(null);
        }
        int i4 = this.d;
        this.d = i4 + 1;
        a9gVar.a = i4;
        a9gVar.b = i;
        a9gVar.c = f;
        this.a.add(a9gVar);
        this.e += i;
        while (true) {
            int i5 = this.e;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            a9g a9gVar2 = (a9g) this.a.get(0);
            int i7 = a9gVar2.b;
            if (i7 <= i6) {
                this.e -= i7;
                this.a.remove(0);
                int i8 = this.f;
                if (i8 < 5) {
                    a9g[] a9gVarArr2 = this.b;
                    this.f = i8 + 1;
                    a9gVarArr2[i8] = a9gVar2;
                }
            } else {
                a9gVar2.b = i7 - i6;
                this.e -= i6;
            }
        }
    }

    public final void c() {
        this.a.clear();
        this.c = -1;
        this.d = 0;
        this.e = 0;
    }
}
