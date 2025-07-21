package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes2.dex */
public final class AFa1eSDK {
    public final String[] AFKeystoreWrapper;

    static final class AFa1wSDK {
        final String AFInAppEventParameterName;
        private final boolean values;

        AFa1wSDK(String str, boolean z) {
            this.AFInAppEventParameterName = str;
            this.values = z;
        }

        final boolean AFInAppEventParameterName() {
            return this.values;
        }
    }

    static final class AFa1ySDK implements IInterface {
        private final IBinder AFKeystoreWrapper;

        AFa1ySDK(IBinder iBinder) {
            this.AFKeystoreWrapper = iBinder;
        }

        public final String AFKeystoreWrapper() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFKeystoreWrapper.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFKeystoreWrapper;
        }

        final boolean values() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.AFKeystoreWrapper.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    AFa1eSDK() {
    }

    static AFa1wSDK AFKeystoreWrapper(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1vSDK aFa1vSDK = new AFa1vSDK((byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1vSDK, 1)) {
                context.unbindService(aFa1vSDK);
                throw new IOException("Google Play connection failed");
            }
            if (aFa1vSDK.values) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1vSDK.values = true;
            IBinder poll = aFa1vSDK.AFKeystoreWrapper.poll(10L, TimeUnit.SECONDS);
            if (poll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1ySDK aFa1ySDK = new AFa1ySDK(poll);
            return new AFa1wSDK(aFa1ySDK.AFKeystoreWrapper(), aFa1ySDK.values());
        } finally {
            context.unbindService(aFa1vSDK);
        }
    }

    public AFa1eSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.AFKeystoreWrapper = null;
            return;
        }
        Pattern compile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !compile.matcher(str).matches()) {
                AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase());
            }
        }
        if (arrayList.contains("all")) {
            this.AFKeystoreWrapper = new String[]{"all"};
        } else if (arrayList.isEmpty()) {
            this.AFKeystoreWrapper = null;
        } else {
            this.AFKeystoreWrapper = (String[]) arrayList.toArray(new String[0]);
        }
    }

    static final class AFa1vSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> AFKeystoreWrapper;
        boolean values;

        private AFa1vSDK() {
            this.AFKeystoreWrapper = new LinkedBlockingQueue<>(1);
            this.values = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFKeystoreWrapper.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        /* synthetic */ AFa1vSDK(byte b) {
            this();
        }
    }
}
