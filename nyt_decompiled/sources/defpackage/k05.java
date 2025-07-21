package defpackage;

import com.amazonaws.auth.BasicAWSCredentials;
import com.nytimes.android.logging.remote.AWS3StorageKeys;

/* loaded from: classes4.dex */
public abstract class k05 implements ba2 {
    public static BasicAWSCredentials a(AWS3StorageKeys aWS3StorageKeys) {
        return (BasicAWSCredentials) g16.e(j05.a.a(aWS3StorageKeys));
    }
}
