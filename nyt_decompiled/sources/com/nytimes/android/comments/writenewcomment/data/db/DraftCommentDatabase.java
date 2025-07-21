package com.nytimes.android.comments.writenewcomment.data.db;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.f;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class DraftCommentDatabase extends RoomDatabase {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DraftCommentDatabase build(Context context) {
            zq3.h(context, "context");
            return (DraftCommentDatabase) f.a(context, DraftCommentDatabase.class, "draft-comment-database.db").e().d();
        }

        private Companion() {
        }
    }

    public static final DraftCommentDatabase build(Context context) {
        return Companion.build(context);
    }

    public abstract DraftCommentDao draftCommentDao();
}
