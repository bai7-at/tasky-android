package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.internal.ads.c4;
import com.google.android.gms.internal.ads.d4;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.g4;
import com.google.android.gms.internal.ads.m3;
import com.google.android.gms.internal.ads.r4;
import com.google.android.gms.internal.ads.s4;
import com.google.android.gms.internal.ads.s9;
import com.google.android.gms.internal.ads.x3;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcei;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class l7d {
    private final ina a;
    private final Context b;
    private final n6d c;
    private final zzcei d;
    private final String e;
    private final k6e f;
    private final hie g = dyf.q().i();

    public l7d(Context context, zzcei zzceiVar, ina inaVar, n6d n6dVar, String str, k6e k6eVar) {
        this.b = context;
        this.d = zzceiVar;
        this.a = inaVar;
        this.c = n6dVar;
        this.e = str;
        this.f = k6eVar;
    }

    private static final void c(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            c4 c4Var = (c4) arrayList.get(i);
            if (c4Var.j0() == 2 && c4Var.R() > j) {
                j = c4Var.R();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    final /* synthetic */ Void a(boolean z, SQLiteDatabase sQLiteDatabase) {
        if (z) {
            this.b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) pla.c().a(mpa.z8)).booleanValue()) {
            j6e b = j6e.b("oa_upload");
            b.a("oa_failed_reqs", String.valueOf(e7d.a(sQLiteDatabase, 0)));
            b.a("oa_total_reqs", String.valueOf(e7d.a(sQLiteDatabase, 1)));
            b.a("oa_upload_time", String.valueOf(dyf.b().currentTimeMillis()));
            b.a("oa_last_successful_time", String.valueOf(e7d.b(sQLiteDatabase, 2)));
            b.a("oa_session_id", this.g.g() ? "" : this.e);
            this.f.a(b);
            ArrayList c = e7d.c(sQLiteDatabase);
            c(sQLiteDatabase, c);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                c4 c4Var = (c4) c.get(i);
                hie hieVar = this.g;
                j6e b2 = j6e.b("oa_signals");
                b2.a("oa_session_id", hieVar.g() ? "" : this.e);
                x3 S = c4Var.S();
                String valueOf = S.P() ? String.valueOf(S.R() - 1) : "-1";
                String obj = s9.b(c4Var.X(), new gge() { // from class: k7d
                    @Override // defpackage.gge
                    public final Object apply(Object obj2) {
                        return ((zzbcn) obj2).name();
                    }
                }).toString();
                b2.a("oa_sig_ts", String.valueOf(c4Var.R()));
                b2.a("oa_sig_status", String.valueOf(c4Var.j0() - 1));
                b2.a("oa_sig_resp_lat", String.valueOf(c4Var.Q()));
                b2.a("oa_sig_render_lat", String.valueOf(c4Var.P()));
                b2.a("oa_sig_formats", obj);
                b2.a("oa_sig_nw_type", valueOf);
                b2.a("oa_sig_wifi", String.valueOf(c4Var.k0() - 1));
                b2.a("oa_sig_airplane", String.valueOf(c4Var.g0() - 1));
                b2.a("oa_sig_data", String.valueOf(c4Var.h0() - 1));
                b2.a("oa_sig_nw_resp", String.valueOf(c4Var.O()));
                b2.a("oa_sig_offline", String.valueOf(c4Var.i0() - 1));
                b2.a("oa_sig_nw_state", String.valueOf(c4Var.W().zza()));
                if (S.O() && S.P() && S.R() == 2) {
                    b2.a("oa_sig_cell_type", String.valueOf(S.Q() - 1));
                }
                this.f.a(b2);
            }
        } else {
            ArrayList c2 = e7d.c(sQLiteDatabase);
            Context context = this.b;
            d4 L = g4.L();
            L.o(context.getPackageName());
            L.q(Build.MODEL);
            L.r(e7d.a(sQLiteDatabase, 0));
            L.n(c2);
            L.t(e7d.a(sQLiteDatabase, 1));
            L.p(e7d.a(sQLiteDatabase, 3));
            L.u(dyf.b().currentTimeMillis());
            L.s(e7d.b(sQLiteDatabase, 2));
            final g4 g4Var = (g4) L.i();
            c(sQLiteDatabase, c2);
            this.a.b(new hna() { // from class: i7d
                @Override // defpackage.hna
                public final void a(m3 m3Var) {
                    m3Var.v(g4.this);
                }
            });
            zzcei zzceiVar = this.d;
            r4 L2 = s4.L();
            L2.n(zzceiVar.zzb);
            L2.p(this.d.zzc);
            L2.o(true == this.d.zzd ? 0 : 2);
            final s4 s4Var = (s4) L2.i();
            this.a.b(new hna() { // from class: j7d
                @Override // defpackage.hna
                public final void a(m3 m3Var) {
                    g3 g3Var = (g3) m3Var.o().l();
                    g3Var.o(s4.this);
                    m3Var.t(g3Var);
                }
            });
            this.a.c(10004);
        }
        e7d.f(sQLiteDatabase);
        return null;
    }

    public final void b(final boolean z) {
        try {
            this.c.a(new f5e() { // from class: h7d
                @Override // defpackage.f5e
                public final Object zza(Object obj) {
                    l7d.this.a(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            fgb.d("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
