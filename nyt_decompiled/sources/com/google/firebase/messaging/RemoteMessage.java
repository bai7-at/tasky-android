package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.b;
import java.util.Map;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new t();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    @SafeParcelable.Field(id = 2)
    Bundle bundle;
    private Map<String, String> data;
    private b notification;

    public static class b {
        private final String a;
        private final String b;
        private final String[] c;
        private final String d;
        private final String e;
        private final String[] f;
        private final String g;
        private final String h;
        private final String i;
        private final String j;
        private final String k;
        private final String l;
        private final String m;
        private final Uri n;
        private final String o;
        private final Integer p;
        private final Integer q;
        private final Integer r;
        private final int[] s;
        private final Long t;
        private final boolean u;
        private final boolean v;
        private final boolean w;
        private final boolean x;
        private final boolean y;
        private final long[] z;

        private static String[] b(p pVar, String str) {
            Object[] g = pVar.g(str);
            if (g == null) {
                return null;
            }
            String[] strArr = new String[g.length];
            for (int i = 0; i < g.length; i++) {
                strArr[i] = String.valueOf(g[i]);
            }
            return strArr;
        }

        public String a() {
            return this.d;
        }

        public Integer c() {
            return this.p;
        }

        public String d() {
            return this.a;
        }

        private b(p pVar) {
            this.a = pVar.p("gcm.n.title");
            this.b = pVar.h("gcm.n.title");
            this.c = b(pVar, "gcm.n.title");
            this.d = pVar.p("gcm.n.body");
            this.e = pVar.h("gcm.n.body");
            this.f = b(pVar, "gcm.n.body");
            this.g = pVar.p("gcm.n.icon");
            this.i = pVar.o();
            this.j = pVar.p("gcm.n.tag");
            this.k = pVar.p("gcm.n.color");
            this.l = pVar.p("gcm.n.click_action");
            this.m = pVar.p("gcm.n.android_channel_id");
            this.n = pVar.f();
            this.h = pVar.p("gcm.n.image");
            this.o = pVar.p("gcm.n.ticker");
            this.p = pVar.b("gcm.n.notification_priority");
            this.q = pVar.b("gcm.n.visibility");
            this.r = pVar.b("gcm.n.notification_count");
            this.u = pVar.a("gcm.n.sticky");
            this.v = pVar.a("gcm.n.local_only");
            this.w = pVar.a("gcm.n.default_sound");
            this.x = pVar.a("gcm.n.default_vibrate_timings");
            this.y = pVar.a("gcm.n.default_light_settings");
            this.t = pVar.j("gcm.n.event_time");
            this.s = pVar.e();
            this.z = pVar.q();
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.bundle = bundle;
    }

    private int K0(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String G0() {
        return this.bundle.getString("from");
    }

    public String H0() {
        String string = this.bundle.getString("google.message_id");
        return string == null ? this.bundle.getString("message_id") : string;
    }

    public b X0() {
        if (this.notification == null && p.t(this.bundle)) {
            this.notification = new b(new p(this.bundle));
        }
        return this.notification;
    }

    public Map t0() {
        if (this.data == null) {
            this.data = b.a.a(this.bundle);
        }
        return this.data;
    }

    public int u1() {
        String string = this.bundle.getString("google.delivered_priority");
        if (string == null) {
            if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(this.bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.bundle.getString("google.priority");
        }
        return K0(string);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        t.c(this, parcel, i);
    }
}
