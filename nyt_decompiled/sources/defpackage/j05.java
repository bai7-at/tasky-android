package defpackage;

import android.app.Application;
import android.util.Base64;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.logging.remote.AWS3StorageKeys;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class j05 {
    public static final j05 a = new j05();

    private j05() {
    }

    public final BasicAWSCredentials a(AWS3StorageKeys aWS3StorageKeys) {
        String str;
        zq3.h(aWS3StorageKeys, "awS3StorageKeys");
        String str2 = "";
        try {
            byte[] decode = Base64.decode(aWS3StorageKeys.a(), 0);
            zq3.g(decode, "decode(...)");
            Charset charset = StandardCharsets.UTF_8;
            zq3.g(charset, "UTF_8");
            String str3 = new String(decode, charset);
            String substring = str3.substring(0, 20);
            zq3.g(substring, "substring(...)");
            Locale locale = Locale.ENGLISH;
            zq3.g(locale, "ENGLISH");
            str = substring.toUpperCase(locale);
            zq3.g(str, "toUpperCase(...)");
            try {
                String substring2 = str3.substring(20);
                zq3.g(substring2, "substring(...)");
                str2 = substring2;
            } catch (Throwable th) {
                th = th;
                NYTLogger.i(th, "Missing android_storage_suffix value w/ access key / secret key to configure AWS client.", new Object[0]);
                return new BasicAWSCredentials(str, str2);
            }
        } catch (Throwable th2) {
            th = th2;
            str = "";
        }
        return new BasicAWSCredentials(str, str2);
    }

    public final AmazonS3Client b(Application application, BasicAWSCredentials basicAWSCredentials) {
        zq3.h(application, "application");
        zq3.h(basicAWSCredentials, "credentials");
        AmazonS3Client amazonS3Client = new AmazonS3Client(basicAWSCredentials, Region.getRegion(Regions.US_EAST_1));
        amazonS3Client.setEndpoint(application.getResources().getString(ll6.aws_s3_base_url));
        return amazonS3Client;
    }
}
