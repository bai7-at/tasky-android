package defpackage;

/* loaded from: classes5.dex */
public abstract class tb8 {
    private static final a a = new a();

    static final class a implements gb8 {
        a() {
        }

        @Override // defpackage.gb8
        public boolean isUnsubscribed() {
            return true;
        }

        @Override // defpackage.gb8
        public void unsubscribe() {
        }
    }

    public static gb8 a(v3 v3Var) {
        return ab0.b(v3Var);
    }

    public static gb8 b() {
        return ab0.a();
    }

    public static gb8 c() {
        return a;
    }
}
