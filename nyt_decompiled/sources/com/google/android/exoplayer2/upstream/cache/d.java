package com.google.android.exoplayer2.upstream.cache;

import android.database.Cursor;
import android.database.SQLException;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.exoplayer2.database.DatabaseIOException;
import defpackage.sa1;
import defpackage.ur;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class d {
    private static final String[] b = {AuthenticationTokenClaims.JSON_KEY_NAME, "length", "last_touch_timestamp"};
    private String a;

    public d(sa1 sa1Var) {
    }

    private Cursor b() {
        ur.e(this.a);
        throw null;
    }

    private static String c(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    public Map a() {
        try {
            Cursor b2 = b();
            try {
                HashMap hashMap = new HashMap(b2.getCount());
                while (b2.moveToNext()) {
                    hashMap.put((String) ur.e(b2.getString(0)), new c(b2.getLong(1), b2.getLong(2)));
                }
                b2.close();
                return hashMap;
            } finally {
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void d(long j) {
        try {
            this.a = c(Long.toHexString(j));
            throw null;
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void e(String str) {
        ur.e(this.a);
        throw null;
    }

    public void f(Set set) {
        ur.e(this.a);
        throw null;
    }

    public void g(String str, long j, long j2) {
        ur.e(this.a);
        throw null;
    }
}
