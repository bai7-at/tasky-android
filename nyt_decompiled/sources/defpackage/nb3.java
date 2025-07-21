package defpackage;

import android.content.res.Resources;
import com.nytimes.android.hybrid.HybridScriptInflater;

/* loaded from: classes2.dex */
public final class nb3 {
    private final Resources a;
    private final HybridScriptInflater b;

    public nb3(Resources resources, HybridScriptInflater hybridScriptInflater) {
        zq3.h(resources, "resources");
        zq3.h(hybridScriptInflater, "hybridScriptInflater");
        this.a = resources;
        this.b = hybridScriptInflater;
    }

    public final Object a(String str, by0 by0Var) {
        return this.b.c(this.a, jj6.hybrid_update_ad_targeting, new String[]{str}, by0Var);
    }

    public final Object b(String str, by0 by0Var) {
        return this.b.c(this.a, jj6.hybrid_update_pageview_id, new String[]{str}, by0Var);
    }
}
