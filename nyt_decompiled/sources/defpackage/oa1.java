package defpackage;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import defpackage.k91;
import defpackage.yu4;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class oa1 implements yu4 {
    private final a a;

    public interface a {
        Class a();

        void b(Object obj);

        Object decode(String str);
    }

    private static final class b implements k91 {
        private final String a;
        private final a b;
        private Object c;

        b(String str, a aVar) {
            this.a = str;
            this.b = aVar;
        }

        @Override // defpackage.k91
        public Class a() {
            return this.b.a();
        }

        @Override // defpackage.k91
        public void b() {
            try {
                this.b.b(this.c);
            } catch (IOException unused) {
            }
        }

        @Override // defpackage.k91
        public void cancel() {
        }

        @Override // defpackage.k91
        public void d(Priority priority, k91.a aVar) {
            try {
                Object decode = this.b.decode(this.a);
                this.c = decode;
                aVar.f(decode);
            } catch (IllegalArgumentException e) {
                aVar.c(e);
            }
        }

        @Override // defpackage.k91
        public DataSource e() {
            return DataSource.LOCAL;
        }
    }

    public static final class c implements zu4 {
        private final a a = new a();

        class a implements a {
            a() {
            }

            @Override // oa1.a
            public Class a() {
                return InputStream.class;
            }

            @Override // oa1.a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // oa1.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public InputStream decode(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new oa1(this.a);
        }
    }

    public oa1(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.yu4
    public yu4.a a(Object obj, int i, int i2, sk5 sk5Var) {
        return new yu4.a(new ac5(obj), new b(obj.toString(), this.a));
    }

    @Override // defpackage.yu4
    public boolean b(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
