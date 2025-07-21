package com.nytimes.android.libs.messagingarchitecture.db;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.f;
import defpackage.b34;
import defpackage.b4;
import defpackage.cr4;
import defpackage.gr4;
import defpackage.qg0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class MessagingArchitectureDatabase extends RoomDatabase {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MessagingArchitectureDatabase a(Context context) {
            zq3.h(context, "context");
            return (MessagingArchitectureDatabase) f.a(context, MessagingArchitectureDatabase.class, "messaging_database").e().d();
        }

        private a() {
        }
    }

    public abstract b4 d();

    public abstract qg0 e();

    public abstract b34 f();

    public abstract gr4 g();

    public abstract cr4 h();
}
