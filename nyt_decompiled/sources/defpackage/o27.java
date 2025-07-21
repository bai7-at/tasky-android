package defpackage;

/* loaded from: classes.dex */
public final class o27 {
    public static final o27 a = new o27();

    private o27() {
    }

    public static final String a(String str) {
        zq3.h(str, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
