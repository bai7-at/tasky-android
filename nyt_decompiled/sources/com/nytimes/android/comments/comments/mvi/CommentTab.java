package com.nytimes.android.comments.comments.mvi;

import com.nytimes.android.comments.R;
import defpackage.b22;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CommentTab {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ CommentTab[] $VALUES;
    private final String defaultTabName;
    private final boolean hasSorting;
    private boolean showThread;
    private int tabName;
    private int title;
    public static final CommentTab All = new CommentTab("All", 0, R.string.comment_tab_all, R.string.comment_tab_all_header, true, true, "comment-list-sort-approvedate-desc");
    public static final CommentTab ReaderPicks = new CommentTab("ReaderPicks", 1, R.string.comment_tab_reader_picks, 0, false, false, "comment-list-sort-recommended", 14, null);
    public static final CommentTab NYTReplies = new CommentTab("NYTReplies", 2, R.string.comment_tab_nyt_replies, 0, true, false, "comment-list-sort-replies", 10, null);
    public static final CommentTab NYTPicks = new CommentTab("NYTPicks", 3, R.string.comment_tab_nyt_picks, 0, false, false, "comment-list-sort-editors", 14, null);

    private static final /* synthetic */ CommentTab[] $values() {
        return new CommentTab[]{All, ReaderPicks, NYTReplies, NYTPicks};
    }

    static {
        CommentTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CommentTab(String str, int i, int i2, int i3, boolean z, boolean z2, String str2) {
        this.tabName = i2;
        this.title = i3;
        this.showThread = z;
        this.hasSorting = z2;
        this.defaultTabName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static CommentTab valueOf(String str) {
        return (CommentTab) Enum.valueOf(CommentTab.class, str);
    }

    public static CommentTab[] values() {
        return (CommentTab[]) $VALUES.clone();
    }

    public final String getDefaultTabName() {
        return this.defaultTabName;
    }

    public final boolean getHasSorting() {
        return this.hasSorting;
    }

    public final boolean getShowThread() {
        return this.showThread;
    }

    public final int getTabName() {
        return this.tabName;
    }

    public final int getTitle() {
        return this.title;
    }

    public final void setShowThread(boolean z) {
        this.showThread = z;
    }

    public final void setTabName(int i) {
        this.tabName = i;
    }

    public final void setTitle(int i) {
        this.title = i;
    }

    /* synthetic */ CommentTab(String str, int i, int i2, int i3, boolean z, boolean z2, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3, (i4 & 4) != 0 ? false : z, (i4 & 8) != 0 ? false : z2, str2);
    }
}
