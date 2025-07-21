package com.nytimes.android.utils.composeutils;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.fragment.app.Fragment;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ComposeViewWithFragment extends c {
    public Fragment fragment;
    private final sy4 k;
    private boolean l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposeViewWithFragment(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void b(Composer composer, final int i) {
        Composer h = composer.h(1147012414);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1147012414, i, -1, "com.nytimes.android.utils.composeutils.ComposeViewWithFragment.Content (ComposeViewWithFragment.kt:30)");
        }
        gt2 gt2Var = (gt2) this.k.getValue();
        if (gt2Var != null) {
            gt2Var.invoke(h, 0);
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.utils.composeutils.ComposeViewWithFragment$Content$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposeViewWithFragment.this.b(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public final Fragment getFragment() {
        Fragment fragment = this.fragment;
        if (fragment != null) {
            return fragment;
        }
        zq3.z("fragment");
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.l;
    }

    public final void setContent(gt2 gt2Var) {
        zq3.h(gt2Var, "content");
        this.l = true;
        this.k.setValue(gt2Var);
        if (isAttachedToWindow()) {
            e();
        }
    }

    public final void setFragment(Fragment fragment) {
        zq3.h(fragment, "<set-?>");
        this.fragment = fragment;
    }

    public /* synthetic */ ComposeViewWithFragment(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewWithFragment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        this.k = b0.e(null, null, 2, null);
    }
}
