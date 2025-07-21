package com.facebook.appevents.ondeviceprocessing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.AuthenticationTokenClaims;
import defpackage.c11;
import defpackage.ew6;
import defpackage.fe3;
import defpackage.g29;
import defpackage.sl;
import defpackage.w92;
import defpackage.x92;
import defpackage.zq3;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public final class RemoteServiceWrapper {
    public static final RemoteServiceWrapper a = new RemoteServiceWrapper();
    private static final String b;
    private static Boolean c;

    public enum EventType {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

        private final String eventType;

        EventType(String str) {
            this.eventType = str;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EventType[] valuesCustom() {
            EventType[] valuesCustom = values();
            return (EventType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.eventType;
        }
    }

    public enum ServiceResult {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static ServiceResult[] valuesCustom() {
            ServiceResult[] valuesCustom = values();
            return (ServiceResult[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    private static final class a implements ServiceConnection {
        private final CountDownLatch a = new CountDownLatch(1);
        private IBinder b;

        public final IBinder a() {
            this.a.await(5L, TimeUnit.SECONDS);
            return this.b;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            zq3.h(componentName, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            zq3.h(componentName, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(iBinder, "serviceBinder");
            this.b = iBinder;
            this.a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            zq3.h(componentName, AuthenticationTokenClaims.JSON_KEY_NAME);
        }
    }

    static {
        String simpleName = RemoteServiceWrapper.class.getSimpleName();
        zq3.g(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        b = simpleName;
    }

    private RemoteServiceWrapper() {
    }

    private final Intent a(Context context) {
        if (c11.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && x92.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (x92.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public static final boolean b() {
        if (c11.d(RemoteServiceWrapper.class)) {
            return false;
        }
        try {
            if (c == null) {
                c = Boolean.valueOf(a.a(w92.l()) != null);
            }
            Boolean bool = c;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Throwable th) {
            c11.b(th, RemoteServiceWrapper.class);
            return false;
        }
    }

    public static final ServiceResult c(String str, List list) {
        if (c11.d(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            zq3.h(str, "applicationId");
            zq3.h(list, "appEvents");
            return a.d(EventType.CUSTOM_APP_EVENTS, str, list);
        } catch (Throwable th) {
            c11.b(th, RemoteServiceWrapper.class);
            return null;
        }
    }

    private final ServiceResult d(EventType eventType, String str, List list) {
        ServiceResult serviceResult;
        String str2;
        if (c11.d(this)) {
            return null;
        }
        try {
            ServiceResult serviceResult2 = ServiceResult.SERVICE_NOT_AVAILABLE;
            sl.b();
            Context l = w92.l();
            Intent a2 = a(l);
            if (a2 == null) {
                return serviceResult2;
            }
            a aVar = new a();
            try {
                if (!l.bindService(a2, aVar, 1)) {
                    return ServiceResult.SERVICE_ERROR;
                }
                try {
                    try {
                        IBinder a3 = aVar.a();
                        if (a3 != null) {
                            fe3 O = fe3.a.O(a3);
                            Bundle a4 = ew6.a(eventType, str, list);
                            if (a4 != null) {
                                O.J0(a4);
                                g29 g29Var = g29.a;
                                g29.f0(b, zq3.q("Successfully sent events to the remote service: ", a4));
                            }
                            serviceResult2 = ServiceResult.OPERATION_SUCCESS;
                        }
                        l.unbindService(aVar);
                        g29 g29Var2 = g29.a;
                        g29.f0(b, "Unbound from the remote service");
                        return serviceResult2;
                    } catch (RemoteException e) {
                        serviceResult = ServiceResult.SERVICE_ERROR;
                        g29 g29Var3 = g29.a;
                        str2 = b;
                        g29.e0(str2, e);
                        l.unbindService(aVar);
                        g29.f0(str2, "Unbound from the remote service");
                        return serviceResult;
                    }
                } catch (InterruptedException e2) {
                    serviceResult = ServiceResult.SERVICE_ERROR;
                    g29 g29Var4 = g29.a;
                    str2 = b;
                    g29.e0(str2, e2);
                    l.unbindService(aVar);
                    g29.f0(str2, "Unbound from the remote service");
                    return serviceResult;
                }
            } catch (Throwable th) {
                l.unbindService(aVar);
                g29 g29Var5 = g29.a;
                g29.f0(b, "Unbound from the remote service");
                throw th;
            }
        } catch (Throwable th2) {
            c11.b(th2, this);
            return null;
        }
    }

    public static final ServiceResult e(String str) {
        if (c11.d(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            zq3.h(str, "applicationId");
            return a.d(EventType.MOBILE_APP_INSTALL, str, i.l());
        } catch (Throwable th) {
            c11.b(th, RemoteServiceWrapper.class);
            return null;
        }
    }
}
