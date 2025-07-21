package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class wm4 {
    final List a;
    final boolean b;

    public static final class a {
        private List a;
        private boolean b = false;

        public a a(sm4 sm4Var) {
            if (sm4Var == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            List list = this.a;
            if (list == null) {
                this.a = new ArrayList();
            } else if (list.contains(sm4Var)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.a.add(sm4Var);
            return this;
        }

        public a b(Collection collection) {
            if (collection == null) {
                throw new IllegalArgumentException("routes must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    a((sm4) it2.next());
                }
            }
            return this;
        }

        public wm4 c() {
            return new wm4(this.a, this.b);
        }

        public a d(boolean z) {
            this.b = z;
            return this;
        }
    }

    wm4(List list, boolean z) {
        this.a = list == null ? Collections.emptyList() : list;
        this.b = z;
    }

    public static wm4 a(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(sm4.d((Bundle) parcelableArrayList.get(i)));
            }
            arrayList = arrayList2;
        }
        return new wm4(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public List b() {
        return this.a;
    }

    public boolean c() {
        int size = b().size();
        for (int i = 0; i < size; i++) {
            sm4 sm4Var = (sm4) this.a.get(i);
            if (sm4Var == null || !sm4Var.x()) {
                return false;
            }
        }
        return true;
    }

    public boolean d() {
        return this.b;
    }

    public String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(b().toArray()) + ", isValid=" + c() + " }";
    }
}
