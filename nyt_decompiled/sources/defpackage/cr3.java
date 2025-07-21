package defpackage;

import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class cr3 {
    private final RoomDatabase a;
    private final Set b;

    public cr3(RoomDatabase roomDatabase) {
        zq3.h(roomDatabase, "database");
        this.a = roomDatabase;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        zq3.g(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.b = newSetFromMap;
    }
}
