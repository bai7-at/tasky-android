package com.nytimes.android.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SpinnerAdapter;
import defpackage.f4;
import defpackage.x3;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes4.dex */
public class CustomActionBarWrapper extends x3 {
    private final x3 internalActionBar;
    private final CustomToolbar internalToolbar;

    public CustomActionBarWrapper(x3 x3Var, CustomToolbar customToolbar) {
        this.internalActionBar = x3Var;
        this.internalToolbar = customToolbar;
    }

    @Override // defpackage.x3
    public void addOnMenuVisibilityListener(x3.b bVar) {
        this.internalActionBar.addOnMenuVisibilityListener(bVar);
    }

    @Override // defpackage.x3
    public void addTab(x3.d dVar) {
        this.internalActionBar.addTab(dVar);
    }

    @Override // defpackage.x3
    public boolean collapseActionView() {
        return this.internalActionBar.collapseActionView();
    }

    @Override // defpackage.x3
    public void dispatchMenuVisibilityChanged(boolean z) {
        this.internalActionBar.dispatchMenuVisibilityChanged(z);
    }

    @Override // defpackage.x3
    public View getCustomView() {
        return this.internalActionBar.getCustomView();
    }

    @Override // defpackage.x3
    public int getDisplayOptions() {
        return this.internalActionBar.getDisplayOptions();
    }

    @Override // defpackage.x3
    public float getElevation() {
        return this.internalActionBar.getElevation();
    }

    @Override // defpackage.x3
    public int getHeight() {
        return this.internalActionBar.getHeight();
    }

    @Override // defpackage.x3
    public int getHideOffset() {
        return this.internalActionBar.getHideOffset();
    }

    @Override // defpackage.x3
    public int getNavigationItemCount() {
        return this.internalActionBar.getNavigationItemCount();
    }

    @Override // defpackage.x3
    public int getNavigationMode() {
        return this.internalActionBar.getNavigationMode();
    }

    @Override // defpackage.x3
    public int getSelectedNavigationIndex() {
        return this.internalActionBar.getSelectedNavigationIndex();
    }

    @Override // defpackage.x3
    public x3.d getSelectedTab() {
        return this.internalActionBar.getSelectedTab();
    }

    @Override // defpackage.x3
    public CharSequence getSubtitle() {
        return this.internalActionBar.getSubtitle();
    }

    @Override // defpackage.x3
    public x3.d getTabAt(int i) {
        return this.internalActionBar.getTabAt(i);
    }

    @Override // defpackage.x3
    public int getTabCount() {
        return this.internalActionBar.getTabCount();
    }

    @Override // defpackage.x3
    public Context getThemedContext() {
        return this.internalActionBar.getThemedContext();
    }

    @Override // defpackage.x3
    public CharSequence getTitle() {
        return this.internalActionBar.getTitle();
    }

    @Override // defpackage.x3
    public void hide() {
        this.internalActionBar.hide();
    }

    @Override // defpackage.x3
    public boolean invalidateOptionsMenu() {
        return this.internalActionBar.invalidateOptionsMenu();
    }

    @Override // defpackage.x3
    public boolean isHideOnContentScrollEnabled() {
        return this.internalActionBar.isHideOnContentScrollEnabled();
    }

    @Override // defpackage.x3
    public boolean isShowing() {
        return this.internalActionBar.isShowing();
    }

    @Override // defpackage.x3
    public boolean isTitleTruncated() {
        return this.internalActionBar.isTitleTruncated();
    }

    @Override // defpackage.x3
    public x3.d newTab() {
        return this.internalActionBar.newTab();
    }

    @Override // defpackage.x3
    public void onConfigurationChanged(Configuration configuration) {
        this.internalActionBar.onConfigurationChanged(configuration);
    }

    @Override // defpackage.x3
    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        return this.internalActionBar.onMenuKeyEvent(keyEvent);
    }

    @Override // defpackage.x3
    public boolean openOptionsMenu() {
        return this.internalActionBar.openOptionsMenu();
    }

    @Override // defpackage.x3
    public void removeAllTabs() {
        this.internalActionBar.removeAllTabs();
    }

    @Override // defpackage.x3
    public void removeOnMenuVisibilityListener(x3.b bVar) {
        this.internalActionBar.removeOnMenuVisibilityListener(bVar);
    }

    @Override // defpackage.x3
    public void removeTab(x3.d dVar) {
        this.internalActionBar.removeTab(dVar);
    }

    @Override // defpackage.x3
    public void removeTabAt(int i) {
        this.internalActionBar.removeTabAt(i);
    }

    @Override // defpackage.x3
    public void selectTab(x3.d dVar) {
        this.internalActionBar.selectTab(dVar);
    }

    @Override // defpackage.x3
    public void setBackgroundDrawable(Drawable drawable) {
        this.internalActionBar.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.x3
    public void setCustomView(View view) {
        this.internalActionBar.setCustomView(view);
    }

    @Override // defpackage.x3
    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        this.internalActionBar.setDefaultDisplayHomeAsUpEnabled(z);
    }

    @Override // defpackage.x3
    public void setDisplayHomeAsUpEnabled(boolean z) {
        this.internalActionBar.setDisplayHomeAsUpEnabled(z);
        this.internalToolbar.setActionBarDisplayOptions(this.internalActionBar.getDisplayOptions());
    }

    @Override // defpackage.x3
    public void setDisplayOptions(int i, int i2) {
        this.internalActionBar.setDisplayOptions(i, i2);
        this.internalToolbar.setActionBarDisplayOptions(this.internalActionBar.getDisplayOptions());
    }

    @Override // defpackage.x3
    public void setDisplayShowCustomEnabled(boolean z) {
        this.internalActionBar.setDisplayShowCustomEnabled(z);
        this.internalToolbar.setActionBarDisplayOptions(this.internalActionBar.getDisplayOptions());
    }

    @Override // defpackage.x3
    public void setDisplayShowHomeEnabled(boolean z) {
        this.internalActionBar.setDisplayShowHomeEnabled(z);
        this.internalToolbar.setActionBarDisplayOptions(this.internalActionBar.getDisplayOptions());
    }

    @Override // defpackage.x3
    public void setDisplayShowTitleEnabled(boolean z) {
        this.internalActionBar.setDisplayShowTitleEnabled(z);
        this.internalToolbar.setActionBarDisplayOptions(this.internalActionBar.getDisplayOptions());
    }

    @Override // defpackage.x3
    public void setDisplayUseLogoEnabled(boolean z) {
        this.internalActionBar.setDisplayUseLogoEnabled(z);
        this.internalToolbar.setActionBarDisplayOptions(this.internalActionBar.getDisplayOptions());
    }

    @Override // defpackage.x3
    public void setElevation(float f) {
        this.internalActionBar.setElevation(f);
    }

    @Override // defpackage.x3
    public void setHideOffset(int i) {
        this.internalActionBar.setHideOffset(i);
    }

    @Override // defpackage.x3
    public void setHideOnContentScrollEnabled(boolean z) {
        this.internalActionBar.setHideOnContentScrollEnabled(z);
    }

    @Override // defpackage.x3
    public void setHomeActionContentDescription(CharSequence charSequence) {
        this.internalActionBar.setHomeActionContentDescription(charSequence);
    }

    @Override // defpackage.x3
    public void setHomeAsUpIndicator(Drawable drawable) {
        this.internalActionBar.setHomeAsUpIndicator(drawable);
    }

    @Override // defpackage.x3
    public void setHomeButtonEnabled(boolean z) {
        this.internalActionBar.setHomeButtonEnabled(z);
    }

    @Override // defpackage.x3
    public void setIcon(int i) {
        this.internalActionBar.setIcon(i);
    }

    @Override // defpackage.x3
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, x3.c cVar) {
        this.internalActionBar.setListNavigationCallbacks(spinnerAdapter, cVar);
    }

    @Override // defpackage.x3
    public void setLogo(int i) {
        this.internalActionBar.setLogo(i);
    }

    @Override // defpackage.x3
    public void setNavigationMode(int i) {
        this.internalActionBar.setNavigationMode(i);
    }

    @Override // defpackage.x3
    public void setSelectedNavigationItem(int i) {
        this.internalActionBar.setSelectedNavigationItem(i);
    }

    @Override // defpackage.x3
    public void setShowHideAnimationEnabled(boolean z) {
        this.internalActionBar.setShowHideAnimationEnabled(z);
    }

    @Override // defpackage.x3
    public void setSplitBackgroundDrawable(Drawable drawable) {
        this.internalActionBar.setSplitBackgroundDrawable(drawable);
    }

    @Override // defpackage.x3
    public void setStackedBackgroundDrawable(Drawable drawable) {
        this.internalActionBar.setStackedBackgroundDrawable(drawable);
    }

    @Override // defpackage.x3
    public void setSubtitle(CharSequence charSequence) {
        this.internalActionBar.setSubtitle(charSequence);
    }

    @Override // defpackage.x3
    public void setTitle(CharSequence charSequence) {
        this.internalActionBar.setTitle(charSequence);
    }

    @Override // defpackage.x3
    public void setWindowTitle(CharSequence charSequence) {
        this.internalActionBar.setWindowTitle(charSequence);
    }

    @Override // defpackage.x3
    public void show() {
        this.internalActionBar.show();
    }

    @Override // defpackage.x3
    public f4 startActionMode(f4.a aVar) {
        return this.internalActionBar.startActionMode(aVar);
    }

    @Override // defpackage.x3
    public void addTab(x3.d dVar, boolean z) {
        this.internalActionBar.addTab(dVar, z);
    }

    @Override // defpackage.x3
    public void setCustomView(View view, x3.a aVar) {
        this.internalActionBar.setCustomView(view, aVar);
    }

    @Override // defpackage.x3
    public void setHomeActionContentDescription(int i) {
        this.internalActionBar.setHomeActionContentDescription(i);
    }

    @Override // defpackage.x3
    public void setHomeAsUpIndicator(int i) {
        this.internalActionBar.setHomeAsUpIndicator(i);
    }

    @Override // defpackage.x3
    public void setIcon(Drawable drawable) {
        this.internalActionBar.setIcon(drawable);
    }

    @Override // defpackage.x3
    public void setLogo(Drawable drawable) {
        this.internalActionBar.setLogo(drawable);
    }

    @Override // defpackage.x3
    public void setSubtitle(int i) {
        this.internalActionBar.setSubtitle(i);
    }

    @Override // defpackage.x3
    public void setTitle(int i) {
        this.internalActionBar.setTitle(i);
    }

    @Override // defpackage.x3
    public void addTab(x3.d dVar, int i) {
        this.internalActionBar.addTab(dVar, i);
    }

    @Override // defpackage.x3
    public void setCustomView(int i) {
        this.internalActionBar.setCustomView(i);
    }

    @Override // defpackage.x3
    public void setDisplayOptions(int i) {
        this.internalActionBar.setDisplayOptions(i);
        this.internalToolbar.setActionBarDisplayOptions(this.internalActionBar.getDisplayOptions());
    }

    @Override // defpackage.x3
    public void addTab(x3.d dVar, int i, boolean z) {
        this.internalActionBar.addTab(dVar, i, z);
    }
}
