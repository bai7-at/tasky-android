package defpackage;

import androidx.fragment.app.Fragment;
import com.nytimes.android.saved.a;
import com.nytimes.android.utils.SaveOrigin;

/* loaded from: classes2.dex */
public final class x87 implements a {
    private final zc a;
    private final w87 b;

    public x87(zc zcVar, w87 w87Var) {
        zq3.h(zcVar, "analyticsEventReporter");
        zq3.h(w87Var, "et2Reporter");
        this.a = zcVar;
        this.b = w87Var;
    }

    @Override // com.nytimes.android.saved.a
    public void a(SaveOrigin saveOrigin, boolean z, s87 s87Var, jk jkVar, Fragment fragment, String str) {
        zq3.h(saveOrigin, "saveOrigin");
        zq3.h(s87Var, "saveable");
        zq3.h(jkVar, "activity");
        this.a.b(saveOrigin.getValue(), z, null);
        w87 w87Var = this.b;
        if (str == null) {
            str = saveOrigin.getValue();
        }
        w87Var.a(s87Var, z, str);
    }

    @Override // com.nytimes.android.saved.a
    public String b() {
        String a = this.a.a();
        zq3.g(a, "getLastActiveSectionName(...)");
        return a;
    }
}
