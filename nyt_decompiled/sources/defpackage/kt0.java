package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class kt0 {
    private final List a = new ArrayList();

    void a(bt8 bt8Var) {
        this.a.add(bt8Var);
    }

    public void b(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            l29.b(path, (bt8) this.a.get(size));
        }
    }
}
