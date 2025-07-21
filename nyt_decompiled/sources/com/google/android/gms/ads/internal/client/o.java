package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.cgb;
import defpackage.esa;
import defpackage.fgb;
import defpackage.kia;
import defpackage.lra;
import defpackage.mpa;
import defpackage.tfb;

/* loaded from: classes2.dex */
abstract class o {
    private static final cgb a;

    static {
        cgb cgbVar = null;
        try {
            Object newInstance = n.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    cgbVar = queryLocalInterface instanceof cgb ? (cgb) queryLocalInterface : new u(iBinder);
                }
            } else {
                fgb.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            fgb.g("Failed to instantiate ClientApi class.");
        }
        a = cgbVar;
    }

    o() {
    }

    private final Object e() {
        cgb cgbVar = a;
        if (cgbVar == null) {
            fgb.g("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return b(cgbVar);
        } catch (RemoteException e) {
            fgb.h("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final Object f() {
        try {
            return c();
        } catch (RemoteException e) {
            fgb.h("Cannot invoke remote loader.", e);
            return null;
        }
    }

    protected abstract Object a();

    protected abstract Object b(cgb cgbVar);

    protected abstract Object c();

    public final Object d(Context context, boolean z) {
        boolean z2;
        Object e;
        if (!z) {
            kia.b();
            if (!tfb.u(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                fgb.b("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
        mpa.a(context);
        if (((Boolean) lra.a.e()).booleanValue()) {
            z2 = false;
        } else if (((Boolean) lra.b.e()).booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z | z4;
            z2 = false;
        }
        if (z3) {
            e = e();
            if (e == null && !z2) {
                e = f();
            }
        } else {
            Object f = f();
            if (f == null) {
                if (kia.e().nextInt(((Long) esa.a.e()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    kia.b().p(context, kia.c().zza, "gmob-apps", bundle, true);
                }
            }
            e = f == null ? e() : f;
        }
        return e == null ? a() : e;
    }
}
