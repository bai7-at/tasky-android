package defpackage;

import android.util.Base64;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.h;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class rd5 {
    public static final rd5 a = new rd5();
    private static final String b = "/.well-known/oauth/openid/keys/";

    private rd5() {
    }

    public static final PublicKey b(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        byte[] decode = Base64.decode(h.F(h.F(h.F(str, "\n", "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), 0);
        zq3.g(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        zq3.g(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String c(final String str) {
        zq3.h(str, "kid");
        final URL url = new URL("https", zq3.q("www.", w92.u()), b);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        w92.t().execute(new Runnable() { // from class: qd5
            @Override // java.lang.Runnable
            public final void run() {
                rd5.d(url, ref$ObjectRef, str, reentrantLock, newCondition);
            }
        });
        reentrantLock.lock();
        try {
            newCondition.await(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) ref$ObjectRef.element;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public static final void d(URL url, Ref$ObjectRef ref$ObjectRef, String str, ReentrantLock reentrantLock, Condition condition) {
        zq3.h(url, "$openIdKeyUrl");
        zq3.h(ref$ObjectRef, "$result");
        zq3.h(str, "$kid");
        zq3.h(reentrantLock, "$lock");
        URLConnection openConnection = url.openConnection();
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                zq3.g(inputStream, "connection.inputStream");
                String f = zj8.f(new BufferedReader(new InputStreamReader(inputStream, yj0.b), 8192));
                httpURLConnection.getInputStream().close();
                ref$ObjectRef.element = new JSONObject(f).optString(str);
                httpURLConnection.disconnect();
                reentrantLock.lock();
            } catch (Exception e) {
                String name = a.getClass().getName();
                String message = e.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                    ww8 ww8Var = ww8.a;
                } finally {
                }
            }
            try {
                condition.signal();
                ww8 ww8Var2 = ww8.a;
            } finally {
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            reentrantLock.lock();
            try {
                condition.signal();
                ww8 ww8Var3 = ww8.a;
                throw th;
            } finally {
            }
        }
    }

    public static final boolean e(PublicKey publicKey, String str, String str2) {
        zq3.h(publicKey, "publicKey");
        zq3.h(str, "data");
        zq3.h(str2, "signature");
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(yj0.b);
            zq3.g(bytes, "(this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            zq3.g(decode, "decode(signature, Base64.URL_SAFE)");
            return signature.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }
}
