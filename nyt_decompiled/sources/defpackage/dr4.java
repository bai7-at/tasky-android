package defpackage;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.nytimes.android.libs.messagingarchitecture.model.Message;
import com.nytimes.android.libs.messagingarchitecture.model.MessageProperties;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class dr4 implements cr4 {
    private final RoomDatabase a;
    private final y12 b;
    private final fs4 c = new fs4();
    private final SharedSQLiteStatement d;
    private final SharedSQLiteStatement e;

    class a extends y12 {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `oma_message_detail` (`id`,`message_id`,`history_id`,`weight`,`unit`,`placement`,`presentation_rule`,`cadence`,`action`,`cancelable`,`body`,`kicker`,`media_resource`,`analytics_module_name`,`analytics_label`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, Message message) {
            if (message.n() == null) {
                wc8Var.c1(1);
            } else {
                wc8Var.v0(1, message.n());
            }
            if (message.j() == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, message.j());
            }
            if (message.q() == null) {
                wc8Var.c1(3);
            } else {
                wc8Var.v0(3, message.q());
            }
            wc8Var.L0(4, message.u());
            if (message.t() == null) {
                wc8Var.c1(5);
            } else {
                wc8Var.v0(5, message.t());
            }
            String b = dr4.this.c.b(message.r());
            if (b == null) {
                wc8Var.c1(6);
            } else {
                wc8Var.v0(6, b);
            }
            String b2 = dr4.this.c.b(message.s());
            if (b2 == null) {
                wc8Var.c1(7);
            } else {
                wc8Var.v0(7, b2);
            }
            wc8Var.L0(8, message.l());
            String b3 = dr4.this.c.b(message.g());
            if (b3 == null) {
                wc8Var.c1(9);
            } else {
                wc8Var.v0(9, b3);
            }
            wc8Var.L0(10, message.m() ? 1L : 0L);
            String d = dr4.this.c.d(message.k());
            if (d == null) {
                wc8Var.c1(11);
            } else {
                wc8Var.v0(11, d);
            }
            if (message.o() == null) {
                wc8Var.c1(12);
            } else {
                wc8Var.v0(12, message.o());
            }
            String b4 = dr4.this.c.b(message.p());
            if (b4 == null) {
                wc8Var.c1(13);
            } else {
                wc8Var.v0(13, b4);
            }
            if (message.i() == null) {
                wc8Var.c1(14);
            } else {
                wc8Var.v0(14, message.i());
            }
            if (message.h() == null) {
                wc8Var.c1(15);
            } else {
                wc8Var.v0(15, message.h());
            }
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM oma_message_detail";
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM oma_message_detail WHERE id = ?";
        }
    }

    class d implements Callable {
        final /* synthetic */ List a;

        d(List list) {
            this.a = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            dr4.this.a.beginTransaction();
            try {
                dr4.this.b.insert((Iterable<Object>) this.a);
                dr4.this.a.setTransactionSuccessful();
                return ww8.a;
            } finally {
                dr4.this.a.endTransaction();
            }
        }
    }

    class e implements Callable {
        e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            wc8 acquire = dr4.this.d.acquire();
            try {
                dr4.this.a.beginTransaction();
                try {
                    acquire.E();
                    dr4.this.a.setTransactionSuccessful();
                    return ww8.a;
                } finally {
                    dr4.this.a.endTransaction();
                }
            } finally {
                dr4.this.d.release(acquire);
            }
        }
    }

    class f implements Callable {
        final /* synthetic */ String a;

        f(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            wc8 acquire = dr4.this.e.acquire();
            String str = this.a;
            if (str == null) {
                acquire.c1(1);
            } else {
                acquire.v0(1, str);
            }
            try {
                dr4.this.a.beginTransaction();
                try {
                    acquire.E();
                    dr4.this.a.setTransactionSuccessful();
                    return ww8.a;
                } finally {
                    dr4.this.a.endTransaction();
                }
            } finally {
                dr4.this.e.release(acquire);
            }
        }
    }

    class g implements Callable {
        final /* synthetic */ p27 a;

        g(p27 p27Var) {
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
            String string4;
            int i3;
            String string5;
            Cursor c = p51.c(dr4.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "message_id");
                int d3 = q41.d(c, "history_id");
                int d4 = q41.d(c, "weight");
                int d5 = q41.d(c, "unit");
                int d6 = q41.d(c, "placement");
                int d7 = q41.d(c, "presentation_rule");
                int d8 = q41.d(c, "cadence");
                int d9 = q41.d(c, "action");
                int d10 = q41.d(c, "cancelable");
                int d11 = q41.d(c, "body");
                int d12 = q41.d(c, "kicker");
                int d13 = q41.d(c, "media_resource");
                int d14 = q41.d(c, "analytics_module_name");
                int d15 = q41.d(c, "analytics_label");
                int i4 = d13;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    String string6 = c.isNull(d) ? null : c.getString(d);
                    String string7 = c.isNull(d2) ? null : c.getString(d2);
                    String string8 = c.isNull(d3) ? null : c.getString(d3);
                    int i5 = c.getInt(d4);
                    String string9 = c.isNull(d5) ? null : c.getString(d5);
                    if (c.isNull(d6)) {
                        i = d;
                        string = null;
                    } else {
                        string = c.getString(d6);
                        i = d;
                    }
                    MessageProperties f = dr4.this.c.f(string);
                    MessageProperties f2 = dr4.this.c.f(c.isNull(d7) ? null : c.getString(d7));
                    int i6 = c.getInt(d8);
                    MessageProperties f3 = dr4.this.c.f(c.isNull(d9) ? null : c.getString(d9));
                    boolean z = c.getInt(d10) != 0;
                    List h = dr4.this.c.h(c.isNull(d11) ? null : c.getString(d11));
                    if (c.isNull(d12)) {
                        i2 = i4;
                        string2 = null;
                    } else {
                        string2 = c.getString(d12);
                        i2 = i4;
                    }
                    if (c.isNull(i2)) {
                        i4 = i2;
                        string3 = null;
                    } else {
                        string3 = c.getString(i2);
                        i4 = i2;
                    }
                    MessageProperties f4 = dr4.this.c.f(string3);
                    int i7 = d14;
                    if (c.isNull(i7)) {
                        i3 = d15;
                        string4 = null;
                    } else {
                        string4 = c.getString(i7);
                        i3 = d15;
                    }
                    if (c.isNull(i3)) {
                        d14 = i7;
                        string5 = null;
                    } else {
                        string5 = c.getString(i3);
                        d14 = i7;
                    }
                    arrayList.add(new Message(string6, string7, string8, i5, string9, f, f2, i6, f3, z, h, string2, f4, string4, string5));
                    d15 = i3;
                    d = i;
                }
                return arrayList;
            } finally {
                c.close();
                this.a.release();
            }
        }
    }

    class h implements Callable {
        final /* synthetic */ p27 a;

        h(p27 p27Var) {
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
            String string4;
            int i3;
            String string5;
            Cursor c = p51.c(dr4.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "message_id");
                int d3 = q41.d(c, "history_id");
                int d4 = q41.d(c, "weight");
                int d5 = q41.d(c, "unit");
                int d6 = q41.d(c, "placement");
                int d7 = q41.d(c, "presentation_rule");
                int d8 = q41.d(c, "cadence");
                int d9 = q41.d(c, "action");
                int d10 = q41.d(c, "cancelable");
                int d11 = q41.d(c, "body");
                int d12 = q41.d(c, "kicker");
                int d13 = q41.d(c, "media_resource");
                int d14 = q41.d(c, "analytics_module_name");
                int d15 = q41.d(c, "analytics_label");
                int i4 = d13;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    String string6 = c.isNull(d) ? null : c.getString(d);
                    String string7 = c.isNull(d2) ? null : c.getString(d2);
                    String string8 = c.isNull(d3) ? null : c.getString(d3);
                    int i5 = c.getInt(d4);
                    String string9 = c.isNull(d5) ? null : c.getString(d5);
                    if (c.isNull(d6)) {
                        i = d;
                        string = null;
                    } else {
                        string = c.getString(d6);
                        i = d;
                    }
                    MessageProperties f = dr4.this.c.f(string);
                    MessageProperties f2 = dr4.this.c.f(c.isNull(d7) ? null : c.getString(d7));
                    int i6 = c.getInt(d8);
                    MessageProperties f3 = dr4.this.c.f(c.isNull(d9) ? null : c.getString(d9));
                    boolean z = c.getInt(d10) != 0;
                    List h = dr4.this.c.h(c.isNull(d11) ? null : c.getString(d11));
                    if (c.isNull(d12)) {
                        i2 = i4;
                        string2 = null;
                    } else {
                        string2 = c.getString(d12);
                        i2 = i4;
                    }
                    if (c.isNull(i2)) {
                        i4 = i2;
                        string3 = null;
                    } else {
                        string3 = c.getString(i2);
                        i4 = i2;
                    }
                    MessageProperties f4 = dr4.this.c.f(string3);
                    int i7 = d14;
                    if (c.isNull(i7)) {
                        i3 = d15;
                        string4 = null;
                    } else {
                        string4 = c.getString(i7);
                        i3 = d15;
                    }
                    if (c.isNull(i3)) {
                        d14 = i7;
                        string5 = null;
                    } else {
                        string5 = c.getString(i3);
                        d14 = i7;
                    }
                    arrayList.add(new Message(string6, string7, string8, i5, string9, f, f2, i6, f3, z, h, string2, f4, string4, string5));
                    d15 = i3;
                    d = i;
                }
                return arrayList;
            } finally {
                c.close();
                this.a.release();
            }
        }
    }

    class i implements Callable {
        final /* synthetic */ p27 a;

        i(p27 p27Var) {
            this.a = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Message call() {
            Message message;
            Cursor c = p51.c(dr4.this.a, this.a, false, null);
            try {
                int d = q41.d(c, "id");
                int d2 = q41.d(c, "message_id");
                int d3 = q41.d(c, "history_id");
                int d4 = q41.d(c, "weight");
                int d5 = q41.d(c, "unit");
                int d6 = q41.d(c, "placement");
                int d7 = q41.d(c, "presentation_rule");
                int d8 = q41.d(c, "cadence");
                int d9 = q41.d(c, "action");
                int d10 = q41.d(c, "cancelable");
                int d11 = q41.d(c, "body");
                int d12 = q41.d(c, "kicker");
                int d13 = q41.d(c, "media_resource");
                int d14 = q41.d(c, "analytics_module_name");
                int d15 = q41.d(c, "analytics_label");
                if (c.moveToFirst()) {
                    message = new Message(c.isNull(d) ? null : c.getString(d), c.isNull(d2) ? null : c.getString(d2), c.isNull(d3) ? null : c.getString(d3), c.getInt(d4), c.isNull(d5) ? null : c.getString(d5), dr4.this.c.f(c.isNull(d6) ? null : c.getString(d6)), dr4.this.c.f(c.isNull(d7) ? null : c.getString(d7)), c.getInt(d8), dr4.this.c.f(c.isNull(d9) ? null : c.getString(d9)), c.getInt(d10) != 0, dr4.this.c.h(c.isNull(d11) ? null : c.getString(d11)), c.isNull(d12) ? null : c.getString(d12), dr4.this.c.f(c.isNull(d13) ? null : c.getString(d13)), c.isNull(d14) ? null : c.getString(d14), c.isNull(d15) ? null : c.getString(d15));
                } else {
                    message = null;
                }
                return message;
            } finally {
                c.close();
                this.a.release();
            }
        }
    }

    public dr4(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.d = new b(roomDatabase);
        this.e = new c(roomDatabase);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // defpackage.cr4
    public Object a(by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM oma_message_detail ORDER BY weight DESC", 0);
        return CoroutinesRoom.b(this.a, false, p51.a(), new g(d2), by0Var);
    }

    @Override // defpackage.cr4
    public Object b(by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new e(), by0Var);
    }

    @Override // defpackage.cr4
    public Object c(String str, by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM oma_message_detail WHERE id = ?", 1);
        if (str == null) {
            d2.c1(1);
        } else {
            d2.v0(1, str);
        }
        return CoroutinesRoom.b(this.a, false, p51.a(), new i(d2), by0Var);
    }

    @Override // defpackage.cr4
    public Object d(List list, by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new d(list), by0Var);
    }

    @Override // defpackage.cr4
    public Object e(String str, by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM oma_message_detail WHERE unit = ? ORDER BY weight DESC", 1);
        if (str == null) {
            d2.c1(1);
        } else {
            d2.v0(1, str);
        }
        return CoroutinesRoom.b(this.a, false, p51.a(), new h(d2), by0Var);
    }

    @Override // defpackage.cr4
    public Object f(String str, by0 by0Var) {
        return CoroutinesRoom.c(this.a, true, new f(str), by0Var);
    }
}
