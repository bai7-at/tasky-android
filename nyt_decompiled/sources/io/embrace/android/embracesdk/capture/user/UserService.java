package io.embrace.android.embracesdk.capture.user;

import io.embrace.android.embracesdk.payload.UserInfo;

/* loaded from: classes5.dex */
public interface UserService {
    void addUserPersona(String str);

    void clearAllUserInfo();

    void clearAllUserPersonas();

    void clearUserAsPayer();

    void clearUserEmail();

    void clearUserIdentifier();

    void clearUserPersona(String str);

    void clearUsername();

    UserInfo getUserInfo();

    UserInfo loadUserInfoFromDisk();

    void setUserAsPayer();

    void setUserEmail(String str);

    void setUserIdentifier(String str);

    void setUsername(String str);
}
