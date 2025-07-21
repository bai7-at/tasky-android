package defpackage;

import defpackage.yu4;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes2.dex */
public class ez8 implements yu4 {
    private final yu4 a;

    public static class a implements zu4 {
        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new ez8(lx4Var.d(z03.class, InputStream.class));
        }
    }

    public ez8(yu4 yu4Var) {
        this.a = yu4Var;
    }

    @Override // defpackage.yu4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yu4.a a(URL url, int i, int i2, sk5 sk5Var) {
        return this.a.a(new z03(url), i, i2, sk5Var);
    }

    @Override // defpackage.yu4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(URL url) {
        return true;
    }
}
