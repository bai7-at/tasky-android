package defpackage;

/* loaded from: classes4.dex */
public abstract class hu4 {
    public static final wt4 a = new a();
    public static final wt4 b = new b();
    public static final wt4 c = new c();
    public static final wt4 d = new d();
    public static final wt4 e = new e();
    public static final wt4 f = new f();

    public static final class a extends wt4 {
        a() {
            super(1, 2);
        }

        @Override // defpackage.wt4
        public void a(sc8 sc8Var) {
            zq3.h(sc8Var, "database");
            sc8Var.B("ALTER TABLE assets ADD COLUMN asset_type TEXT NOT NULL DEFAULT ''");
            sc8Var.B("ALTER TABLE assets ADD COLUMN last_updated TEXT NOT NULL DEFAULT ''");
        }
    }

    public static final class b extends wt4 {
        b() {
            super(2, 3);
        }

        @Override // defpackage.wt4
        public void a(sc8 sc8Var) {
            zq3.h(sc8Var, "database");
            sc8Var.B("ALTER TABLE assets ADD COLUMN section_name TEXT NOT NULL DEFAULT ''");
        }
    }

    public static final class c extends wt4 {
        c() {
            super(3, 4);
        }

        @Override // defpackage.wt4
        public void a(sc8 sc8Var) {
            zq3.h(sc8Var, "database");
            sc8Var.B("ALTER TABLE assets ADD COLUMN kicker TEXT");
        }
    }

    public static final class d extends wt4 {
        d() {
            super(4, 5);
        }

        @Override // defpackage.wt4
        public void a(sc8 sc8Var) {
            zq3.h(sc8Var, "database");
            sc8Var.B("ALTER TABLE assets ADD COLUMN comment_count INTEGER NOT NULL DEFAULT 0");
            sc8Var.B("ALTER TABLE assets ADD COLUMN url TEXT");
        }
    }

    public static final class e extends wt4 {
        e() {
            super(5, 6);
        }

        @Override // defpackage.wt4
        public void a(sc8 sc8Var) {
            zq3.h(sc8Var, "database");
            sc8Var.B("ALTER TABLE assets ADD COLUMN uri TEXT");
        }
    }

    public static final class f extends wt4 {
        f() {
            super(6, 7);
        }

        @Override // defpackage.wt4
        public void a(sc8 sc8Var) {
            zq3.h(sc8Var, "database");
            sc8Var.B("ALTER TABLE assets ADD COLUMN read_before_but_updated INTEGER NOT NULL DEFAULT 0");
        }
    }
}
