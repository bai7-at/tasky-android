package defpackage;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import defpackage.k91;
import defpackage.yu4;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class af0 implements yu4 {
    private final b a;

    public static class a implements zu4 {

        /* renamed from: af0$a$a, reason: collision with other inner class name */
        class C0001a implements b {
            C0001a() {
            }

            @Override // af0.b
            public Class a() {
                return ByteBuffer.class;
            }

            @Override // af0.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new af0(new C0001a());
        }
    }

    public interface b {
        Class a();

        Object b(byte[] bArr);
    }

    private static class c implements k91 {
        private final byte[] a;
        private final b b;

        c(byte[] bArr, b bVar) {
            this.a = bArr;
            this.b = bVar;
        }

        @Override // defpackage.k91
        public Class a() {
            return this.b.a();
        }

        @Override // defpackage.k91
        public void b() {
        }

        @Override // defpackage.k91
        public void cancel() {
        }

        @Override // defpackage.k91
        public void d(Priority priority, k91.a aVar) {
            aVar.f(this.b.b(this.a));
        }

        @Override // defpackage.k91
        public DataSource e() {
            return DataSource.LOCAL;
        }
    }

    public static class d implements zu4 {

        class a implements b {
            a() {
            }

            @Override // af0.b
            public Class a() {
                return InputStream.class;
            }

            @Override // af0.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new af0(new a());
        }
    }

    public af0(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.yu4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yu4.a a(byte[] bArr, int i, int i2, sk5 sk5Var) {
        return new yu4.a(new ac5(bArr), new c(bArr, this.a));
    }

    @Override // defpackage.yu4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(byte[] bArr) {
        return true;
    }
}
