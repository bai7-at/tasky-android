package defpackage;

import android.app.Application;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.SectionFront;

/* loaded from: classes4.dex */
public class b24 extends u57 {
    public b24(Application application, jl9 jl9Var, cb2 cb2Var) {
        super(application, jl9Var, cb2Var);
    }

    @Override // defpackage.u57
    protected int i(Asset asset, SectionFront sectionFront) {
        return um6.TextView_SFSummary_Lede;
    }
}
