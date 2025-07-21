package defpackage;

import android.app.Application;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;

/* loaded from: classes4.dex */
public abstract class l05 implements ba2 {
    public static AmazonS3Client a(Application application, BasicAWSCredentials basicAWSCredentials) {
        return (AmazonS3Client) g16.e(j05.a.b(application, basicAWSCredentials));
    }
}
