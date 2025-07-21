package com.comscore.streaming;

/* loaded from: classes2.dex */
public interface ContentMediaFormat {
    public static final int FULL_CONTENT_GENERIC = 1001;
    public static final int PARTIAL_CONTENT_EPISODE = 1005;
    public static final int FULL_CONTENT_EPISODE = 1002;
    public static final int FULL_CONTENT_MOVIE = 1003;
    public static final int PARTIAL_CONTENT_GENERIC = 1004;
    public static final int PARTIAL_CONTENT_MOVIE = 1006;
    public static final int PREVIEW_GENERIC = 1007;
    public static final int PREVIEW_EPISODE = 1008;
    public static final int PREVIEW_MOVIE = 1009;
    public static final int EXTRA_GENERIC = 1010;
    public static final int EXTRA_EPISODE = 1012;
    public static final int EXTRA_MOVIE = 1013;
    public static final int FULL_CONTENT_PODCAST = 1014;
    public static final int PARTIAL_CONTENT_PODCAST = 1015;
    public static final int[] ALLOWED_VALUES = {1001, FULL_CONTENT_EPISODE, FULL_CONTENT_MOVIE, PARTIAL_CONTENT_GENERIC, 1005, PARTIAL_CONTENT_MOVIE, PREVIEW_GENERIC, PREVIEW_EPISODE, PREVIEW_MOVIE, EXTRA_GENERIC, EXTRA_EPISODE, EXTRA_MOVIE, FULL_CONTENT_PODCAST, PARTIAL_CONTENT_PODCAST};
}
