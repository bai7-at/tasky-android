package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.d0;

/* loaded from: classes.dex */
public class bl extends SeekBar {
    private final cl a;

    public bl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nc6.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.g(canvas);
    }

    public bl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d0.a(this, getContext());
        cl clVar = new cl(this);
        this.a = clVar;
        clVar.c(attributeSet, i);
    }
}
