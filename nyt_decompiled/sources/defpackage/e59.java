package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.database.DatabaseIOException;

/* loaded from: classes2.dex */
public abstract class e59 {
    static {
        n72.a("goog.exo.database");
    }

    private static String[] a(int i, String str) {
        return new String[]{Integer.toString(i), str};
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            if (z19.Z0(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", a(i, str));
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}
