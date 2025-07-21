package com.nytimes.android.dimodules;

import android.content.res.Resources;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.sectionfrontrefresher.SectionFrontResourcesProvider;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ba2;
import defpackage.bh7;
import defpackage.f15;
import defpackage.g16;
import defpackage.r57;
import defpackage.vb2;

/* loaded from: classes4.dex */
public abstract class g implements ba2 {
    public static bh7 a(NetworkStatus networkStatus, r57 r57Var, SnackbarUtil snackbarUtil, Resources resources, AppPreferences appPreferences, TimeStampUtil timeStampUtil, f15 f15Var, SectionFrontResourcesProvider sectionFrontResourcesProvider, vb2 vb2Var) {
        return (bh7) g16.e(ActivityModule.Companion.g(networkStatus, r57Var, snackbarUtil, resources, appPreferences, timeStampUtil, f15Var, sectionFrontResourcesProvider, vb2Var));
    }
}
