package defpackage;

import com.nytimes.android.subauth.core.purr.directive.AgentTCFInfo;
import com.nytimes.android.subauth.core.purr.directive.EmailMarketingOptInDirectiveValue;
import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceName;
import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceValue;
import java.util.List;

/* loaded from: classes4.dex */
public interface s86 {
    Object a(UserPrivacyPreferenceName userPrivacyPreferenceName, UserPrivacyPreferenceValue userPrivacyPreferenceValue, List list, by0 by0Var);

    Object b(List list, AgentTCFInfo agentTCFInfo, by0 by0Var);

    Object c(String str, String str2, by0 by0Var);

    Object d(boolean z, EmailMarketingOptInDirectiveValue emailMarketingOptInDirectiveValue, boolean z2, by0 by0Var);
}
