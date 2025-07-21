package com.nytimes.android.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class SectionFrontRecyclerView extends RecyclerView {
    private final List<RecyclerView.n> itemDecorations;
    private final Rect reusableInsetRect;
    private final Rect reusableTempInsetRect;

    public SectionFrontRecyclerView(Context context) {
        this(context, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void addItemDecoration(RecyclerView.n nVar, int i) {
        super.addItemDecoration(nVar, i);
        if (i < 0) {
            this.itemDecorations.add(nVar);
        } else {
            this.itemDecorations.add(i, nVar);
        }
    }

    public void clearItemDecorations() {
        Iterator<RecyclerView.n> it2 = this.itemDecorations.iterator();
        while (it2.hasNext()) {
            super.removeItemDecoration(it2.next());
        }
        this.itemDecorations.clear();
    }

    public Rect getItemDecorInsetsForChild(View view, RecyclerView.z zVar) {
        this.reusableInsetRect.set(0, 0, 0, 0);
        int size = this.itemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.reusableTempInsetRect.set(0, 0, 0, 0);
            this.itemDecorations.get(i).e(this.reusableTempInsetRect, view, this, zVar);
            Rect rect = this.reusableInsetRect;
            int i2 = rect.left;
            Rect rect2 = this.reusableTempInsetRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        return this.reusableInsetRect;
    }

    public SectionFrontRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionFrontRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.reusableInsetRect = new Rect();
        this.reusableTempInsetRect = new Rect();
        this.itemDecorations = new ArrayList();
    }
}
