package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j0;
import androidx.fragment.app.f;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.savedstate.a;
import defpackage.f4;
import defpackage.ug8;

/* loaded from: classes.dex */
public abstract class jk extends f implements kk, ug8.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private mk mDelegate;
    private Resources mResources;

    class a implements a.c {
        a() {
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            jk.this.getDelegate().E(bundle);
            return bundle;
        }
    }

    class b implements pe5 {
        b() {
        }

        @Override // defpackage.pe5
        public void onContextAvailable(Context context) {
            mk delegate = jk.this.getDelegate();
            delegate.v();
            delegate.A(jk.this.getSavedStateRegistry().b(jk.DELEGATE_TAG));
        }
    }

    public jk() {
        I();
    }

    private void I() {
        getSavedStateRegistry().h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void J() {
        ViewTreeLifecycleOwner.b(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.b(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.b(getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.b(getWindow().getDecorView(), this);
    }

    private boolean K(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        getDelegate().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().i(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        x3 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.closeOptionsMenu()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.sq0, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        x3 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.onMenuKeyEvent(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().l(i);
    }

    public mk getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = mk.j(this, this);
        }
        return this.mDelegate;
    }

    public y3 getDrawerToggleDelegate() {
        return getDelegate().p();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().s();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && j0.c()) {
            this.mResources = new j0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public x3 getSupportActionBar() {
        return getDelegate().u();
    }

    @Override // ug8.a
    public Intent getSupportParentActivityIntent() {
        return q25.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().w();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().z(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(ug8 ug8Var) {
        ug8Var.e(this);
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().B();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (K(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    protected void onLocalesChanged(m74 m74Var) {
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        x3 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.getDisplayOptions() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    protected void onNightModeChanged(int i) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().C(bundle);
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().D();
    }

    public void onPrepareSupportNavigateUpTaskStack(ug8 ug8Var) {
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().F();
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().G();
    }

    @Override // defpackage.kk
    public void onSupportActionModeFinished(f4 f4Var) {
    }

    @Override // defpackage.kk
    public void onSupportActionModeStarted(f4 f4Var) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        ug8 j = ug8.j(this);
        onCreateSupportNavigateUpTaskStack(j);
        onPrepareSupportNavigateUpTaskStack(j);
        j.q();
        try {
            j4.o(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().R(charSequence);
    }

    @Override // defpackage.kk
    public f4 onWindowStartingSupportActionMode(f4.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        x3 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.openOptionsMenu()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        J();
        getDelegate().K(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().P(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().Q(i);
    }

    public f4 startSupportActionMode(f4.a aVar) {
        return getDelegate().S(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().w();
    }

    public void supportNavigateUpTo(Intent intent) {
        q25.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().J(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return q25.f(this, intent);
    }

    public jk(int i) {
        super(i);
        I();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        J();
        getDelegate().L(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        getDelegate().M(view, layoutParams);
    }
}
