package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class dh3 {
    private final HashMap a = new HashMap();

    public static final class a {
        private final ch3 a;
        private final int b;

        public a(ch3 ch3Var, int i) {
            this.a = ch3Var;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final ch3 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ')';
        }
    }

    public static final class b {
        private final Resources.Theme a;
        private final int b;

        public b(Resources.Theme theme, int i) {
            this.a = theme;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "Key(theme=" + this.a + ", id=" + this.b + ')';
        }
    }

    public final void a() {
        this.a.clear();
    }

    public final a b(b bVar) {
        WeakReference weakReference = (WeakReference) this.a.get(bVar);
        if (weakReference != null) {
            return (a) weakReference.get();
        }
        return null;
    }

    public final void c(int i) {
        Iterator it2 = this.a.entrySet().iterator();
        while (it2.hasNext()) {
            a aVar = (a) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(i, aVar.a())) {
                it2.remove();
            }
        }
    }

    public final void d(b bVar, a aVar) {
        this.a.put(bVar, new WeakReference(aVar));
    }
}
