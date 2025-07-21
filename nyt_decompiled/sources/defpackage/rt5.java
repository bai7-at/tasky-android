package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class rt5 implements wq8 {
    private final bh3 a;

    public rt5(bh3 bh3Var) {
        zq3.h(bh3Var, "transformation");
        this.a = bh3Var;
    }

    @Override // defpackage.wq8
    public String a() {
        return this.a.a();
    }

    @Override // defpackage.wq8
    public Bitmap b(Bitmap bitmap) {
        zq3.h(bitmap, "source");
        return this.a.b(bitmap);
    }
}
