package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import defpackage.at0;
import defpackage.fw8;
import defpackage.gt2;
import defpackage.i17;
import defpackage.kg6;
import defpackage.ws0;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class y {
    private static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static final i17 a(LayoutNode layoutNode, androidx.compose.runtime.c cVar) {
        return at0.b(new fw8(layoutNode), cVar);
    }

    private static final ws0 b(AndroidComposeView androidComposeView, androidx.compose.runtime.c cVar, gt2 gt2Var) {
        if (InspectableValueKt.c() && androidComposeView.getTag(kg6.inspection_slot_table_set) == null) {
            androidComposeView.setTag(kg6.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
        }
        ws0 a2 = at0.a(new fw8(androidComposeView.getRoot()), cVar);
        Object tag = androidComposeView.getView().getTag(kg6.wrapped_composition_tag);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, a2);
            androidComposeView.getView().setTag(kg6.wrapped_composition_tag, wrappedComposition);
        }
        wrappedComposition.d(gt2Var);
        return wrappedComposition;
    }

    public static final ws0 c(AbstractComposeView abstractComposeView, androidx.compose.runtime.c cVar, gt2 gt2Var) {
        GlobalSnapshotManager.a.b();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), cVar.g());
            abstractComposeView.addView(androidComposeView.getView(), a);
        }
        return b(androidComposeView, cVar, gt2Var);
    }
}
