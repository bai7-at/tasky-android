package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public interface ov3 {
    public static final Charset a = Charset.forName(Constants.DEFAULT_ENCODING);

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
