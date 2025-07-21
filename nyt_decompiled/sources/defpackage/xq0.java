package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.h;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.savedstate.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class xq0 extends Dialog implements d44, fe5, aa7 {
    private h a;
    private final z97 b;
    private final OnBackPressedDispatcher c;

    public /* synthetic */ xq0(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    private final h b() {
        h hVar = this.a;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        this.a = hVar2;
        return hVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(xq0 xq0Var) {
        zq3.h(xq0Var, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        zq3.h(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public void c() {
        Window window = getWindow();
        zq3.e(window);
        View decorView = window.getDecorView();
        zq3.g(decorView, "window!!.decorView");
        ViewTreeLifecycleOwner.b(decorView, this);
        Window window2 = getWindow();
        zq3.e(window2);
        View decorView2 = window2.getDecorView();
        zq3.g(decorView2, "window!!.decorView");
        ViewTreeOnBackPressedDispatcherOwner.b(decorView2, this);
        Window window3 = getWindow();
        zq3.e(window3);
        View decorView3 = window3.getDecorView();
        zq3.g(decorView3, "window!!.decorView");
        ViewTreeSavedStateRegistryOwner.b(decorView3, this);
    }

    @Override // defpackage.d44
    public Lifecycle getLifecycle() {
        return b();
    }

    @Override // defpackage.fe5
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.c;
    }

    @Override // defpackage.aa7
    public a getSavedStateRegistry() {
        return this.b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.c.l();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.c;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            zq3.g(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.o(onBackInvokedDispatcher);
        }
        this.b.d(bundle);
        b().i(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        zq3.g(onSaveInstanceState, "super.onSaveInstanceState()");
        this.b.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().i(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().i(Lifecycle.Event.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq0(Context context, int i) {
        super(context, i);
        zq3.h(context, "context");
        this.b = z97.d.a(this);
        this.c = new OnBackPressedDispatcher(new Runnable() { // from class: wq0
            @Override // java.lang.Runnable
            public final void run() {
                xq0.d(xq0.this);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        zq3.h(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        zq3.h(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
