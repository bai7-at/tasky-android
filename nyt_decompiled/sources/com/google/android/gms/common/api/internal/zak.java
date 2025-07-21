package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public final class zak extends zap {
    private final SparseArray zad;

    private zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.zad = new SparseArray();
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(lifecycleActivity);
        zak zakVar = (zak) fragment.getCallbackOrNull("AutoManageHelper", zak.class);
        return zakVar != null ? zakVar : new zak(fragment);
    }

    private final t0 zai(int i) {
        if (this.zad.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.zad;
        return (t0) sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.zad.size(); i++) {
            t0 zai = zai(i);
            if (zai != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(zai.a);
                printWriter.println(":");
                zai.b.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        Log.d("AutoManageHelper", "onStart " + this.zaa + " " + String.valueOf(this.zad));
        if (this.zab.get() == null) {
            for (int i = 0; i < this.zad.size(); i++) {
                t0 zai = zai(i);
                if (zai != null) {
                    zai.b.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i = 0; i < this.zad.size(); i++) {
            t0 zai = zai(i);
            if (zai != null) {
                zai.b.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zab(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        t0 t0Var = (t0) this.zad.get(i);
        if (t0Var != null) {
            zae(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = t0Var.c;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zac() {
        for (int i = 0; i < this.zad.size(); i++) {
            t0 zai = zai(i);
            if (zai != null) {
                zai.b.connect();
            }
        }
    }

    public final void zad(int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        Preconditions.checkState(this.zad.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        u0 u0Var = (u0) this.zab.get();
        Log.d("AutoManageHelper", "starting AutoManage for client " + i + " " + this.zaa + " " + String.valueOf(u0Var));
        t0 t0Var = new t0(this, i, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(t0Var);
        this.zad.put(i, t0Var);
        if (this.zaa && u0Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void zae(int i) {
        t0 t0Var = (t0) this.zad.get(i);
        this.zad.remove(i);
        if (t0Var != null) {
            t0Var.b.unregisterConnectionFailedListener(t0Var);
            t0Var.b.disconnect();
        }
    }
}
