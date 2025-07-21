package defpackage;

import android.animation.Animator;
import android.view.ViewPropertyAnimator;

/* loaded from: classes4.dex */
public abstract class fb9 {

    public static final class a implements Animator.AnimatorListener {
        final /* synthetic */ ss2 a;
        final /* synthetic */ ss2 b;
        final /* synthetic */ ss2 c;
        final /* synthetic */ ss2 d;

        a(ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, ss2 ss2Var4) {
            this.a = ss2Var;
            this.b = ss2Var2;
            this.c = ss2Var3;
            this.d = ss2Var4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            zq3.h(animator, "animation");
            ss2 ss2Var = this.c;
            if (ss2Var != null) {
                ss2Var.invoke(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            zq3.h(animator, "animation");
            ss2 ss2Var = this.b;
            if (ss2Var != null) {
                ss2Var.invoke(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            zq3.h(animator, "animation");
            ss2 ss2Var = this.a;
            if (ss2Var != null) {
                ss2Var.invoke(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            zq3.h(animator, "animation");
            ss2 ss2Var = this.d;
            if (ss2Var != null) {
                ss2Var.invoke(animator);
            }
        }
    }

    public static final ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, ss2 ss2Var4) {
        zq3.h(viewPropertyAnimator, "<this>");
        viewPropertyAnimator.setListener(new a(ss2Var4, ss2Var, ss2Var3, ss2Var2));
        return viewPropertyAnimator;
    }

    public static /* synthetic */ ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, ss2 ss2Var4, int i, Object obj) {
        if ((i & 1) != 0) {
            ss2Var = null;
        }
        if ((i & 2) != 0) {
            ss2Var2 = null;
        }
        if ((i & 4) != 0) {
            ss2Var3 = null;
        }
        if ((i & 8) != 0) {
            ss2Var4 = null;
        }
        return a(viewPropertyAnimator, ss2Var, ss2Var2, ss2Var3, ss2Var4);
    }
}
