package defpackage;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import defpackage.k91;
import defpackage.yu4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class kx4 implements yu4 {
    private final List a;
    private final sz5 b;

    static class a implements k91, k91.a {
        private final List a;
        private final sz5 b;
        private int c;
        private Priority d;
        private k91.a e;
        private List f;
        private boolean g;

        a(List list, sz5 sz5Var) {
            this.b = sz5Var;
            z06.c(list);
            this.a = list;
            this.c = 0;
        }

        private void g() {
            if (this.g) {
                return;
            }
            if (this.c < this.a.size() - 1) {
                this.c++;
                d(this.d, this.e);
            } else {
                z06.d(this.f);
                this.e.c(new GlideException("Fetch failed", new ArrayList(this.f)));
            }
        }

        @Override // defpackage.k91
        public Class a() {
            return ((k91) this.a.get(0)).a();
        }

        @Override // defpackage.k91
        public void b() {
            List list = this.f;
            if (list != null) {
                this.b.a(list);
            }
            this.f = null;
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((k91) it2.next()).b();
            }
        }

        @Override // k91.a
        public void c(Exception exc) {
            ((List) z06.d(this.f)).add(exc);
            g();
        }

        @Override // defpackage.k91
        public void cancel() {
            this.g = true;
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((k91) it2.next()).cancel();
            }
        }

        @Override // defpackage.k91
        public void d(Priority priority, k91.a aVar) {
            this.d = priority;
            this.e = aVar;
            this.f = (List) this.b.b();
            ((k91) this.a.get(this.c)).d(priority, this);
            if (this.g) {
                cancel();
            }
        }

        @Override // defpackage.k91
        public DataSource e() {
            return ((k91) this.a.get(0)).e();
        }

        @Override // k91.a
        public void f(Object obj) {
            if (obj != null) {
                this.e.f(obj);
            } else {
                g();
            }
        }
    }

    kx4(List list, sz5 sz5Var) {
        this.a = list;
        this.b = sz5Var;
    }

    @Override // defpackage.yu4
    public yu4.a a(Object obj, int i, int i2, sk5 sk5Var) {
        yu4.a a2;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        ov3 ov3Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            yu4 yu4Var = (yu4) this.a.get(i3);
            if (yu4Var.b(obj) && (a2 = yu4Var.a(obj, i, i2, sk5Var)) != null) {
                ov3Var = a2.a;
                arrayList.add(a2.c);
            }
        }
        if (arrayList.isEmpty() || ov3Var == null) {
            return null;
        }
        return new yu4.a(ov3Var, new a(arrayList, this.b));
    }

    @Override // defpackage.yu4
    public boolean b(Object obj) {
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            if (((yu4) it2.next()).b(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
