package defpackage;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class g26 {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void c(a aVar, String str, Throwable th, int i, Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            aVar.b(str, th);
        }

        public final void a(String str, Throwable th) {
            Log.e("PreviewLogger", str, th);
        }

        public final void b(String str, Throwable th) {
            Log.w("PreviewLogger", str, th);
        }

        private a() {
        }
    }
}
