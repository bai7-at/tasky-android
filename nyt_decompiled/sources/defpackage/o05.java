package defpackage;

import com.nytimes.android.logging.Secrets;
import com.nytimes.android.logging.remote.AWS3StorageKeys;
import com.nytimes.android.logging.remote.LogUploaderImpl;

/* loaded from: classes4.dex */
public final class o05 {
    public final AWS3StorageKeys a() {
        AWS3StorageKeys aWS3StorageKeys = new AWS3StorageKeys();
        aWS3StorageKeys.b(Secrets.ACCESS_KEY.decode(), Secrets.SECRET_KEY.decode());
        return aWS3StorageKeys;
    }

    public final String b() {
        return "s1-stg-nyt-com";
    }

    public final String c() {
        return "android-phoenix-release";
    }

    public final d94 d(LogUploaderImpl logUploaderImpl) {
        zq3.h(logUploaderImpl, "impl");
        return logUploaderImpl;
    }
}
