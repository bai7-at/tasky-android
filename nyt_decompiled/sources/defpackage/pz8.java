package defpackage;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import com.nytimes.android.subauth.core.database.userdata.UserData;
import com.nytimes.android.subauth.core.database.userdata.googleplay.GooglePlayData;
import com.nytimes.android.subauth.core.database.userdata.regi.RegiData;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class pz8 implements oz8 {
    private final RoomDatabase __db;
    private final y12 __insertionAdapterOfUserData;
    private final SharedSQLiteStatement __preparedStmtOfUpdateGooglePlayData;
    private final SharedSQLiteStatement __preparedStmtOfUpdateRegiData;
    private final m19 __userSubscriptionConverter = new m19();
    private final rb1 __dateConverter = new rb1();

    class a extends y12 {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `UserData` (`userId`,`subscriptions`,`regiId`,`email`,`displayName`,`name`,`givenName`,`familyName`,`username`,`gamesUsername`,`gamesAvatarIcon`,`entitlements`,`provisionalExpirationDate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.y12
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(wc8 wc8Var, UserData userData) {
            wc8Var.L0(1, userData.getUserId());
            RegiData regiData = userData.getRegiData();
            String b = pz8.this.__userSubscriptionConverter.b(regiData.getSubscriptions());
            if (b == null) {
                wc8Var.c1(2);
            } else {
                wc8Var.v0(2, b);
            }
            mz8 userAccount = regiData.getUserAccount();
            if (userAccount != null) {
                if (userAccount.i() == null) {
                    wc8Var.c1(3);
                } else {
                    wc8Var.v0(3, userAccount.i());
                }
                if (userAccount.c() == null) {
                    wc8Var.c1(4);
                } else {
                    wc8Var.v0(4, userAccount.c());
                }
                if (userAccount.b() == null) {
                    wc8Var.c1(5);
                } else {
                    wc8Var.v0(5, userAccount.b());
                }
                if (userAccount.h() == null) {
                    wc8Var.c1(6);
                } else {
                    wc8Var.v0(6, userAccount.h());
                }
                if (userAccount.g() == null) {
                    wc8Var.c1(7);
                } else {
                    wc8Var.v0(7, userAccount.g());
                }
                if (userAccount.d() == null) {
                    wc8Var.c1(8);
                } else {
                    wc8Var.v0(8, userAccount.d());
                }
                if (userAccount.j() == null) {
                    wc8Var.c1(9);
                } else {
                    wc8Var.v0(9, userAccount.j());
                }
                if (userAccount.f() == null) {
                    wc8Var.c1(10);
                } else {
                    wc8Var.v0(10, userAccount.f());
                }
                if (userAccount.e() == null) {
                    wc8Var.c1(11);
                } else {
                    wc8Var.v0(11, userAccount.e());
                }
            } else {
                wc8Var.c1(3);
                wc8Var.c1(4);
                wc8Var.c1(5);
                wc8Var.c1(6);
                wc8Var.c1(7);
                wc8Var.c1(8);
                wc8Var.c1(9);
                wc8Var.c1(10);
                wc8Var.c1(11);
            }
            GooglePlayData googlePlayData = userData.getGooglePlayData();
            String a = pz8.this.__userSubscriptionConverter.a(googlePlayData.getEntitlements());
            if (a == null) {
                wc8Var.c1(12);
            } else {
                wc8Var.v0(12, a);
            }
            Long b2 = pz8.this.__dateConverter.b(googlePlayData.getProvisionalExpirationDate());
            if (b2 == null) {
                wc8Var.c1(13);
            } else {
                wc8Var.L0(13, b2.longValue());
            }
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE UserData SET regiId = ?, email = ?, displayName = ?, name = ?, givenName = ?, familyName = ?, username = ?, gamesUsername = ?, gamesAvatarIcon = ?, subscriptions = ? WHERE userId = 1234";
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE UserData SET entitlements = ?, provisionalExpirationDate = ? WHERE userId = 1234";
        }
    }

    class d implements Callable {
        final /* synthetic */ UserData val$userData;

        d(UserData userData) {
            this.val$userData = userData;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            pz8.this.__db.beginTransaction();
            try {
                pz8.this.__insertionAdapterOfUserData.insert(this.val$userData);
                pz8.this.__db.setTransactionSuccessful();
                return ww8.a;
            } finally {
                pz8.this.__db.endTransaction();
            }
        }
    }

    class e implements Callable {
        final /* synthetic */ String val$displayName;
        final /* synthetic */ String val$email;
        final /* synthetic */ String val$familyName;
        final /* synthetic */ String val$gamesAvatarIcon;
        final /* synthetic */ String val$gamesUsername;
        final /* synthetic */ String val$givenName;
        final /* synthetic */ String val$name;
        final /* synthetic */ String val$regiId;
        final /* synthetic */ List val$subs;
        final /* synthetic */ String val$username;

        e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
            this.val$regiId = str;
            this.val$email = str2;
            this.val$displayName = str3;
            this.val$name = str4;
            this.val$givenName = str5;
            this.val$familyName = str6;
            this.val$username = str7;
            this.val$gamesUsername = str8;
            this.val$gamesAvatarIcon = str9;
            this.val$subs = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            wc8 acquire = pz8.this.__preparedStmtOfUpdateRegiData.acquire();
            String str = this.val$regiId;
            if (str == null) {
                acquire.c1(1);
            } else {
                acquire.v0(1, str);
            }
            String str2 = this.val$email;
            if (str2 == null) {
                acquire.c1(2);
            } else {
                acquire.v0(2, str2);
            }
            String str3 = this.val$displayName;
            if (str3 == null) {
                acquire.c1(3);
            } else {
                acquire.v0(3, str3);
            }
            String str4 = this.val$name;
            if (str4 == null) {
                acquire.c1(4);
            } else {
                acquire.v0(4, str4);
            }
            String str5 = this.val$givenName;
            if (str5 == null) {
                acquire.c1(5);
            } else {
                acquire.v0(5, str5);
            }
            String str6 = this.val$familyName;
            if (str6 == null) {
                acquire.c1(6);
            } else {
                acquire.v0(6, str6);
            }
            String str7 = this.val$username;
            if (str7 == null) {
                acquire.c1(7);
            } else {
                acquire.v0(7, str7);
            }
            String str8 = this.val$gamesUsername;
            if (str8 == null) {
                acquire.c1(8);
            } else {
                acquire.v0(8, str8);
            }
            String str9 = this.val$gamesAvatarIcon;
            if (str9 == null) {
                acquire.c1(9);
            } else {
                acquire.v0(9, str9);
            }
            String b = pz8.this.__userSubscriptionConverter.b(this.val$subs);
            if (b == null) {
                acquire.c1(10);
            } else {
                acquire.v0(10, b);
            }
            try {
                pz8.this.__db.beginTransaction();
                try {
                    acquire.E();
                    pz8.this.__db.setTransactionSuccessful();
                    return ww8.a;
                } finally {
                    pz8.this.__db.endTransaction();
                }
            } finally {
                pz8.this.__preparedStmtOfUpdateRegiData.release(acquire);
            }
        }
    }

    class f implements Callable {
        final /* synthetic */ Set val$googlePlaySubEntitlements;
        final /* synthetic */ Date val$provisionalExpirationDate;

        f(Set set, Date date) {
            this.val$googlePlaySubEntitlements = set;
            this.val$provisionalExpirationDate = date;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ww8 call() {
            wc8 acquire = pz8.this.__preparedStmtOfUpdateGooglePlayData.acquire();
            String a = pz8.this.__userSubscriptionConverter.a(this.val$googlePlaySubEntitlements);
            if (a == null) {
                acquire.c1(1);
            } else {
                acquire.v0(1, a);
            }
            Long b = pz8.this.__dateConverter.b(this.val$provisionalExpirationDate);
            if (b == null) {
                acquire.c1(2);
            } else {
                acquire.L0(2, b.longValue());
            }
            try {
                pz8.this.__db.beginTransaction();
                try {
                    acquire.E();
                    pz8.this.__db.setTransactionSuccessful();
                    return ww8.a;
                } finally {
                    pz8.this.__db.endTransaction();
                }
            } finally {
                pz8.this.__preparedStmtOfUpdateGooglePlayData.release(acquire);
            }
        }
    }

    class g implements Callable {
        final /* synthetic */ p27 val$_statement;

        g(p27 p27Var) {
            this.val$_statement = p27Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            Boolean bool = null;
            Cursor c = p51.c(pz8.this.__db, this.val$_statement, false, null);
            try {
                if (c.moveToFirst()) {
                    Integer valueOf = c.isNull(0) ? null : Integer.valueOf(c.getInt(0));
                    if (valueOf != null) {
                        bool = Boolean.valueOf(valueOf.intValue() != 0);
                    }
                }
                return bool;
            } finally {
                c.close();
                this.val$_statement.release();
            }
        }
    }

    class h implements Callable {
        final /* synthetic */ p27 val$_statement;

        h(p27 p27Var) {
            this.val$_statement = p27Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0170 A[Catch: all -> 0x00bc, TryCatch #0 {all -> 0x00bc, blocks: (B:3:0x0010, B:5:0x0064, B:8:0x0076, B:10:0x0088, B:12:0x008e, B:14:0x0094, B:16:0x009a, B:18:0x00a0, B:20:0x00a6, B:22:0x00ac, B:24:0x00b2, B:28:0x014d, B:31:0x015e, B:34:0x0178, B:40:0x0170, B:41:0x015a, B:42:0x00bf, B:45:0x00ce, B:48:0x00dd, B:51:0x00ec, B:54:0x00fb, B:57:0x010a, B:60:0x0119, B:63:0x0128, B:66:0x0137, B:69:0x0146, B:70:0x0140, B:71:0x0131, B:72:0x0122, B:73:0x0113, B:74:0x0104, B:75:0x00f5, B:76:0x00e6, B:77:0x00d7, B:78:0x00c8, B:79:0x0072), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x015a A[Catch: all -> 0x00bc, TryCatch #0 {all -> 0x00bc, blocks: (B:3:0x0010, B:5:0x0064, B:8:0x0076, B:10:0x0088, B:12:0x008e, B:14:0x0094, B:16:0x009a, B:18:0x00a0, B:20:0x00a6, B:22:0x00ac, B:24:0x00b2, B:28:0x014d, B:31:0x015e, B:34:0x0178, B:40:0x0170, B:41:0x015a, B:42:0x00bf, B:45:0x00ce, B:48:0x00dd, B:51:0x00ec, B:54:0x00fb, B:57:0x010a, B:60:0x0119, B:63:0x0128, B:66:0x0137, B:69:0x0146, B:70:0x0140, B:71:0x0131, B:72:0x0122, B:73:0x0113, B:74:0x0104, B:75:0x00f5, B:76:0x00e6, B:77:0x00d7, B:78:0x00c8, B:79:0x0072), top: B:2:0x0010 }] */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.nytimes.android.subauth.core.database.userdata.UserData call() {
            /*
                Method dump skipped, instructions count: 417
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pz8.h.call():com.nytimes.android.subauth.core.database.userdata.UserData");
        }
    }

    public pz8(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfUserData = new a(roomDatabase);
        this.__preparedStmtOfUpdateRegiData = new b(roomDatabase);
        this.__preparedStmtOfUpdateGooglePlayData = new c(roomDatabase);
    }

    public static List l() {
        return Collections.emptyList();
    }

    @Override // defpackage.oz8
    public Object e(by0 by0Var) {
        p27 d2 = p27.d("SELECT * FROM UserData WHERE userId = 1234", 0);
        return CoroutinesRoom.b(this.__db, false, p51.a(), new h(d2), by0Var);
    }

    @Override // defpackage.oz8
    public Object f(Set set, Date date, by0 by0Var) {
        return CoroutinesRoom.c(this.__db, true, new f(set, date), by0Var);
    }

    @Override // defpackage.oz8
    public Object g(UserData userData, by0 by0Var) {
        return CoroutinesRoom.c(this.__db, true, new d(userData), by0Var);
    }

    @Override // defpackage.oz8
    public Object h(by0 by0Var) {
        p27 d2 = p27.d("SELECT (SELECT COUNT(*) FROM userdata) != 0", 0);
        return CoroutinesRoom.b(this.__db, false, p51.a(), new g(d2), by0Var);
    }

    @Override // defpackage.oz8
    public Object i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, by0 by0Var) {
        return CoroutinesRoom.c(this.__db, true, new e(str, str2, str3, str4, str5, str6, str7, str8, str9, list), by0Var);
    }
}
