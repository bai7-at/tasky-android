package defpackage;

import com.nytimes.android.entitlements.a;
import com.nytimes.android.messaging.api.UserStatus;

/* loaded from: classes4.dex */
public final class l19 {
    public static final l19 a = new l19();

    private l19() {
    }

    public static final UserStatus a(a aVar) {
        zq3.h(aVar, "ecommClient");
        return aVar.a() ? UserStatus.SUBSCRIBER : aVar.q() ? UserStatus.REGISTERED : UserStatus.ANONYMOUS;
    }
}
