package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import defpackage.k91;
import defpackage.yu4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class ke2 implements yu4 {
    private final d a;

    public static class a implements zu4 {
        private final d a;

        public a(d dVar) {
            this.a = dVar;
        }

        @Override // defpackage.zu4
        public final yu4 b(lx4 lx4Var) {
            return new ke2(this.a);
        }
    }

    public static class b extends a {

        class a implements d {
            a() {
            }

            @Override // ke2.d
            public Class a() {
                return ParcelFileDescriptor.class;
            }

            @Override // ke2.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            @Override // ke2.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    private static final class c implements k91 {
        private final File a;
        private final d b;
        private Object c;

        c(File file, d dVar) {
            this.a = file;
            this.b = dVar;
        }

        @Override // defpackage.k91
        public Class a() {
            return this.b.a();
        }

        @Override // defpackage.k91
        public void b() {
            Object obj = this.c;
            if (obj != null) {
                try {
                    this.b.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // defpackage.k91
        public void cancel() {
        }

        @Override // defpackage.k91
        public void d(Priority priority, k91.a aVar) {
            try {
                Object c = this.b.c(this.a);
                this.c = c;
                aVar.f(c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.c(e);
            }
        }

        @Override // defpackage.k91
        public DataSource e() {
            return DataSource.LOCAL;
        }
    }

    public interface d {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    public static class e extends a {

        class a implements d {
            a() {
            }

            @Override // ke2.d
            public Class a() {
                return InputStream.class;
            }

            @Override // ke2.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // ke2.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public ke2(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.yu4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yu4.a a(File file, int i, int i2, sk5 sk5Var) {
        return new yu4.a(new ac5(file), new c(file, this.a));
    }

    @Override // defpackage.yu4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }
}
