package it.sephiroth.android.library.imagezoom;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
public class ImageViewTouch extends ImageViewTouchBase {
    private float Q;
    protected ScaleGestureDetector S;
    protected GestureDetector e0;
    protected int f0;
    protected int g0;
    protected GestureDetector.OnGestureListener h0;
    protected ScaleGestureDetector.OnScaleGestureListener i0;
    protected boolean j0;
    protected boolean k0;
    protected boolean l0;
    private c m0;
    long n0;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (ImageViewTouchBase.N) {
                Log.i("ImageViewTouchBase", "onDoubleTap. double tap enabled? " + ImageViewTouch.this.j0);
            }
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            if (imageViewTouch.j0) {
                if (imageViewTouch.S.isQuickScaleEnabled()) {
                    return true;
                }
                ImageViewTouch imageViewTouch2 = ImageViewTouch.this;
                imageViewTouch2.e = true;
                float scale = imageViewTouch2.getScale();
                ImageViewTouch imageViewTouch3 = ImageViewTouch.this;
                ImageViewTouch.this.I(Math.min(ImageViewTouch.this.getMaxScale(), Math.max(imageViewTouch3.N(scale, imageViewTouch3.getMaxScale(), ImageViewTouch.this.getMinScale()), ImageViewTouch.this.getMinScale())), motionEvent.getX(), motionEvent.getY(), ImageViewTouch.this.r);
            }
            ImageViewTouch.L(ImageViewTouch.this);
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            if (ImageViewTouchBase.N) {
                Log.i("ImageViewTouchBase", "onDown");
            }
            ImageViewTouch.this.D();
            return ImageViewTouch.this.O(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!ImageViewTouch.this.l0 || motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || ImageViewTouch.this.S.isInProgress()) {
                return false;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            if (uptimeMillis - imageViewTouch.n0 > 150) {
                return imageViewTouch.P(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (!ImageViewTouch.this.isLongClickable() || ImageViewTouch.this.S.isInProgress()) {
                return;
            }
            ImageViewTouch.this.setPressed(true);
            ImageViewTouch.this.performLongClick();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (ImageViewTouch.this.l0 && motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !ImageViewTouch.this.S.isInProgress()) {
                return ImageViewTouch.this.Q(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ImageViewTouch.this.m0 != null) {
                ImageViewTouch.this.m0.a();
            }
            return ImageViewTouch.this.R(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return ImageViewTouch.this.S(motionEvent);
        }
    }

    public interface b {
    }

    public interface c {
        void a();
    }

    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        protected boolean a = false;

        public d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            float scale = ImageViewTouch.this.getScale() * scaleGestureDetector.getScaleFactor();
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            if (imageViewTouch.k0) {
                boolean z = this.a;
                if (z && currentSpan != 0.0f) {
                    imageViewTouch.e = true;
                    ImageViewTouch.this.H(Math.min(imageViewTouch.getMaxScale(), Math.max(scale, ImageViewTouch.this.getMinScale() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    ImageViewTouch imageViewTouch2 = ImageViewTouch.this;
                    imageViewTouch2.g0 = 1;
                    imageViewTouch2.invalidate();
                    return true;
                }
                if (!z) {
                    this.a = true;
                }
            }
            return true;
        }
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j0 = true;
        this.k0 = true;
        this.l0 = true;
    }

    static /* synthetic */ b L(ImageViewTouch imageViewTouch) {
        imageViewTouch.getClass();
        return null;
    }

    public boolean M() {
        if (getScale() > 1.0f) {
            return true;
        }
        return !this.H.contains(getBitmapRect());
    }

    protected float N(float f, float f2, float f3) {
        float f4 = this.Q;
        return f + f4 <= f2 ? f + f4 : f3;
    }

    public boolean O(MotionEvent motionEvent) {
        return !getBitmapChanged();
    }

    public boolean P(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!M()) {
            return false;
        }
        if (ImageViewTouchBase.N) {
            Log.i("ImageViewTouchBase", "onFling");
        }
        if (Math.abs(f) <= this.s * 4 && Math.abs(f2) <= this.s * 4) {
            return false;
        }
        if (ImageViewTouchBase.N) {
            Log.v("ImageViewTouchBase", "velocity: " + f2);
            Log.v("ImageViewTouchBase", "diff: " + (motionEvent2.getY() - motionEvent.getY()));
        }
        float min = Math.min(Math.max(2.0f, getScale() / 2.0f), 3.0f);
        float width = (f / this.t) * getWidth() * min;
        float height = (f2 / this.t) * getHeight() * min;
        if (ImageViewTouchBase.N) {
            Log.v("ImageViewTouchBase", "scale: " + getScale() + ", scale_final: " + min);
            StringBuilder sb = new StringBuilder();
            sb.append("scaledDistanceX: ");
            sb.append(width);
            Log.v("ImageViewTouchBase", sb.toString());
            Log.v("ImageViewTouchBase", "scaledDistanceY: " + height);
        }
        this.e = true;
        z(width, height, (long) Math.min(Math.max(300.0d, Math.sqrt(Math.pow(width, 2.0d) + Math.pow(height, 2.0d)) / 5.0d), 800.0d));
        postInvalidate();
        return true;
    }

    public boolean Q(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!M()) {
            return false;
        }
        this.e = true;
        y(-f, -f2);
        invalidate();
        return true;
    }

    public boolean R(MotionEvent motionEvent) {
        return true;
    }

    public boolean S(MotionEvent motionEvent) {
        return !getBitmapChanged();
    }

    public boolean T(MotionEvent motionEvent) {
        if (getBitmapChanged()) {
            return false;
        }
        if (getScale() >= getMinScale()) {
            return true;
        }
        J(getMinScale(), 50L);
        return true;
    }

    public boolean getDoubleTapEnabled() {
        return this.j0;
    }

    protected GestureDetector.OnGestureListener getGestureListener() {
        return new a();
    }

    @TargetApi(19)
    public boolean getQuickScaleEnabled() {
        return this.S.isQuickScaleEnabled();
    }

    public float getScaleFactor() {
        return this.Q;
    }

    protected ScaleGestureDetector.OnScaleGestureListener getScaleListener() {
        return new d();
    }

    @Override // it.sephiroth.android.library.imagezoom.ImageViewTouchBase
    protected void o(Context context, AttributeSet attributeSet, int i) {
        super.o(context, attributeSet, i);
        this.f0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.h0 = getGestureListener();
        this.i0 = getScaleListener();
        this.S = new ScaleGestureDetector(getContext(), this.i0);
        this.e0 = new GestureDetector(getContext(), this.h0, null, true);
        this.g0 = 1;
        setQuickScaleEnabled(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBitmapChanged()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6) {
            this.n0 = motionEvent.getEventTime();
        }
        this.S.onTouchEvent(motionEvent);
        if (!this.S.isInProgress()) {
            this.e0.onTouchEvent(motionEvent);
        }
        if (actionMasked != 1) {
            return true;
        }
        return T(motionEvent);
    }

    @Override // it.sephiroth.android.library.imagezoom.ImageViewTouchBase
    protected void r(int i, int i2, int i3, int i4) {
        super.r(i, i2, i3, i4);
        Log.v("ImageViewTouchBase", "min: " + getMinScale() + ", max: " + getMaxScale() + ", result: " + ((getMaxScale() - getMinScale()) / 2.0f));
        this.Q = ((getMaxScale() - getMinScale()) / 2.0f) + 0.5f;
    }

    public void setDoubleTapEnabled(boolean z) {
        this.j0 = z;
    }

    public void setDoubleTapListener(b bVar) {
    }

    @TargetApi(19)
    public void setQuickScaleEnabled(boolean z) {
        this.S.setQuickScaleEnabled(z);
    }

    public void setScaleEnabled(boolean z) {
        this.k0 = z;
    }

    public void setScrollEnabled(boolean z) {
        this.l0 = z;
    }

    public void setSingleTapListener(c cVar) {
        this.m0 = cVar;
    }
}
