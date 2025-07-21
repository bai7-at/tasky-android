package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.bp9;
import defpackage.gp9;
import defpackage.so;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class b implements zaca {
    private final Context a;
    private final zabe b;
    private final Looper c;
    private final zabi d;
    private final zabi e;
    private final Map f;
    private final Api.Client h;
    private Bundle i;
    private final Lock m;
    private final Set g = Collections.newSetFromMap(new WeakHashMap());
    private ConnectionResult j = null;
    private ConnectionResult k = null;
    private boolean l = false;
    private int n = 0;

    private b(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, Map map2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, Api.Client client, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.a = context;
        this.b = zabeVar;
        this.m = lock;
        this.c = looper;
        this.h = client;
        this.d = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new a1(this, null));
        this.e = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new b1(this, null));
        so soVar = new so();
        Iterator it2 = map2.keySet().iterator();
        while (it2.hasNext()) {
            soVar.put((Api.AnyClientKey) it2.next(), this.d);
        }
        Iterator it3 = map.keySet().iterator();
        while (it3.hasNext()) {
            soVar.put((Api.AnyClientKey) it3.next(), this.e);
        }
        this.f = Collections.unmodifiableMap(soVar);
    }

    private final void a(ConnectionResult connectionResult) {
        int i = this.n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.n = 0;
            }
            this.b.zaa(connectionResult);
        }
        b();
        this.n = 0;
    }

    private final void b() {
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            ((SignInConnectionListener) it2.next()).onComplete();
        }
        this.g.clear();
    }

    private final boolean c() {
        ConnectionResult connectionResult = this.k;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final boolean d(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabi zabiVar = (zabi) this.f.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabiVar.equals(this.e);
    }

    private static boolean e(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    public static b g(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList) {
        so soVar = new so();
        so soVar2 = new so();
        Api.Client client = null;
        for (Map.Entry entry : map.entrySet()) {
            Api.Client client2 = (Api.Client) entry.getValue();
            if (true == client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                soVar.put((Api.AnyClientKey) entry.getKey(), client2);
            } else {
                soVar2.put((Api.AnyClientKey) entry.getKey(), client2);
            }
        }
        Preconditions.checkState(!soVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        so soVar3 = new so();
        so soVar4 = new so();
        for (Api api : map2.keySet()) {
            Api.AnyClientKey zab = api.zab();
            if (soVar.containsKey(zab)) {
                soVar3.put(api, (Boolean) map2.get(api));
            } else {
                if (!soVar2.containsKey(zab)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                soVar4.put(api, (Boolean) map2.get(api));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zat zatVar = (zat) arrayList.get(i);
            if (soVar3.containsKey(zatVar.zaa)) {
                arrayList2.add(zatVar);
            } else {
                if (!soVar4.containsKey(zatVar.zaa)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(zatVar);
            }
        }
        return new b(context, zabeVar, lock, looper, googleApiAvailabilityLight, soVar, soVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, soVar3, soVar4);
    }

    static /* bridge */ /* synthetic */ void n(b bVar, int i, boolean z) {
        bVar.b.zac(i, z);
        bVar.k = null;
        bVar.j = null;
    }

    static /* bridge */ /* synthetic */ void o(b bVar, Bundle bundle) {
        Bundle bundle2 = bVar.i;
        if (bundle2 == null) {
            bVar.i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    static /* bridge */ /* synthetic */ void p(b bVar) {
        ConnectionResult connectionResult;
        if (!e(bVar.j)) {
            if (bVar.j != null && e(bVar.k)) {
                bVar.e.zar();
                bVar.a((ConnectionResult) Preconditions.checkNotNull(bVar.j));
                return;
            }
            ConnectionResult connectionResult2 = bVar.j;
            if (connectionResult2 == null || (connectionResult = bVar.k) == null) {
                return;
            }
            if (bVar.e.zaf < bVar.d.zaf) {
                connectionResult2 = connectionResult;
            }
            bVar.a(connectionResult2);
            return;
        }
        if (!e(bVar.k) && !bVar.c()) {
            ConnectionResult connectionResult3 = bVar.k;
            if (connectionResult3 != null) {
                if (bVar.n == 1) {
                    bVar.b();
                    return;
                } else {
                    bVar.a(connectionResult3);
                    bVar.d.zar();
                    return;
                }
            }
            return;
        }
        int i = bVar.n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                bVar.n = 0;
            }
            ((zabe) Preconditions.checkNotNull(bVar.b)).zab(bVar.i);
        }
        bVar.b();
        bVar.n = 0;
    }

    private final PendingIntent r() {
        if (this.h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.a, System.identityHashCode(this.b), this.h.getSignInIntent(), bp9.a | 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zac(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zad(Api api) {
        return Objects.equal(this.f.get(api.zab()), this.e) ? c() ? new ConnectionResult(4, r()) : this.e.zad(api) : this.d.zad(api);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zae(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!d(apiMethodImpl)) {
            this.d.zae(apiMethodImpl);
            return apiMethodImpl;
        }
        if (c()) {
            apiMethodImpl.setFailedResult(new Status(4, (String) null, r()));
            return apiMethodImpl;
        }
        this.e.zae(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zaf(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!d(apiMethodImpl)) {
            return this.d.zaf(apiMethodImpl);
        }
        if (!c()) {
            return this.e.zaf(apiMethodImpl);
        }
        apiMethodImpl.setFailedResult(new Status(4, (String) null, r()));
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        this.n = 2;
        this.l = false;
        this.k = null;
        this.j = null;
        this.d.zaq();
        this.e.zaq();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        this.k = null;
        this.j = null;
        this.n = 0;
        this.d.zar();
        this.e.zar();
        b();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        this.d.zat();
        this.e.zat();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        this.m.lock();
        try {
            boolean zax = zax();
            this.e.zar();
            this.k = new ConnectionResult(4);
            if (zax) {
                new gp9(this.c).post(new z0(this));
            } else {
                b();
            }
            this.m.unlock();
        } catch (Throwable th) {
            this.m.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r3.n == 1) goto L11;
     */
    @Override // com.google.android.gms.common.api.internal.zaca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zaw() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.m
            r0.lock()
            com.google.android.gms.common.api.internal.zabi r0 = r3.d     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.common.api.internal.zabi r0 = r3.e     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L23
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.c()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L21
            int r0 = r3.n     // Catch: java.lang.Throwable -> L23
            if (r0 != r2) goto L25
        L21:
            r1 = r2
            goto L25
        L23:
            r0 = move-exception
            goto L2b
        L25:
            java.util.concurrent.locks.Lock r3 = r3.m
            r3.unlock()
            return r1
        L2b:
            java.util.concurrent.locks.Lock r3 = r3.m
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.b.zaw():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        this.m.lock();
        try {
            return this.n == 2;
        } finally {
            this.m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        this.m.lock();
        try {
            if (!zax()) {
                if (zaw()) {
                }
                this.m.unlock();
                return false;
            }
            if (!this.e.zaw()) {
                this.g.add(signInConnectionListener);
                if (this.n == 0) {
                    this.n = 1;
                }
                this.k = null;
                this.e.zaq();
                this.m.unlock();
                return true;
            }
            this.m.unlock();
            return false;
        } catch (Throwable th) {
            this.m.unlock();
            throw th;
        }
    }
}
