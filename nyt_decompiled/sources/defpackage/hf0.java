package defpackage;

import coil.ImageLoader;
import coil.decode.DataSource;
import defpackage.vd2;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class hf0 implements vd2 {
    private final ByteBuffer a;
    private final uk5 b;

    public static final class a implements vd2.a {
        @Override // vd2.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public vd2 a(ByteBuffer byteBuffer, uk5 uk5Var, ImageLoader imageLoader) {
            return new hf0(byteBuffer, uk5Var);
        }
    }

    public hf0(ByteBuffer byteBuffer, uk5 uk5Var) {
        this.a = byteBuffer;
        this.b = uk5Var;
    }

    @Override // defpackage.vd2
    public Object a(by0 by0Var) {
        try {
            ad0 ad0Var = new ad0();
            ad0Var.write(this.a);
            this.a.position(0);
            return new sx7(zg3.a(ad0Var, this.b.g()), null, DataSource.MEMORY);
        } catch (Throwable th) {
            this.a.position(0);
            throw th;
        }
    }
}
