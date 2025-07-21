package defpackage;

import android.view.ViewConfiguration;
import androidx.activity.ComponentActivity;
import com.nytimes.android.side.effects.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ur7 implements a {
    private final List a;

    public ur7(ComponentActivity componentActivity, sr7... sr7VarArr) {
        zq3.h(componentActivity, "componentActivity");
        zq3.h(sr7VarArr, "callbacks");
        ArrayList arrayList = new ArrayList(sr7VarArr.length);
        for (sr7 sr7Var : sr7VarArr) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(componentActivity);
            zq3.g(viewConfiguration, "get(...)");
            arrayList.add(new rr7(sr7Var, viewConfiguration));
        }
        this.a = arrayList;
    }

    @Override // com.nytimes.android.side.effects.a
    public void a(int i, int i2) {
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((rr7) it2.next()).a(i, i2);
        }
    }
}
