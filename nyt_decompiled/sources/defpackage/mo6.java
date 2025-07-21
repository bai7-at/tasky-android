package defpackage;

import com.nytimes.abtests.XPNTestVariants;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.models.AbraTest;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.Severity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public final class mo6 {
    private final AbraManager a;

    public mo6(AbraManager abraManager) {
        zq3.h(abraManager, "abraManager");
        this.a = abraManager;
    }

    private final String b(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add((String) ((Pair) it2.next()).c());
        }
        return i.u0(arrayList, ", ", null, null, 0, null, null, 62, null);
    }

    private final Map c(zx8 zx8Var) {
        Pair a = du8.a("main tabs enabled:", "updated: " + zx8Var.c() + ", old tabs: " + b(zx8Var.b()) + ", new tabs: " + b(zx8Var.a()));
        AbraTest test = this.a.getTest(XPNTestVariants.Companion.a().getTestName());
        return t.m(a, du8.a("xpn experiment:", " " + (test != null ? test.getVariant() : null)));
    }

    public final void a(String str, Severity severity, zx8 zx8Var) {
        zq3.h(str, "message");
        zq3.h(severity, "severity");
        zq3.h(zx8Var, "updatedTabs");
        Embrace.getInstance().logMessage(str, severity, c(zx8Var));
    }

    public final void d(String str, zx8 zx8Var, qs2 qs2Var) {
        zq3.h(str, "message");
        zq3.h(zx8Var, "updatedTabs");
        zq3.h(qs2Var, "action");
        try {
            qs2Var.mo865invoke();
            a(str, Severity.INFO, zx8Var);
        } catch (Exception e) {
            a(str + ": " + e.getMessage(), Severity.ERROR, zx8Var);
        }
    }
}
