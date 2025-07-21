package defpackage;

/* loaded from: classes.dex */
public interface un5 {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final un5 a(int i) {
            if (i >= 0) {
                return new vn5(i);
            }
            throw new IllegalArgumentException(("pages should be greater than or equal to 0. You have used " + i + '.').toString());
        }
    }

    int a(int i, int i2, float f, int i3, int i4);
}
