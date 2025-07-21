package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class llc extends uta implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, qmc {
    private final WeakReference a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private jkc e;
    private wia f;

    public llc(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        dyf.z();
        ihb.a(view, this);
        dyf.z();
        ihb.b(view, this);
        this.a = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.b.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.d.putAll(this.b);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.c.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.d.putAll(this.c);
        this.f = new wia(view.getContext(), view);
    }

    @Override // defpackage.vta
    public final synchronized void J4(ee3 ee3Var) {
        try {
            if (this.e != null) {
                Object Q1 = fc5.Q1(ee3Var);
                if (!(Q1 instanceof View)) {
                    fgb.g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.e.s((View) Q1);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.qmc
    public final synchronized View K(String str) {
        WeakReference weakReference = (WeakReference) this.d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // defpackage.vta
    public final synchronized void a5(ee3 ee3Var) {
        Object Q1 = fc5.Q1(ee3Var);
        if (!(Q1 instanceof jkc)) {
            fgb.g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        jkc jkcVar = this.e;
        if (jkcVar != null) {
            jkcVar.y(this);
        }
        jkc jkcVar2 = (jkc) Q1;
        if (!jkcVar2.z()) {
            fgb.d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.e = jkcVar2;
        jkcVar2.x(this);
        this.e.p(zzf());
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
        jkc jkcVar = this.e;
        if (jkcVar != null) {
            jkcVar.j(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        jkc jkcVar = this.e;
        if (jkcVar != null) {
            jkcVar.h(zzf(), zzl(), zzm(), jkc.D(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        jkc jkcVar = this.e;
        if (jkcVar != null) {
            jkcVar.h(zzf(), zzl(), zzm(), jkc.D(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        jkc jkcVar = this.e;
        if (jkcVar != null) {
            jkcVar.q(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // defpackage.qmc
    public final synchronized void x4(String str, View view, boolean z) {
        this.d.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.b.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // defpackage.vta
    public final synchronized void zzd() {
        jkc jkcVar = this.e;
        if (jkcVar != null) {
            jkcVar.y(this);
            this.e = null;
        }
    }

    @Override // defpackage.qmc
    public final View zzf() {
        return (View) this.a.get();
    }

    @Override // defpackage.qmc
    public final FrameLayout zzh() {
        return null;
    }

    @Override // defpackage.qmc
    public final wia zzi() {
        return this.f;
    }

    @Override // defpackage.qmc
    public final synchronized ee3 zzj() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // defpackage.qmc
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // defpackage.qmc
    public final synchronized Map zzl() {
        return this.d;
    }

    @Override // defpackage.qmc
    public final synchronized Map zzm() {
        return this.b;
    }

    @Override // defpackage.qmc
    public final synchronized Map zzn() {
        return this.c;
    }

    @Override // defpackage.qmc
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // defpackage.qmc
    public final synchronized JSONObject zzp() {
        jkc jkcVar = this.e;
        if (jkcVar == null) {
            return null;
        }
        return jkcVar.U(zzf(), zzl(), zzm());
    }
}
