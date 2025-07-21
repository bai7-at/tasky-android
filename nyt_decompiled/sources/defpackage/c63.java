package defpackage;

import com.google.gson.Gson;
import defpackage.b63;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class c63 {
    private long a;
    private Gson b;
    private boolean c;
    private boolean d;
    private b63.b e;
    private List f = new ArrayList();

    private static final class b extends b63.d {
        private final Gson a;
        private final boolean b;
        private final boolean c;
        private final b63.b d;
        private final List e;
        private volatile transient a f;

        private final class a {
            private Gson a;
            private int b;
            private boolean c;
            private int d;
            private boolean e;
            private int f;
            private b63.b g;
            private int h;

            private a() {
            }

            private String e() {
                ArrayList arrayList = new ArrayList();
                if (this.b == -1) {
                    arrayList.add("gson");
                }
                if (this.d == -1) {
                    arrayList.add("allowJackson");
                }
                if (this.f == -1) {
                    arrayList.add("lenient");
                }
                if (this.h == -1) {
                    arrayList.add("exceptionHandler");
                }
                return "Cannot build GsonProviderOptions, attribute initializers form cycle" + arrayList;
            }

            void a(boolean z) {
                this.c = z;
                this.d = 1;
            }

            boolean b() {
                int i = this.d;
                if (i == -1) {
                    throw new IllegalStateException(e());
                }
                if (i == 0) {
                    this.d = -1;
                    this.c = b.super.a();
                    this.d = 1;
                }
                return this.c;
            }

            b63.b c() {
                int i = this.h;
                if (i == -1) {
                    throw new IllegalStateException(e());
                }
                if (i == 0) {
                    this.h = -1;
                    b63.b b = b.super.b();
                    Objects.requireNonNull(b, "exceptionHandler");
                    this.g = b;
                    this.h = 1;
                }
                return this.g;
            }

            void d(b63.b bVar) {
                this.g = bVar;
                this.h = 1;
            }

            Gson f() {
                int i = this.b;
                if (i == -1) {
                    throw new IllegalStateException(e());
                }
                if (i == 0) {
                    this.b = -1;
                    Gson c = b.super.c();
                    Objects.requireNonNull(c, "gson");
                    this.a = c;
                    this.b = 1;
                }
                return this.a;
            }

            void g(Gson gson) {
                this.a = gson;
                this.b = 1;
            }

            void h(boolean z) {
                this.e = z;
                this.f = 1;
            }

            boolean i() {
                int i = this.f;
                if (i == -1) {
                    throw new IllegalStateException(e());
                }
                if (i == 0) {
                    this.f = -1;
                    this.e = b.super.d();
                    this.f = 1;
                }
                return this.e;
            }
        }

        private boolean j(b bVar) {
            return this.a.equals(bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d.equals(bVar.d) && this.e.equals(bVar.e);
        }

        @Override // b63.d
        public boolean a() {
            a aVar = this.f;
            return aVar != null ? aVar.b() : this.b;
        }

        @Override // b63.d
        public b63.b b() {
            a aVar = this.f;
            return aVar != null ? aVar.c() : this.d;
        }

        @Override // b63.d
        public Gson c() {
            a aVar = this.f;
            return aVar != null ? aVar.f() : this.a;
        }

        @Override // b63.d
        public boolean d() {
            a aVar = this.f;
            return aVar != null ? aVar.i() : this.c;
        }

        @Override // b63.d
        public List e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && j((b) obj);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() + 177573;
            int i = hashCode + (hashCode << 5) + (this.b ? 1231 : 1237);
            int i2 = i + (i << 5) + (this.c ? 1231 : 1237);
            int hashCode2 = i2 + (i2 << 5) + this.d.hashCode();
            return hashCode2 + (hashCode2 << 5) + this.e.hashCode();
        }

        public String toString() {
            return "GsonProviderOptions{gson=" + this.a + ", allowJackson=" + this.b + ", lenient=" + this.c + ", exceptionHandler=" + this.d + ", mediaTypes=" + this.e + "}";
        }

        private b(c63 c63Var) {
            this.f = new a();
            this.e = c63.k(true, c63Var.f);
            if (c63Var.b != null) {
                this.f.g(c63Var.b);
            }
            if (c63Var.i()) {
                this.f.a(c63Var.c);
            }
            if (c63Var.l()) {
                this.f.h(c63Var.d);
            }
            if (c63Var.e != null) {
                this.f.d(c63Var.e);
            }
            this.a = this.f.f();
            this.b = this.f.b();
            this.c = this.f.i();
            this.d = this.f.c();
            this.f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        return (this.a & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List k(boolean z, List list) {
        int size = list.size();
        if (size == 0) {
            return Collections.emptyList();
        }
        if (size == 1) {
            return Collections.singletonList(list.get(0));
        }
        if (z) {
            return Collections.unmodifiableList(new ArrayList(list));
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        return (this.a & 2) != 0;
    }

    public b63.d j() {
        return new b();
    }
}
