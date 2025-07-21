package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import defpackage.f4;

/* loaded from: classes.dex */
public abstract class x3 {
    public static final int DISPLAY_HOME_AS_UP = 4;
    public static final int DISPLAY_SHOW_CUSTOM = 16;
    public static final int DISPLAY_SHOW_HOME = 2;
    public static final int DISPLAY_SHOW_TITLE = 8;
    public static final int DISPLAY_USE_LOGO = 1;

    @Deprecated
    public static final int NAVIGATION_MODE_LIST = 1;

    @Deprecated
    public static final int NAVIGATION_MODE_STANDARD = 0;

    @Deprecated
    public static final int NAVIGATION_MODE_TABS = 2;

    public interface b {
    }

    public interface c {
    }

    public static abstract class d {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract CharSequence e();

        public abstract void f();
    }

    public interface e {
    }

    public abstract void addOnMenuVisibilityListener(b bVar);

    public abstract void addTab(d dVar);

    public abstract void addTab(d dVar, int i);

    public abstract void addTab(d dVar, int i, boolean z);

    public abstract void addTab(d dVar, boolean z);

    public boolean closeOptionsMenu() {
        return false;
    }

    public abstract boolean collapseActionView();

    public abstract void dispatchMenuVisibilityChanged(boolean z);

    public abstract View getCustomView();

    public abstract int getDisplayOptions();

    public abstract float getElevation();

    public abstract int getHeight();

    public int getHideOffset() {
        return 0;
    }

    public abstract int getNavigationItemCount();

    public abstract int getNavigationMode();

    public abstract int getSelectedNavigationIndex();

    public abstract d getSelectedTab();

    public abstract CharSequence getSubtitle();

    public abstract d getTabAt(int i);

    public abstract int getTabCount();

    public abstract Context getThemedContext();

    public abstract CharSequence getTitle();

    public abstract void hide();

    public boolean invalidateOptionsMenu() {
        return false;
    }

    public boolean isHideOnContentScrollEnabled() {
        return false;
    }

    public abstract boolean isShowing();

    public boolean isTitleTruncated() {
        return false;
    }

    public abstract d newTab();

    public void onConfigurationChanged(Configuration configuration) {
    }

    void onDestroy() {
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    public boolean openOptionsMenu() {
        return false;
    }

    public abstract void removeAllTabs();

    public abstract void removeOnMenuVisibilityListener(b bVar);

    public abstract void removeTab(d dVar);

    public abstract void removeTabAt(int i);

    boolean requestFocus() {
        return false;
    }

    public abstract void selectTab(d dVar);

    public abstract void setBackgroundDrawable(Drawable drawable);

    public abstract void setCustomView(int i);

    public abstract void setCustomView(View view);

    public abstract void setCustomView(View view, a aVar);

    public abstract void setDefaultDisplayHomeAsUpEnabled(boolean z);

    public abstract void setDisplayHomeAsUpEnabled(boolean z);

    public abstract void setDisplayOptions(int i);

    public abstract void setDisplayOptions(int i, int i2);

    public abstract void setDisplayShowCustomEnabled(boolean z);

    public abstract void setDisplayShowHomeEnabled(boolean z);

    public abstract void setDisplayShowTitleEnabled(boolean z);

    public abstract void setDisplayUseLogoEnabled(boolean z);

    public abstract void setElevation(float f);

    public void setHideOffset(int i) {
        if (i != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    public abstract void setHomeActionContentDescription(int i);

    public abstract void setHomeActionContentDescription(CharSequence charSequence);

    public abstract void setHomeAsUpIndicator(int i);

    public abstract void setHomeAsUpIndicator(Drawable drawable);

    public abstract void setHomeButtonEnabled(boolean z);

    public abstract void setIcon(int i);

    public abstract void setIcon(Drawable drawable);

    public abstract void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, c cVar);

    public abstract void setLogo(int i);

    public abstract void setLogo(Drawable drawable);

    public abstract void setNavigationMode(int i);

    public abstract void setSelectedNavigationItem(int i);

    public abstract void setShowHideAnimationEnabled(boolean z);

    public abstract void setSplitBackgroundDrawable(Drawable drawable);

    public abstract void setStackedBackgroundDrawable(Drawable drawable);

    public abstract void setSubtitle(int i);

    public abstract void setSubtitle(CharSequence charSequence);

    public abstract void setTitle(int i);

    public abstract void setTitle(CharSequence charSequence);

    public abstract void setWindowTitle(CharSequence charSequence);

    public abstract void show();

    public f4 startActionMode(f4.a aVar) {
        return null;
    }

    public static class a extends ViewGroup.MarginLayoutParams {
        public int a;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fo6.ActionBarLayout);
            this.a = obtainStyledAttributes.getInt(fo6.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(i, i2);
            this.a = 8388627;
        }

        public a(int i, int i2, int i3) {
            super(i, i2);
            this.a = i3;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.a = 0;
            this.a = aVar.a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}
