package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ym4 {
    public static final ym4 c = new ym4(new Bundle(), null);
    private final Bundle a;
    List b;

    public static final class a {
        private ArrayList a;

        public a() {
        }

        public a a(Collection collection) {
            if (collection == null) {
                throw new IllegalArgumentException("categories must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    b((String) it2.next());
                }
            }
            return this;
        }

        public a b(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (this.a == null) {
                this.a = new ArrayList();
            }
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            return this;
        }

        public a c(ym4 ym4Var) {
            if (ym4Var == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            a(ym4Var.e());
            return this;
        }

        public ym4 d() {
            if (this.a == null) {
                return ym4.c;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.a);
            return new ym4(bundle, this.a);
        }

        public a(ym4 ym4Var) {
            if (ym4Var == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            ym4Var.c();
            if (ym4Var.b.isEmpty()) {
                return;
            }
            this.a = new ArrayList(ym4Var.b);
        }
    }

    ym4(Bundle bundle, List list) {
        this.a = bundle;
        this.b = list;
    }

    public static ym4 d(Bundle bundle) {
        if (bundle != null) {
            return new ym4(bundle, null);
        }
        return null;
    }

    public Bundle a() {
        return this.a;
    }

    public boolean b(ym4 ym4Var) {
        if (ym4Var == null) {
            return false;
        }
        c();
        ym4Var.c();
        return this.b.containsAll(ym4Var.b);
    }

    void c() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("controlCategories");
            this.b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.b = Collections.emptyList();
            }
        }
    }

    public List e() {
        c();
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ym4)) {
            return false;
        }
        ym4 ym4Var = (ym4) obj;
        c();
        ym4Var.c();
        return this.b.equals(ym4Var.b);
    }

    public boolean f() {
        c();
        return this.b.isEmpty();
    }

    public boolean g() {
        c();
        return !this.b.contains(null);
    }

    public boolean h(List list) {
        if (list != null) {
            c();
            int size = this.b.size();
            if (size != 0) {
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    IntentFilter intentFilter = (IntentFilter) list.get(i);
                    if (intentFilter != null) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (intentFilter.hasCategory((String) this.b.get(i2))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        c();
        return this.b.hashCode();
    }

    public String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(e().toArray()) + " }";
    }
}
