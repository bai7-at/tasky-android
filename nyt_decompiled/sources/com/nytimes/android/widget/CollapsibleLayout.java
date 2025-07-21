package com.nytimes.android.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.nytimes.android.widget.CollapsibleLayout;

/* loaded from: classes4.dex */
public class CollapsibleLayout extends LinearLayout {
    private int internalVisbility;
    private final ViewTreeObserver.OnGlobalLayoutListener layoutListener;

    public CollapsibleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.internalVisbility = i;
        super.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"WrongConstant"})
    /* renamed from: trimCollapsableChildren, reason: merged with bridge method [inline-methods] */
    public void lambda$new$0() {
        int childCount = getChildCount();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            if (childAt instanceof CollapsibleView) {
                if (!z2 || i == childCount - 1) {
                    childAt.setVisibility(8);
                } else {
                    childAt.setVisibility(0);
                }
                z2 = false;
            } else if (childAt.getVisibility() != 8) {
                z = true;
                z2 = true;
            }
            i++;
        }
        super.setVisibility(z ? this.internalVisbility : 8);
    }

    public void unregisterViewTreeObserver() {
        if (getViewTreeObserver() != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.layoutListener);
        }
    }

    public CollapsibleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: gn0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CollapsibleLayout.this.lambda$new$0();
            }
        };
        this.layoutListener = onGlobalLayoutListener;
        this.internalVisbility = getVisibility();
        getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}
