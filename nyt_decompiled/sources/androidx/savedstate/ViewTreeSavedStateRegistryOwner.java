package androidx.savedstate;

import android.view.View;
import defpackage.aa7;
import defpackage.sf6;
import defpackage.ss2;
import defpackage.zq3;
import kotlin.sequences.d;

/* loaded from: classes.dex */
public abstract class ViewTreeSavedStateRegistryOwner {
    public static final aa7 a(View view) {
        zq3.h(view, "<this>");
        return (aa7) d.m(d.s(d.f(view, new ss2() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final View invoke(View view2) {
                zq3.h(view2, "view");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new ss2() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final aa7 invoke(View view2) {
                zq3.h(view2, "view");
                Object tag = view2.getTag(sf6.view_tree_saved_state_registry_owner);
                if (tag instanceof aa7) {
                    return (aa7) tag;
                }
                return null;
            }
        }));
    }

    public static final void b(View view, aa7 aa7Var) {
        zq3.h(view, "<this>");
        view.setTag(sf6.view_tree_saved_state_registry_owner, aa7Var);
    }
}
