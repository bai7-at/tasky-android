package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class d54 {
    public static final a Companion = new a(null);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d54 a(int i, String str) {
            if (i == -1) {
                return null;
            }
            d dVar = d.b;
            if (i == dVar.a()) {
                return dVar;
            }
            f fVar = f.b;
            if (i == fVar.a()) {
                return fVar;
            }
            g gVar = g.b;
            if (i == gVar.a()) {
                return gVar;
            }
            b bVar = b.b;
            return i == bVar.a() ? bVar : i == 5 ? new e(str) : new c(str);
        }

        private a() {
        }
    }

    public static final class b extends d54 {
        public static final b b = new b();

        private b() {
            super(4, null);
        }
    }

    public static final class c extends d54 {
        private final String b;

        public c(String str) {
            super(3, null);
            this.b = str;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.b, ((c) obj).b);
        }

        public int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "LinkToNYTFailed(errorMessage=" + this.b + ")";
        }
    }

    public static final class d extends d54 {
        public static final d b = new d();

        private d() {
            super(0, null);
        }
    }

    public static final class e extends d54 {
        private final String b;

        public e(String str) {
            super(5, null);
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && zq3.c(this.b, ((e) obj).b);
        }

        public int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "NetworkConnectivityIssue(errorMessage=" + this.b + ")";
        }
    }

    public static final class f extends d54 {
        public static final f b = new f();

        private f() {
            super(1, null);
        }
    }

    public static final class g extends d54 {
        public static final g b = new g();

        private g() {
            super(2, null);
        }
    }

    public /* synthetic */ d54(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int a() {
        return this.a;
    }

    private d54(int i) {
        this.a = i;
    }
}
