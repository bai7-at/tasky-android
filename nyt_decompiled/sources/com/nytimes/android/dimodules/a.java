package com.nytimes.android.dimodules;

import com.nytimes.android.features.settings.AccountSettingsPresenter;
import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes4.dex */
public abstract class a implements ba2 {
    public static AccountSettingsPresenter a(com.nytimes.android.entitlements.a aVar) {
        return (AccountSettingsPresenter) g16.e(ActivityModule.Companion.a(aVar));
    }
}
