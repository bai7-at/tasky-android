package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class rh7 {
    public static final rh7 a = new rh7();

    private rh7() {
    }

    public static final String a(String str) {
        String str2;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ROOT);
            zq3.g(str2, "toLowerCase(...)");
        } else {
            str2 = null;
        }
        return zq3.c(str2, "home") ? "homepage" : zq3.c(str2, "for_you") ? "FollowedChannels" : str;
    }
}
