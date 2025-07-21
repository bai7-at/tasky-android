package io.embrace.android.embracesdk.gating;

import defpackage.zq3;
import io.embrace.android.embracesdk.payload.UserInfo;
import java.util.Set;

/* loaded from: classes5.dex */
public final class UserInfoSanitizer implements Sanitizable<UserInfo> {
    private final Set<String> enabledComponents;
    private final UserInfo userInfo;

    public UserInfoSanitizer(UserInfo userInfo, Set<String> set) {
        zq3.h(set, "enabledComponents");
        this.userInfo = userInfo;
        this.enabledComponents = set;
    }

    private final boolean shouldSendUserPersonas() {
        return this.enabledComponents.contains(SessionGatingKeys.USER_PERSONAS);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.embrace.android.embracesdk.gating.Sanitizable
    public UserInfo sanitize() {
        return this.userInfo == null ? new UserInfo(null, null, null, null, 15, null) : !shouldSendUserPersonas() ? UserInfo.copy$default(this.userInfo, null, null, null, null, 7, null) : this.userInfo;
    }
}
