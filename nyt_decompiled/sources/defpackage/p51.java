package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes.dex */
public abstract class p51 {
    public static final CancellationSignal a() {
        return nc8.b();
    }

    public static final void b(sc8 sc8Var) {
        zq3.h(sc8Var, "db");
        List c = i.c();
        Cursor T0 = sc8Var.T0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (T0.moveToNext()) {
            try {
                c.add(T0.getString(0));
            } finally {
            }
        }
        ww8 ww8Var = ww8.a;
        gm0.a(T0, null);
        for (String str : i.a(c)) {
            zq3.g(str, "triggerName");
            if (h.K(str, "room_fts_content_sync_", false, 2, null)) {
                sc8Var.B("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final Cursor c(RoomDatabase roomDatabase, vc8 vc8Var, boolean z, CancellationSignal cancellationSignal) {
        zq3.h(roomDatabase, "db");
        zq3.h(vc8Var, "sqLiteQuery");
        Cursor query = roomDatabase.query(vc8Var, cancellationSignal);
        if (!z || !(query instanceof AbstractWindowedCursor)) {
            return query;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? q41.a(query) : query;
    }

    public static final int d(File file) {
        zq3.h(file, "databaseFile");
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i = allocate.getInt();
            gm0.a(channel, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                gm0.a(channel, th);
                throw th2;
            }
        }
    }
}
