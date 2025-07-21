package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageButton;

/* loaded from: classes2.dex */
final class dsf extends AnimatorListenerAdapter {
    final /* synthetic */ nwf a;

    dsf(nwf nwfVar) {
        this.a = nwfVar;
    }

    private final void a(boolean z) {
        ImageButton imageButton;
        this.a.setEnabled(z);
        imageButton = this.a.a;
        imageButton.setEnabled(z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        a(false);
    }
}
