package defpackage;

import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class c51 extends i51 {
    private static g51 c;
    private static j51 d;
    public static final a b = new a(null);
    private static final ReentrantLock e = new ReentrantLock();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void c() {
            g51 g51Var;
            c51.e.lock();
            if (c51.d == null && (g51Var = c51.c) != null) {
                c51.d = g51Var.c(null);
            }
            c51.e.unlock();
        }

        public final j51 a() {
            c51.e.lock();
            j51 j51Var = c51.d;
            c51.d = null;
            c51.e.unlock();
            return j51Var;
        }

        public final void b(Uri uri) {
            zq3.h(uri, "url");
            c();
            c51.e.lock();
            j51 j51Var = c51.d;
            if (j51Var != null) {
                j51Var.f(uri, null, null);
            }
            c51.e.unlock();
        }

        private a() {
        }
    }
}
