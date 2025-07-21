package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes2.dex */
public class dz6 implements iz6 {
    private final vz6 a;
    private final w80 b;

    public dz6(vz6 vz6Var, w80 w80Var) {
        this.a = vz6Var;
        this.b = w80Var;
    }

    @Override // defpackage.iz6
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public cz6 b(Uri uri, int i, int i2, sk5 sk5Var) {
        cz6 b = this.a.b(uri, i, i2, sk5Var);
        if (b == null) {
            return null;
        }
        return qv1.a(this.b, (Drawable) b.get(), i, i2);
    }

    @Override // defpackage.iz6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, sk5 sk5Var) {
        return "android.resource".equals(uri.getScheme());
    }
}
