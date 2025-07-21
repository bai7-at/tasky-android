package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class pz2 implements xq8 {
    private final xq8 b;

    public pz2(xq8 xq8Var) {
        this.b = (xq8) z06.d(xq8Var);
    }

    @Override // defpackage.xq8
    public cz6 a(Context context, cz6 cz6Var, int i, int i2) {
        lz2 lz2Var = (lz2) cz6Var.get();
        cz6 y80Var = new y80(lz2Var.e(), a.c(context).f());
        cz6 a = this.b.a(context, y80Var, i, i2);
        if (!y80Var.equals(a)) {
            y80Var.c();
        }
        lz2Var.m(this.b, (Bitmap) a.get());
        return cz6Var;
    }

    @Override // defpackage.ov3
    public void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.ov3
    public boolean equals(Object obj) {
        if (obj instanceof pz2) {
            return this.b.equals(((pz2) obj).b);
        }
        return false;
    }

    @Override // defpackage.ov3
    public int hashCode() {
        return this.b.hashCode();
    }
}
