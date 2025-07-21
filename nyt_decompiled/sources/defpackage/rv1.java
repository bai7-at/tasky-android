package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class rv1 implements xq8 {
    private final xq8 b;
    private final boolean c;

    public rv1(xq8 xq8Var, boolean z) {
        this.b = xq8Var;
        this.c = z;
    }

    private cz6 d(Context context, cz6 cz6Var) {
        return e04.f(context.getResources(), cz6Var);
    }

    @Override // defpackage.xq8
    public cz6 a(Context context, cz6 cz6Var, int i, int i2) {
        w80 f = a.c(context).f();
        Drawable drawable = (Drawable) cz6Var.get();
        cz6 a = qv1.a(f, drawable, i, i2);
        if (a != null) {
            cz6 a2 = this.b.a(context, a, i, i2);
            if (!a2.equals(a)) {
                return d(context, a2);
            }
            a2.c();
            return cz6Var;
        }
        if (!this.c) {
            return cz6Var;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // defpackage.ov3
    public void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    public xq8 c() {
        return this;
    }

    @Override // defpackage.ov3
    public boolean equals(Object obj) {
        if (obj instanceof rv1) {
            return this.b.equals(((rv1) obj).b);
        }
        return false;
    }

    @Override // defpackage.ov3
    public int hashCode() {
        return this.b.hashCode();
    }
}
