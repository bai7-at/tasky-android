package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.widget.d0;

/* loaded from: classes.dex */
public class zk extends RatingBar {
    private final yk a;

    public zk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nc6.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.a.b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public zk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d0.a(this, getContext());
        yk ykVar = new yk(this);
        this.a = ykVar;
        ykVar.c(attributeSet, i);
    }
}
