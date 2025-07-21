package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class y1 extends AbstractCollection implements Set, yu3 {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Set set, Set set2) {
            zq3.h(set, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
            zq3.h(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int b(Collection collection) {
            zq3.h(collection, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
            Iterator it2 = collection.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                i += next != null ? next.hashCode() : 0;
            }
            return i;
        }

        private a() {
        }
    }

    protected y1() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return a.a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return a.b(this);
    }
}
