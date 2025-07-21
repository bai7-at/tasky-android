package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.internal.cms.signing.SigningAuthRequestException;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class is7 implements ty6 {
    public static final a Companion = new a(null);
    private final String a;
    private Pattern b;
    private Pattern c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str, String str2, String str3) {
            String str4 = str2 + str + str3;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bytes = str4.getBytes(yj0.b);
                zq3.g(bytes, "getBytes(...)");
                byte[] digest = messageDigest.digest(bytes);
                StringBuilder sb = new StringBuilder(32);
                for (byte b : digest) {
                    String hexString = Integer.toHexString((b & 255) | JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
                    zq3.g(hexString, "toHexString(...)");
                    String substring = hexString.substring(1, 3);
                    zq3.g(substring, "substring(...)");
                    sb.append(substring);
                }
                String sb2 = sb.toString();
                zq3.e(sb2);
                return sb2;
            } catch (NoSuchAlgorithmException e) {
                throw new SigningAuthRequestException("Missing MD5 Algorithm", e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String d(Matcher matcher, String str) {
            String group;
            return (!matcher.find() || (group = matcher.group(1)) == null) ? str : group;
        }

        private a() {
        }
    }

    public is7(String str) {
        zq3.h(str, "salt");
        this.a = str;
        this.b = Pattern.compile("https?://[^/]*(/.*/v[0-9.]*)/.*");
        this.c = Pattern.compile("https?://[^/]*(/.*)/[^/]*");
    }

    private final String b(String str) {
        String str2 = "";
        if (str != null) {
            a aVar = Companion;
            Matcher matcher = this.b.matcher(str);
            zq3.g(matcher, "matcher(...)");
            Matcher matcher2 = this.c.matcher(str);
            zq3.g(matcher2, "matcher(...)");
            String d = aVar.d(matcher, aVar.d(matcher2, ""));
            if (d != null) {
                str2 = d;
            }
        }
        return str2 + "/*";
    }

    @Override // defpackage.ty6
    public String a(String str, long j) {
        zq3.h(str, "url");
        String valueOf = String.valueOf(j + NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
        String b = b(str);
        z38 z38Var = z38.a;
        String format = String.format("auth=expires=%s~access=%s~md5=%s", Arrays.copyOf(new Object[]{valueOf, b, Companion.c(b, valueOf, this.a)}, 3));
        zq3.g(format, "format(...)");
        return format;
    }
}
