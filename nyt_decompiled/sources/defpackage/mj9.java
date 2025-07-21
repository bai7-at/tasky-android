package defpackage;

import android.content.Context;
import androidx.work.ExistingWorkPolicy;
import androidx.work.c;
import androidx.work.d;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class mj9 {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public mj9 a(Context context) {
            zq3.h(context, "context");
            pj9 p = pj9.p(context);
            zq3.g(p, "getInstance(context)");
            return p;
        }

        public void b(Context context, androidx.work.a aVar) {
            zq3.h(context, "context");
            zq3.h(aVar, "configuration");
            pj9.i(context, aVar);
        }

        public boolean c() {
            return pj9.j();
        }

        private a() {
        }
    }

    public static mj9 g(Context context) {
        return a.a(context);
    }

    public static void i(Context context, androidx.work.a aVar) {
        a.b(context, aVar);
    }

    public static boolean j() {
        return a.c();
    }

    public abstract hi5 a(String str);

    public abstract hi5 b(String str);

    public final hi5 c(d dVar) {
        zq3.h(dVar, "request");
        return d(i.e(dVar));
    }

    public abstract hi5 d(List list);

    public hi5 e(String str, ExistingWorkPolicy existingWorkPolicy, c cVar) {
        zq3.h(str, "uniqueWorkName");
        zq3.h(existingWorkPolicy, "existingWorkPolicy");
        zq3.h(cVar, "request");
        return f(str, existingWorkPolicy, i.e(cVar));
    }

    public abstract hi5 f(String str, ExistingWorkPolicy existingWorkPolicy, List list);

    public abstract j64 h(String str);
}
