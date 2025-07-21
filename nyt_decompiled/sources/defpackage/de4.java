package defpackage;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import defpackage.s25;
import kotlin.text.h;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public interface de4 {

    public static final class a {
        public static String a(de4 de4Var, Uri uri) {
            zq3.h(uri, "$receiver");
            String uri2 = uri.toString();
            zq3.g(uri2, "toString(...)");
            for (int V = h.V(uri2); -1 < V; V--) {
                if (uri2.charAt(V) != '/') {
                    String substring = uri2.substring(0, V + 1);
                    zq3.g(substring, "substring(...)");
                    return substring;
                }
            }
            return "";
        }

        public static Flow b(de4 de4Var) {
            return FlowKt.flowOf(s25.b.a);
        }

        public static Object c(de4 de4Var, by0 by0Var) {
            return ww8.a;
        }
    }

    void a(fe4 fe4Var, Composer composer, int i);

    Flow b();

    String c();

    Object d(by0 by0Var);

    boolean e(Uri uri);

    hf8 f();

    boolean isEnabled();
}
