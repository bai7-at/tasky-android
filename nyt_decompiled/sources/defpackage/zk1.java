package defpackage;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class zk1 {

    public interface a {
        c c();
    }

    public interface b {
        c c();
    }

    public static final class c {
        private final Set a;
        private final ma9 b;

        c(Set set, ma9 ma9Var) {
            this.a = set;
            this.b = ma9Var;
        }

        private t.b c(t.b bVar) {
            return new g83(this.a, (t.b) f16.b(bVar), this.b);
        }

        t.b a(ComponentActivity componentActivity, t.b bVar) {
            return c(bVar);
        }

        t.b b(Fragment fragment, t.b bVar) {
            return c(bVar);
        }
    }

    public static t.b a(ComponentActivity componentActivity, t.b bVar) {
        return ((a) a22.a(componentActivity, a.class)).c().a(componentActivity, bVar);
    }

    public static t.b b(Fragment fragment, t.b bVar) {
        return ((b) a22.a(fragment, b.class)).c().b(fragment, bVar);
    }
}
