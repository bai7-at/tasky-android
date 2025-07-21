package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class u15 extends FrameLayout {
    private final FrameLayout a;
    private final qta b;

    public u15(Context context) {
        super(context);
        this.a = d(context);
        this.b = e();
    }

    private final FrameLayout d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final qta e() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.a;
        return kia.a().g(frameLayout.getContext(), this, frameLayout);
    }

    private final void f(String str, View view) {
        qta qtaVar = this.b;
        if (qtaVar == null) {
            return;
        }
        try {
            qtaVar.v1(str, fc5.l3(view));
        } catch (RemoteException e) {
            fgb.e("Unable to call setAssetView on delegate", e);
        }
    }

    protected final View a(String str) {
        qta qtaVar = this.b;
        if (qtaVar != null) {
            try {
                ee3 f = qtaVar.f(str);
                if (f != null) {
                    return (View) fc5.Q1(f);
                }
            } catch (RemoteException e) {
                fgb.e("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.a);
    }

    final /* synthetic */ void b(vh4 vh4Var) {
        qta qtaVar = this.b;
        if (qtaVar == null) {
            return;
        }
        try {
            if (vh4Var == null) {
                qtaVar.v0(null);
            } else {
                fgb.b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            fgb.e("Unable to call setMediaContent on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    final /* synthetic */ void c(ImageView.ScaleType scaleType) {
        qta qtaVar = this.b;
        if (qtaVar == null || scaleType == null) {
            return;
        }
        try {
            qtaVar.G5(fc5.l3(scaleType));
        } catch (RemoteException e) {
            fgb.e("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.b != null) {
            if (((Boolean) pla.c().a(mpa.Ua)).booleanValue()) {
                try {
                    this.b.X(fc5.l3(motionEvent));
                } catch (RemoteException e) {
                    fgb.e("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public w5 getAdChoicesView() {
        a("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final zo4 getMediaView() {
        View a = a("3010");
        if (a instanceof zo4) {
            return (zo4) a;
        }
        if (a == null) {
            return null;
        }
        fgb.b("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        qta qtaVar = this.b;
        if (qtaVar == null) {
            return;
        }
        try {
            qtaVar.M1(fc5.l3(view), i);
        } catch (RemoteException e) {
            fgb.e("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(w5 w5Var) {
        f("3011", w5Var);
    }

    public final void setAdvertiserView(View view) {
        f("3005", view);
    }

    public final void setBodyView(View view) {
        f("3004", view);
    }

    public final void setCallToActionView(View view) {
        f("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        qta qtaVar = this.b;
        if (qtaVar == null) {
            return;
        }
        try {
            qtaVar.I3(fc5.l3(view));
        } catch (RemoteException e) {
            fgb.e("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        f("3001", view);
    }

    public final void setIconView(View view) {
        f("3003", view);
    }

    public final void setImageView(View view) {
        f("3008", view);
    }

    public final void setMediaView(zo4 zo4Var) {
        f("3010", zo4Var);
        if (zo4Var == null) {
            return;
        }
        zo4Var.a(new jla(this));
        zo4Var.b(new ebb(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ee3, java.lang.Object] */
    public void setNativeAd(p15 p15Var) {
        qta qtaVar = this.b;
        if (qtaVar == 0) {
            return;
        }
        try {
            qtaVar.u5(p15Var.d());
        } catch (RemoteException e) {
            fgb.e("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        f("3007", view);
    }

    public final void setStarRatingView(View view) {
        f("3009", view);
    }

    public final void setStoreView(View view) {
        f("3006", view);
    }
}
