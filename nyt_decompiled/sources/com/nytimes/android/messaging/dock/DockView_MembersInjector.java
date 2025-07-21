package com.nytimes.android.messaging.dock;

import com.nytimes.android.utils.AppPreferences;
import defpackage.op4;
import defpackage.p76;

/* loaded from: classes4.dex */
public final class DockView_MembersInjector implements op4 {
    private final p76 appPreferencesProvider;
    private final p76 presenterProvider;

    public DockView_MembersInjector(p76 p76Var, p76 p76Var2) {
        this.presenterProvider = p76Var;
        this.appPreferencesProvider = p76Var2;
    }

    public static op4 create(p76 p76Var, p76 p76Var2) {
        return new DockView_MembersInjector(p76Var, p76Var2);
    }

    public static void injectAppPreferences(DockView dockView, AppPreferences appPreferences) {
        dockView.appPreferences = appPreferences;
    }

    public static void injectPresenter(DockView dockView, DockPresenter dockPresenter) {
        dockView.presenter = dockPresenter;
    }

    public void injectMembers(DockView dockView) {
        injectPresenter(dockView, (DockPresenter) this.presenterProvider.get());
        injectAppPreferences(dockView, (AppPreferences) this.appPreferencesProvider.get());
    }
}
