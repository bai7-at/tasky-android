package defpackage;

import defpackage.d20;

/* loaded from: classes2.dex */
abstract class qj7 {

    public static abstract class a {
        public abstract qj7 a();

        abstract a b(f12 f12Var);

        abstract a c(b32 b32Var);

        abstract a d(br8 br8Var);

        public abstract a e(as8 as8Var);

        public abstract a f(String str);
    }

    qj7() {
    }

    public static a a() {
        return new d20.b();
    }

    public abstract f12 b();

    abstract b32 c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    abstract br8 e();

    public abstract as8 f();

    public abstract String g();
}
