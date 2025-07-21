package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;
import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class qe4 implements lu3 {
    private Object a;
    private boolean b;
    private final List c = new ArrayList();

    public static abstract class a {

        /* renamed from: qe4$a$a, reason: collision with other inner class name */
        public static final class C0517a extends a {
            private final List a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0517a(List list) {
                super(null);
                zq3.h(list, "list");
                this.a = list;
            }

            public final List a() {
                return this.a;
            }

            public String toString() {
                return "List (" + this.a.size() + ')';
            }
        }

        public static final class b extends a {
            private final Map a;
            private String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Map map, String str) {
                super(null);
                zq3.h(map, "map");
                this.a = map;
                this.b = str;
            }

            public final Map a() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }

            public final void c(String str) {
                this.b = str;
            }

            public String toString() {
                return "Map (" + this.b + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final qe4 G(Object obj) {
        a aVar = (a) i.y0(this.c);
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            String b = bVar.b();
            if (b == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (bVar.a().containsKey(b)) {
                bVar.a().put(b, a(bVar.a().get(b), obj));
            } else {
                bVar.a().put(b, obj);
            }
            bVar.c(null);
        } else if (aVar instanceof a.C0517a) {
            ((a.C0517a) aVar).a().add(obj);
        } else {
            this.a = obj;
            this.b = true;
        }
        return this;
    }

    private final Object a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 == null) {
            return obj;
        }
        if (obj instanceof List) {
            if (!(obj2 instanceof List)) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
            an3 m = i.m((Collection) obj);
            ArrayList arrayList = new ArrayList(i.w(m, 10));
            Iterator it2 = m.iterator();
            while (it2.hasNext()) {
                int c = ((qm3) it2).c();
                arrayList.add(a(list.get(c), list2.get(c)));
            }
            return arrayList;
        }
        if (!(obj instanceof Map)) {
            if (zq3.c(obj, obj2)) {
                return obj;
            }
            throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
        }
        if (!(obj2 instanceof Map)) {
            throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        Set<String> m2 = b0.m(map.keySet(), map2.keySet());
        ArrayList arrayList2 = new ArrayList(i.w(m2, 10));
        for (String str : m2) {
            arrayList2.add(du8.a(str, a(map.get(str), map2.get(str))));
        }
        return t.t(arrayList2);
    }

    @Override // defpackage.lu3
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public qe4 value(boolean z) {
        return G(Boolean.valueOf(z));
    }

    @Override // defpackage.lu3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public qe4 p1() {
        return G(null);
    }

    @Override // defpackage.lu3
    public lu3 beginArray() {
        this.c.add(new a.C0517a(new ArrayList()));
        return this;
    }

    @Override // defpackage.lu3
    public lu3 beginObject() {
        this.c.add(new a.b(new LinkedHashMap(), null));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final Object d() {
        if (this.b) {
            return this.a;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // defpackage.lu3
    public lu3 endArray() {
        a aVar = (a) this.c.remove(r0.size() - 1);
        if (!(aVar instanceof a.C0517a)) {
            throw new IllegalStateException("Check failed.");
        }
        G(((a.C0517a) aVar).a());
        return this;
    }

    @Override // defpackage.lu3
    public lu3 endObject() {
        a aVar = (a) this.c.remove(r0.size() - 1);
        if (!(aVar instanceof a.b)) {
            throw new IllegalStateException("Check failed.");
        }
        G(((a.b) aVar).a());
        return this;
    }

    @Override // defpackage.lu3
    public String getPath() {
        String b;
        List<a> list = this.c;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        for (a aVar : list) {
            if (aVar instanceof a.C0517a) {
                b = String.valueOf(((a.C0517a) aVar).a().size());
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                b = ((a.b) aVar).b();
                if (b == null) {
                    b = "?";
                }
            }
            arrayList.add(b);
        }
        return i.u0(arrayList, InstructionFileId.DOT, null, null, 0, null, null, 62, null);
    }

    @Override // defpackage.lu3
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public qe4 value(double d) {
        return G(Double.valueOf(d));
    }

    @Override // defpackage.lu3
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public qe4 D(int i) {
        return G(Integer.valueOf(i));
    }

    @Override // defpackage.lu3
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public qe4 value(long j) {
        return G(Long.valueOf(j));
    }

    @Override // defpackage.lu3
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public qe4 z0(zt3 zt3Var) {
        zq3.h(zt3Var, "value");
        return G(zt3Var);
    }

    @Override // defpackage.lu3
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public qe4 A(ay8 ay8Var) {
        zq3.h(ay8Var, "value");
        return G(null);
    }

    @Override // defpackage.lu3
    public lu3 name(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        a aVar = (a) i.w0(this.c);
        if (!(aVar instanceof a.b)) {
            throw new IllegalStateException("Check failed.");
        }
        a.b bVar = (a.b) aVar;
        if (bVar.b() != null) {
            throw new IllegalStateException("Check failed.");
        }
        bVar.c(str);
        return this;
    }

    public final qe4 r(Object obj) {
        return G(obj);
    }

    @Override // defpackage.lu3
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public qe4 value(String str) {
        zq3.h(str, "value");
        return G(str);
    }
}
