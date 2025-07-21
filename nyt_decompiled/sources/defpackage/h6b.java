package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h6b extends q6b {
    private final Map c;
    private final Context d;
    private final String e;
    private final long f;
    private final long g;
    private final String h;
    private final String i;

    public h6b(wlb wlbVar, Map map) {
        super(wlbVar, "createCalendarEvent");
        this.c = map;
        this.d = wlbVar.zzi();
        this.e = l("description");
        this.h = l("summary");
        this.f = k("start_ticks");
        this.g = k("end_ticks");
        this.i = l("location");
    }

    private final long k(String str) {
        String str2 = (String) this.c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String l(String str) {
        return TextUtils.isEmpty((CharSequence) this.c.get(str)) ? "" : (String) this.c.get(str);
    }

    final Intent i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.e);
        data.putExtra("eventLocation", this.i);
        data.putExtra("description", this.h);
        long j = this.f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void j() {
        if (this.d == null) {
            c("Activity context is not available.");
            return;
        }
        dyf.r();
        if (!new roa(this.d).b()) {
            c("This feature is not available on the device.");
            return;
        }
        dyf.r();
        AlertDialog.Builder j = wxf.j(this.d);
        Resources e = dyf.q().e();
        j.setTitle(e != null ? e.getString(tj6.s5) : "Create calendar event");
        j.setMessage(e != null ? e.getString(tj6.s6) : "Allow Ad to create a calendar event?");
        j.setPositiveButton(e != null ? e.getString(tj6.s3) : "Accept", new f6b(this));
        j.setNegativeButton(e != null ? e.getString(tj6.s4) : "Decline", new g6b(this));
        j.create().show();
    }
}
