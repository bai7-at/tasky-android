package defpackage;

import androidx.compose.material.ripple.AndroidRippleIndicationInstance;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class i27 {
    private final Map a = new LinkedHashMap();
    private final Map b = new LinkedHashMap();

    public final k27 a(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        return (k27) this.a.get(androidRippleIndicationInstance);
    }

    public final AndroidRippleIndicationInstance b(k27 k27Var) {
        return (AndroidRippleIndicationInstance) this.b.get(k27Var);
    }

    public final void c(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        k27 k27Var = (k27) this.a.get(androidRippleIndicationInstance);
        if (k27Var != null) {
        }
        this.a.remove(androidRippleIndicationInstance);
    }

    public final void d(AndroidRippleIndicationInstance androidRippleIndicationInstance, k27 k27Var) {
        this.a.put(androidRippleIndicationInstance, k27Var);
        this.b.put(k27Var, androidRippleIndicationInstance);
    }
}
