package defpackage;

import android.os.StatFs;
import defpackage.jp5;
import java.io.Closeable;
import java.io.File;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public interface qr1 {

    public static final class a {
        private jp5 a;
        private long f;
        private we2 b = we2.b;
        private double c = 0.02d;
        private long d = 10485760;
        private long e = 262144000;
        private CoroutineDispatcher g = Dispatchers.getIO();

        public final qr1 a() {
            long j;
            jp5 jp5Var = this.a;
            if (jp5Var == null) {
                throw new IllegalStateException("directory == null");
            }
            if (this.c > 0.0d) {
                try {
                    StatFs statFs = new StatFs(jp5Var.o().getAbsolutePath());
                    j = uo6.o((long) (this.c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.d, this.e);
                } catch (Exception unused) {
                    j = this.d;
                }
            } else {
                j = this.f;
            }
            return new eq6(j, jp5Var, this.b, this.g);
        }

        public final a b(jp5 jp5Var) {
            this.a = jp5Var;
            return this;
        }

        public final a c(File file) {
            return b(jp5.a.d(jp5.b, file, false, 1, null));
        }
    }

    public interface b {
        c a();

        void abort();

        jp5 getData();

        jp5 getMetadata();
    }

    public interface c extends Closeable {
        b Y0();

        jp5 getData();

        jp5 getMetadata();
    }

    we2 a();

    b b(String str);

    c get(String str);
}
