package defpackage;

import android.content.res.Resources;

/* loaded from: classes2.dex */
public class o80 implements iz6 {
    private final iz6 a;
    private final Resources b;

    public o80(Resources resources, iz6 iz6Var) {
        this.b = (Resources) z06.d(resources);
        this.a = (iz6) z06.d(iz6Var);
    }

    @Override // defpackage.iz6
    public boolean a(Object obj, sk5 sk5Var) {
        return this.a.a(obj, sk5Var);
    }

    @Override // defpackage.iz6
    public cz6 b(Object obj, int i, int i2, sk5 sk5Var) {
        return e04.f(this.b, this.a.b(obj, i, i2, sk5Var));
    }
}
