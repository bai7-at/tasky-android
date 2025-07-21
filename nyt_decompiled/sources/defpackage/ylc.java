package defpackage;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ylc implements View.OnClickListener {
    private final cqc a;
    private final Clock b;
    private mva c;
    private uxa d;
    String e;
    Long f;
    WeakReference g;

    public ylc(cqc cqcVar, Clock clock) {
        this.a = cqcVar;
        this.b = clock;
    }

    private final void d() {
        View view;
        this.e = null;
        this.f = null;
        WeakReference weakReference = this.g;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.g = null;
    }

    public final mva a() {
        return this.c;
    }

    public final void b() {
        if (this.c == null || this.f == null) {
            return;
        }
        d();
        try {
            this.c.zze();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    public final void c(final mva mvaVar) {
        this.c = mvaVar;
        uxa uxaVar = this.d;
        if (uxaVar != null) {
            this.a.k("/unconfirmedClick", uxaVar);
        }
        uxa uxaVar2 = new uxa() { // from class: xlc
            @Override // defpackage.uxa
            public final void a(Object obj, Map map) {
                ylc ylcVar = ylc.this;
                try {
                    ylcVar.f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    fgb.d("Failed to call parse unconfirmedClickTimestamp.");
                }
                mva mvaVar2 = mvaVar;
                ylcVar.e = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (mvaVar2 == null) {
                    fgb.b("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    mvaVar2.n(str);
                } catch (RemoteException e) {
                    fgb.i("#007 Could not call remote method.", e);
                }
            }
        };
        this.d = uxaVar2;
        this.a.i("/unconfirmedClick", uxaVar2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
        WeakReference weakReference = this.g;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.e != null && this.f != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.e);
            hashMap.put("time_interval", String.valueOf(this.b.currentTimeMillis() - this.f.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.a.g("sendMessageToNativeJs", hashMap);
        }
        d();
    }
}
