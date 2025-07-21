package androidx.core.view;

import android.view.ViewParent;
import defpackage.ss2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
/* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements ss2 {
    public static final ViewKt$ancestors$1 a = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // defpackage.ss2
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
