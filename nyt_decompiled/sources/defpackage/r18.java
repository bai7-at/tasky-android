package defpackage;

/* loaded from: classes3.dex */
public abstract class r18 {

    public static abstract class a {
        public static a b(String str, String str2, String str3, String str4, int i, ko1 ko1Var) {
            return new g20(str, str2, str3, str4, i, ko1Var);
        }

        public abstract String a();

        public abstract int c();

        public abstract ko1 d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    public static abstract class b {
        public static b c(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
            return new h20(i, str, i2, j, j2, z, i3, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    public static abstract class c {
        public static c a(String str, String str2, boolean z) {
            return new i20(str, str2, z);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static r18 b(a aVar, c cVar, b bVar) {
        return new f20(aVar, cVar, bVar);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();
}
