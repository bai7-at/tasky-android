package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes3.dex */
public abstract class i8f {
    public static Object a(Object obj) {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        try {
            if (obj != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        try {
                            Object readObject = objectInputStream.readObject();
                            objectOutputStream.close();
                            objectInputStream.close();
                            return readObject;
                        } catch (Throwable th2) {
                            th = th2;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            if (objectInputStream == null) {
                                throw th;
                            }
                            objectInputStream.close();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectInputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    objectInputStream = null;
                    objectOutputStream = null;
                }
            }
        } catch (IOException | ClassNotFoundException unused) {
        }
        return null;
    }

    public static String b(String str, String[] strArr, String[] strArr2) {
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public static String c(Context context, String str, String str2) {
        Preconditions.checkNotNull(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = wie.a(context);
        }
        return wie.b("google_app_id", resources, str2);
    }
}
