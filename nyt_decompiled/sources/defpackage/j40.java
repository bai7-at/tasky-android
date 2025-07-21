package defpackage;

/* loaded from: classes4.dex */
public interface j40 {

    public static final class a {
        public static /* synthetic */ void a(j40 j40Var, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlignBottom");
            }
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            j40Var.a(i, i2);
        }
    }

    void a(int i, int i2);

    void dismiss();

    /* synthetic */ void setOnBalloonOverlayClickListener(qs2 qs2Var);
}
