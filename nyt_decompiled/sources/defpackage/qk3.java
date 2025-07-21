package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.video.sectionfront.ui.VideoCover;
import com.nytimes.android.video.views.ExoPlayerView;
import com.nytimes.android.video.views.InlineVideoState;
import com.nytimes.android.video.views.VideoControlView;

/* loaded from: classes4.dex */
public final class qk3 {
    private VideoCover a;
    private ExoPlayerView b;
    private VideoControlView c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InlineVideoState.values().length];
            try {
                iArr[InlineVideoState.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InlineVideoState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InlineVideoState.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InlineVideoState.BUFFERING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InlineVideoState.RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InlineVideoState.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public final void a(VideoCover videoCover, ExoPlayerView exoPlayerView, VideoControlView videoControlView) {
        zq3.h(videoCover, "videoCover");
        zq3.h(exoPlayerView, "exoPlayerView");
        zq3.h(videoControlView, "videoControlView");
        this.a = videoCover;
        this.b = exoPlayerView;
        this.c = videoControlView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.nytimes.android.video.views.ExoPlayerView] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.nytimes.android.video.views.ExoPlayerView] */
    public final void b(InlineVideoState inlineVideoState, boolean z) {
        zq3.h(inlineVideoState, TransferTable.COLUMN_STATE);
        VideoControlView videoControlView = null;
        switch (a.a[inlineVideoState.ordinal()]) {
            case 1:
                VideoCover videoCover = this.a;
                if (videoCover == null) {
                    zq3.z("videoCover");
                    videoCover = null;
                }
                videoCover.o0(InlineVideoState.START, z);
                ExoPlayerView exoPlayerView = this.b;
                if (exoPlayerView == null) {
                    zq3.z("exoPlayerView");
                    exoPlayerView = null;
                }
                exoPlayerView.setVisibility(4);
                VideoControlView videoControlView2 = this.c;
                if (videoControlView2 == null) {
                    zq3.z("videoControlView");
                } else {
                    videoControlView = videoControlView2;
                }
                videoControlView.F();
                break;
            case 2:
                VideoCover videoCover2 = this.a;
                if (videoCover2 == null) {
                    zq3.z("videoCover");
                    videoCover2 = null;
                }
                videoCover2.o0(InlineVideoState.LOADING, z);
                ExoPlayerView exoPlayerView2 = this.b;
                if (exoPlayerView2 == null) {
                    zq3.z("exoPlayerView");
                    exoPlayerView2 = null;
                }
                exoPlayerView2.setVisibility(0);
                VideoControlView videoControlView3 = this.c;
                if (videoControlView3 == null) {
                    zq3.z("videoControlView");
                } else {
                    videoControlView = videoControlView3;
                }
                videoControlView.F();
                break;
            case 3:
                VideoCover videoCover3 = this.a;
                if (videoCover3 == null) {
                    zq3.z("videoCover");
                    videoCover3 = null;
                }
                videoCover3.o0(InlineVideoState.PLAYING, z);
                ?? r6 = this.b;
                if (r6 == 0) {
                    zq3.z("exoPlayerView");
                } else {
                    videoControlView = r6;
                }
                videoControlView.setVisibility(0);
                break;
            case 4:
                VideoCover videoCover4 = this.a;
                if (videoCover4 == null) {
                    zq3.z("videoCover");
                    videoCover4 = null;
                }
                videoCover4.o0(InlineVideoState.BUFFERING, z);
                ?? r62 = this.b;
                if (r62 == 0) {
                    zq3.z("exoPlayerView");
                } else {
                    videoControlView = r62;
                }
                videoControlView.setVisibility(0);
                break;
            case 5:
                VideoCover videoCover5 = this.a;
                if (videoCover5 == null) {
                    zq3.z("videoCover");
                    videoCover5 = null;
                }
                videoCover5.o0(InlineVideoState.RESUME, z);
                ExoPlayerView exoPlayerView3 = this.b;
                if (exoPlayerView3 == null) {
                    zq3.z("exoPlayerView");
                    exoPlayerView3 = null;
                }
                exoPlayerView3.setVisibility(4);
                VideoControlView videoControlView4 = this.c;
                if (videoControlView4 == null) {
                    zq3.z("videoControlView");
                } else {
                    videoControlView = videoControlView4;
                }
                videoControlView.F();
                break;
            case 6:
                VideoCover videoCover6 = this.a;
                if (videoCover6 == null) {
                    zq3.z("videoCover");
                    videoCover6 = null;
                }
                videoCover6.o0(InlineVideoState.END, z);
                ExoPlayerView exoPlayerView4 = this.b;
                if (exoPlayerView4 == null) {
                    zq3.z("exoPlayerView");
                    exoPlayerView4 = null;
                }
                exoPlayerView4.setVisibility(4);
                VideoControlView videoControlView5 = this.c;
                if (videoControlView5 == null) {
                    zq3.z("videoControlView");
                } else {
                    videoControlView = videoControlView5;
                }
                videoControlView.F();
                break;
        }
    }
}
