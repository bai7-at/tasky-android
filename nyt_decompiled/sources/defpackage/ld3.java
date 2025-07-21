package defpackage;

import android.content.res.Resources;
import com.nytimes.android.hybrid.HybridScriptInflater;

/* loaded from: classes4.dex */
public final class ld3 {
    private final Resources a;
    private final HybridScriptInflater b;

    public ld3(Resources resources, HybridScriptInflater hybridScriptInflater) {
        zq3.h(resources, "resources");
        zq3.h(hybridScriptInflater, "hybridScriptInflater");
        this.a = resources;
        this.b = hybridScriptInflater;
    }

    public final Object a(by0 by0Var) {
        return this.b.c(this.a, fj6.hybrid_interface, new String[]{"AndroidNativeInterface"}, by0Var);
    }

    public final Object b(by0 by0Var) {
        return this.b.c(this.a, fj6.hybrid_listener_resize_and_hashchange, new String[]{"AndroidNativeInterface"}, by0Var);
    }

    public final Object c(String str, by0 by0Var) {
        return this.b.c(this.a, fj6.hybrid_set_config, new String[]{str}, by0Var);
    }
}
