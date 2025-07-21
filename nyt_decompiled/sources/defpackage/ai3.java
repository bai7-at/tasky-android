package defpackage;

/* loaded from: classes5.dex */
public abstract class ai3 implements xx7 {
    public static final xx7 a = h(bp8.b(), fy7.b(), ap8.a(), dp8.a(), false, false);

    public static xx7 a(String str, String str2, ap8 ap8Var, dp8 dp8Var, boolean z, boolean z2) {
        return (z2 || (fy7.c(str2) && bp8.c(str))) ? h(str, str2, ap8Var, dp8Var, z, true) : h(bp8.b(), fy7.b(), ap8Var, dp8Var, z, false);
    }

    private static r10 h(String str, String str2, ap8 ap8Var, dp8 dp8Var, boolean z, boolean z2) {
        return new r10(str, str2, ap8Var, dp8Var, z, z2);
    }

    @Override // defpackage.xx7
    public abstract boolean c();
}
