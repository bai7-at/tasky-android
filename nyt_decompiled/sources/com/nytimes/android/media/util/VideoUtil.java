package com.nytimes.android.media.util;

import android.app.Application;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.b22;
import defpackage.du8;
import defpackage.ss2;
import defpackage.tp0;
import defpackage.zq3;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class VideoUtil {
    private static final String EMPTY_ENCODING = "";
    private static final String MOBILE_SUFFIX = "_mobile";
    private final Application application;
    public static final Companion Companion = new Companion(null);
    private static final String[] supportedCodecs = {"", "H264", "MP4", "VP8"};
    private static final String HLS_EXTENSION = "m3u8";
    private static final String[] supportedExtensions = {HLS_EXTENSION, "mp4", "webm"};
    private static final String[] supportedExtensionsNoHls = {"mp4", "webm", HLS_EXTENSION};

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getFileExtension(String str) {
            try {
                String name = new File(new URL(str).getPath()).getName();
                zq3.e(name);
                int g0 = h.g0(name, '.', 0, false, 6, null);
                if (g0 == -1) {
                    return "";
                }
                String substring = name.substring(g0 + 1);
                zq3.g(substring, "substring(...)");
                return substring;
            } catch (MalformedURLException e) {
                NYTLogger.i(e, "Malformed Url Exception, getting bad url from cms", new Object[0]);
                return null;
            }
        }

        public static /* synthetic */ void getSupportedExtensions$media_release$annotations() {
        }

        public final String[] getSupportedExtensions$media_release() {
            return VideoUtil.supportedExtensions;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VideoRes {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ VideoRes[] $VALUES;
        public static final VideoRes HIGH = new VideoRes("HIGH", 0, 1.0f);
        public static final VideoRes LOW = new VideoRes("LOW", 1, 0.25f);
        private final float maxWidthResolutionScale;

        private static final /* synthetic */ VideoRes[] $values() {
            return new VideoRes[]{HIGH, LOW};
        }

        static {
            VideoRes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private VideoRes(String str, int i, float f) {
            this.maxWidthResolutionScale = f;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static VideoRes valueOf(String str) {
            return (VideoRes) Enum.valueOf(VideoRes.class, str);
        }

        public static VideoRes[] values() {
            return (VideoRes[]) $VALUES.clone();
        }

        public final float getMaxWidthResolutionScale$media_release() {
            return this.maxWidthResolutionScale;
        }
    }

    public VideoUtil(Application application) {
        zq3.h(application, "application");
        this.application = application;
    }

    private final VideoRendition extractDefaultVideoFile(List<VideoRendition> list, final int i, String[] strArr, final boolean z) {
        ArrayList<VideoRendition> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((VideoRendition) obj).getVideoUrl().length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
        for (VideoRendition videoRendition : arrayList) {
            arrayList2.add(du8.a(videoRendition, Integer.valueOf(areEncodingAndExtensionSupported(videoRendition, strArr))));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((Number) ((Pair) obj2).b()).intValue() != -1) {
                arrayList3.add(obj2);
            }
        }
        List N0 = i.N0(arrayList3, tp0.b(new ss2() { // from class: com.nytimes.android.media.util.VideoUtil$extractDefaultVideoFile$4
            @Override // defpackage.ss2
            public final Comparable<?> invoke(Pair<VideoRendition, Integer> pair) {
                zq3.h(pair, "<name for destructuring parameter 0>");
                return Integer.valueOf(((Number) pair.b()).intValue());
            }
        }, new ss2() { // from class: com.nytimes.android.media.util.VideoUtil$extractDefaultVideoFile$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final Comparable<?> invoke(Pair<VideoRendition, Integer> pair) {
                zq3.h(pair, "<name for destructuring parameter 0>");
                return z ? Boolean.valueOf(!h.u(((VideoRendition) pair.a()).getType(), "_mobile", true)) : Boolean.FALSE;
            }
        }, new ss2() { // from class: com.nytimes.android.media.util.VideoUtil$extractDefaultVideoFile$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final Comparable<?> invoke(Pair<VideoRendition, Integer> pair) {
                zq3.h(pair, "<name for destructuring parameter 0>");
                return Integer.valueOf(Math.abs(((VideoRendition) pair.a()).getWidth() - i));
            }
        }));
        ArrayList arrayList4 = new ArrayList(i.w(N0, 10));
        Iterator it2 = N0.iterator();
        while (it2.hasNext()) {
            arrayList4.add((VideoRendition) ((Pair) it2.next()).a());
        }
        return (VideoRendition) i.m0(arrayList4);
    }

    private final VideoRendition extractHLSFile(List<VideoRendition> list) {
        Object obj;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (isHLSExtension(((VideoRendition) obj).getVideoUrl())) {
                break;
            }
        }
        return (VideoRendition) obj;
    }

    public static /* synthetic */ VideoRendition extractVideoFile$default(VideoUtil videoUtil, List list, VideoRes videoRes, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return videoUtil.extractVideoFile(list, videoRes, z, z2);
    }

    public final int areEncodingAndExtensionSupported(VideoRendition videoRendition, String[] strArr) {
        zq3.h(videoRendition, "rendition");
        zq3.h(strArr, "extensions");
        String encoding = videoRendition.getEncoding();
        if (encoding == null) {
            encoding = "";
        }
        int isExtensionSupported = isExtensionSupported(videoRendition.getVideoUrl(), strArr);
        if (isExtensionSupported == -1) {
            return -1;
        }
        if (encoding.length() == 0 && isExtensionSupported != 0) {
            return -1;
        }
        for (String str : supportedCodecs) {
            if (h.w(encoding, str, true)) {
                return isExtensionSupported;
            }
        }
        return -1;
    }

    public final VideoRendition extractVideoFile(List<VideoRendition> list, VideoRes videoRes, boolean z, boolean z2) {
        zq3.h(list, "renditions");
        zq3.h(videoRes, "videoRes");
        int maxWidthResolutionScale$media_release = (int) (videoRes.getMaxWidthResolutionScale$media_release() * DeviceUtils.p(this.application));
        VideoRendition extractHLSFile = z ? extractHLSFile(list) : null;
        if (extractHLSFile == null) {
            return extractDefaultVideoFile(list, maxWidthResolutionScale$media_release, z ? supportedExtensions : supportedExtensionsNoHls, z2);
        }
        return extractHLSFile;
    }

    public final VideoRes getDefaultResolution(boolean z) {
        return z ? VideoRes.HIGH : VideoRes.LOW;
    }

    public final int isExtensionSupported(String str, String[] strArr) {
        zq3.h(str, "videoUrl");
        zq3.h(strArr, "extensions");
        String fileExtension = Companion.getFileExtension(str);
        if (fileExtension == null || fileExtension.length() == 0) {
            return -1;
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (h.w(fileExtension, strArr[i], true)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean isHLSExtension(String str) {
        String fileExtension;
        zq3.h(str, "videoUrl");
        return (str.length() == 0 || (fileExtension = Companion.getFileExtension(str)) == null || fileExtension.length() == 0 || !h.w(HLS_EXTENSION, fileExtension, true)) ? false : true;
    }
}
