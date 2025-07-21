package com.nytimes.android.subauth.core.database;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import defpackage.c00;
import defpackage.du8;
import defpackage.gm0;
import defpackage.hy0;
import defpackage.m19;
import defpackage.nu7;
import defpackage.oz8;
import defpackage.sc8;
import defpackage.zq3;
import java.util.Calendar;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class SubauthDatabase extends RoomDatabase {

    public static final class a implements c00 {
        public static final C0418a Companion = new C0418a(null);
        public static final String EMPTY_LIST = "[]";
        public static final int PROVISIONAL_DATE_GRACE_PERIOD_HOURS = 12;
        public static final String SUBAUTH_CLIENT_KEY = "SubauthEnt";
        public static final String SUBAUTH_STORE_CLIENT_KEY = "SubauthStoreEnt";

        /* renamed from: com.nytimes.android.subauth.core.database.SubauthDatabase$a$a, reason: collision with other inner class name */
        public static final class C0418a {
            public /* synthetic */ C0418a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0418a() {
            }
        }

        private final String b(String str) {
            return h.F(str, "'", "''", false, 4, null);
        }

        private final String c(sc8 sc8Var) {
            UserSubscriptionEntitlement b;
            Cursor T0 = sc8Var.T0("SELECT entitlementKey FROM `Entitlement` WHERE `clientKey` = 'SubauthStoreEnt'");
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                T0.moveToFirst();
                while (true) {
                    String str = null;
                    if (T0.isAfterLast()) {
                        break;
                    }
                    if (!T0.isNull(0)) {
                        str = T0.getString(0);
                    }
                    if (str != null && (b = com.nytimes.android.subauth.core.database.userdata.subscription.a.b(str)) != null) {
                        linkedHashSet.add(b);
                    }
                    T0.moveToNext();
                }
                String a = linkedHashSet.size() > 0 ? new m19().a(linkedHashSet) : "[]";
                gm0.a(T0, null);
                return a;
            } finally {
            }
        }

        private final Long d(sc8 sc8Var) {
            Long l;
            Cursor T0 = sc8Var.T0("SELECT * FROM `Entitlement` WHERE `clientKey` = 'SubauthEnt'");
            try {
                if (T0.getCount() > 0) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(12, 10);
                    l = Long.valueOf(calendar.getTime().getTime());
                } else {
                    l = null;
                }
                gm0.a(T0, null);
                return l;
            } finally {
            }
        }

        private final Pair e(sc8 sc8Var) {
            Pair a;
            Cursor T0 = sc8Var.T0("SELECT `regiId`, `email` FROM `User`");
            try {
                T0.moveToFirst();
                if (T0.getCount() > 0) {
                    int columnIndex = T0.getColumnIndex("regiId");
                    String string = T0.isNull(columnIndex) ? null : T0.getString(columnIndex);
                    int columnIndex2 = T0.getColumnIndex("email");
                    a = du8.a(string, T0.isNull(columnIndex2) ? null : T0.getString(columnIndex2));
                } else {
                    a = du8.a(null, null);
                }
                gm0.a(T0, null);
                return a;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    gm0.a(T0, th);
                    throw th2;
                }
            }
        }

        @Override // defpackage.c00
        public void a(sc8 sc8Var) {
            String str;
            zq3.h(sc8Var, "db");
            Pair e = e(sc8Var);
            String str2 = (String) e.a();
            String str3 = (String) e.b();
            String c = c(sc8Var);
            Long d = d(sc8Var);
            String b = b(String.valueOf(str3));
            String str4 = null;
            if (str2 != null) {
                str = "'" + str2 + "'";
            } else {
                str = null;
            }
            if (str3 != null) {
                str4 = "'" + b + "'";
            }
            sc8Var.B(h.f("\n                INSERT INTO `UserData` (\n                    `userId`, \n                    `subscriptions`, \n                    `regiId`, \n                    `email`, \n                    `entitlements`, \n                    `provisionalExpirationDate`\n                ) VALUES (\n                    1234,\n                    '[]',\n                    " + str + ",\n                    " + str4 + ",\n                    '" + c + "',\n                    " + d + "\n                )\n                "));
        }
    }

    public abstract hy0 d();

    public abstract nu7 e();

    public abstract oz8 f();
}
