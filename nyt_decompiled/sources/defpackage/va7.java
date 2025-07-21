package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class va7 {
    public static va7 a(ViewGroup viewGroup) {
        lh4.a(viewGroup.getTag(tf6.transition_current_scene));
        return null;
    }

    static void b(ViewGroup viewGroup, va7 va7Var) {
        viewGroup.setTag(tf6.transition_current_scene, va7Var);
    }
}
