package defpackage;

/* loaded from: classes4.dex */
public abstract class iu4 {
    public static final wt4 a = new a();

    public static final class a extends wt4 {
        a() {
            super(1, 2);
        }

        @Override // defpackage.wt4
        public void a(sc8 sc8Var) {
            zq3.h(sc8Var, "database");
            sc8Var.B("ALTER TABLE audio_positions ADD COLUMN asset_state TEXT NOT NULL DEFAULT 'PAUSED'");
        }
    }
}
