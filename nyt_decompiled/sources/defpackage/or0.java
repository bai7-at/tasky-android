package defpackage;

import coil.ImageLoader;
import defpackage.uc1;
import defpackage.vd2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class or0 {
    private final List a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;

    public /* synthetic */ or0(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    public final List a() {
        return this.e;
    }

    public final List b() {
        return this.d;
    }

    public final List c() {
        return this.a;
    }

    public final List d() {
        return this.c;
    }

    public final List e() {
        return this.b;
    }

    public final String f(Object obj, uk5 uk5Var) {
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            qw3 qw3Var = (qw3) pair.a();
            if (((Class) pair.b()).isAssignableFrom(obj.getClass())) {
                zq3.f(qw3Var, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String a2 = qw3Var.a(obj, uk5Var);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    public final Object g(Object obj, uk5 uk5Var) {
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            we4 we4Var = (we4) pair.a();
            if (((Class) pair.b()).isAssignableFrom(obj.getClass())) {
                zq3.f(we4Var, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object a2 = we4Var.a(obj, uk5Var);
                if (a2 != null) {
                    obj = a2;
                }
            }
        }
        return obj;
    }

    public final a h() {
        return new a(this);
    }

    public final Pair i(sx7 sx7Var, uk5 uk5Var, ImageLoader imageLoader, int i) {
        int size = this.e.size();
        while (i < size) {
            uc1 a2 = ((uc1.a) this.e.get(i)).a(sx7Var, uk5Var, imageLoader);
            if (a2 != null) {
                return du8.a(a2, Integer.valueOf(i));
            }
            i++;
        }
        return null;
    }

    public final Pair j(Object obj, uk5 uk5Var, ImageLoader imageLoader, int i) {
        int size = this.d.size();
        while (i < size) {
            Pair pair = (Pair) this.d.get(i);
            vd2.a aVar = (vd2.a) pair.a();
            if (((Class) pair.b()).isAssignableFrom(obj.getClass())) {
                zq3.f(aVar, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                vd2 a2 = aVar.a(obj, uk5Var, imageLoader);
                if (a2 != null) {
                    return du8.a(a2, Integer.valueOf(i));
                }
            }
            i++;
        }
        return null;
    }

    private or0(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    public static final class a {
        private final List a;
        private final List b;
        private final List c;
        private final List d;
        private final List e;

        public a() {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }

        public final a a(uc1.a aVar) {
            this.e.add(aVar);
            return this;
        }

        public final a b(vd2.a aVar, Class cls) {
            this.d.add(du8.a(aVar, cls));
            return this;
        }

        public final a c(qw3 qw3Var, Class cls) {
            this.c.add(du8.a(qw3Var, cls));
            return this;
        }

        public final a d(we4 we4Var, Class cls) {
            this.b.add(du8.a(we4Var, cls));
            return this;
        }

        public final or0 e() {
            return new or0(e.a(this.a), e.a(this.b), e.a(this.c), e.a(this.d), e.a(this.e), null);
        }

        public final List f() {
            return this.e;
        }

        public final List g() {
            return this.d;
        }

        public a(or0 or0Var) {
            this.a = i.a1(or0Var.c());
            this.b = i.a1(or0Var.e());
            this.c = i.a1(or0Var.d());
            this.d = i.a1(or0Var.b());
            this.e = i.a1(or0Var.a());
        }
    }

    public or0() {
        this(i.l(), i.l(), i.l(), i.l(), i.l());
    }
}
