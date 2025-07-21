package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Map;

/* loaded from: classes2.dex */
public interface ImaSdkSettings {
    public static final int DEFAULT_MAX_REDIRECTS = 4;

    @KeepForSdk
    boolean doesRestrictToCustomPlayer();

    boolean getAutoPlayAdBreaks();

    Map<String, String> getFeatureFlags();

    String getLanguage();

    int getMaxRedirects();

    String getPlayerType();

    String getPlayerVersion();

    String getPpid();

    String getSessionId();

    @KeepForSdk
    TestingConfiguration getTestingConfig();

    boolean isDebugMode();

    void setAutoPlayAdBreaks(boolean z);

    void setDebugMode(boolean z);

    void setFeatureFlags(Map<String, String> map);

    void setLanguage(String str);

    void setMaxRedirects(int i);

    void setPlayerType(String str);

    void setPlayerVersion(String str);

    void setPpid(String str);

    @KeepForSdk
    void setRestrictToCustomPlayer(boolean z);

    void setSessionId(String str);

    @KeepForSdk
    void setTestingConfig(TestingConfiguration testingConfiguration);

    String toString();
}
