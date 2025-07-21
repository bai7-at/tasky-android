package com.nytimes.android.libs.messagingarchitecture.db;

import android.app.Application;
import com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater;
import defpackage.ba1;
import defpackage.gr4;
import defpackage.jr4;
import defpackage.s16;
import defpackage.u16;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class MessageHistoryMigrator {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private static final s16.a f = u16.a("is_migrated");
    private final Application a;
    private final MessageHistoryUpdater b;
    private final gr4 c;
    private final ba1 d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s16.a a() {
            return MessageHistoryMigrator.f;
        }

        private a() {
        }
    }

    public MessageHistoryMigrator(Application application, MessageHistoryUpdater messageHistoryUpdater, gr4 gr4Var) {
        ba1 b;
        zq3.h(application, "application");
        zq3.h(messageHistoryUpdater, "messageHistoryUpdater");
        zq3.h(gr4Var, "legacyMessageHistoryDao");
        this.a = application;
        this.b = messageHistoryUpdater;
        this.c = gr4Var;
        b = jr4.b(application);
        this.d = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5 A[LOOP:0: B:29:0x009f->B:31:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.by0 r10) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.db.MessageHistoryMigrator.b(by0):java.lang.Object");
    }
}
