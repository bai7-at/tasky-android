package com.comscore.android.id;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.Settings;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import defpackage.um;
import defpackage.vg8;
import defpackage.wm;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public class IdHelperAndroid {
    public static final String NO_ID_AVAILABLE = "none";
    private static final String a = "com.google.android.gms";
    private static final String b = "com.google.android.gms.ads.identifier.service.START";
    private static boolean c;
    public static final String[] INVALID_ID_VALUES = {"0123456789ABCDEF", "0123456789abcdef", "9774d56d682e549c", "9774D56D682E549C", DatasetUtils.UNKNOWN_IDENTITY_ID, "UNKNOWN", "android_id", "ANDROID_ID"};
    public static final String[] INVALID_AD_ID_VALUES = {"00000000-0000-0000-0000-000000000000"};

    private static final class b implements ServiceConnection {
        boolean a;
        private final LinkedBlockingQueue<IBinder> b;

        private b() {
            this.a = false;
            this.b = new LinkedBlockingQueue<>(1);
        }

        IBinder a() throws InterruptedException {
            if (this.a) {
                throw new IllegalStateException();
            }
            this.a = true;
            return this.b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private static final class c implements IInterface {
        private IBinder a;

        c(IBinder iBinder) {
            this.a = iBinder;
        }

        boolean a(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public String getId() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    private static DeviceId a() {
        return new DeviceId("random", UUID.randomUUID().toString(), 7, 2, 0);
    }

    private static String b(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        b bVar = new b();
        Intent intent = new Intent(b);
        intent.setPackage(a);
        if (context.bindService(intent, bVar, 1)) {
            try {
                return new c(bVar.a()).getId();
            } catch (Exception unused) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return "";
    }

    private static boolean c(Context context) {
        if (Build.MODEL.matches("AFTN")) {
            return true;
        }
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static String getAmazonAdvertisingId(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        Boolean a2 = a(context, z);
        if (a2 == null) {
            return null;
        }
        return a2.booleanValue() ? a(context) : "none";
    }

    public static wm getAppSetID(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        try {
            return (wm) vg8.a(um.a(context).b());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static CrossPublisherId getCrossPublisherDeviceId(Context context) {
        return getCrossPublisherDeviceId(context, false);
    }

    public static DeviceId getDeviceId(Context context) {
        wm appSetID = getAppSetID(context);
        if (appSetID != null) {
            int b2 = appSetID.b();
            if (b2 == 1) {
                return new DeviceId("AppSetIdScopeApp", appSetID.a(), 7, 2, 4);
            }
            if (b2 == 2) {
                return new DeviceId("AppSetIdScopeDeveloper", appSetID.a(), 6, 2, 3);
            }
        }
        return a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (isAdvertisementIdValid(r6) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.comscore.android.id.DeviceId getGooglePlayAdvertisingDeviceId(android.content.Context r6, boolean r7) {
        /*
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto L34
            boolean r0 = isGooglePlayServicesAvailable(r6)
            if (r0 == 0) goto L32
            boolean r7 = isAdvertisingIdEnabled(r6, r7)
            if (r7 == 0) goto L23
            java.lang.String r6 = b(r6)
            boolean r7 = isAdvertisementIdValid(r6)
            if (r7 != 0) goto L21
            goto L23
        L21:
            r2 = r6
            goto L26
        L23:
            java.lang.String r6 = "none"
            goto L21
        L26:
            com.comscore.android.id.DeviceId r6 = new com.comscore.android.id.DeviceId
            r4 = 0
            r5 = -1
            java.lang.String r1 = "googleplayapp"
            r3 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L32:
            r6 = 0
            return r6
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Cannot be called from the main thread"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.android.id.IdHelperAndroid.getGooglePlayAdvertisingDeviceId(android.content.Context, boolean):com.comscore.android.id.DeviceId");
    }

    public static boolean isAdvertisementIdValid(String str) {
        for (String str2 : INVALID_AD_ID_VALUES) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAdvertisingIdEnabled(Context context) {
        return isAdvertisingIdEnabled(context, false);
    }

    public static boolean isGooglePlayServicesAvailable(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            b bVar = new b();
            Intent intent = new Intent(b);
            intent.setPackage(a);
            if (!context.bindService(intent, bVar, 1)) {
                return false;
            }
            context.unbindService(bVar);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String md5(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b2 : digest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Huh, MD5 should be supported?", e);
        }
    }

    private static Boolean a(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (!z && c) {
            return Boolean.FALSE;
        }
        try {
            boolean z2 = Settings.Secure.getInt(context.getContentResolver(), "limit_ad_tracking") == 0;
            if (!z && !z2) {
                c = true;
            }
            return Boolean.valueOf(z2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static CrossPublisherId getCrossPublisherDeviceId(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (c(context)) {
            String amazonAdvertisingId = getAmazonAdvertisingId(context, z);
            if (amazonAdvertisingId != null) {
                return new CrossPublisherId(amazonAdvertisingId, 1);
            }
        } else {
            DeviceId googlePlayAdvertisingDeviceId = getGooglePlayAdvertisingDeviceId(context, z);
            if (googlePlayAdvertisingDeviceId != null) {
                return new CrossPublisherId(googlePlayAdvertisingDeviceId.getId(), 1);
            }
        }
        return new CrossPublisherId(null, 0);
    }

    public static boolean isAdvertisingIdEnabled(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        boolean z2 = false;
        if (!z && c) {
            return false;
        }
        b bVar = new b();
        Intent intent = new Intent(b);
        intent.setPackage(a);
        if (context.bindService(intent, bVar, 1)) {
            try {
                z2 = !new c(bVar.a()).a(true);
            } catch (Exception unused) {
            } catch (Throwable th) {
                context.unbindService(bVar);
                throw th;
            }
            context.unbindService(bVar);
        }
        if (!z && !z2) {
            c = true;
        }
        return z2;
    }

    private static String a(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "advertising_id");
        } catch (Exception unused) {
            return null;
        }
    }
}
