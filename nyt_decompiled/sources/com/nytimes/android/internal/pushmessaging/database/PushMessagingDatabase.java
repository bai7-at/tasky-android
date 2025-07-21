package com.nytimes.android.internal.pushmessaging.database;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.f;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class PushMessagingDatabase extends RoomDatabase {
    public static final a Companion = new a(null);
    private static volatile PushMessagingDatabase a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final PushMessagingDatabase a(Context context) {
            return (PushMessagingDatabase) f.a(context, PushMessagingDatabase.class, "push-sub.db").d();
        }

        public final PushMessagingDatabase b(Context context) {
            zq3.h(context, "context");
            PushMessagingDatabase pushMessagingDatabase = PushMessagingDatabase.a;
            if (pushMessagingDatabase == null) {
                synchronized (this) {
                    pushMessagingDatabase = PushMessagingDatabase.a;
                    if (pushMessagingDatabase == null) {
                        PushMessagingDatabase a = PushMessagingDatabase.Companion.a(context);
                        PushMessagingDatabase.a = a;
                        pushMessagingDatabase = a;
                    }
                }
            }
            return pushMessagingDatabase;
        }

        private a() {
        }
    }

    public abstract PushMessagingDao f();
}
