package com.nytimes.android.media.util;

import android.app.Application;
import android.view.accessibility.CaptioningManager;
import com.nytimes.android.utils.AppPreferences;

/* loaded from: classes4.dex */
public class CaptionPrefManager {
    private static final String CAPTIONS_KEY = "com.nytimes.android.utils.CAPTIONS_KEY";
    private static final String CAPTIONS_OVERRIDE_KEY = "com.nytimes.android.utils.CAPTIONS_OVERRIDE_KEY";
    private final AppPreferences appPreferences;
    private final CaptioningManager captioningManager;

    public CaptionPrefManager(Application application, AppPreferences appPreferences) {
        this.captioningManager = (CaptioningManager) application.getSystemService("captioning");
        this.appPreferences = appPreferences;
    }

    public boolean areCaptionsEnabled() {
        if (this.appPreferences.h(CAPTIONS_OVERRIDE_KEY)) {
            return true;
        }
        return this.appPreferences.h(CAPTIONS_KEY) ? this.appPreferences.n(CAPTIONS_KEY, false) : this.captioningManager.isEnabled();
    }

    public void clearOverridePref() {
        this.appPreferences.p(CAPTIONS_OVERRIDE_KEY);
    }

    public boolean isCaptionsKey(String str) {
        return CAPTIONS_KEY.equalsIgnoreCase(str);
    }

    public boolean isCaptionsOverrideKey(String str) {
        return CAPTIONS_OVERRIDE_KEY.equalsIgnoreCase(str);
    }

    public void setOverridePref() {
        this.appPreferences.f(CAPTIONS_OVERRIDE_KEY, true);
    }

    public void updateCaptionEnabledPreference(boolean z) {
        this.appPreferences.f(CAPTIONS_KEY, z);
    }
}
