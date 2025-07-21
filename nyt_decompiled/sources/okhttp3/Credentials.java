package okhttp3;

import defpackage.zq3;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        zq3.h(str, "username");
        zq3.h(str2, "password");
        return basic$default(str, str2, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            zq3.g(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2, Charset charset) {
        zq3.h(str, "username");
        zq3.h(str2, "password");
        zq3.h(charset, "charset");
        return "Basic " + ByteString.c.c(str + ':' + str2, charset).a();
    }
}
