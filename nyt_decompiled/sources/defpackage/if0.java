package defpackage;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import defpackage.k91;
import defpackage.yu4;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class if0 implements yu4 {

    private static final class a implements k91 {
        private final File a;

        a(File file) {
            this.a = file;
        }

        @Override // defpackage.k91
        public Class a() {
            return ByteBuffer.class;
        }

        @Override // defpackage.k91
        public void b() {
        }

        @Override // defpackage.k91
        public void cancel() {
        }

        @Override // defpackage.k91
        public void d(Priority priority, k91.a aVar) {
            try {
                aVar.f(lf0.a(this.a));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.c(e);
            }
        }

        @Override // defpackage.k91
        public DataSource e() {
            return DataSource.LOCAL;
        }
    }

    public static class b implements zu4 {
        @Override // defpackage.zu4
        public yu4 b(lx4 lx4Var) {
            return new if0();
        }
    }

    @Override // defpackage.yu4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yu4.a a(File file, int i, int i2, sk5 sk5Var) {
        return new yu4.a(new ac5(file), new a(file));
    }

    @Override // defpackage.yu4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }
}
