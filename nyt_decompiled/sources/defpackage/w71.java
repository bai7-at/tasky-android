package defpackage;

import com.nytimes.android.utils.MoshiFileSystemPersister;

/* loaded from: classes4.dex */
public final class w71 extends MoshiFileSystemPersister {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w71(ve2 ve2Var) {
        super(ve2Var, i81.a.a(), new bq5() { // from class: v71
            @Override // defpackage.bq5
            public final String a(Object obj) {
                String g;
                g = w71.g((ww8) obj);
                return g;
            }
        });
        zq3.h(ve2Var, "fileSystem");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(ww8 ww8Var) {
        zq3.h(ww8Var, "it");
        return "your_daily_five_follow_status";
    }
}
