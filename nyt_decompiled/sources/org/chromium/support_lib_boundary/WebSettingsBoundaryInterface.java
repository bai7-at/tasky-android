package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* loaded from: classes5.dex */
public interface WebSettingsBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface WebAuthnSupport {
        public static final int APP = 1;
        public static final int BROWSER = 2;
        public static final int NONE = 0;
    }

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getOffscreenPreRaster();

    Set<String> getRequestedWithHeaderOriginAllowList();

    boolean getSafeBrowsingEnabled();

    int getWebAuthnSupport();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean z);

    void setDisabledActionModeMenuItems(int i);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z);

    void setForceDark(int i);

    void setForceDarkBehavior(int i);

    void setOffscreenPreRaster(boolean z);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);

    void setSafeBrowsingEnabled(boolean z);

    void setWebAuthnSupport(int i);

    void setWillSuppressErrorPage(boolean z);
}
