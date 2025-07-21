package io.embrace.android.embracesdk.capture.envelope.metadata;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.internal.payload.EnvelopeMetadata;
import io.embrace.android.embracesdk.payload.UserInfo;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class EnvelopeMetadataSourceImpl implements EnvelopeMetadataSource {
    private final UserService userService;

    public EnvelopeMetadataSourceImpl(UserService userService) {
        zq3.h(userService, "userService");
        this.userService = userService;
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.metadata.EnvelopeMetadataSource
    public EnvelopeMetadata getEnvelopeMetadata() {
        UserInfo userInfo = this.userService.getUserInfo();
        String userId = userInfo.getUserId();
        String email = userInfo.getEmail();
        String username = userInfo.getUsername();
        Set<String> personas = userInfo.getPersonas();
        if (personas == null) {
            personas = b0.e();
        }
        Set<String> set = personas;
        TimeZone timeZone = TimeZone.getDefault();
        zq3.g(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.getDefault();
        zq3.g(locale, "Locale.getDefault()");
        sb.append(locale.getLanguage());
        sb.append(QueryKeys.END_MARKER);
        Locale locale2 = Locale.getDefault();
        zq3.g(locale2, "Locale.getDefault()");
        sb.append(locale2.getCountry());
        return new EnvelopeMetadata(userId, email, username, set, id, sb.toString());
    }
}
