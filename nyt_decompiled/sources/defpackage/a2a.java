package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
final class a2a extends c2a {
    public final long b;
    public final List c;
    public final List d;

    public a2a(int i, long j) {
        super(i);
        this.b = j;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final a2a c(int i) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            a2a a2aVar = (a2a) this.d.get(i2);
            if (a2aVar.a == i) {
                return a2aVar;
            }
        }
        return null;
    }

    public final b2a d(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b2a b2aVar = (b2a) this.c.get(i2);
            if (b2aVar.a == i) {
                return b2aVar;
            }
        }
        return null;
    }

    public final void e(a2a a2aVar) {
        this.d.add(a2aVar);
    }

    public final void f(b2a b2aVar) {
        this.c.add(b2aVar);
    }

    @Override // defpackage.c2a
    public final String toString() {
        List list = this.c;
        return c2a.b(this.a) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
    }
}
