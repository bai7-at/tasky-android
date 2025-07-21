package com.nytimes.android.features.settings.push;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.Settings;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.f;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.nytimes.android.BaseAppCompatActivity;
import com.nytimes.android.features.settings.push.NotificationsSettingsFragment;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.AppPreferences;
import defpackage.d5;
import defpackage.ho6;
import defpackage.i5;
import defpackage.j5;
import defpackage.jl6;
import defpackage.q83;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tm;
import defpackage.wl6;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* loaded from: classes4.dex */
public final class NotificationsSettingsFragment extends q83 {
    public AppPreferences appPreferences;
    public tm appPreferencesManager;
    private final CompositeDisposable f = new CompositeDisposable();
    private final qs2 g;

    public NotificationsSettingsFragment() {
        final j5 registerForActivityResult = registerForActivityResult(new i5(), new d5() { // from class: pa5
            @Override // defpackage.d5
            public final void a(Object obj) {
                NotificationsSettingsFragment.l1(NotificationsSettingsFragment.this, (ActivityResult) obj);
            }
        });
        zq3.g(registerForActivityResult, "registerForActivityResult(...)");
        this.g = new qs2() { // from class: com.nytimes.android.features.settings.push.NotificationsSettingsFragment$special$$inlined$registerForActivityResultInvokable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m437invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m437invoke() {
                j5 j5Var = j5.this;
                Intent putExtra = new Intent("android.intent.action.RINGTONE_PICKER").putExtra("android.intent.extra.ringtone.TYPE", 2).putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true).putExtra("android.intent.extra.ringtone.SHOW_SILENT", true).putExtra("android.intent.extra.ringtone.DEFAULT_URI", Settings.System.DEFAULT_NOTIFICATION_URI);
                String c = this.getAppPreferencesManager().c();
                Uri uri = null;
                if (c != null) {
                    if (c.length() <= 0) {
                        c = null;
                    }
                    if (c != null) {
                        uri = Uri.parse(c);
                    }
                }
                if (uri != null) {
                    putExtra.putExtra("android.intent.extra.ringtone.EXISTING_URI", uri);
                }
                zq3.g(putExtra, "also(...)");
                j5Var.a(putExtra);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k1() {
        addPreferencesFromResource(ho6.notification_preferences);
        Object systemService = requireActivity().getSystemService("vibrator");
        zq3.f(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        if (((Vibrator) systemService).hasVibrator()) {
            return;
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) getPreferenceScreen().N0(getString(wl6.notifications));
        Preference findPreference = findPreference(getString(jl6.key_bna_vibrate));
        if (findPreference != null && preferenceCategory != null) {
            preferenceCategory.U0(findPreference);
        }
        if (preferenceCategory == null || preferenceCategory.R0() != 0) {
            return;
        }
        getPreferenceScreen().U0(preferenceCategory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l1(NotificationsSettingsFragment notificationsSettingsFragment, ActivityResult activityResult) {
        zq3.h(notificationsSettingsFragment, "this$0");
        zq3.h(activityResult, "it");
        Intent a = activityResult.a();
        Uri uri = a != null ? (Uri) a.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI") : null;
        if (activityResult.b() != -1 || uri == null) {
            return;
        }
        notificationsSettingsFragment.getAppPreferencesManager().f(uri.toString());
    }

    private final Disposable listenToLocaleUpdate() {
        f activity = getActivity();
        zq3.f(activity, "null cannot be cast to non-null type com.nytimes.android.BaseAppCompatActivity");
        Single<Boolean> forceLocaleUpdate = ((BaseAppCompatActivity) activity).forceLocaleUpdate();
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.features.settings.push.NotificationsSettingsFragment$listenToLocaleUpdate$1
            {
                super(1);
            }

            public final void b(Boolean bool) {
                NotificationsSettingsFragment.this.k1();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Boolean) obj);
                return ww8.a;
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: qa5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NotificationsSettingsFragment.m1(ss2.this, obj);
            }
        };
        final NotificationsSettingsFragment$listenToLocaleUpdate$2 notificationsSettingsFragment$listenToLocaleUpdate$2 = new NotificationsSettingsFragment$listenToLocaleUpdate$2(NYTLogger.a);
        Disposable subscribe = forceLocaleUpdate.subscribe(consumer, new Consumer() { // from class: ra5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NotificationsSettingsFragment.listenToLocaleUpdate$lambda$6(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        return subscribe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenToLocaleUpdate$lambda$6(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m1(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    public final tm getAppPreferencesManager() {
        tm tmVar = this.appPreferencesManager;
        if (tmVar != null) {
            return tmVar;
        }
        zq3.z("appPreferencesManager");
        return null;
    }

    @Override // androidx.preference.d
    public void onCreatePreferences(Bundle bundle, String str) {
        this.f.add(listenToLocaleUpdate());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f.clear();
        super.onDestroy();
    }

    @Override // androidx.preference.d, androidx.preference.g.c
    public boolean onPreferenceTreeClick(Preference preference) {
        zq3.h(preference, "preference");
        if (!zq3.c(preference.q(), getString(jl6.key_bna_ringtone))) {
            return super.onPreferenceTreeClick(preference);
        }
        this.g.mo865invoke();
        return true;
    }
}
