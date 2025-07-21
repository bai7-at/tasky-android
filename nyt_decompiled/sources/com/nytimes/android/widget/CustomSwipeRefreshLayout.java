package com.nytimes.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.nytimes.android.logging.NYTLogger;

@Deprecated
/* loaded from: classes4.dex */
public class CustomSwipeRefreshLayout extends SwipeRefreshLayout {
    private boolean measured;
    private boolean preMeasureRefreshingState;
    private float prevX;
    private SwipeDelegate swipeDelegate;
    private final int touchSlop;

    public interface SwipeDelegate {
        boolean canScrollUp();
    }

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public boolean canChildScrollUp() {
        SwipeDelegate swipeDelegate = this.swipeDelegate;
        return swipeDelegate == null ? super.canChildScrollUp() : swipeDelegate.canScrollUp();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.prevX = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.prevX) > this.touchSlop) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.measured) {
            return;
        }
        this.measured = true;
        setRefreshing(this.preMeasureRefreshingState);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            NYTLogger.i(e, "Touch event occurring when Activity onDestroy() is being called", new Object[0]);
            return false;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public void setRefreshing(boolean z) {
        if (this.measured) {
            super.setRefreshing(z);
        } else {
            this.preMeasureRefreshingState = z;
        }
    }

    public void setSwipeDelegate(SwipeDelegate swipeDelegate) {
        this.swipeDelegate = swipeDelegate;
    }
}
