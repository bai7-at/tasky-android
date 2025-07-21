package defpackage;

import android.util.Log;
import com.facebook.AuthenticationTokenClaims;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class t36 {
    public static final a e = new a(null);
    private static final Map f = new HashMap();
    private final boolean a;
    private final File b;
    private final Lock c;
    private FileChannel d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (t36.f) {
                try {
                    Map map = t36.f;
                    Object obj = map.get(str);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        map.put(str, obj);
                    }
                    lock = (Lock) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        private a() {
        }
    }

    public t36(String str, File file, boolean z) {
        File file2;
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a = z;
        if (file != null) {
            file2 = new File(file, str + ".lck");
        } else {
            file2 = null;
        }
        this.b = file2;
        this.c = e.b(str);
    }

    public static /* synthetic */ void c(t36 t36Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = t36Var.a;
        }
        t36Var.b(z);
    }

    public final void b(boolean z) {
        this.c.lock();
        if (z) {
            try {
                File file = this.b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.b).getChannel();
                channel.lock();
                this.d = channel;
            } catch (IOException e2) {
                this.d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e2);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.c.unlock();
    }
}
