package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.f;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.a;
import defpackage.aa7;
import defpackage.af5;
import defpackage.ag5;
import defpackage.df5;
import defpackage.fe5;
import defpackage.gq2;
import defpackage.hq7;
import defpackage.j4;
import defpackage.l5;
import defpackage.lq4;
import defpackage.lv0;
import defpackage.ne5;
import defpackage.pe5;
import defpackage.sa9;
import defpackage.xp4;
import defpackage.y64;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class f extends ComponentActivity implements j4.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.h mFragmentLifecycleRegistry;
    final h mFragments;
    boolean mResumed;
    boolean mStopped;

    class a extends j implements ne5, ag5, af5, df5, sa9, fe5, l5, aa7, gq2, xp4 {
        public a() {
            super(f.this);
        }

        @Override // defpackage.gq2
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            f.this.onAttachFragment(fragment);
        }

        @Override // defpackage.xp4
        public void addMenuProvider(lq4 lq4Var) {
            f.this.addMenuProvider(lq4Var);
        }

        @Override // defpackage.ne5
        public void addOnConfigurationChangedListener(lv0 lv0Var) {
            f.this.addOnConfigurationChangedListener(lv0Var);
        }

        @Override // defpackage.af5
        public void addOnMultiWindowModeChangedListener(lv0 lv0Var) {
            f.this.addOnMultiWindowModeChangedListener(lv0Var);
        }

        @Override // defpackage.df5
        public void addOnPictureInPictureModeChangedListener(lv0 lv0Var) {
            f.this.addOnPictureInPictureModeChangedListener(lv0Var);
        }

        @Override // defpackage.ag5
        public void addOnTrimMemoryListener(lv0 lv0Var) {
            f.this.addOnTrimMemoryListener(lv0Var);
        }

        @Override // defpackage.yp2
        public View c(int i) {
            return f.this.findViewById(i);
        }

        @Override // defpackage.yp2
        public boolean d() {
            Window window = f.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // defpackage.l5
        public ActivityResultRegistry getActivityResultRegistry() {
            return f.this.getActivityResultRegistry();
        }

        @Override // defpackage.d44
        public Lifecycle getLifecycle() {
            return f.this.mFragmentLifecycleRegistry;
        }

        @Override // defpackage.fe5
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return f.this.getOnBackPressedDispatcher();
        }

        @Override // defpackage.aa7
        public androidx.savedstate.a getSavedStateRegistry() {
            return f.this.getSavedStateRegistry();
        }

        @Override // defpackage.sa9
        public androidx.lifecycle.u getViewModelStore() {
            return f.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.j
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            f.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.j
        public LayoutInflater j() {
            return f.this.getLayoutInflater().cloneInContext(f.this);
        }

        @Override // androidx.fragment.app.j
        public boolean l(String str) {
            return j4.v(f.this, str);
        }

        @Override // androidx.fragment.app.j
        public void o() {
            p();
        }

        public void p() {
            f.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.j
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public f i() {
            return f.this;
        }

        @Override // defpackage.xp4
        public void removeMenuProvider(lq4 lq4Var) {
            f.this.removeMenuProvider(lq4Var);
        }

        @Override // defpackage.ne5
        public void removeOnConfigurationChangedListener(lv0 lv0Var) {
            f.this.removeOnConfigurationChangedListener(lv0Var);
        }

        @Override // defpackage.af5
        public void removeOnMultiWindowModeChangedListener(lv0 lv0Var) {
            f.this.removeOnMultiWindowModeChangedListener(lv0Var);
        }

        @Override // defpackage.df5
        public void removeOnPictureInPictureModeChangedListener(lv0 lv0Var) {
            f.this.removeOnPictureInPictureModeChangedListener(lv0Var);
        }

        @Override // defpackage.ag5
        public void removeOnTrimMemoryListener(lv0 lv0Var) {
            f.this.removeOnTrimMemoryListener(lv0Var);
        }
    }

    public f() {
        this.mFragments = h.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.h(this);
        this.mStopped = true;
        C();
    }

    private void C() {
        getSavedStateRegistry().h(LIFECYCLE_TAG, new a.c() { // from class: sp2
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle D;
                D = f.this.D();
                return D;
            }
        });
        addOnConfigurationChangedListener(new lv0() { // from class: tp2
            @Override // defpackage.lv0
            public final void accept(Object obj) {
                f.this.E((Configuration) obj);
            }
        });
        addOnNewIntentListener(new lv0() { // from class: up2
            @Override // defpackage.lv0
            public final void accept(Object obj) {
                f.this.F((Intent) obj);
            }
        });
        addOnContextAvailableListener(new pe5() { // from class: vp2
            @Override // defpackage.pe5
            public final void onContextAvailable(Context context) {
                f.this.G(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle D() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.i(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(Configuration configuration) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(Intent intent) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Context context) {
        this.mFragments.a(null);
    }

    private static boolean H(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.x0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= H(fragment.getChildFragmentManager(), state);
                }
                v vVar = fragment.mViewLifecycleOwner;
                if (vVar != null && vVar.getLifecycle().b().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.f(state);
                    z = true;
                }
                if (fragment.mLifecycleRegistry.b().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.n(state);
                    z = true;
                }
            }
        }
        return z;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                y64.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().X(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public y64 getSupportLoaderManager() {
        return y64.b(this);
    }

    void markFragmentsCreated() {
        while (H(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.i(Lifecycle.Event.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.i(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.i(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.i(Lifecycle.Event.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.i(Lifecycle.Event.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.i(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(hq7 hq7Var) {
        j4.t(this, hq7Var);
    }

    public void setExitSharedElementCallback(hq7 hq7Var) {
        j4.u(this, hq7Var);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            j4.x(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        j4.p(this);
    }

    public void supportPostponeEnterTransition() {
        j4.q(this);
    }

    public void supportStartPostponedEnterTransition() {
        j4.y(this);
    }

    @Override // j4.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            j4.w(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public f(int i) {
        super(i);
        this.mFragments = h.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.h(this);
        this.mStopped = true;
        C();
    }
}
