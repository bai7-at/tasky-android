package defpackage;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.nytimes.android.libs.messagingarchitecture.model.LegacyMessage;
import com.nytimes.android.libs.messagingarchitecture.model.MessageProperties;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class c34 implements b34 {
    private final RoomDatabase a;
    private final y12 b;
    private final fs4 c = new fs4();
    private final SharedSQLiteStatement d;

    class a extends y12 {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `message_detail` (`id`,`message_id`,`history_id`,`order_id`,`context`,`presentation_rule`,`message_cadence`,`message_placement`,`message_action`,`cancelable`,`message_body`,`kicker`,`media_resource`,`subscription_required`,`ab_test_name`,`ab_test_variant`,`analytics_module_name`,`analytics_label`,`targeting`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, LegacyMessage legacyMessage) {
            if (legacyMessage.l() == null) {
                wc8Var.c1(1);
            } else {
                wc8Var.v0(1, legacyMessage.l());
            }
            if (legacyMessage.o() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, legacyMessage.o());
            }
            if (legacyMessage.k() == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, legacyMessage.k());
            }
            wc8Var.L0(4, legacyMessage.p());
            if (legacyMessage.j() == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, legacyMessage.j());
            }
            String b = c34.this.c.b(legacyMessage.r());
            if (b == null) {
                wc8Var.c1(6);
            } else {
                wc8Var.v0(6, b);
            }
            wc8Var.L0(7, legacyMessage.h());
            String b2 = c34.this.c.b(legacyMessage.q());
            if (b2 == null) {
                wc8Var.c1(8);
            } else {
                wc8Var.v0(8, b2);
            }
            String b3 = c34.this.c.b(legacyMessage.d());
            if (b3 == null) {
                wc8Var.c1(9);
            } else {
                wc8Var.v0(9, b3);
            }
            wc8Var.L0(10, legacyMessage.i() ? 1L : 0L);
            String d = c34.this.c.d(legacyMessage.g());
            if (d == null) {
                wc8Var.c1(11);
            } else {
                wc8Var.v0(11, d);
            }
            if (legacyMessage.m() == null) {
                wc8Var.c1(12);
            } else {
                wc8Var.v0(12, legacyMessage.m());
            }
            String b4 = c34.this.c.b(legacyMessage.n());
            if (b4 == null) {
                wc8Var.c1(13);
            } else {
                wc8Var.v0(13, b4);
            }
            wc8Var.L0(14, legacyMessage.s() ? 1L : 0L);
            if (legacyMessage.b() == null) {
                wc8Var.c1(15);
            } else {
                wc8Var.v0(15, legacyMessage.b());
            }
            if (legacyMessage.c() == null) {
                wc8Var.c1(16);
            } else {
                wc8Var.v0(16, legacyMessage.c());
            }
            if (legacyMessage.f() == null) {
                wc8Var.c1(17);
            } else {
                wc8Var.v0(17, legacyMessage.f());
            }
            if (legacyMessage.e() == null) {
                wc8Var.c1(18);
            } else {
                wc8Var.v0(18, legacyMessage.e());
            }
            String c = c34.this.c.c(legacyMessage.t());
            if (c == null) {
                wc8Var.c1(19);
            } else {
                wc8Var.v0(19, c);
            }
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM message_detail";
        }
    }

    class c implements Callable {
        final /* synthetic */ List a;

        c(List list) {
            this.a = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            c34.this.a.beginTransaction();
            try {
                c34.this.b.insert((Iterable<Object>) this.a);
                c34.this.a.setTransactionSuccessful();
                return ww8.a;
            } finally {
                c34.this.a.endTransaction();
            }
        }
    }

    class d implements Callable {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            wc8 acquire = c34.this.d.acquire();
            try {
                c34.this.a.beginTransaction();
                try {
                    acquire.E();
                    c34.this.a.setTransactionSuccessful();
                    return ww8.a;
                } finally {
                    c34.this.a.endTransaction();
                }
            } finally {
                c34.this.d.release(acquire);
            }
        }
    }

    class e implements Callable {
        final /* synthetic */ p27 a;

        e(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            String string;
            int i;
            String string2;
            int i2;
            String string3;
            int i3;
            boolean z;
            String string4;
            int i4;
            String string5;
            int i5;
            String string6;
            int i6;
            String string7;
            int i7;
            String string8;
            Cursor c = p51.c(c34.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "message_id");
                int d3 = q41.d(c, "history_id");
                int d4 = q41.d(c, "order_id");
                int d5 = q41.d(c, "context");
                int d6 = q41.d(c, "presentation_rule");
                int d7 = q41.d(c, "message_cadence");
                int d8 = q41.d(c, "message_placement");
                int d9 = q41.d(c, "message_action");
                int d10 = q41.d(c, "cancelable");
                int d11 = q41.d(c, "message_body");
                int d12 = q41.d(c, "kicker");
                int d13 = q41.d(c, "media_resource");
                int d14 = q41.d(c, "subscription_required");
                int d15 = q41.d(c, "ab_test_name");
                int d16 = q41.d(c, "ab_test_variant");
                int d17 = q41.d(c, "analytics_module_name");
                int d18 = q41.d(c, "analytics_label");
                int d19 = q41.d(c, "targeting");
                int i8 = d13;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    String string9 = c.isNull(d) ? null : c.getString(d);
                    String string10 = c.isNull(d2) ? null : c.getString(d2);
                    String string11 = c.isNull(d3) ? null : c.getString(d3);
                    int i9 = c.getInt(d4);
                    String string12 = c.isNull(d5) ? null : c.getString(d5);
                    if (c.isNull(d6)) {
                        i = d;
                        string = null;
                    } else {
                        string = c.getString(d6);
                        i = d;
                    }
                    MessageProperties f = c34.this.c.f(string);
                    int i10 = c.getInt(d7);
                    MessageProperties f2 = c34.this.c.f(c.isNull(d8) ? null : c.getString(d8));
                    MessageProperties f3 = c34.this.c.f(c.isNull(d9) ? null : c.getString(d9));
                    boolean z2 = c.getInt(d10) != 0;
                    List h = c34.this.c.h(c.isNull(d11) ? null : c.getString(d11));
                    if (c.isNull(d12)) {
                        i2 = i8;
                        string2 = null;
                    } else {
                        string2 = c.getString(d12);
                        i2 = i8;
                    }
                    if (c.isNull(i2)) {
                        i8 = i2;
                        string3 = null;
                    } else {
                        string3 = c.getString(i2);
                        i8 = i2;
                    }
                    MessageProperties f4 = c34.this.c.f(string3);
                    int i11 = d14;
                    if (c.getInt(i11) != 0) {
                        i3 = d15;
                        z = true;
                    } else {
                        i3 = d15;
                        z = false;
                    }
                    if (c.isNull(i3)) {
                        d14 = i11;
                        i4 = d16;
                        string4 = null;
                    } else {
                        string4 = c.getString(i3);
                        d14 = i11;
                        i4 = d16;
                    }
                    if (c.isNull(i4)) {
                        d16 = i4;
                        i5 = d17;
                        string5 = null;
                    } else {
                        d16 = i4;
                        string5 = c.getString(i4);
                        i5 = d17;
                    }
                    if (c.isNull(i5)) {
                        d17 = i5;
                        i6 = d18;
                        string6 = null;
                    } else {
                        d17 = i5;
                        string6 = c.getString(i5);
                        i6 = d18;
                    }
                    if (c.isNull(i6)) {
                        d18 = i6;
                        i7 = d19;
                        string7 = null;
                    } else {
                        d18 = i6;
                        string7 = c.getString(i6);
                        i7 = d19;
                    }
                    if (c.isNull(i7)) {
                        d19 = i7;
                        d15 = i3;
                        string8 = null;
                    } else {
                        d19 = i7;
                        string8 = c.getString(i7);
                        d15 = i3;
                    }
                    arrayList.add(new LegacyMessage(string9, string10, string11, i9, string12, f, i10, f2, f3, z2, h, string2, f4, z, string4, string5, string6, string7, c34.this.c.g(string8)));
                    d = i;
                }
                return arrayList;
            } finally {
                c.close();
                this.a.release();
            }
        }
    }

    class f implements Callable {
        final /* synthetic */ p27 a;

        f(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LegacyMessage call() {
            LegacyMessage legacyMessage;
            int i;
            boolean z;
            String string;
            int i2;
            String string2;
            int i3;
            String string3;
            int i4;
            Cursor c = p51.c(c34.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "message_id");
                int d3 = q41.d(c, "history_id");
                int d4 = q41.d(c, "order_id");
                int d5 = q41.d(c, "context");
                int d6 = q41.d(c, "presentation_rule");
                int d7 = q41.d(c, "message_cadence");
                int d8 = q41.d(c, "message_placement");
                int d9 = q41.d(c, "message_action");
                int d10 = q41.d(c, "cancelable");
                int d11 = q41.d(c, "message_body");
                int d12 = q41.d(c, "kicker");
                int d13 = q41.d(c, "media_resource");
                int d14 = q41.d(c, "subscription_required");
                int d15 = q41.d(c, "ab_test_name");
                int d16 = q41.d(c, "ab_test_variant");
                int d17 = q41.d(c, "analytics_module_name");
                int d18 = q41.d(c, "analytics_label");
                int d19 = q41.d(c, "targeting");
                if (c.moveToFirst()) {
                    String string4 = c.isNull(d) ? null : c.getString(d);
                    String string5 = c.isNull(d2) ? null : c.getString(d2);
                    String string6 = c.isNull(d3) ? null : c.getString(d3);
                    int i5 = c.getInt(d4);
                    String string7 = c.isNull(d5) ? null : c.getString(d5);
                    MessageProperties f = c34.this.c.f(c.isNull(d6) ? null : c.getString(d6));
                    int i6 = c.getInt(d7);
                    MessageProperties f2 = c34.this.c.f(c.isNull(d8) ? null : c.getString(d8));
                    MessageProperties f3 = c34.this.c.f(c.isNull(d9) ? null : c.getString(d9));
                    boolean z2 = c.getInt(d10) != 0;
                    List h = c34.this.c.h(c.isNull(d11) ? null : c.getString(d11));
                    String string8 = c.isNull(d12) ? null : c.getString(d12);
                    MessageProperties f4 = c34.this.c.f(c.isNull(d13) ? null : c.getString(d13));
                    if (c.getInt(d14) != 0) {
                        z = true;
                        i = d15;
                    } else {
                        i = d15;
                        z = false;
                    }
                    if (c.isNull(i)) {
                        i2 = d16;
                        string = null;
                    } else {
                        string = c.getString(i);
                        i2 = d16;
                    }
                    if (c.isNull(i2)) {
                        i3 = d17;
                        string2 = null;
                    } else {
                        string2 = c.getString(i2);
                        i3 = d17;
                    }
                    if (c.isNull(i3)) {
                        i4 = d18;
                        string3 = null;
                    } else {
                        string3 = c.getString(i3);
                        i4 = d18;
                    }
                    legacyMessage = new LegacyMessage(string4, string5, string6, i5, string7, f, i6, f2, f3, z2, h, string8, f4, z, string, string2, string3, c.isNull(i4) ? null : c.getString(i4), c34.this.c.g(c.isNull(d19) ? null : c.getString(d19)));
                } else {
                    legacyMessage = null;
                }
                return legacyMessage;
            } finally {
                c.close();
                this.a.release();
            }
        }
    }

    public c34(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.d = new b(roomDatabase);
    }

    public static List i() {
        return Collections.emptyList();
    }

    @Override // defpackage.b34
    public Object a(by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM message_detail ORDER BY order_id ASC", 0);
        return CoroutinesRoom.b(this.a, false, p51.a(), new e(d2), by0Var);
    }

    @Override // defpackage.b34
    public Object b(by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new d(), by0Var);
    }

    @Override // defpackage.b34
    public Object c(String str, by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM message_detail WHERE id = ?", 1);
        if (str == null) {
            d2.c1(1);
        } else {
            d2.v0(1, str);
        }
        return CoroutinesRoom.b(this.a, false, p51.a(), new f(d2), by0Var);
    }

    @Override // defpackage.b34
    public Object d(List list, by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new c(list), by0Var);
    }
}
