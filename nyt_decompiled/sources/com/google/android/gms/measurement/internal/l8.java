package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import defpackage.shd;

/* loaded from: classes3.dex */
public final class l8 implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private volatile boolean a;
    private volatile s3 b;
    final /* synthetic */ m8 c;

    protected l8(m8 m8Var) {
        this.c = m8Var;
    }

    public final void b(Intent intent) {
        l8 l8Var;
        this.c.c();
        Context zzau = this.c.a.zzau();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                if (this.a) {
                    this.c.a.o().u().a("Connection attempt already in progress");
                    return;
                }
                this.c.a.o().u().a("Using local app measurement service");
                this.a = true;
                l8Var = this.c.c;
                connectionTracker.bindService(zzau, intent, l8Var, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        this.c.c();
        Context zzau = this.c.a.zzau();
        synchronized (this) {
            try {
                if (this.a) {
                    this.c.a.o().u().a("Connection attempt already in progress");
                    return;
                }
                if (this.b != null && (this.b.isConnecting() || this.b.isConnected())) {
                    this.c.a.o().u().a("Already awaiting connection attempt");
                    return;
                }
                this.b = new s3(zzau, Looper.getMainLooper(), this, this);
                this.c.a.o().u().a("Connecting to remote service");
                this.a = true;
                Preconditions.checkNotNull(this.b);
                this.b.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.b != null && (this.b.isConnected() || this.b.isConnecting())) {
            this.b.disconnect();
        }
        this.b = null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.b);
                this.c.a.e().y(new i8(this, (shd) this.b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        x3 D = this.c.a.D();
        if (D != null) {
            D.v().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.a.e().y(new k8(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.c.a.o().m().a("Service connection suspended");
        this.c.a.e().y(new j8(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l8 l8Var;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.a.o().n().a("Service connected with null binder");
                return;
            }
            shd shdVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    shdVar = queryLocalInterface instanceof shd ? (shd) queryLocalInterface : new n3(iBinder);
                    this.c.a.o().u().a("Bound to IMeasurementService interface");
                } else {
                    this.c.a.o().n().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.c.a.o().n().a("Service connect failed to get IMeasurementService");
            }
            if (shdVar == null) {
                this.a = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context zzau = this.c.a.zzau();
                    l8Var = this.c.c;
                    connectionTracker.unbindService(zzau, l8Var);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.c.a.e().y(new f8(this, shdVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.c.a.o().m().a("Service disconnected");
        this.c.a.e().y(new g8(this, componentName));
    }
}
