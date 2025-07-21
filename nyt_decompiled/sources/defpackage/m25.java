package defpackage;

import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.f;
import androidx.navigation.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class m25 extends l25 {
    private final k h;
    private int i;
    private String j;
    private final List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m25(k kVar, String str, String str2) {
        super(kVar.d(f.class), str2);
        zq3.h(kVar, "provider");
        zq3.h(str, "startDestination");
        this.k = new ArrayList();
        this.h = kVar;
        this.j = str;
    }

    public final void c(NavDestination navDestination) {
        zq3.h(navDestination, "destination");
        this.k.add(navDestination);
    }

    public NavGraph d() {
        NavGraph navGraph = (NavGraph) super.a();
        navGraph.I(this.k);
        int i = this.i;
        if (i == 0 && this.j == null) {
            if (b() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.j;
        if (str != null) {
            zq3.e(str);
            navGraph.U(str);
        } else {
            navGraph.T(i);
        }
        return navGraph;
    }

    public final k e() {
        return this.h;
    }
}
