package defpackage;

import com.nytimes.android.ribbon.di.GamesModule;
import com.nytimes.android.utils.MoshiFileSystemPersister;
import com.squareup.moshi.i;

/* loaded from: classes4.dex */
public abstract class fv2 implements ba2 {
    public static MoshiFileSystemPersister a(ve2 ve2Var, i iVar) {
        return (MoshiFileSystemPersister) g16.e(GamesModule.a.b(ve2Var, iVar));
    }
}
