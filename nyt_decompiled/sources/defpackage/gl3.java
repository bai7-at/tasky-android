package defpackage;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import defpackage.t91;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class gl3 implements t91 {
    private final RecyclableBufferedInputStream a;

    public static final class a implements t91.a {
        private final to a;

        public a(to toVar) {
            this.a = toVar;
        }

        @Override // t91.a
        public Class a() {
            return InputStream.class;
        }

        @Override // t91.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t91 b(InputStream inputStream) {
            return new gl3(inputStream, this.a);
        }
    }

    public gl3(InputStream inputStream, to toVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, toVar);
        this.a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // defpackage.t91
    public void b() {
        this.a.release();
    }

    public void c() {
        this.a.b();
    }

    @Override // defpackage.t91
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.a.reset();
        return this.a;
    }
}
